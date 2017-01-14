////////////////////
// Kirk Easterson //
// CST 242 Final ///
////////////////////

package controller;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import model.CourseBag;
import model.Major;
import model.MajorBag;
import model.Staff;
import model.StaffBag;
import model.Student;
import model.StudentBag;
import view.LoginView;
import view.LoginViewEvent;
import view.LoginViewListener;
import view.SAINeditView;
import view.SAINview;

public class LoginViewController
{
	private StudentBag		studentBag;			// Bag for students
	private StaffBag		staffBag;			// Bag for staff
	private MajorBag		majorBag;			// Bag for majors
	private CourseBag		courseBag;			// Bag for courses
	
	private String			userName;			// Username
	private String			password;			// Password
	
	private Student			studentModel;		// Model of student
	private Staff			staffModel;			// Model of staff
	
	private Alert			alert;				// Alert for validation
	private ButtonType		sainButton;			// SAIN display button
	private ButtonType		whatIfButton;		// What-if-analysis button
	private ButtonType		logoutButton;		// Logout button
	private ButtonType		viewButton;			// Button to view student
	private ButtonType		editButton;			// Button to edit student
	
	private TextInputDialog	dialog;
	private TextInputDialog	staffChoiceDialog;
	
	private Stage			stage;				// The stage
	
	public LoginViewController(LoginView window, StudentBag studentBag, StaffBag staffBag, MajorBag majorBag,
			CourseBag courseBag)
	{
		// Set studentBag to argument studentBag
		this.studentBag = studentBag;
		// Set staffBag to argument staffBag
		this.staffBag = staffBag;
		// Set majorBag to argument majorBag
		this.majorBag = majorBag;
		// Set courseBag to argument courseBag
		this.courseBag = courseBag;
		
		// Instantiate windowListener
		window.setLoginViewListener(new LoginViewListener()
		{
			// Login button method
			public void loginButtonClicked(LoginViewEvent ev)
			{
				// Initialize stage
				stage = new Stage();
				
				// Get username from text field
				userName = ev.getUserName();
				// Get password from password field
				password = ev.getPassword();
				
				// Validation for student
				if (studentBag.isStudentValid(userName, password))
				{
					// Get valid student
					studentModel = studentBag.getValidStudent();
					showStudentChoice();
					
					// Validation for staff
				} else if (staffBag.isStaffValid(userName, password))
				{
					// Get valid staff
					staffModel = staffBag.getValidStaff();
					showFacultySearch();
					
				} else
				{
					// Instantiate error
					alert = new Alert(AlertType.ERROR);
					// Set title for error
					alert.setTitle("ERROR");
					// Set header text to null
					alert.setHeaderText(null);
					// Set content text for error
					alert.setContentText("Incorrect username/password");
					// Show error
					alert.showAndWait();
				}
			}
		});
	}
	
	private void showStudentChoice()
	{
		alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("MySCCC");
		alert.setHeaderText(null);
		alert.setContentText("Choose an option");
		sainButton = new ButtonType("SAIN Report");
		whatIfButton = new ButtonType("What If Analysis");
		logoutButton = new ButtonType("Log Out");
		alert.getButtonTypes().setAll(sainButton, whatIfButton, logoutButton);
		Optional<ButtonType> result = alert.showAndWait();
		
		if (result.get() == sainButton)
		{
			// Display SAIN report
			onStudentChoiceSainReport();
		} else if (result.get() == whatIfButton)
		{
			// Generate What-If-Analysis
			onStudentChoiceWhatIfAnalysis();
		} else
		{
			// Log out the student
			alert.close();
		}
	}
	
	private void onStudentChoiceSainReport()
	{
		// Instantiate new SAINviewController
		SAINviewController sainViewController = new SAINviewController(studentModel, studentModel.getMajor());
		// Instantiate new SAINviewController
		SAINview sainView = new SAINview(stage, sainViewController);
	}
	
	private void onStudentChoiceWhatIfAnalysis()
	{
		
		ChoiceDialog<String> choiceDialog = new ChoiceDialog<>("Major", majorBag.getMajorStringList());
		choiceDialog.setTitle("What If Analysis");
		choiceDialog.setHeaderText("Choose the major for the What-If-Analysis");
		choiceDialog.setContentText("Major:");
		Optional<String> resultWhatIf;
		resultWhatIf = choiceDialog.showAndWait();
		resultWhatIf.ifPresent(majorChoice ->
		{
			Major tempMajor = majorBag.findByString(majorChoice);
			if ((!tempMajor.getTitle().equals(studentModel.getMajor().getTitle())))
			{
				SAINviewController sainViewController = new SAINviewController(studentModel, tempMajor);
				// Instantiate new SAINviewController
				SAINview sainView = new SAINview(stage, sainViewController);
			} else
			{
				Alert alertTwo = new Alert(AlertType.ERROR);
				alertTwo.setTitle("ERROR");
				alertTwo.setHeaderText(null);
				alertTwo.setContentText("Choose a major other than the student's current major");
				alertTwo.showAndWait();
				onStudentChoiceWhatIfAnalysis();
			}
		});
		
	}
	
	private void showFacultySearch()
	{
		dialog = new TextInputDialog("Name");
		dialog.setTitle("Student Search");
		dialog.setHeaderText(null);
		dialog.setContentText("Enter name of student:");
		Optional<String> result = dialog.showAndWait();
		
		result.ifPresent(name ->
		{
			if (studentBag.isStudentValid(name))
			{
				// Get valid student
				studentModel = studentBag.getValidStudent();
				onValidStudentSearch(studentModel);
				
			} else
			{
				alert = new Alert(AlertType.ERROR);
				alert.setTitle("Error");
				alert.setHeaderText("Entered name is invalid");
				alert.setContentText("Please enter a valid name");
				alert.showAndWait();
				showFacultySearch();
			}
			
		});
	}
	
	private void onValidStudentSearch(Student student)
	{
		// NEW DIALOG
		alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("SBU Solar (Faculty)");
		alert.setHeaderText(null);
		alert.setContentText("Choose an option");
		viewButton = new ButtonType("View Student");
		editButton = new ButtonType("Edit Student");
		logoutButton = new ButtonType("Logout");
		alert.getButtonTypes().setAll(viewButton, editButton, logoutButton);
		Optional<ButtonType> resultTwo = alert.showAndWait();
		
		if (resultTwo.get() == viewButton)
		{
			// Instantiate new SAINviewController
			SAINviewController sainViewController = new SAINviewController(student, student.getMajor());
			// Instantiate new SAINview
			SAINview sainView = new SAINview(stage, sainViewController);
			onValidStudentSearch(student);
		} else if (resultTwo.get() == editButton)
		{
			
			SAINeditViewController sainEditViewController = new SAINeditViewController(stage, student, majorBag,
					courseBag);
			
			// SAINeditView sainEditView = new SAINeditView(stage, sainEditViewController);
			
		} else
		{
			alert.close();
		}
	}
	
}

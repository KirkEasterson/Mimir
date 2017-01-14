////////////////////
// Kirk Easterson //
// CST 242 Final ///
////////////////////

package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import controller.SAINeditViewController;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SAINeditView
{
	private Label					lblName;				// Name label
	private Label					lblNameResult;			// Name text field
	private HBox					hboxName;				// Name hbox
	private Button					btnUpdateName;
	private Label					lblMajor;				// Major label
	private Label					lblMajorResult;			// Major ComboBox
	private HBox					hboxMajor;				// Major hbox
	private Button					btnUpdateMajor;
	private Label					lblUserName;			// User name label
	private Label					lblUserNameResult;		// User name text field
	private HBox					hboxUserName;			// User name hbox
	private Button					btnUpdateUserName;
	private Label					lblPassword;			// Password label
	private Label					lblPasswordResult;		// Password text field
	private HBox					hboxPassword;			// Password hbox
	private Button					btnUpdatePassword;
	private Label					lblGPA;					// GPA label
	private Label					lblGPAResult;			// GPA text field
	private HBox					hboxGPA;				// GPA hbox
	private Button					btnUpdateGPA;
	private Label					lblCoursesTook;			// Courses took label
	private ComboBox				cmboBoxCoursesTook;		// Courses took combo box
	private HBox					hboxCoursesTook;		// Courses took hbox
	private Button					btnUpdateCoursesTook;
	private Label					lblCoursesOther;		// Courses other label
	private ComboBox				cmboBoxCoursesOther;	// Courses other combo box
	private HBox					hboxCoursesOther;		// Courses other hbox
	private Button					btnUpdateCoursesOther;
	private Label					lblCoursesFailed;		// Courses failed label
	private ComboBox				cmboBoxCoursesFailed;	// Courses failed combo box
	private HBox					hboxCoursesFailed;		// Courses failed hbox
	private Button					btnUpdateCoursesFailed;
	private Label					lblCoursesTaking;		// Courses taking label
	private ComboBox				cmboBoxCoursesTaking;	// Courses taking combo box
	private HBox					hboxCoursesTaking;		// Courses taking hbox
	private Button					btnUpdateCoursesTaking;
	
	private GridPane				gridPane;				// GridPane for student info
	
	private Button					btnSave;				// Save button
	private Button					btnCancel;				// Cancel button
	private HBox					hboxButtons;			// Buttons hbox
	
	private VBox					pane;					// Parent pane
	private Stage					stage;					// Stage
	
	private String					name;					// Name
	private String					userName;				// User name
	private String					password;				// Password
	private String					address;				// Address
	private String					gpa;					// GPA
	
	private Alert					alert;
	private TextInputDialog			textInputDialog;
	
	private SAINeditViewController	controller;				// Controller
	
	private SAINeditViewListener	sainEditViewListener;	// Listener
	
	// Constructor
	public SAINeditView(Stage stage, SAINeditViewController controller)
	{
		// Set stage to argument stage
		this.stage = stage;
		
		this.controller = controller;
		
		// Set title of stage
		stage.setTitle("SAIN Editor");
		
		// Initialize name label
		lblName = new Label("Name: ");
		lblName.setStyle("-fx-font-weight: bold");
		// Initialize name text field
		lblNameResult = new Label(controller.getModel().getName());
		lblNameResult.setStyle("-fx-font-posture: italic");
		btnUpdateName = new Button("Update Name");
		btnUpdateName.setOnAction(e ->
		{
			if (sainEditViewListener != null)
			{
				String temp = sainEditViewListener.updateNameClicked();
				if (!temp.equals(null))
				{
					lblNameResult.setText(temp);
				}
				
			}
		});
		
		// Initialize major label
		lblMajor = new Label("Major: ");
		lblMajor.setStyle("-fx-font-weight: bold");
		// Initialize major combo box
		lblMajorResult = new Label(controller.getModel().getMajor().getTitle());
		lblMajorResult.setStyle("-fx-font-posture: italic");
		// // Set width of major combo box
		// cmboBoxMajor.setMaxWidth(150);
		btnUpdateMajor = new Button("Update Major");
		btnUpdateMajor.setOnAction(e ->
		{
			
			List<String> choices = new ArrayList<>();
			choices.add("a");
			choices.add("b");
			choices.add("c");
			
			//////////////////////////////////////////////////
			for (int i = 0; i < controller.getMajorBag().getMajorList().size(); i++)
			{
				// choices.add(getMajorBag);
			}
			
			//////////////////////////////////////////////////
			ChoiceDialog<String> dialog = new ChoiceDialog<>("b", choices);
			dialog.setTitle("Choice Dialog");
			dialog.setHeaderText("Look, a Choice Dialog");
			dialog.setContentText("Choose your letter:");
			
			// Traditional way to get the response value.
			Optional<String> result = dialog.showAndWait();
			if (result.isPresent())
			{
				System.out.println("Your choice: " + result.get());
			}
			
			// The Java 8 way to get the response value (with lambda expression).
			result.ifPresent(letter -> System.out.println("Your choice: " + letter));
			
		});
		
		// Initialize username label
		lblUserName = new Label("User Name: ");
		lblUserName.setStyle("-fx-font-weight: bold");
		// Initialize username text field
		lblUserNameResult = new Label(controller.getModel().getUserName());
		lblUserNameResult.setStyle("-fx-font-posture: italic");
		btnUpdateUserName = new Button("Update User Name");
		btnUpdateUserName.setOnAction(e ->
		{
			if (sainEditViewListener != null)
			{
				String temp = sainEditViewListener.updateUserNameClicked();
				if (!temp.equals(null))
				{
					lblUserNameResult.setText(temp);
				}
			}
		});
		
		// Initialize password label
		lblPassword = new Label("Password: ");
		lblPassword.setStyle("-fx-font-weight: bold");
		// Initialize password text field
		lblPasswordResult = new Label(controller.getModel().getPassword());
		lblPasswordResult.setStyle("-fx-font-posture: italic");
		// Initialize password hbox
		hboxPassword = new HBox(20);
		btnUpdatePassword = new Button("Update Password");
		btnUpdatePassword.setOnAction(e ->
		{
			if (sainEditViewListener != null)
			{
				String temp = sainEditViewListener.updatePasswordClicked();
				if (!temp.equals(null))
				{
					lblPasswordResult.setText(temp);
				}
			}
		});
		
		// Initialize GPA label
		lblGPA = new Label("GPA: ");
		lblGPA.setStyle("-fx-font-weight: bold");
		// Initialize GPA text field
		lblGPAResult = new Label(Double.toString(controller.getModel().getGpa()));
		lblGPAResult.setStyle("-fx-font-posture: italic");
		btnUpdateGPA = new Button("Update GPA");
		btnUpdateGPA.setOnAction(e ->
		{
			if (sainEditViewListener != null)
			{
				double temp = sainEditViewListener.updateGpaClicked();
				if (temp == 0)
				{
					lblGPAResult.setText(Double.toString(temp));
				}
			}
		});
		
		// Initialize courses took label
		lblCoursesTook = new Label("Courses Taken: ");
		lblCoursesTook.setStyle("-fx-font-weight: bold");
		// Initialize courses took combo box
		cmboBoxCoursesTook = new ComboBox();
		// // Set width of courses took combo box
		// cmboBoxCoursesTook.setMaxWidth(150);
		btnUpdateCoursesTook = new Button("Update Courses Took");
		btnUpdateCoursesTook.setOnAction(e ->
		{
			// Check boxes next to each course indicating status (notTake, taken, took)
		});
		
		// Initialize other courses label
		lblCoursesOther = new Label("Other courses: ");
		lblCoursesOther.setStyle("-fx-font-weight: bold");
		// Initialize other courses combo box
		cmboBoxCoursesOther = new ComboBox();
		btnUpdateCoursesOther = new Button("Update Courses Other");
		btnUpdateCoursesOther.setOnAction(e ->
		{
			// Check boxes next to each course indicating status (notTake, taken, took)
		});
		
		// Initialize courses failed label
		lblCoursesFailed = new Label("Failed Courses: ");
		lblCoursesFailed.setStyle("-fx-font-weight: bold");
		// Initialize courses failed combo box
		cmboBoxCoursesFailed = new ComboBox();
		btnUpdateCoursesFailed = new Button("Update Courses Failed");
		btnUpdateCoursesFailed.setOnAction(e ->
		{
			// Check boxes next to each course indicating status (notTake, taken, took)
		});
		
		// Initialize courses currently taking label
		lblCoursesTaking = new Label("Courses Currently Taking: ");
		lblCoursesTaking.setStyle("-fx-font-weight: bold");
		// Initialize courses taking combo box
		cmboBoxCoursesTaking = new ComboBox();
		btnUpdateCoursesTaking = new Button("Update Courses Taking");
		btnUpdateCoursesTaking.setOnAction(e ->
		{
			// Check boxes next to each course indicating status (notTake, taken, took)
		});
		
		gridPane = new GridPane();
		gridPane.add(lblName, 0, 0, 1, 1);
		gridPane.add(lblNameResult, 1, 0, 1, 1);
		gridPane.add(btnUpdateName, 2, 0, 1, 1);
		gridPane.add(lblMajor, 0, 1, 1, 1);
		gridPane.add(lblMajorResult, 1, 1, 1, 1);
		gridPane.add(btnUpdateMajor, 2, 1, 1, 1);
		gridPane.add(lblUserName, 0, 2, 1, 1);
		gridPane.add(lblUserNameResult, 1, 2, 1, 1);
		gridPane.add(btnUpdateUserName, 2, 2, 1, 1);
		gridPane.add(lblPassword, 0, 3, 1, 1);
		gridPane.add(lblPasswordResult, 1, 3, 1, 1);
		gridPane.add(btnUpdatePassword, 2, 3, 1, 1);
		gridPane.add(lblGPA, 0, 4, 1, 1);
		gridPane.add(lblGPAResult, 1, 4, 1, 1);
		gridPane.add(btnUpdateGPA, 2, 4, 1, 1);
		gridPane.add(lblCoursesTook, 0, 5, 1, 1);
		gridPane.add(cmboBoxCoursesTook, 1, 5, 1, 1);
		gridPane.add(btnUpdateCoursesTook, 2, 5, 1, 1);
		gridPane.add(lblCoursesOther, 0, 6, 1, 1);
		gridPane.add(cmboBoxCoursesOther, 1, 6, 1, 1);
		gridPane.add(btnUpdateCoursesOther, 2, 6, 1, 1);
		gridPane.add(lblCoursesFailed, 0, 7, 1, 1);
		gridPane.add(cmboBoxCoursesFailed, 1, 7, 1, 1);
		gridPane.add(btnUpdateCoursesFailed, 2, 7, 1, 1);
		gridPane.add(lblCoursesTaking, 0, 8, 1, 1);
		gridPane.add(cmboBoxCoursesTaking, 1, 8, 1, 1);
		gridPane.add(btnUpdateCoursesTaking, 2, 8, 1, 1);
		
		gridPane.setVgap(10);
		gridPane.setHgap(10);
		
		// Initialize update button
		btnSave = new Button("Save");
		// Update button event handler
		btnSave.setOnAction(e ->
		{
			// Save all info to the student model, then close the window
			stage.close();
			// Go back to search pane
		});
		
		// Initialize cancel button
		btnCancel = new Button("Cancel");
		// Cancel button event handler
		btnCancel.setOnAction(e ->
		{
			stage.close();
			// Then go back to search pane
		});
		
		// Initialize hbox for button
		hboxButtons = new HBox(30);
		// Add buttons to buttons hbox
		hboxButtons.getChildren().addAll(btnSave, btnCancel);
		
		// Initialize the parent pane
		pane = new VBox(8);
		// Set padding for parent pane
		pane.setPadding(new Insets(10, 10, 10, 10));
		// Add hboxes to the parent pane
		// pane.getChildren().addAll(hboxName, hboxUserName, hboxPassword, hboxGPA, hboxCoursesTook, hboxCoursesOther,
		// hboxCoursesFailed, hboxCoursesTaking, hboxButtons);
		pane.getChildren().addAll(gridPane, hboxButtons);
		
		// // Insert methods to updates text fields
		// lblNameResult.setText(controller.getModel().getName());
		// lblUserNameResult.setText(controller.getModel().getUserName());
		// lblPasswordResult.setText(controller.getModel().getPassword());
		// lblGPAResult.setText(Double.toString(controller.getModel().getGpa()));
		
		// FIX THESE COMBO BOXES LATER
		// comboBoxCoursesTook.setText("");
		// comboBoxCoursesOther.setText("");
		// comboBoxCoursesFailed.setText("");
		// comboBoxCoursesTaking.setText("");
		
		// Set scene
		stage.setScene(new Scene(pane, 750, 500));
		// Show stage
		stage.show();
	}
	
	public void setController(SAINeditViewController controller)
	{
		this.controller = controller;
	}
	
	// Set listener method
	public void setSAINeditViewListener(SAINeditViewListener sainEditViewListener)
	{
		// Set listener to argument listener
		this.sainEditViewListener = sainEditViewListener;
	}
	
}

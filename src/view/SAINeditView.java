////////////////////
// Kirk Easterson //
// CST 242 Final ///
////////////////////

package view;

/////////////////////////////// UPDATE ALL TEXT FIELDS AND COMBO BOXES TO LABELS
/////////////////////////////// CREATE DIALOGS IF THE USER WISHES TO EDIT THE STUDENT

import controller.SAINeditViewController;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class SAINeditView
{
	private Label					lblDirections;
									
	private Label					lblNameSearch;
	private TextField				txtFldNameSearch;
	private Button					btnNameSearch;
	private HBox					hboxSearch;
									
	private Line					line1;
									
	private GridPane				infoGridPane;
									
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
									
	private SAINeditViewController	controller;				// Controller
									
	private SAINeditViewListener	sainEditViewListener;	// Listener
									
	// Constructor
	public SAINeditView(Stage stage)
	{
		// Set stage to argument stage
		this.stage = stage;
		
		// Set title of stage
		stage.setTitle("SAIN Editor");
		
		lblDirections = new Label("Enter the name of the student that you wish to view");
		lblDirections.setStyle("-fx-font-weight: bold");
		
		lblNameSearch = new Label("Name:");
		lblNameSearch.setStyle("-fx-font-weight: bold");
		txtFldNameSearch = new TextField("name");
		
		btnNameSearch = new Button("Search");
		btnNameSearch.setOnAction(e ->
		{
			name = txtFldNameSearch.getText();
			
			SAINeditViewEvent ev = new SAINeditViewEvent(this, name);
			if (sainEditViewListener != null)
			{
				sainEditViewListener.nameSearchClicked();
			}
			
			// Instantiate new runnable
			Platform.runLater(new Runnable()
			{
				// Override the run method
				@Override
				public void run()
				{
					// Insert methods to updates text fields
					lblNameResult.setText(controller.getModel().getName());
					lblUserNameResult.setText(controller.getModel().getUserName());
					lblPasswordResult.setText(controller.getModel().getPassword());
					// lblGPAResult.setText(controller.getModel().getGpa());
					// comboBoxCoursesTook.setText("");
					// comboBoxCoursesOther.setText("");
					// comboBoxCoursesFailed.setText("");
					// comboBoxCoursesTaking.setText("");
					
				}
			});
		});
		
		line1 = new Line(100, 40, 730, 40);
		
		infoGridPane = new GridPane();
		
		hboxSearch = new HBox(20);
		hboxSearch.getChildren().addAll(lblNameSearch, txtFldNameSearch, btnNameSearch);
		
		// Initialize name label
		lblName = new Label("Name: ");
		lblName.setStyle("-fx-font-weight: bold");
		// Translate label 5 pixels down to match the text field
		// lblName.setTranslateY(5);
		// Initialize name text field
		lblNameResult = new Label("name");
		lblNameResult.setStyle("-fx-font-posture: italic");
		// lblName.setFont(Font.font("Verdana", FontPosture.ITALIC, 9));
		// // Set width of name text field
		// txtFldName.setMaxWidth(150);
		btnUpdateName = new Button("Update Name");
		btnUpdateName.setOnAction(e ->
		{
		});
		// Initialize name hbox
		hboxName = new HBox(20);
		// Add label and text field to the hbox
		hboxName.getChildren().addAll(lblName, lblNameResult, btnUpdateName);
		
		// Initialize major label
		lblMajor = new Label("Major: ");
		lblMajor.setStyle("-fx-font-weight: bold");
		// Translate label 5 pixels down to match the text field
		// lblMajor.setTranslateY(5);
		// cmboBoxMajor = new ComboBox(majorBag.getMajorStringList());
		// Initialize major combo box
		lblMajorResult = new Label("major");
		lblMajorResult.setStyle("-fx-font-posture: italic");
		// // Set width of major combo box
		// cmboBoxMajor.setMaxWidth(150);
		btnUpdateMajor = new Button("Update Major");
		btnUpdateMajor.setOnAction(e ->
		{
		});
		// Initialize major hbox
		hboxMajor = new HBox();
		// Add label and combo box to major hbox
		hboxMajor.getChildren().addAll(lblMajor, lblMajorResult, btnUpdateMajor);
		
		// Initialize username label
		lblUserName = new Label("User Name: ");
		lblUserName.setStyle("-fx-font-weight: bold");
		// Translate label 5 pixels down to match the text field
		// lblUserName.setTranslateY(5);
		// Initialize username text field
		lblUserNameResult = new Label("user name");
		lblUserNameResult.setStyle("-fx-font-posture: italic");
		// // Set width of username text field
		// txtFldUserName.setMaxWidth(150);
		btnUpdateUserName = new Button("Update User Name");
		btnUpdateUserName.setOnAction(e ->
		{
		});
		// Initialize username hbox
		hboxUserName = new HBox(20);
		// Add label and text field to username hbox
		hboxUserName.getChildren().addAll(lblUserName, lblUserNameResult, btnUpdateUserName);
		
		// Initialize password label
		lblPassword = new Label("Password: ");
		lblPassword.setStyle("-fx-font-weight: bold");
		// Translate label 5 pixels down to match the text field
		// lblPassword.setTranslateY(5);
		// Initialize password text field
		lblPasswordResult = new Label("password");
		lblPasswordResult.setStyle("-fx-font-posture: italic");
		// // Set width of password text field
		// txtFldPassword.setMaxWidth(150);
		// Initialize password hbox
		hboxPassword = new HBox(20);
		btnUpdatePassword = new Button("Update Password");
		btnUpdatePassword.setOnAction(e ->
		{
		});
		// Add label and password and text field to password hbox
		hboxPassword.getChildren().addAll(lblPassword, lblPasswordResult, btnUpdatePassword);
		
		// Initialize GPA label
		lblGPA = new Label("GPA: ");
		lblGPA.setStyle("-fx-font-weight: bold");
		// Translate label 5 pixels down to match the text field
		// lblGPA.setTranslateY(5);
		// Initialize GPA text field
		lblGPAResult = new Label("GPA");
		lblGPAResult.setStyle("-fx-font-posture: italic");
		// // Set width of GPA text field
		// txtFldGPA.setMaxWidth(150);
		btnUpdateGPA = new Button("Update GPA");
		// Initialize GPA hbox
		hboxGPA = new HBox(20);
		// Add label and text field to GPA hbox
		hboxGPA.getChildren().addAll(lblGPA, lblGPAResult, btnUpdateGPA);
		
		// Initialize courses took label
		lblCoursesTook = new Label("Courses Taken: ");
		lblCoursesTook.setStyle("-fx-font-weight: bold");
		// Translate label 5 pixels down to match the text field
		// lblCoursesTook.setTranslateY(5);
		// Initialize courses took combo box
		cmboBoxCoursesTook = new ComboBox();
		// // Set width of courses took combo box
		// cmboBoxCoursesTook.setMaxWidth(150);
		btnUpdateCoursesTook = new Button("Update Courses Took");
		btnUpdateCoursesTook.setOnAction(e ->
		{
		});
		// Initialize courses took hbox
		hboxCoursesTook = new HBox(20);
		// Add label and combo box to courses took hbox
		hboxCoursesTook.getChildren().addAll(lblCoursesTook, cmboBoxCoursesTook, btnUpdateCoursesTook);
		
		// Initialize other courses label
		lblCoursesOther = new Label("Other courses: ");
		lblCoursesOther.setStyle("-fx-font-weight: bold");
		// Translate label 5 pixels down to match the text field
		// lblCoursesOther.setTranslateY(5);
		// Initialize other courses combo box
		cmboBoxCoursesOther = new ComboBox();
		// // Set width of other courses combo box
		// cmboBoxCoursesOther.setMaxWidth(150);
		btnUpdateCoursesOther = new Button("Update courses Other");
		// Initialize other courses hbox
		hboxCoursesOther = new HBox(20);
		// Add label and combo box to other courses hbox
		hboxCoursesOther.getChildren().addAll(lblCoursesOther, cmboBoxCoursesOther, btnUpdateCoursesOther);
		
		// Initialize courses failed label
		lblCoursesFailed = new Label("Failed Courses: ");
		lblCoursesFailed.setStyle("-fx-font-weight: bold");
		// Translate label 5 pixels down to match the text field
		// lblCoursesFailed.setTranslateY(5);
		// Initialize courses failed combo box
		cmboBoxCoursesFailed = new ComboBox();
		// // Set width of courses failed combo box
		// cmboBoxCoursesFailed.setMaxWidth(150);
		btnUpdateCoursesFailed = new Button("Update Courses Failed");
		btnUpdateCoursesFailed.setOnAction(e ->
		{
		});
		// Initialize courses failed hbox
		hboxCoursesFailed = new HBox(20);
		// Add label and combo box to courses failed hbox
		hboxCoursesFailed.getChildren().addAll(lblCoursesFailed, cmboBoxCoursesFailed, btnUpdateCoursesFailed);
		
		// Initialize courses currently taking label
		lblCoursesTaking = new Label("Courses Currently Taking: ");
		lblCoursesTaking.setStyle("-fx-font-weight: bold");
		// Translate label 5 pixels down to match the text field
		// lblCoursesTaking.setTranslateY(5);
		// Initialize courses taking combo box
		cmboBoxCoursesTaking = new ComboBox();
		// // Set width of courses taking combo box
		// cmboBoxCoursesTaking.setMaxWidth(150);
		btnUpdateCoursesTaking = new Button("Update Courses Taking");
		btnUpdateCoursesTaking.setOnAction(e ->
		{
		});
		// Initialize courses tkaing hbox
		hboxCoursesTaking = new HBox(20);
		// Add label and combo box to courses taking hbox
		hboxCoursesTaking.getChildren().addAll(lblCoursesTaking, cmboBoxCoursesTaking, btnUpdateCoursesTaking);
		
		// Initialize update button
		btnSave = new Button("Save");
		// Update button event handler
		btnSave.setOnAction(e ->
		{
			// // Get name from text field
			// name = txtFldName.getText();
			// // Get major from combo box
			// // major = txtFldMajor.getText();
			// // Get username from text field
			// userName = txtFldUserName.getText();
			// // Get password from text field
			// password = txtFldPassword.getText();
			// // Get GPA from text field
			// gpa = txtFldGPA.getText();
			// Get courses took form combo box
			// Get courses other form combo box
			// Get courses failed form combo box
			// Get courses taking form combo box
			
			// SAINediViewEvent ev = new SAINeditViewEvent(this, name, userName,
			// password, gpa);
			
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
		pane.getChildren().addAll(lblDirections, hboxSearch, line1, hboxName, hboxUserName, hboxPassword, hboxGPA,
				hboxCoursesTook, hboxCoursesOther, hboxCoursesFailed, hboxCoursesTaking, hboxButtons);
				
		// Set scene
		stage.setScene(new Scene(pane, 750, 500));
		// Show stage
		stage.show();
	}
	
	// Set listener method
	public void setSAINeditViewListener(SAINeditViewListener sainEditViewListener)
	{
		// Set listener to argument listener
		this.sainEditViewListener = sainEditViewListener;
	}
	
}

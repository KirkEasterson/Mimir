////////////////////
// Kirk Easterson //
// CST 242 Final ///
////////////////////

package view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginView
{
	private HBox				paneUserName;		// Username HBox
	private Label				lblUserName;		// Username label
	private TextField			txtFldUserName;		// Username text field
	private HBox				panePassword;		// Password HBox
	private Label				lblPassword;		// Password label
	private PasswordField		txtFldPassword;		// Password text field
	private Button				btnLogin;			// Login button
	// private Hyperlink hplinkProblems;
	
	private VBox				pane;				// VBox for everything
	private LoginViewListener	loginViewListener;	// Listener
	private Stage				stage;				// Stage
								
	private String				userName;			// Username string
	private String				password;			// Password string
								
	// Constructor
	public LoginView(Stage stage)
	{
		// Set stage to argument stage
		this.stage = stage;
		// Set title
		stage.setTitle("Login");
		
		// Initialize hbox for username
		paneUserName = new HBox(20);
		// Initialize label for username
		lblUserName = new Label("User Name:");
		// Translate 5 pixels down to match level of text field
		lblUserName.setTranslateY(5);
		// Initialize username text field
		txtFldUserName = new TextField();
		// Set width of username text field
		txtFldUserName.setMaxWidth(150);
		// Move username text field 7 pixels to the left
		txtFldUserName.setTranslateX(-7);
		// Add username label and text field to the username hbox
		paneUserName.getChildren().addAll(lblUserName, txtFldUserName);
		
		// Initialize hbox for password
		panePassword = new HBox(20);
		// Initialize label for password
		lblPassword = new Label("Password:");
		// Translate 5 pixels down to match level of text field
		lblPassword.setTranslateY(5);
		// Initialize password text field
		txtFldPassword = new PasswordField();
		// Set width of password text field
		txtFldPassword.setMaxWidth(150);
		// Add password label and text field to password hbox
		panePassword.getChildren().addAll(lblPassword, txtFldPassword);
		
		// Initialize login button
		btnLogin = new Button("Login");
		// Login button event handler
		btnLogin.setOnAction(e ->
		{
			// Get username from text field
			userName = txtFldUserName.getText();
			// Get password form text field
			password = txtFldPassword.getText();
			
			// Create new loginView event
			LoginViewEvent ev = new LoginViewEvent(this, userName, password);
			// If listener isn't null
			if (loginViewListener != null)
			{
				// Perform login button method
				loginViewListener.loginButtonClicked(ev);
			}
			
			//			SAINviewController sainViewController = new SAINviewController(loginViewController.getStudentModel(),
			//					loginViewController.getStudentModel().getMajor());
			//			stage.setScene(SAINview());
			//			stage.show();
			
		});
		
		// hplinkProblems = new Hyperlink("Having trouble logging in?");
		
		// Initialize parent pane
		pane = new VBox(10);
		// Set padding of parent pane
		pane.setPadding(new Insets(10, 10, 10, 10));
		// Add everything to the parent pane
		pane.getChildren().addAll(paneUserName, panePassword, btnLogin);
		
		// Set the stage
		stage.setScene(new Scene(pane, 265, 150));
		// Show the stage
		stage.show();
		
	}
	
	// Set listener method
	public void setLoginViewListener(LoginViewListener loginViewListener)
	{
		// Set listener to argument listener
		this.loginViewListener = loginViewListener;
	}
	
}

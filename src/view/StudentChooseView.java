package view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class StudentChooseView
{
	private HBox						pane;
	private Button						sainButton;
	private Button						whatIfButton;
	private Button						logoutButton;
	private StudentChooseViewListener	studentChooseViewListener;
										
	public StudentChooseView(Stage stage)
	{
		stage.setTitle("Choose and Option");
		
		sainButton = new Button("SAIN Report");
		sainButton.setOnAction(e ->
		{
		
		});
		
		whatIfButton = new Button("What If Analysis");
		whatIfButton.setOnAction(e ->
		{
		
		});
		
		logoutButton = new Button("Log Out");
		logoutButton.setOnAction(e ->
		{
		
		});
		
		pane = new HBox(10);
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.getChildren().addAll(sainButton, whatIfButton, logoutButton);
		
		stage.setScene(new Scene(pane));
		stage.show();
	}
	
	public void setStudentChooseViewListener(StudentChooseViewListener studentChooseViewListener)
	{
		this.studentChooseViewListener = studentChooseViewListener;
	}
	
}

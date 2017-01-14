
package view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Staff;
import model.StudentBag;

public class StaffSearchView
{
	private Staff					staffModel;
	private StudentBag				studentBag;
	
	// private Alert alert;
	
	private HBox					namePane;
	private Label					directionsLabel;
	private TextField				inputTextField;
	
	private Button					searchButton;
	private VBox					pane;
	
	private StaffSearchViewListener	staffSearchViewListener;
	
	public StaffSearchView(Stage stage)
	{
		stage.setTitle("Student Search");
		
		directionsLabel = new Label("Name of Student:");
		inputTextField = new TextField();
		namePane = new HBox(10);
		namePane.getChildren().addAll(directionsLabel, inputTextField);
		
		searchButton = new Button("Search");
		searchButton.setOnAction(e ->
		{
			
		});
		
		pane = new VBox(10);
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.getChildren().addAll(namePane, searchButton);
		
		stage.setScene(new Scene(pane));
		stage.show();
		
	}
	
	public void setStaffSearchViewListener(StaffSearchViewListener staffSearchViewListener)
	{
		this.staffSearchViewListener = staffSearchViewListener;
	}
	
}

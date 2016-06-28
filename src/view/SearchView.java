package view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SearchView
{
	private String		name;		// Name to search
	private Label		lblName;	// Name label
	private TextField	txtFldName;	// Name text field
	private HBox		namePane;	// Name pane
	private Button		btnSearch;	// Search button
	private VBox		pane;		// Parent pane
	private Stage		stage;		// Stage
						
	// Constructor
	public SearchView(Stage stage)
	{
		// Set stage to argument stage
		this.stage = stage;
		
		// Set title of stage
		stage.setTitle("Search");
		
		// Initialize name label
		lblName = new Label("Name:");
		// Translate name label down 5 pixels to match name text field
		lblName.setTranslateY(5);
		
		// Initialize name text field
		txtFldName = new TextField();
		// Set width fo name text field
		txtFldName.setMaxWidth(180);
		
		// Initialize name pane
		namePane = new HBox(5);
		// Add label and text field to name pane
		namePane.getChildren().addAll(lblName, txtFldName);
		
		// Initialize search button
		btnSearch = new Button("Search");
		// Translate search button 80 pixels to the right
		btnSearch.setTranslateX(80);
		
		// Search button event handler
		btnSearch.setOnAction(e ->
		{
			// get name from text field
			name = txtFldName.getText();
			
			//DONT FORGET EVENT HANDLER
		});
		
		// Initialize parent pane
		pane = new VBox(10);
		// Set padding for parent pane
		pane.setPadding(new Insets(10, 10, 10, 10));
		// Add pane and button to parent pane
		pane.getChildren().addAll(namePane, btnSearch);
		
		// Set the scene
		stage.setScene(new Scene(pane, 230, 80));
		// Show the stage
		stage.show();
		
	}
	
}

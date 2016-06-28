package view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TESTwhatIfView
{
	
	private Label					chooseLabel;
	private ComboBox				chooseComboBox;
	private HBox					choosePane;
	private Button					generateButton;
	private VBox					pane;
	private Stage					stage;
	private TESTwhatIfViewListener	testWhatIfViewListener;
									
	public TESTwhatIfView(Stage stage)
	{
		this.stage = stage;
		stage.setTitle("What If Analysis");
		
		chooseLabel = new Label("Choose major for analysis:");
		chooseComboBox = new ComboBox();
		choosePane = new HBox(10);
		choosePane.getChildren().addAll(chooseLabel, chooseComboBox);
		
		generateButton = new Button("Generate Analysis");
		generateButton.setOnAction(e ->
		{
		
		});
		
		pane = new VBox(10);
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.getChildren().addAll(choosePane, generateButton);
		
		stage.setScene(new Scene(pane, 250, 100));
		stage.show();
	}
	
	public void setTESTwhatIfViewListener(TESTwhatIfViewListener testwhatIfViewListener)
	{
		this.testWhatIfViewListener = testWhatIfViewListener;
	}
}

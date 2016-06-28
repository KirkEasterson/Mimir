package controller;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import model.Major;
import model.MajorBag;
import model.Student;
import view.SAINview;
import view.TESTwhatIfView;
import view.TESTwhatIfViewEvent;
import view.TESTwhatIfViewListener;

public class TESTwhatIfViewController
{
	private Student				studentModel;
	private MajorBag			majorBag;
	private Major				majorModel;
	private Alert				alert;
	private Stage				stage;
	private SAINview			sainView;
	private SAINviewController	sainViewController;
								
	public TESTwhatIfViewController(TESTwhatIfView window, Student studentModel, MajorBag majorBag)
	{
		this.studentModel = studentModel;
		
		window.setTESTwhatIfViewListener(new TESTwhatIfViewListener()
		{
			@Override
			public void generateButtonClicked(TESTwhatIfViewEvent ev)
			{
				majorModel = ev.getMajor();
				
				if (majorModel.getTitle().equals(studentModel.getMajor().getTitle()))
				{
					alert = new Alert(AlertType.ERROR);
					alert.setTitle("ERROR");
					alert.setHeaderText("Please choose a major other than the student's current major");
					alert.showAndWait();
					return;
				}
				
				sainViewController = new SAINviewController(studentModel, majorModel);
				sainView = new SAINview(stage, sainViewController);
				
			}
			
		});
	}
	
}

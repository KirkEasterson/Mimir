package controller;

import javafx.scene.control.Alert;
import javafx.stage.Stage;
import model.MajorBag;
import model.Student;
import view.SAINview;
import view.StudentChooseView;
import view.StudentChooseViewEvent;
import view.StudentChooseViewListener;
import view.TESTwhatIfView;

public class StudentChooseViewController
{
	private Student						studentModel;
	private MajorBag					majorBag;
										
	private Alert						alert;
										
	private SAINview					sainView;
	private SAINviewController			sainViewController;
	private TESTwhatIfView				whatIfView;
	private TESTwhatIfViewController	whatIfViewController;
										
	private Stage						stage;
										
	public StudentChooseViewController(StudentChooseView window, Student studentModel, MajorBag majorBag)
	{
		this.studentModel = studentModel;
		this.majorBag = majorBag;
		
		window.setStudentChooseViewListener(new StudentChooseViewListener()
		{
			
			@Override
			public void sainButtonClicked(StudentChooseViewEvent ev)
			{
				sainViewController = new SAINviewController(studentModel, studentModel.getMajor());
				sainView = new SAINview(stage, sainViewController);
			}
			
			@Override
			public void whatIfButtonClicked(StudentChooseViewEvent ev)
			{
				whatIfView = new TESTwhatIfView(stage);
				whatIfViewController = new TESTwhatIfViewController(whatIfView, studentModel, majorBag);
				
			}
			
		});
	}
	
}

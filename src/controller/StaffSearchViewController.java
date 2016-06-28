package controller;

import javafx.scene.control.Alert;
import javafx.stage.Stage;
import model.Staff;
import model.Student;
import model.StudentBag;
import view.StaffSearchView;
import view.StaffSearchViewEvent;
import view.StaffSearchViewListener;

public class StaffSearchViewController
{
	private Staff		staffModel;
	private Student		studentmodel;
	private StudentBag	studentBag;
						
	private String		name;
						
	private Alert		alert;
						
	private Stage		stage;
						
	public StaffSearchViewController(StaffSearchView window, Staff staffModel, String name)
	{
		this.staffModel = staffModel;
		this.name = name;
		
		window.setStaffSearchViewListener(new StaffSearchViewListener(){

			@Override
			public void searchButtonClicked(StaffSearchViewEvent ev)
			{
				
			}
			
		});
		
	}
	
}

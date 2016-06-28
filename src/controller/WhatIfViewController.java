package controller;

import model.MajorBag;
import model.Student;
import view.WhatIfView;

public class WhatIfViewController
{
	private WhatIfView	view;
	private Student		studentModel;
	private MajorBag	majorBagModel;
						
	public WhatIfViewController(Student studentModel, MajorBag majorBagModel)
	{
		// Set studentModel to argument studentModel
		this.studentModel = studentModel;
		// Set majorModel to argument majorModel
		this.majorBagModel = majorBagModel;
	}
	
	// Get student model
	public Student getStudentModel()
	{
		return studentModel;
	}
	
	// Get major bag model
	public MajorBag getMajorBagModel()
	{
		return majorBagModel;
	}
}

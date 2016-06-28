////////////////////
// Kirk Easterson //
// CST 242 Final ///
////////////////////

package controller;

import model.Major;
import model.Student;

public class SAINviewController
{
	//	private SAINview	view;
	private Student	studentModel;	// Model for student
	private Major	majorModel;		// Model for major
					
	// Constructor
	public SAINviewController(Student studentModel, Major majorModel)
	{
		// Set studentModel to argument studentModel
		this.studentModel = studentModel;
		// Set majorModel to argument majorModel
		this.majorModel = majorModel;
	}
	
	// Get student model
	public Student getStudentModel()
	{
		return studentModel;
	}
	
	// Get major model
	public Major getMajorModel()
	{
		return majorModel;
	}
	
}

package view;

import java.util.EventObject;

import model.Student;

public class SAINviewEvent extends EventObject
{
	private Student studentModel; // Student model
	
	// One argument constructor
	public SAINviewEvent(Object source)
	{
		// Inherit methods
		super(source);
	}
	
	// Two argument constructor
	public SAINviewEvent(Object source, Student studentModel)
	{
		// Inherit methods
		super(source);
		// Set studentModel to argument studentModel
		this.studentModel = studentModel;
	}
	
	// Get student model
	public Student getModel()
	{
		return studentModel;
	}
	
}

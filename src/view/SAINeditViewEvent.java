package view;

import java.util.EventObject;

import model.Major;

public class SAINeditViewEvent extends EventObject
{
	private String	name;		// Name
	private Major	major;		// Major
	private String	userName;	// Username
	private String	password;	// Password
	private String	gpa;		// GPA
					
	// One argument constructor
	public SAINeditViewEvent(Object source)
	{
		// Inherit methods
		super(source);
	}
	
	// Six arguemnt constructor
	public SAINeditViewEvent(Object source, String name)
	{
		// Inherit methods
		super(source);
		// Set name to argument name
		this.name = name;
	}
	
	// Get name
	public String getName()
	{
		return name;
	}
	
	// Get major
	public Major getMajor()
	{
		return major;
	}
	
	// Get username
	public String getUserName()
	{
		return userName;
	}
	
	// Get password
	public String getPassword()
	{
		return password;
	}
	
	// Get GPA
	public String getGpa()
	{
		return gpa;
	}
	
}

package view;

import java.util.EventObject;

import model.Major;

public class TESTwhatIfViewEvent extends EventObject
{
	private Major major;
	
	public TESTwhatIfViewEvent(Object source)
	{
		super(source);
	}
	
	public TESTwhatIfViewEvent(Object source, Major major)
	{
		super(source);
		this.major = major;
	}
	
	public Major getMajor()
	{
		return major;
	}
	
}

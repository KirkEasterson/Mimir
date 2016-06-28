////////////////////
// Kirk Easterson //
// CST 242 Final ///
////////////////////

package view;

import java.util.EventObject;

public class LoginViewEvent extends EventObject
{
	private String	userName;	// Username
	private String	password;	// Password
					
	// One argument constructor
	public LoginViewEvent(Object source)
	{
		// Inherit methods
		super(source);
	}
	
	// Three argument constructor
	public LoginViewEvent(Object source, String userName, String password)
	{
		// Inherit methods
		super(source);
		// Set username to argument username
		this.userName = userName;
		// Set password to argument password
		this.password = password;
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
	
}

////////////////////
// Kirk Easterson //
// CST 242 Final ///
////////////////////

package model;

public class Staff
{
	private String	name;		// Name of staff
	private String	userName;	// Username
	private String	password;	// Password
	private int		status;		// Permission to edit students' record
					
	// Constructor
	public Staff(String name, String userName, String password)
	{
		// Set name to argument name
		this.name = name;
		// Set userName to argument userName
		this.userName = userName;
		// Set password to argument password
		this.password = password;
	}
	
	// Get name method
	public String getName()
	{
		return name;
	}
	
	// Set name method
	public void setName(String name)
	{
		this.name = name;
	}
	
	// Get userName method
	public String getUserName()
	{
		return userName;
	}
	
	// Set userName method
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	// Get password method
	public String getPassword()
	{
		return password;
	}
	
	// Set password method
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	// Get status method
	public int getStatus()
	{
		return status;
	}
	
	// Set status method
	public void setStatus(int status)
	{
		this.status = status;
	}
	
	// ToString method
	@Override
	public String toString()
	{
		return "Staff [name=" + name + ", userName=" + userName + ", password=" + password + "]";
	}
	
}

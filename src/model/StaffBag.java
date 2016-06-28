////////////////////
// Kirk Easterson //
// CST 242 Final ///
////////////////////

package model;

import java.util.HashSet;

public class StaffBag
{
	
	private HashSet<Staff>	staffSet;	// Bag to hold staff objects
	private Staff			validStaff;	// Temporary staff for validation
	private int				staffCount;	// Number of staffs in bag
							
	// Constructor
	public StaffBag()
	{
		// Initialize HashSet
		staffSet = new HashSet<Staff>();
		// Initialize count to zero
		staffCount = 0;
	}
	
	// Add staff member to bag
	public void add(Staff staff)
	{
		// Add staff to the hash set
		staffSet.add(staff);
		// Increase count  by one
		staffCount++;
	}
	
	// Validation method
	public boolean isStaffValid(String userName, String password)
	{
		// Iterate through staff hashset
		for (Staff s : staffSet)
		{
			// If username and password match
			if ((s.getUserName().equals(userName)) && (s.getPassword().equals(password)))
			{
				// Valid staff member is the current staff
				validStaff = s;
				return true;
			}
		}
		return false;
	}
	
	// Get the valid staff member
	public Staff getValidStaff()
	{
		return validStaff;
	}
	
	// public Staff findByUserName(String userName)
	// {
	// Iterator itStaff = staffSet.iterator();
	// while (itStaff.hasNext())
	// {
	// tempStaff = (Staff) itStaff.next();
	// if (tempStaff.getUserName().equals(userName))
	// {
	// return tempStaff;
	// }
	// }
	// return null;
	// }
	
}

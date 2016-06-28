////////////////////
// Kirk Easterson //
// CST 242 Final ///
////////////////////

package model;

import java.util.ArrayList;

public class MajorBag
{
	private ArrayList<Major>	majorList;			// TEST List of majors
	private ArrayList<String>	majorStringList;	// List of majors as string
	private int					majorCount;			// Count for number of majors
								
	// Constructor
	public MajorBag()
	{
		// Instantiate majorList
		//		majorList = FXCollections.observableArrayList();
		majorList = new ArrayList<>();
		majorStringList = new ArrayList<>();
		// Set count to zero
		majorCount = 0;
	}
	
	// Add major method
	public void add(Major major)
	{
		// Add major to bag
		majorList.add(major);
		majorStringList.add(major.getTitle());
		// Increase the count by one
		majorCount++;
	}
	
	// Get majorList
	public ArrayList<Major> getMajorList()
	{
		return majorList;
	}
	
	// Get majorList as string
	public ArrayList<String> getMajorStringList()
	{
		return majorStringList;
	}
	
	public Major findByString(String majorName)
	{
		for (Major temp : majorList)
		{
			if (temp.getTitle().equals(majorName))
			{
				return temp;
			}
		}
		return null;
	}
	
}

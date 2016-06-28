////////////////////
// Kirk Easterson //
// CST 242 Final ///
////////////////////

package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class StudentBag
{
	private ObservableList<Student>	studentSet;		// Bag to hold student objects
	private Student					validStudent;	// Temporary student for validation
	private int						studentCount;	// Number of students in bag
									
	// Constructor
	public StudentBag()
	{
		// Initialize HashSet
		studentSet = FXCollections.observableArrayList();
		// Initialize count to zero
		studentCount = 0;
	}
	
	// Add student to bag
	public void add(Student student)
	{
		// Add student to the hash set
		studentSet.add(student);
		// Increase count by one
		studentCount++;
	}
	
	// Validation method
	public boolean isStudentValid(String userName, String password)
	{
		// Iterate through student hashset
		for (Student s : studentSet)
		{
			// If username and password match
			if ((s.getUserName().equals(userName)) && (s.getPassword().equals(password)))
			{
				// Vald student is the current student
				validStudent = s;
				return true;
			}
		}
		return false;
	}
	
	public boolean isStudentValid(String name)
	{
		// Iterate through student hashset
		for (Student s : studentSet)
		{
			// If name match
			if (s.getName().equalsIgnoreCase(name))
			{
				// Valid student is the current student
				validStudent = s;
				return true;
			}
		}
		return false;
	}
	
	// Get the valid student
	public Student getValidStudent()
	{
		return validStudent;
	}
	
	// public Student findByUserName(String userName)
	// {
	//// for (Student s : studentSet)
	//// {
	//// if (s.getUserName().equals(userName))
	//// {
	//// return s;
	//// }
	//// }
	//// return null;
	//
	// Iterator itStudent = studentSet.iterator();
	// while (itStudent.hasNext())
	// {
	// tempStudent = (Student) itStudent.next();
	// if (tempStudent.getUserName().equals(userName))
	// {
	//
	// return tempStudent;
	// }
	// }
	// return null;
	// }
	
}

////////////////////
// Kirk Easterson //
// CST 242 Final ///
////////////////////

package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Major
{
	
	private String					title;				// Major title
	private String					courseSubj;			// Subject of major
	private double					totalCredits;		// Total credits for major
	private double					minGpa;				// Minimum GPA
	private double					minCreditsAtSCCC;	// Minimum number of credits that must be taken at SCCC
	private ObservableList<Course>	majorCourses;		// Major courses required for major
	private ObservableList<Course>	nonMajorCourses;	// Non-major courses required for major
									
	// Constructor
	public Major(String title, String courseSubj)
	{
		// Set title to argument title
		this.title = title;
		// Set courseSubj to argument courseSubj
		this.courseSubj = courseSubj;
		// Set total number of credits to 65.5
		totalCredits = 65.5;
		// Set minimum GPA to 2.0
		minGpa = 2;
		// Set minimum number of credits to 30
		minCreditsAtSCCC = 30;
		// Instantiate majorCourses list
		majorCourses = FXCollections.observableArrayList();
		// Instantiate nonMajorCourses list
		nonMajorCourses = FXCollections.observableArrayList();
	}
	
	// Get major title method
	public String getTitle()
	{
		return title;
	}
	
	// Set major title method
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	// Get course subject method
	public String getCourseSubj()
	{
		return courseSubj;
	}
	
	// Get total credits
	public double getTotalCredits()
	{
		return totalCredits;
	}
	
	// Set total credits
	public void setTotalCredits(int totalCredits)
	{
		this.totalCredits = totalCredits;
	}
	
	// Get minimum GPA
	public double getMinGpa()
	{
		return minGpa;
	}
	
	// Set minimum GPA
	public void setMinGpa(double minGpa)
	{
		this.minGpa = minGpa;
	}
	
	// Get minimum credits at SCCC
	public double getMinCreditsAtSCCC()
	{
		return minCreditsAtSCCC;
	}
	
	// Set minimum credits at SCCC
	public void setMinCreditsAtSCCC(double minCreditsAtSCCC)
	{
		this.minCreditsAtSCCC = minCreditsAtSCCC;
	}
	
	// Add major course to major list
	public void addMajorCourse(Course course)
	{
		majorCourses.add(course);
	}
	
	// Remove major course from major list
	public void removeMajorCourse(Course course)
	{
		majorCourses.remove(course);
	}
	
	// Add non major course to non major list
	public void addNonMajorCourse(Course course)
	{
		nonMajorCourses.add(course);
	}
	
	// Remove non major course from non major list
	public void removeNonMajorCourse(Course course)
	{
		nonMajorCourses.remove(course);
	}
	
	// Get major courses
	public ObservableList<Course> getMajorCourses()
	{
		return majorCourses;
	}
	
	// Get non major courses
	public ObservableList<Course> getNonMajorCourses()
	{
		return nonMajorCourses;
	}
}

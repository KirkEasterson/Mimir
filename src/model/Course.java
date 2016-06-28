////////////////////
// Kirk Easterson //
// CST 242 Final ///
////////////////////

package model;

public class Course
{
	
	private String	courseSubj;			// Subject of course
	private int		courseNum;			// Course number
	private String	areaRequirement;	// Area requirement for course
	private String	courseTitle;		// Title of course
	private String	courseAttributes;	// Attributes for course
	private String	otherAttributes;	// Other attributes for course
	private double	credits;			// Number of credits for the course
	private int		grade;				// Grade received by student 
	private String	counts;				// Counts for financial aid
	private String	nys;				// Counts for NYS financial aid
	private String	fed;				// Counts for Federal financial aid
	private String	repeat;				// Whether nor not the student is repeating the course
					
	// Constructor
	public Course(String courseTitle, String courseSubj, int courseNum, double credits)
	{
		// Set courseTitle to argument courseTitle
		this.courseTitle = courseTitle;
		// Set courseSubj to argument courseSubj
		this.courseSubj = courseSubj;
		// Set courseNum to argument courseNum
		this.courseNum = courseNum;
		// Set credits to argument credits
		this.credits = credits;
	}
	
	// Get course subject
	public String getCourseSubj()
	{
		return courseSubj;
	}
	
	// Get course grade
	public String getGrade()
	{
		return Integer.toString(grade);
	}
	
	// Set course grade
	public void setGrade(int grade)
	{
		this.grade = grade;
	}
	
	// Get course number
	public String getCourseNum()
	{
		return Integer.toString(courseNum);
	}
	
	// Get course title
	public String getCourseTitle()
	{
		return courseTitle;
	}
	
	// Get number of credits as a double
	public double getCreditsDouble()
	{
		return credits;
	}
	
	// Get number of credits as a string
	public String getCredits()
	{
		return Double.toString(credits);
	}
	
	// get course attributes
	public String getCourseAttributes()
	{
		return courseAttributes;
	}
	
	// Get other attributes
	public String getOtherAttributes()
	{
		return otherAttributes;
	}
	
	// Get whether or not it counts
	public String getCounts()
	{
		return counts;
	}
	
	// Set whether or not it counts
	public void setCounts(String counts)
	{
		this.counts = counts;
	}
	
	// Get NYS financial aid eligibility
	public String getNys()
	{
		return nys;
	}
	
	// Set NYS financial aid eligibility
	public void setNys(String nys)
	{
		this.nys = nys;
	}
	
	// Get Federal financial aid eligibility
	public String getFed()
	{
		return fed;
	}
	
	// Set Federal financial aid eligibility
	public void setFed(String fed)
	{
		this.fed = fed;
	}
	
	// Get whether or the course is repeated
	public String getRepeat()
	{
		return repeat;
	}
	
	// Set whether or not the student has repeated the course
	public void setRepeat(String repeat)
	{
		this.repeat = repeat;
	}
	
	// Override the toString method
	@Override
	public String toString()
	{
		return courseSubj + " " + courseNum + " - " + courseTitle;
	}
	
	// public void setCredits(int credits)
	// {
	// this.credits = credits;
	// }
	
}

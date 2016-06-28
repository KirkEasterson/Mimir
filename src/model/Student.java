////////////////////
// Kirk Easterson //
// CST 242 Final ///
////////////////////

package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Student
{
	private String					name;						// Name of student
	private Major					major;						// Major of student
	private String					userName;					// Username for student
	private String					password;					// Password for student
	private double					gpa;						// Student's GPA
	private double					totalCredsAtSCCC;			// Total credits taken at SCCC
	private double					totalTransferCredits;		// Total credits transferred in
	private double					totalCreditsTowardsDegree;	// Totla number of credits towards the degree
	private double					totalCredits;				// Total credits taken
	private ObservableList<Course>	coursesTook;				// List of courses taken
	//	private ObservableList<String>	coursesStringTook;
	private int						coursesTookCount;			// Number of courses taken
	private ObservableList<Course>	coursesOther;				// List of other courses taken
	private int						coursesOtherCount;			// Number of other courses taken
	private ObservableList<Course>	coursesFailed;				// List of courses failed
	private int						coursesFailedCount;			// Number of courses failed
	private ObservableList<Course>	coursesTaking;				// List of courses currently taking
	private int						coursesTakingCount;			// Number of courses currently taking
									
	// Constructor
	public Student(String name, String userName, String password)
	{
		// Set name to arhument name
		this.name = name;
		// Set userName to argument userName
		this.userName = userName;
		// Set password to argument password
		this.password = password;
		// Initialize courses took list
		coursesTook = FXCollections.observableArrayList();
		// Set courses took count to zero
		coursesTookCount = 0;
		// Initialize other courses taken list
		coursesOther = FXCollections.observableArrayList();
		// Set other courses taken count to zero
		coursesOtherCount = 0;
		// Initialize courses failed list
		coursesFailed = FXCollections.observableArrayList();
		// Set courses failed count to zero
		coursesFailedCount = 0;
		// Initialize courses taking list
		coursesTaking = FXCollections.observableArrayList();
		// Set courses taking count to zero
		coursesTakingCount = 0;
	}
	
	// Get name method
	public String getName()
	{
		return name;
	}
	
	// Set naem method
	public void setName(String name)
	{
		this.name = name;
	}
	
	// Get major method
	public Major getMajor()
	{
		return major;
	}
	
	// Set major method
	public void setMajor(Major major)
	{
		this.major = major;
	}
	
	// Get username method
	public String getUserName()
	{
		return userName;
	}
	
	// Set username method
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
	
	// Get GPA method
	public double getGpa()
	{
		return gpa;
	}
	
	// Set GPA method
	public void setGpa(double gpa)
	{
		this.gpa = gpa;
	}
	
	// Add courses took method
	public void addCourseTook(Course course, int grade)
	{
		// If major course subject
		if (course.getCourseSubj().equals(major.getCourseSubj()))
		{
			// Remove from student's major course list
			major.removeMajorCourse(course);
			// Then it is a non major course
		} else
		{
			// Remove from student's non-major course list
			major.removeNonMajorCourse(course);
		}
		// Set the grade of the courses
		course.setGrade(grade);
		// Add the course
		coursesTook.add(course);
		// Increase course took count by one
		coursesTookCount++;
	}
	
	// Add other course method
	public void addCourseOther(Course course, int grade)
	{
		// If major course subject
		if (course.getCourseSubj().equals(major.getCourseSubj()))
		{
			// Remove from student's major course list
			major.removeMajorCourse(course);
			// Then it is a non-major course
		} else
		{
			// Remove from student's non-major course list
			major.removeNonMajorCourse(course);
		}
		// Set the grade of the course
		course.setGrade(grade);
		// Add the course
		coursesOther.add(course);
		// Increase course took count by one
		coursesOtherCount++;
	}
	
	// Add other course method
	public void addCourseFailed(Course course, int grade)
	{
		// If major course subject
		if (course.getCourseSubj().equals(major.getCourseSubj()))
		{
			// Remove from student's major course list
			major.removeMajorCourse(course);
			// Then it is a non-major course
		} else
		{
			// Remove from student's non-major course list
			major.removeNonMajorCourse(course);
		}
		// Set the grade of the course
		course.setGrade(grade);
		// Add the course
		coursesFailed.add(course);
		// Increase course failed count by one
		coursesFailedCount++;
	}
	
	// Add course currently taking method
	public void addCourseTaking(Course course, String counts, String nys, String fed, String repeat)
	{
		// If major course subject
		if (course.getCourseSubj().equals(major.getCourseSubj()))
		{
			// Remove from student's major course list
			major.removeMajorCourse(course);
			// Then it is a non-major course
		} else
		{
			// Remove from student's non-major course list
			major.removeNonMajorCourse(course);
		}
		// Set whether or not it counts for financial aid
		course.setCounts(counts);
		// Set whether it counts for NYS financial aid
		course.setNys(nys);
		// Set whether it counts for Federal financial aid
		course.setFed(fed);
		// Set whether or not the student is repeating the course
		course.setRepeat(repeat);
		// Add the course
		coursesTaking.add(course);
		// Increase course taking count by one
		coursesTakingCount++;
	}
	
	// Get courses took list
	public ObservableList<Course> getCoursesTook()
	{
		return coursesTook;
	}
	
	// Get number of courses took
	public int getCoursesTookCount()
	{
		return coursesTookCount;
	}
	
	// Get courses other list
	public ObservableList<Course> getCoursesOther()
	{
		return coursesOther;
	}
	
	// Get number of other courses
	public int getCoursesOtherCount()
	{
		return coursesOtherCount;
	}
	
	// Get courses failed list
	public ObservableList<Course> getCoursesFailed()
	{
		return coursesFailed;
	}
	
	// Get number of courses failed
	public int getCoursesFailedCount()
	{
		return coursesFailedCount;
	}
	
	// Get courses taking list
	public ObservableList<Course> getCoursesTaking()
	{
		return coursesTaking;
	}
	
	// Get number of courses currently taking 
	public int getCoursesTakingCount()
	{
		return coursesTakingCount;
	}
	
	// Get total number of credits
	public double getTotalCredits()
	{
		double total = 0;
		for (Course c : coursesTook)
		{
			total += c.getCreditsDouble();
		}
		for (Course c : coursesOther)
		{
			total += c.getCreditsDouble();
		}
		for (Course c : coursesFailed)
		{
			total += c.getCreditsDouble();
		}
		for (Course c : coursesTaking)
		{
			total += c.getCreditsDouble();
		}
		return total;
	}
	
	// Get number of transfer credits
	public double getTransferCredits()
	{
		return totalTransferCredits;
	}
	
	// ToString method
	@Override
	public String toString()
	{
		return "Student [name=" + name + ", major=" + major + ", userName=" + userName + ", password=" + password + "]";
	}
	
}

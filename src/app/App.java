
package app;

import controller.LoginViewController;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Course;
import model.CourseBag;
import model.Major;
import model.MajorBag;
import model.Staff;
import model.StaffBag;
import model.Student;
import model.StudentBag;
import view.LoginView;

/**
 * The application object. It creates an instance of the SAIN report program.
 * This is a replica of my school's student records.
 * 
 * @author Kirk Easterson
 * @version 1.0
 *
 */

public class App extends Application
{
	
	/**
	 * The main method where the SAIN report is launched.
	 * 
	 * 
	 * @param args
	 *        The string array of arguments
	 */
	
	public static void main(String[] args)
	{
		// Launch the program
		launch(args);
	}
	
	/**
	 * The starting method. It is where the model, view, and controller are created.
	 */
	@Override
	public void start(Stage stage) throws Exception
	{
		// TEST COURSES /////////////////////////////////////////////////
		
		// Computer Science courses
		Course cst111 = new Course("Introduction to Computer Science and Information Technology", "CST", 111, 4);
		Course cst112 = new Course("Introduction to Programming", "CST", 112, 4);
		Course cst121 = new Course("Computer Organization and Assembly Language Programming", "CST", 121, 4);
		Course cst125 = new Course("Installing, Configurind and Administering Windows", "CST", 125, 4);
		Course cst141 = new Course("Principles of Computing Using Java I", "CST", 141, 4);
		Course cst222 = new Course("Computer Architecture", "CST", 222, 4);
		Course cst227 = new Course("Network Operating Systems and Network Infrastructure", "CST", 227, 4);
		Course cst242 = new Course("Advanced Programming and Problem Solving with Java", "CST", 242, 4);
		Course cst246 = new Course("Data Structures", "CST", 246, 4);
		Course cst288 = new Course("Internship for Information Technology", "CST", 288, 4);
		
		// Math courses
		Course mat107 = new Course("Computer Mathematics Concepts", "MAT", 107, 4);
		Course mat141 = new Course("Calculus with Analytic Geometry I", "MAT", 141, 4);
		Course mat142 = new Course("Calculus with Analytic Geometry II", "MAT", 142, 4);
		Course mat203 = new Course("Calculus with Analytic Geometry III", "MAT", 203, 4);
		Course mat204 = new Course("Differential Equations", "MAT", 204, 4);
		Course mat205 = new Course("Discrete Mathematics", "MAT", 205, 4);
		
		// Physics courses
		Course phy130 = new Course("Physics I", "PHY", 130, 3);
		Course phy132 = new Course("Physics I Lab", "PHY", 132, 1);
		Course phy230 = new Course("Physics II", "PHY", 230, 3);
		Course phy232 = new Course("Physics II Lab", "PHY", 232, 1);
		Course phy245 = new Course("Physics III", "PHY", 245, 3);
		Course phy246 = new Course("Physics III Lab", "PHY", 246, 1);
		
		// Chemistry courses
		Course che133 = new Course("College Chemistry I", "CHE", 133, 4);
		Course che134 = new Course("College Chemistry II", "CHE", 134, 4);
		Course che250 = new Course("Organic Chemistry I", "CHE", 250, 4);
		Course che251 = new Course("Organic Chemistry II", "CHE", 251, 4);
		
		// Biology courses
		Course bio150 = new Course("Modern Biology I", "BIO", 150, 4);
		Course bio152 = new Course("Modern Biology II", "BIO", 152, 4);
		
		// ELT courses
		Course elt112 = new Course("Electricity I", "ELT", 112, 4);
		Course elt150 = new Course("The Workings of Personal Computers", "ELT", 150, 4);
		Course elt151 = new Course("CISCO - Computer Networking I", "ELT", 151, 4);
		Course elt152 = new Course("CISCO - Computer Networking II", "ELT", 152, 4);
		Course elt224 = new Course("Electricity II", "ELT", 224, 4);
		
		// English courses
		Course eng101 = new Course("Standard Freshman Composition", "ENG", 101, 3);
		Course eng102 = new Course("Introduction to Literature", "ENG", 102, 3);
		Course eng121 = new Course("Technical Writing", "ENG", 121, 3);
		
		// History courses
		Course his101 = new Course("Western Civilization I", "HIS", 101, 3);
		Course his103 = new Course("Foundations of American History", "HIS", 103, 3);
		
		// Philosophy courses
		Course phl105 = new Course("Logic", "PHL", 105, 3);
		
		// Physical education courses
		Course ped119 = new Course("Fitness Walking", "PED", 119, 1);
		Course ped126 = new Course("Pilates", "PED", 126, 1);
		
		// Freshman Seminar
		Course col101 = new Course("Freshman Seminar", "COL", 101, 1.5);
		
		CourseBag courseBag = new CourseBag();
		courseBag.add(cst111);
		courseBag.add(cst112);
		courseBag.add(cst121);
		courseBag.add(cst125);
		courseBag.add(cst141);
		courseBag.add(cst222);
		courseBag.add(cst227);
		courseBag.add(cst242);
		courseBag.add(cst246);
		courseBag.add(cst288);
		courseBag.add(mat107);
		courseBag.add(mat141);
		courseBag.add(mat142);
		courseBag.add(mat203);
		courseBag.add(mat204);
		courseBag.add(mat205);
		courseBag.add(phy130);
		courseBag.add(phy132);
		courseBag.add(phy230);
		courseBag.add(phy232);
		courseBag.add(phy245);
		courseBag.add(phy246);
		courseBag.add(che133);
		courseBag.add(che134);
		courseBag.add(che250);
		courseBag.add(che251);
		courseBag.add(bio150);
		courseBag.add(bio152);
		courseBag.add(elt112);
		courseBag.add(elt150);
		courseBag.add(elt151);
		courseBag.add(elt152);
		courseBag.add(elt224);
		courseBag.add(eng101);
		courseBag.add(eng102);
		courseBag.add(eng121);
		courseBag.add(his101);
		courseBag.add(his103);
		courseBag.add(phl105);
		courseBag.add(ped119);
		courseBag.add(ped126);
		courseBag.add(col101);
		
		// TEST MAJORS /////////////////////////////////////////////////
		
		// Computer Science
		Major computerScience = new Major("Computer Science", "CST");
		computerScience.addMajorCourse(cst111);
		computerScience.addMajorCourse(cst112);
		computerScience.addMajorCourse(cst141);
		computerScience.addMajorCourse(cst222);
		computerScience.addMajorCourse(cst242);
		computerScience.addMajorCourse(cst246);
		computerScience.addNonMajorCourse(mat141);
		computerScience.addNonMajorCourse(mat142);
		computerScience.addNonMajorCourse(mat205);
		computerScience.addNonMajorCourse(phy130);
		computerScience.addNonMajorCourse(phy132);
		computerScience.addNonMajorCourse(phy230);
		computerScience.addNonMajorCourse(phy232);
		computerScience.addNonMajorCourse(phl105);
		computerScience.addNonMajorCourse(eng101);
		computerScience.addNonMajorCourse(eng102);
		computerScience.addNonMajorCourse(his101);
		computerScience.addNonMajorCourse(his103);
		computerScience.addNonMajorCourse(ped119);
		computerScience.addNonMajorCourse(ped126);
		computerScience.addNonMajorCourse(col101);
		
		// Information Technology
		Major informationTechnology = new Major("Information Technology", "CST");
		informationTechnology.addMajorCourse(cst111);
		informationTechnology.addMajorCourse(cst112);
		informationTechnology.addMajorCourse(cst121);
		informationTechnology.addMajorCourse(cst125);
		informationTechnology.addMajorCourse(cst141);
		informationTechnology.addMajorCourse(cst227);
		informationTechnology.addMajorCourse(cst288);
		informationTechnology.addNonMajorCourse(elt150);
		informationTechnology.addNonMajorCourse(elt151);
		informationTechnology.addNonMajorCourse(elt152);
		informationTechnology.addNonMajorCourse(mat107);
		informationTechnology.addNonMajorCourse(mat141);
		informationTechnology.addNonMajorCourse(elt112);
		informationTechnology.addNonMajorCourse(elt224);
		informationTechnology.addNonMajorCourse(eng101);
		informationTechnology.addNonMajorCourse(eng121);
		informationTechnology.addNonMajorCourse(his101);
		informationTechnology.addNonMajorCourse(his103);
		informationTechnology.addNonMajorCourse(ped119);
		informationTechnology.addNonMajorCourse(ped126);
		informationTechnology.addNonMajorCourse(col101);
		
		// Instantiate major bag
		MajorBag majorBag = new MajorBag();
		// Add computer science
		majorBag.add(computerScience);
		// Add information technology
		majorBag.add(informationTechnology);
		
		// TEST STUDENTS /////////////////////////////////////////////////
		
		// Student one
		Student studentOne = new Student("Sina Kyllingstad", "kyll92", "password");
		studentOne.setGpa(4.0);
		studentOne.setMajor(computerScience);
		studentOne.addCourseTook(eng101, 92);
		studentOne.addCourseTook(col101, 93);
		studentOne.addCourseTook(cst111, 90);
		studentOne.addCourseTook(cst112, 88);
		studentOne.addCourseTook(cst141, 84);
		studentOne.addCourseTook(eng102, 86);
		studentOne.addCourseTook(mat142, 87);
		studentOne.addCourseOther(che133, 84);
		studentOne.addCourseOther(che134, 86);
		studentOne.addCourseOther(his101, 94);
		studentOne.addCourseFailed(phy130, 61);
		studentOne.addCourseFailed(phy132, 57);
		studentOne.addCourseTaking(cst222, "Y", "Y", "Y", "N");
		studentOne.addCourseTaking(cst242, "Y", "Y", "Y", "N");
		studentOne.addCourseTaking(mat205, "Y", "Y", "Y", "N");
		
		// Student two
		Student studentTwo = new Student("Signe Daae", "daae43", "password");
		studentTwo.setGpa(3.2);
		studentTwo.setMajor(informationTechnology);
		
		// Student three through ten
		Student studentThree = new Student("Amanda Lohne", "lohn23", "password");
		Student studentFour = new Student("Peder Strand", "stra77", "password");
		Student studentFive = new Student("Hedda Linde", "lind98", "password");
		Student studentSix = new Student("Simon Birkenes", "birk69", "password");
		Student studentSeven = new Student("Stella Taranger", "tara14", "password");
		Student studentEight = new Student("Pernelius Greseth", "gres34", "password");
		Student studentNine = new Student("Tobias Rostad", "rost93", "password");
		Student studentTen = new Student("Geirtjof Berdahl", "berd58", "password");
		
		// Add students to student bag
		StudentBag studentBag = new StudentBag();
		studentBag.add(studentOne);
		studentBag.add(studentTwo);
		studentBag.add(studentThree);
		studentBag.add(studentFour);
		studentBag.add(studentFive);
		studentBag.add(studentSix);
		studentBag.add(studentSeven);
		studentBag.add(studentEight);
		studentBag.add(studentNine);
		studentBag.add(studentTen);
		
		// TEST STAFF /////////////////////////////////////////////////
		
		// Staff one through ten
		Staff staffOne = new Staff("Olea Eriksen", "erik56", "password");
		Staff staffTwo = new Staff("Christina Bjerke", "bjer46", "password");
		Staff staffThree = new Staff("Linus Johansen", "joha94", "password");
		Staff staffFour = new Staff("Daniel Svendsen", "sven19", "password");
		Staff staffFive = new Staff("Natalie Olsen", "olse12", "password");
		Staff staffSix = new Staff("Olav Kristiansen", "kris25", "password");
		Staff staffSeven = new Staff("Aurora Johansen", "joha59", "password");
		Staff staffEight = new Staff("Mari Erga", "erga88", "password");
		Staff staffNine = new Staff("Anita Nilsen", "nils54", "password");
		Staff staffTen = new Staff("Annie Pedersen", "pede03", "password");
		
		// Add staff to staff bag
		StaffBag staffBag = new StaffBag();
		staffBag.add(staffOne);
		staffBag.add(staffTwo);
		staffBag.add(staffThree);
		staffBag.add(staffFour);
		staffBag.add(staffFive);
		staffBag.add(staffSix);
		staffBag.add(staffSeven);
		staffBag.add(staffEight);
		staffBag.add(staffNine);
		staffBag.add(staffTen);
		
		// VIEW /////////////////////////////////////////////////
		
		// MIGHT ADD A LOGIN DIALOG
		LoginView loginView = new LoginView(stage);
		LoginViewController loginController = new LoginViewController(loginView, studentBag, staffBag, majorBag,
				courseBag);
		
		// TEST OBJECTS
		
		// Controller controller = new Controller(studentBag, staffBag,
		// loginView);
		
		// SAINeditView test = new SAINeditView(stage);
		// SAINeditViewController testController = new SAINeditViewController(test, studentBag, majorBag, courseBag);
		
		// SearchView test = new SearchView(stage);
		
		// SAINviewController testController = new
		// SAINviewController(studentOne, computerScience);
		// SAINview test = new SAINview(stage, testController);
		
		// WhatIfViewController controller = new
		// WhatIfViewController(studentOne, majors);
		// WhatIfView test = new WhatIfView(stage, controller);
		
		// TESTwhatIfView view = new TESTwhatIfView(stage, studentOne);
		
		// StudentChooseView view = new StudentChooseView(stage);
	}
	
}

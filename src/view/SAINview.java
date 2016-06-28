package view;

import java.util.Calendar;

import controller.SAINviewController;
import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import model.Course;

public class SAINview
{
	private SAINviewController			controller;						// Controller
										
	private VBox						studentPane;					// Student info vbox
	private GridPane					studentGridPane;				// Student info gridpane
	private Label						programLabel;					// "Program" label
	private Label						programResultLabel;				// Program result label
	private Label						degreeLabel;					// "Degree" label
	private Label						degreeResultLabel;				// Degree result label
	private Label						majorLabel;						// "Major" label
	private Label						majorResultLabel;				// Major result label
	private Label						cumulativeGPALabel;				// "Cumulative GPA" label
	private Label						cumulativeGPAResultLabel;		// Cumulative GPA result label
	private Label						programGPALabel;				// "Program GPA" label
	private Label						programGPAResultLabel;			// Program GPA result label
	private Label						majorGPALabel;					// "Major GPA" label
	private Label						majorGPAResultLabel;			// Major GPA result label
	private Label						campusLabel;					// "Campus" label
	private Label						campusResultLabel;				// Campus result label
	private Label						advisorLabel;					// "Advisor" label
	private Label						advisorResultLabel;				// Advisor result label
	private Label						enteredLabel;					// "Entered" label
	private Label						enteredResultLabel;				// entered result label
	private Label						matriculatedLabel;				// "Matriculated" label
	private Label						matriculatedResultLabel;		// Matriculated result label
	private Label						catalogTermLabel;				// "Catalog Term" label
	private Label						catalogTermResultLabel;			// Catalog term result label
	private Label						evaluationTermLabel;			// "Evaluation Term" label
	private Label						evaluationTermResultLabel;		// Evaluation term result label
	private Label						priorDegreesLabel;				// "Prior Degrees" label
	private Label						priorDegreesResultLabel;		// Prior degrees result label
	private Label						resultsAsOfLabel;				// "Results as of" label
	private Label						resultsAsOfResultLabel;			// Results as of result label
										
	private Line						line1;							// First solid black line
										
	private HBox						coursesPane;					// Course pane
	private VBox						requiredBox;					// Required courses vbox
	private Label						requiredLabel;					// Required courses label
	private TableView					requiredTable;					// Required courses table
	private TableColumn<Course, String>	requiredSubjCol;				// Required table subject column
	private TableColumn<Course, String>	requiredCrseNumCol;				// Required table crse num column
	private TableColumn<Course, String>	requiredGradeCol;				// Required table grade column
	private TableColumn<Course, String>	requiredAreaRequirementCol;		// Required table area requirement column
	private TableColumn<Course, String>	requiredSubOrWaiverCol;			// Required table sub or waiver column
	private VBox						otherBox;						// Other courses vbox
	private Label						otherLabel;						// Other courses label
	private TableView					otherTable;						// Other courses table
	private TableColumn<Course, String>	otherSubjCol;					// Other courses table subject column
	private TableColumn<Course, String>	otherCrseNumCol;				// Other courses table crse num column
	private TableColumn<Course, String>	otherGradeCol;					// Other courses table grade column
	private VBox						withdrawnBox;					// Withdrawn courses vbox
	private Label						withdrawnLabel;					// Withdrawn courses label
	private TableView					withdrawnTable;					// Withdrawn courses table
	private TableColumn<Course, String>	withdrawnSubjCol;				// Withdrawn courses table subject column
	private TableColumn<Course, String>	withdrawnCrseNumCol;			// Withdrawn courses table crse num column
	private TableColumn<Course, String>	withdrawnGradeCol;				// Withdrawn courses table grade column
	private VBox						currentlyBox;					// Currently taking courses vbox
	private Label						currentlyLabel;					// Currently taking courses label
	private TableView					currentlyTable;					// Currently taking courses table
	private TableColumn<Course, String>	currentlyTermCol;				// Currently table term column
	private TableColumn<Course, String>	currentlySubjCol;				// Currently table subj column
	private TableColumn<Course, String>	currentlyCrseNumCol;			// Currently table crse num column
	private TableColumn<Course, String>	currentlyCountsCol;				// Currently table counts column
	private TableColumn<Course, String>	currentlyNYSFinCol;				// Currently table NYS financial aid column
	private TableColumn<Course, String>	currentlyFedFinCol;				// Currently table Federal financial aid column
	private TableColumn<Course, String>	currentlyRepeatCol;				// Currently table repeat column
										
	private Line						line2;							// Second solid black line
										
	private VBox						majorPane;						// Major pane
	private Label						lblCoursesNeeded;				// "Courses Needed" label
										
	private VBox						nonMajorRequiredPane;			// Non major required courses pane
	private Label						lblNonMajorRequired;			// "Non major required" label
	private TableView					nonMajorTable;					// Non major table
	private TableColumn<Course, String>	nonSubjCol;						// Non major table subject column
	private TableColumn<Course, String>	nonCrseNumCol;					// Non major table crse num column
	private TableColumn<Course, String>	nonTitleCol;					// Non major table title column
	private TableColumn<Course, String>	nonAttributesCol;				// Non major table attributes column
	private TableColumn<Course, String>	nonOtherCol;					// Non major table other column
	private TableColumn<Course, String>	nonCreditsCol;					// Non major table credits column
										
	private VBox						majorRequiredPane;				// Major required courses pane
	private Label						lblMajorRequired;				// "Major required" label
	private TableView					majorTable;						// Major table
	private TableColumn<Course, String>	majorSubjCol;					// Major table subj column
	private TableColumn<Course, String>	majorCrseNumCol;				// Major table crse num column
	private TableColumn<Course, String>	majorTitleCol;					// Major table title column
	private TableColumn<Course, String>	majorAttributesCol;				// Major table attributes column
	private TableColumn<Course, String>	majorOtherCol;					// Major table other column
	private TableColumn<Course, String>	majorCreditsCol;				// Major table credits column
										
	private Line						line3;							// Third solid black line
										
	private GridPane					programReqGridPane;				// Program requirements grid pane
	private Label						programReqLabel;				// "Program requirements" label
	private Label						programMinGpaLabel;				// "Program minimum GPA" label
	private Label						programMinGpaResultLabel;		// Program min GPA result label
	private Label						programTotalCredLabel;			// "Program total credits" label
	private Label						programTotalCredResultLabel;	// Program total credits result label
	private Label						programMinNumLabel;				// "Program minimum number of credits" label
	private Label						programMinNumResultLabel;		// Program minimum number of credits result label
										
	private Line						line4;							// Fourth solid black line
										
	private GridPane					summaryGridPane;				// Summary grid pane
	private Label						summaryLabel;					// "Summary" label
	private Label						summaryTotalCredLabel;			// "Total credits" label
	private Label						summaryTotalCredResultLabel;	// Total credits result label
	private Label						summaryTotalTransLabel;			// "Total transfer credits" label
	private Label						summaryTotalTransResultLabel;	// Total transfer credits result label
	private Label						summaryTotalTowardsLabel;		// "Total credits towards degree" label
	private Label						summaryTotalTowardsResultLabel;	// Total credits towards degree result label
	private Label						summaryTotalTakenLabel;			// "Total credit taken" label
	private Label						summaryTotalTakenResultLabel;	// Total credits taken result label
										
	private VBox						endPane;						// Ending pane
	private Label						keyLabel;						// Label with the key
	private Line						line5;							// Fifth solid black line
	private Hyperlink					whatIfLink;						// Link to "What-If-Analysis"
	private Label						endNotesLabel;					// Ending notes label
										
	private VBox						pane;							// Parent pane
	private ScrollPane					scrollPane;						// Parent scrollbox pane
	private SAINviewListener			listener;						// Listener
	private Stage						stage;							// Stage
										
	// Constructor
	public SAINview(Stage stage, SAINviewController controller)
	{
		// Set controller to argument controller
		this.controller = controller;
		// Set stage to argument stage
		this.stage = stage;
		// Set title of stage
		stage.setTitle("SAIN Report v1.1");
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		
		// Initialize student grid pane
		studentGridPane = new GridPane();
		// Set vertical gap for student grid pane
		studentGridPane.setVgap(8);
		// Set horizontal gap for student grid pane
		studentGridPane.setHgap(20);
		
		// Initialize program label
		programLabel = new Label("Program:");
		// Set program label font to bold
		programLabel.setStyle("-fx-font-weight: bold");
		// Set grid constraints for program label
		GridPane.setConstraints(programLabel, 0, 0);
		// Initialize program result label
		programResultLabel = new Label(controller.getMajorModel().getTitle());
		// Set grid constraints for program result label
		GridPane.setConstraints(programResultLabel, 1, 0);
		
		// Initialize degree label
		degreeLabel = new Label("Degree:");
		// Set degree label font to bold
		degreeLabel.setStyle("-fx-font-weight: bold");
		// Set grid constraints for degree label
		GridPane.setConstraints(degreeLabel, 0, 1);
		// Initialize degree result label
		degreeResultLabel = new Label("AAS"); // DONT HARDCODE THIS
		// Set grid constraints for degree result label
		GridPane.setConstraints(degreeResultLabel, 1, 1);
		
		// Initialize major label
		majorLabel = new Label("Major:");
		// Set major label font to bold
		majorLabel.setStyle("-fx-font-weight: bold");
		// Set grid constraints for major label
		GridPane.setConstraints(majorLabel, 0, 2);
		// Initialize major result label
		majorResultLabel = new Label(controller.getMajorModel().getTitle());
		// Set grid constraint for major result label
		GridPane.setConstraints(majorResultLabel, 1, 2);
		
		// Initialize cumulative GPA label
		cumulativeGPALabel = new Label("Cumulative GPA:");
		// Set GPA label font to bold
		cumulativeGPALabel.setStyle("-fx-font-weight: bold");
		// Set grid constraint for cumulative GPA label
		GridPane.setConstraints(cumulativeGPALabel, 0, 3);
		// Initialize GPA result label
		cumulativeGPAResultLabel = new Label(Double.toString(controller.getStudentModel().getGpa()));
		// Set grid constraints for cumulative GPA result label
		GridPane.setConstraints(cumulativeGPAResultLabel, 1, 3);
		
		// Initialize program GPA label
		programGPALabel = new Label("Program GPA:");
		// Set program GPA label font to bold 
		programGPALabel.setStyle("-fx-font-weight: bold");
		// Set grid constraint for program GPA label
		GridPane.setConstraints(programGPALabel, 0, 4);
		// Initialize program GPA result label
		programGPAResultLabel = new Label(Double.toString(controller.getStudentModel().getGpa()));
		// Set grid constraint for program GPA result label
		GridPane.setConstraints(programGPAResultLabel, 1, 4);
		
		// Initialize major GPA label
		majorGPALabel = new Label("Major GPA:");
		// Set major GPA label font to bold
		majorGPALabel.setStyle("-fx-font-weight: bold");
		// Set grid constraint for major GPA label
		GridPane.setConstraints(majorGPALabel, 0, 5);
		// Initialize major GPA result label
		majorGPAResultLabel = new Label(Double.toString(controller.getStudentModel().getGpa()));
		// Set grid constraint for major GPA result label
		GridPane.setConstraints(majorGPAResultLabel, 1, 5);
		
		// Initialize campus label
		campusLabel = new Label("Campus:");
		// Set campus label font to bold
		campusLabel.setStyle("-fx-font-weight: bold");
		// Set grid constraint for campus label
		GridPane.setConstraints(campusLabel, 0, 6);
		// Initialize campus result label
		campusResultLabel = new Label("Ammerman (A)"); // DON'T HARDCODE THIS
		// Set grid constraint for campus result label
		GridPane.setConstraints(campusResultLabel, 1, 6);
		
		// Initialize advisor label
		advisorLabel = new Label("Advisor:");
		// Set advisor label font to bold
		advisorLabel.setStyle("-fx-font-weight: bold");
		// Set grid constraint for advisor label
		GridPane.setConstraints(advisorLabel, 0, 7);
		
		// Initialize entered label
		enteredLabel = new Label("Entered:");
		// Set entered label font to bold
		enteredLabel.setStyle("-fx-font-weight: bold");
		// Set grid constraint for entered label
		GridPane.setConstraints(enteredLabel, 2, 0);
		// Initialize entered result label
		enteredResultLabel = new Label("Fall 2015"); // DON'T HARDCODE THIS
		// Set grid constraint for entered result label 
		GridPane.setConstraints(enteredResultLabel, 3, 0);
		
		// Initialize matriculated label
		matriculatedLabel = new Label("Matriculated:");
		// Set matriculated label font to bold
		matriculatedLabel.setStyle("-fx-font-weight: bold");
		// Set grid constraint for matriculated label
		GridPane.setConstraints(matriculatedLabel, 2, 1);
		
		// Initialize catalog term label
		catalogTermLabel = new Label("Catalog Term:");
		// Set catalog term label font to bold
		catalogTermLabel.setStyle("-fx-font-weight: bold");
		// Set grid constraint for catalog term label
		GridPane.setConstraints(catalogTermLabel, 2, 2);
		// Initialize catalog term result label
		catalogTermResultLabel = new Label("Fall 2015");
		// Set grid constraint for catalog term result label
		GridPane.setConstraints(catalogTermResultLabel, 3, 2);
		
		// Initialize catalog term result label
		evaluationTermLabel = new Label("Evaluation Term:");
		// Set evaluation term label font to bold
		evaluationTermLabel.setStyle("-fx-font-weight: bold");
		// Set grid constraint for evaluation term label
		GridPane.setConstraints(evaluationTermLabel, 2, 3);
		// Initialize catalog term result label
		evaluationTermResultLabel = new Label("Wintersession 2017"); // DON'T HARDCODE THIS
		// Set grid constraint for evaluation term result label
		GridPane.setConstraints(evaluationTermResultLabel, 3, 3);
		
		// Initialize prior degrees result label
		priorDegreesLabel = new Label("Prior Degrees at SCCC:");
		// Set prior degrees label font to bold
		priorDegreesLabel.setStyle("-fx-font-weight: bold");
		// Set grid constraint for prior degrees label
		GridPane.setConstraints(priorDegreesLabel, 2, 5);
		
		// Initialize results as of label
		resultsAsOfLabel = new Label("Results as of:");
		// Set results as of label font to bold
		resultsAsOfLabel.setStyle("-fx-font-weight: bold");
		// Set gird constraint for results as of label
		GridPane.setConstraints(resultsAsOfLabel, 2, 7);
		// Initialize results as of result label
		resultsAsOfResultLabel = new Label(Calendar.getInstance().getTime().toString());
		// Set grid constraint for results as of label
		GridPane.setConstraints(resultsAsOfResultLabel, 3, 7);
		
		// Add labels to the student grid pane
		studentGridPane.getChildren().addAll(programLabel, programResultLabel, enteredLabel, enteredResultLabel,
		        degreeLabel, degreeResultLabel, matriculatedLabel, majorLabel, majorResultLabel, catalogTermLabel,
		        catalogTermResultLabel, cumulativeGPALabel, cumulativeGPAResultLabel, evaluationTermLabel,
		        evaluationTermResultLabel, programGPALabel, programGPAResultLabel, majorGPALabel, majorGPAResultLabel,
		        priorDegreesLabel, campusLabel, campusResultLabel, advisorLabel, resultsAsOfLabel,
		        resultsAsOfResultLabel);
				
		// Initialize first solid black line
		line1 = new Line(100, 40, 1700, 40);
		
		// Initialize student vbox
		studentPane = new VBox(10);
		// Set upper padding for student vbox
		studentPane.setPadding(new Insets(0, 0, 10, 0));
		// Add student grid pane and black line to the student pane
		studentPane.getChildren().addAll(studentGridPane, line1);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// Initialize required courses taken label
		requiredLabel = new Label("Required Courses Taken");
		// Set required label font to bold
		requiredLabel.setStyle("-fx-font-weight: bold");
		// Initialize required courses taken table
		requiredTable = new TableView();
		// Initialize required table subj column
		requiredSubjCol = new TableColumn("Subj");
		// Set content for required subject column
		requiredSubjCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseSubj()));
		// Initialize required table crse num column
		requiredCrseNumCol = new TableColumn("Crse\nNum");
		// Set content for required table crse num column
		requiredCrseNumCol.setCellValueFactory(d -> new SimpleStringProperty(d.getValue().getCourseNum()));
		// Initialize required table grade column
		requiredGradeCol = new TableColumn("Grade");
		// Set content for required table grade column
		requiredGradeCol.setCellValueFactory(e -> new SimpleStringProperty(e.getValue().getGrade()));
		// Initialize required table area requirement
		requiredAreaRequirementCol = new TableColumn("Area\nRequirement");
		// Initialize required table sub or waiver column
		requiredSubOrWaiverCol = new TableColumn("Sub or\nWaiver");
		// Set content for required table
		requiredTable.setItems(controller.getStudentModel().getCoursesTook());
		// Add columns to required table
		requiredTable.getColumns().addAll(requiredSubjCol, requiredCrseNumCol, requiredGradeCol,
		        requiredAreaRequirementCol, requiredSubOrWaiverCol);
		// Initialize required courses vbox
		requiredBox = new VBox(10);
		// Add label and table to required courses vbox
		requiredBox.getChildren().addAll(requiredLabel, requiredTable);
		
		// Initialize other courses taken label
		otherLabel = new Label("Other Courses Taken");
		// Set other label font to bold
		otherLabel.setStyle("-fx-font-weight: bold");
		// Initialize other courses taken label
		otherTable = new TableView();
		// Initialize other table subj column
		otherSubjCol = new TableColumn("Subj");
		// Set content for other table subj column
		otherSubjCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseSubj()));
		// Initialize other table crse num column
		otherCrseNumCol = new TableColumn("Crse\nNum");
		// Set content for other table crse num column
		otherCrseNumCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseNum()));
		// Initialize other table grade column
		otherGradeCol = new TableColumn("Grade");
		// Set content for other table grade column
		otherGradeCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getGrade()));
		// Set content for other table
		otherTable.setItems(controller.getStudentModel().getCoursesOther());
		// Add columns to other table
		otherTable.getColumns().addAll(otherSubjCol, otherCrseNumCol, otherGradeCol);
		// Initialize other courses vbox
		otherBox = new VBox(10);
		// Add label and table to other courses vbox
		otherBox.getChildren().addAll(otherLabel, otherTable);
		
		// Initialize withdrawn/failed courses label
		withdrawnLabel = new Label("Withdrawn/Failed");
		// Set withdrawn/failed label font to bold
		withdrawnLabel.setStyle("-fx-font-weight: bold");
		// Initialize withdrawn/failed table
		withdrawnTable = new TableView();
		// Initialize withdrawn/failed table subj column
		withdrawnSubjCol = new TableColumn("Subj");
		// Set content for withdrawn/failed table subject column
		withdrawnSubjCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseSubj()));
		// Initialize withdrawn/failed table crse num column
		withdrawnCrseNumCol = new TableColumn("Crse\nNum");
		// Set content for withdrawn/failed table crse num column
		withdrawnCrseNumCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseNum()));
		// Initialize withdrawn/failed table grade column
		withdrawnGradeCol = new TableColumn("Grade");
		// Set content for withdrawn/failed table grade column
		withdrawnGradeCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getGrade()));
		// Set content for withdrawn/failed table
		withdrawnTable.setItems(controller.getStudentModel().getCoursesFailed());
		// Add columns to withdrawn/failed table
		withdrawnTable.getColumns().addAll(withdrawnSubjCol, withdrawnCrseNumCol, withdrawnGradeCol);
		// Initialize withdrawn/failed courses vbox
		withdrawnBox = new VBox(10);
		// Add label and table to withdrawn failed/courses vbox
		withdrawnBox.getChildren().addAll(withdrawnLabel, withdrawnTable);
		
		// Initialize currently taking courses label
		currentlyLabel = new Label("Currently Taking");
		// Set currently label font to bold
		currentlyLabel.setStyle("-fx-font-weight: bold");
		// Initialize currently taking table
		currentlyTable = new TableView();
		// Initialize currently table term column
		currentlyTermCol = new TableColumn("Term");
		// Set content for currently table term column
		//				currentlyTermCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getTerm()));
		// Initialize currently table subject column
		currentlySubjCol = new TableColumn("Subj");
		// Set content for currently table subject column
		currentlySubjCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseSubj()));
		// Initialize currently table crse num column
		currentlyCrseNumCol = new TableColumn("Crse\nNum");
		// Set content for currently table crse num column
		currentlyCrseNumCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseNum()));
		// Initialize currently table counts column
		currentlyCountsCol = new TableColumn("Counts in\nProgram");
		// Set content for currently table counts column
		currentlyCountsCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCounts()));
		// Initialize currently table NYS financial aid column
		currentlyNYSFinCol = new TableColumn("NYS Fin\nAid Elig");
		// Set content for currently table NYS financial aid column
		currentlyNYSFinCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getNys()));
		// Initialize currently table Federal financial aid oclumn
		currentlyFedFinCol = new TableColumn("Fed Fin\nAid Elig");
		// Set content for currently table Federal financial aid column
		currentlyFedFinCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getFed()));
		// Initialize currently table repeat column
		currentlyRepeatCol = new TableColumn("Repeat");
		// Set content for currently table repeat column
		currentlyRepeatCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getRepeat()));
		// Set content for currently taking courses table
		currentlyTable.setItems(controller.getStudentModel().getCoursesTaking());
		// Add columns to currently taking courses table
		currentlyTable.getColumns().addAll(currentlyTermCol, currentlySubjCol, currentlyCrseNumCol, currentlyCountsCol,
		        currentlyNYSFinCol, currentlyFedFinCol, currentlyRepeatCol);
		// Initialize currently taking courses vbox
		currentlyBox = new VBox(10);
		// Add label and table to currently taking courses vbox
		currentlyBox.getChildren().addAll(currentlyLabel, currentlyTable);
		
		// Initialize courses pane
		coursesPane = new HBox(10);
		// Set padding for courses pane
		coursesPane.setPadding(new Insets(10, 0, 10, 0));
		// Add panes to courses pane
		coursesPane.getChildren().addAll(requiredBox, otherBox, withdrawnBox, currentlyBox);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		
		// Initialize courses needed label
		lblCoursesNeeded = new Label("Courses Needed");
		// Set courses needed labe font to bold
		lblCoursesNeeded.setStyle("-fx-font-weight: bold");
		
		// Initialize non major required label
		lblNonMajorRequired = new Label("AREA: ______-Non Major Req ( __ credits )");
		// Set non major required label font to bold
		lblNonMajorRequired.setStyle("-fx-font-weight: bold");
		// Initialize non major table
		nonMajorTable = new TableView();
		// Initialize non major table subj column
		nonSubjCol = new TableColumn("Subject");
		// Set content for non mjaor table subj column
		nonSubjCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseSubj()));
		// Initialize non major table subj column
		nonCrseNumCol = new TableColumn("Crse Num");
		// Set content for non major table crse num column
		nonCrseNumCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseNum()));
		// Initialize non major table title column
		nonTitleCol = new TableColumn("Title");
		// Set content for non major table title column
		nonTitleCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseTitle()));
		// Initialize non major table attributes column
		nonAttributesCol = new TableColumn("Course Attributes");
		// Set content for non major table attributes column
		nonAttributesCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseAttributes()));
		// Initialize non major table other column
		nonOtherCol = new TableColumn("Other Requirements");
		// Set content for non mjaor table other column
		nonOtherCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getOtherAttributes()));
		// Initialize non major table credits column
		nonCreditsCol = new TableColumn("Credits");
		// Set content for non major table credits column
		nonCreditsCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCredits()));
		// Set content for non major table
		nonMajorTable.setItems(controller.getStudentModel().getMajor().getNonMajorCourses());
		// Add oclumns to non major table
		nonMajorTable.getColumns().addAll(nonSubjCol, nonCrseNumCol, nonTitleCol, nonAttributesCol, nonOtherCol,
		        nonCreditsCol);
		// Initialize non major required pane
		nonMajorRequiredPane = new VBox();
		// Add label and table to non major pane
		nonMajorRequiredPane.getChildren().addAll(lblNonMajorRequired, nonMajorTable);
		
		// Initialize major required label
		lblMajorRequired = new Label("AREA: ______-Major Req ( __ credits )");
		// Set major required label font to bold
		lblMajorRequired.setStyle("-fx-font-weight: bold");
		// Initialize major table
		majorTable = new TableView();
		// Initialize major table subj column
		majorSubjCol = new TableColumn("Subject");
		// Set content for major table subj column
		majorSubjCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseSubj()));
		// Initialize major table crse num column
		majorCrseNumCol = new TableColumn("Crse Num");
		// Set content for major table crse num column
		majorCrseNumCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseNum()));
		// Initialize major table title column
		majorTitleCol = new TableColumn("Title");
		// Set content for major table title column
		majorTitleCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseTitle()));
		// Initiallize major table attributes column
		majorAttributesCol = new TableColumn("Course Attributes");
		// Set content for major table attributes column
		majorAttributesCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseAttributes()));
		// Initialize major table other column
		majorOtherCol = new TableColumn("Other Requirements");
		// Set content for major table other column
		majorOtherCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getOtherAttributes()));
		// Initialize major table credits column
		majorCreditsCol = new TableColumn("Credits");
		// Set content for major table credits column
		majorCreditsCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCredits()));
		// set content for major table
		majorTable.setItems(controller.getStudentModel().getMajor().getMajorCourses());
		// Add columnd to major table
		majorTable.getColumns().addAll(majorSubjCol, majorCrseNumCol, majorTitleCol, majorAttributesCol, majorOtherCol,
		        majorCreditsCol);
		// Initialize major required pane
		majorRequiredPane = new VBox();
		// Add label and table to major pane
		majorRequiredPane.getChildren().addAll(lblMajorRequired, majorTable);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		
		// Initialize program requirements grid pane
		programReqGridPane = new GridPane();
		// Set vertical gap for program requirements grid pane
		programReqGridPane.setVgap(3);
		// set horizontal gap for program requirements grid pane
		programReqGridPane.setHgap(10);
		// Initialize program requirements label
		programReqLabel = new Label("Program Requirements");
		// Set program requirements label font to bold
		programReqLabel.setStyle("-fx-font-weight: bold");
		// Set grid constrain for program requriements label
		GridPane.setConstraints(programReqLabel, 0, 0);
		// Initialize program min GPA label
		programMinGpaLabel = new Label("Minimum GPA:");
		// Set font for program min GPA label to bold
		programMinGpaLabel.setStyle("-fx-font-weight: bold");
		// Set grid constraint for program min GPA label
		GridPane.setConstraints(programMinGpaLabel, 0, 1);
		// Initialize program min GPA result label
		programMinGpaResultLabel = new Label(Double.toString(controller.getStudentModel().getMajor().getMinGpa()));
		// Set grid constraint for program min GPA result label
		GridPane.setConstraints(programMinGpaResultLabel, 1, 1);
		// Initialize program total cred label
		programTotalCredLabel = new Label("Total Credits Required:");
		// Set program total cred label font to bold
		programTotalCredLabel.setStyle("-fx-font-weight: bold");
		// Set grid constraint for program total cred GPA label to bold
		GridPane.setConstraints(programTotalCredLabel, 0, 2);
		// Initialize program total cred result label
		programTotalCredResultLabel = new Label(
		        Double.toString(controller.getStudentModel().getMajor().getTotalCredits()));
		// Set grid constraint for program total cred result label
		GridPane.setConstraints(programTotalCredResultLabel, 1, 2);
		// Initialize program min num label
		programMinNumLabel = new Label("Mininum Number of Degree Credits at SCCC:");
		// Set font for program min num label to bold
		programMinNumLabel.setStyle("-fx-font-weight: bold");
		// Set grid constraint for program min num label
		GridPane.setConstraints(programMinNumLabel, 0, 3);
		// Initialize program min num result label
		programMinNumResultLabel = new Label(
		        Double.toString(controller.getStudentModel().getMajor().getMinCreditsAtSCCC()));
		// Set grid constraint for program min num result label
		GridPane.setConstraints(programMinNumResultLabel, 1, 3);
		// Add labels to program required gird pane
		programReqGridPane.getChildren().addAll(programReqLabel, programMinGpaLabel, programMinGpaResultLabel,
		        programTotalCredLabel, programTotalCredResultLabel, programMinNumLabel, programMinNumResultLabel);
				
		///////////////////////////////////////////////////////////////////////////////////////////////////
		
		// Initialize summary grid pane
		summaryGridPane = new GridPane();
		// Set vertical gap for summary grid pane
		summaryGridPane.setVgap(8);
		// Set horizontal gap for summary grid pane
		summaryGridPane.setHgap(10);
		// Initialize summary label
		summaryLabel = new Label("Summary");
		// Set font for summary label to bold
		summaryLabel.setStyle("-fx-font-weight: bold");
		// Set grid constraint for summary label
		GridPane.setConstraints(summaryLabel, 0, 0);
		// Initialize summary total cred label
		summaryTotalCredLabel = new Label("Total Credits Taken at SCCC:");
		// Set font for summary total cred label to bold
		summaryTotalCredLabel.setStyle("-fx-font-weight: bold");
		// Set grid constraint for summary total cred label to bold
		GridPane.setConstraints(summaryTotalCredLabel, 0, 1);
		// Initialize summary total cred result label
		summaryTotalCredResultLabel = new Label(Double.toString(controller.getStudentModel().getTotalCredits()));
		// Set grid constraint for summary total cred result label
		GridPane.setConstraints(summaryTotalCredResultLabel, 1, 1);
		// Initialize summary total transfer credits label
		summaryTotalTransLabel = new Label("Total Transfer Credits:");
		// Set font for summary total trans label to bold
		summaryTotalTransLabel.setStyle("-fx-font-weight: bold");
		// Set grid constraint for summary total trans label to bold
		GridPane.setConstraints(summaryTotalTransLabel, 0, 2);
		// Initialize summary total trans result label
		summaryTotalTransResultLabel = new Label(Double.toString(controller.getStudentModel().getTransferCredits()));
		// Set grid constraint for summary total trans label
		GridPane.setConstraints(summaryTotalTransResultLabel, 1, 2);
		// Initialize summary total towards label
		summaryTotalTowardsLabel = new Label("Total Credits Toward Degree (Includes In Progress\nCredits):");
		// Set font for summary total towards label to bold
		summaryTotalTowardsLabel.setStyle("-fx-font-weight: bold");
		// Set grid constraint for summary total towards label to bold
		GridPane.setConstraints(summaryTotalTowardsLabel, 0, 3);
		// Initialize summary total credits towards result label
		summaryTotalTowardsResultLabel = new Label(Double.toString(controller.getStudentModel().getTotalCredits()));
		// Set grid constraint for summary total towards result label
		GridPane.setConstraints(summaryTotalTowardsResultLabel, 1, 3);
		// Initialize summary total credits taken label
		summaryTotalTakenLabel = new Label("Total Credits Taken:");
		// Set font for summary total taken label to bold
		summaryTotalTakenLabel.setStyle("-fx-font-weight: bold");
		// Set grid constraint for summary total taken result label
		GridPane.setConstraints(summaryTotalTakenLabel, 0, 4);
		// Initialize summary total taken result label
		summaryTotalTakenResultLabel = new Label(Double.toString(controller.getStudentModel().getTotalCredits()));
		// Set grid constraint for summary total taken result label
		GridPane.setConstraints(summaryTotalTakenResultLabel, 1, 4);
		// Add labels to summary grid pane
		summaryGridPane.getChildren().addAll(summaryLabel, summaryTotalCredLabel, summaryTotalCredResultLabel,
		        summaryTotalTransLabel, summaryTotalTransResultLabel, summaryTotalTowardsLabel,
		        summaryTotalTowardsResultLabel, summaryTotalTakenLabel, summaryTotalTakenResultLabel);
				
		///////////////////////////////////////////////////////////////////////////////////////////////////
		
		// Initialize line two
		line2 = new Line(100, 40, 1700, 40);
		// Initialize line three
		line3 = new Line(100, 40, 1700, 40);
		// Initialize line four
		line4 = new Line(100, 40, 1700, 40);
		// Initialize line five
		line5 = new Line(100, 40, 1700, 40);
		
		// Initialize major pane
		majorPane = new VBox(10);
		// Set padding for major pane
		majorPane.setPadding(new Insets(10, 0, 10, 0));
		// Add content to major pane
		majorPane.getChildren().addAll(line2, lblCoursesNeeded, nonMajorRequiredPane, majorRequiredPane, line3,
		        programReqGridPane, line4, summaryGridPane);
				
		// Initialize key label
		keyLabel = new Label(
		        "KEY:\n" + "In progress course is identified as IP." + "Course substitution is identified as SUB.\n"
		                + "Course waiver is identified as WAV.\n" + "Transfer course is identified as TR.\n"
		                + "Credit by Exam is identified as E.\n" + "Prior Learning Assessment is identified as L.");
						
		// Initialize what if hyperlink
		whatIfLink = new Hyperlink("[ What-If Analysis ]");
		// Initialize end notes label
		endNotesLabel = new Label("RELEASE: 8.6.2S SCCC:3.1\n" + "� 2016 Ellucian Company L.P. and its affiliates.");
		// Set font for end notes label to bold
		endNotesLabel.setStyle("-fx-font-weight: bold");
		
		// Initialize end pane
		endPane = new VBox(5);
		// Add content to end pane
		endPane.getChildren().addAll(keyLabel, line5, whatIfLink, endNotesLabel);
		
		// Initialize parent pane
		pane = new VBox();
		// Set padding for parent pane
		pane.setPadding(new Insets(10, 10, 10, 10));
		// Add content to parent pane
		pane.getChildren().addAll(studentPane, coursesPane, majorPane, endPane);
		
		// Initialize scroll pane
		scrollPane = new ScrollPane();
		// Add parent pane to scroll pane
		scrollPane.setContent(pane);
		
		// Set scene
		stage.setScene(new Scene(scrollPane, 1000, 800));
		// Show stage
		stage.show();
	}
	
}

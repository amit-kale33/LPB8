package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	@FindBy(id="password")
	private WebElement password;
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}

	@FindBy(id="lost_password_user")
	private WebElement lostPasswordUser;
	public void sendlostPasswordUser(String lostPasswordUser) {
		this.lostPasswordUser.clear(); 
		this.lostPasswordUser.sendKeys(lostPasswordUser); 
	}
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	@FindBy(linkText ="I lost my password")
	private WebElement iLostMyPassword;
	public void clickiLostMyPasswordBtn() {
		this.iLostMyPassword.click(); 
	}

	@FindBy(id="lost_password_submit")
	private WebElement lostPasswordSubmit; 
	public void clicklostPasswordSubmitBtn() {
		this.lostPasswordSubmit.click(); 
	}
	@FindBy(linkText ="Sign up!")
	private WebElement signUp;
	public void clicksignUpBtn() {
		this.signUp.click(); 
	}
	
	@FindBy(linkText ="Create a course")
	private WebElement createACourse;
	public void clickcreateACourseBtn() {
		this.createACourse.click(); 
	}
	@FindBy(linkText ="Course catalog")
	private WebElement courseCatalog;
	public void clickcourseCatalogBtn() {
		this.courseCatalog.click(); 
	}
	@FindBy(linkText ="Reporting")
	private WebElement Reporting;
	public void clickReportingBtn() {
		this.Reporting.click(); 
	}
	@FindBy(linkText ="Followed students")
	private WebElement followedStudents;
	public void clickfollowedStudentsBtn() {
		this.followedStudents.click(); 
	}
	@FindBy(linkText ="Selenium")
	private WebElement courseLinkUnderStudent;
	public void clickcourseLinkUnderStudent() {
		this.courseLinkUnderStudent.click(); 
	}
	
	@FindBy(xpath = "//a[text()='v']//parent::td//preceding::td//a[text()='Priya']") //teacher and student code
	private WebElement studentLink;
	public void clickstudentLink() {
		this.studentLink.click(); 
	}
	@FindBy(id="search_user_keyword")
	private WebElement userSearchText;
	public void senduserSearchText(String userSearchText) {
		this.userSearchText.clear(); 
		this.userSearchText.sendKeys(userSearchText); 
	}
	@FindBy(id="search_user_submit")
	private WebElement userSearchLinkSubmit;
	public void clickuserSearchLinkSubmit() {
		this.userSearchLinkSubmit.click(); 
	}
	@FindBy(id="registration_firstname")
	private WebElement firstName;
	public void sendfirstName(String firstName) {
		this.firstName.clear(); 
		this.firstName.sendKeys(firstName); 
	}
	
	@FindBy(id="title")
	private WebElement courseName;
	public void sendcourseName(String courseName) {
		this.courseName.clear(); 
		this.courseName.sendKeys(courseName); 
	}
	@FindBy(id="registration_lastname")
	private WebElement lastName;
	public void sendlastName(String lastName) {
		this.lastName.clear(); 
		this.lastName.sendKeys(lastName); 
	}
	
	@FindBy(id="registration_email")
	private WebElement emailId;
	public void sendemailId(String emailId) {
		this.emailId.clear(); 
		this.emailId.sendKeys(emailId); 
	}
	
	@FindBy(id="username")
	private WebElement userNameSp;
	public void senduserNameSp(String userNameSp) {
		this.userNameSp.clear(); 
		this.userNameSp.sendKeys(userNameSp); 
	}
	
	@FindBy(id="pass1")
	private WebElement pass1;
	public void sendpass1(String pass1) {
		this.pass1.clear(); 
		this.pass1.sendKeys(pass1); 
	}	
	
	@FindBy(id="pass2")
	private WebElement pass2;
	public void sendpass2(String pass2) {
		this.pass2.clear(); 
		this.pass2.sendKeys(pass2); 
	}
	
	@FindBy(id="registration_phone")
	private WebElement phoneNumber;
	public void sendphoneNumber(String phoneNumber) {
		this.phoneNumber.clear(); 
		this.phoneNumber.sendKeys(phoneNumber); 
	}
	
	@FindBy(xpath = "//input[@className='filter-option-inner-inner']") 
	private WebElement language;
		
	@FindBy(xpath = "//p[text()='Teach courses']")
	private WebElement teacherOrStudent;
	public void clickteacherOrStudent() {
		this.teacherOrStudent.click(); 
	}
	
	@FindBy(linkText ="My courses")
	private WebElement myCourseLink;
	public void clickmyCourseLink() {
		this.myCourseLink.click(); 
	}
	
	@FindBy(linkText ="Complex Test2")
	private WebElement mycomplexTest2Link;
	public void clickmycomplexTest2Link() {
		this.mycomplexTest2Link.click(); 
	}
	
	@FindBy(linkText ="Start test")
	private WebElement startTestLink;
	public void clickstartTestLink() {
		this.startTestLink.click(); 
	}
	
	@FindBy(linkText ="Proceed with the test")
	private WebElement proceedTestLink;
	public void clickproceedTestLink() {
		this.proceedTestLink.click(); 
	}
	
	@FindBy(xpath = "//div[@class='col-md-6']//div//input[@name='search_term']") 
	private WebElement courseSearchText;
	public void sendcourseSearchText(String courseSearchText) {
		this.courseSearchText.clear(); 
		this.courseSearchText.sendKeys(courseSearchText); 
	}
	
	@FindBy(xpath = "//div[@class='col-md-6']//div//button[@type='submit']") 
	private WebElement courseSearchButton;
	public void clickcourseSearchButton() {
		this.courseSearchButton.click(); 
	}
	
	@FindBy(xpath = "//a[@class='btn btn-success btn-sm' and @title='Subscribe']") 
	private WebElement courseSubscribeButton;
	public void clickcourseSubscribeButton() {
		this.courseSubscribeButton.click(); 
	}
	
	@FindBy(xpath = "//img[@title='Results and feedback']") 
	private WebElement resultAndFeedback;
	public void clickresultAndFeedback() {
		this.resultAndFeedback.click(); 
	}
	
	@FindBy(xpath = "//img[@title='Grade activity']") 
	private WebElement gradeActivityLink;
	public void clickgradeActivityLink() {
		this.gradeActivityLink.click(); 
	}
	
	@FindBy(xpath = "//img[@title='Tests']")
	private WebElement testsLink;
	public void clicktestsLink() {
		this.testsLink.click(); 
	}
	
	@FindBy(xpath = "//img[@title='Create a new test']") 
	private WebElement ceateNewTestLink;
	public void clickceateNewTestLink() {
		this.ceateNewTestLink.click(); 
	}
	
	@FindBy(id="exercise_title")
	private WebElement testName;
	public void sendtestName(String testName) {
	this.testName.clear(); 
	this.testName.sendKeys(testName); 
	}
	
	@FindBy(id="registration_submit")
	private WebElement submit;
	public void clicksubmit() {
		this.submit.click(); 
	}
	
	@FindBy(id="form-email_submit")
	private WebElement formEmailSubmit;
	public void clickformEmailSubmit() {
		this.formEmailSubmit.click(); 
	}		
	
	@FindBy(xpath = "//img[@title='amit_test1']")
	private WebElement amittest1link;
	public void clickamitTest1LinkBtn() {
		this.amittest1link.click(); 
	}
	
	@FindBy(xpath = "//div[@id='send_notification']//label//input")
	private WebElement sendEmailCheckBoxlink;
	public void clicksendEmailCheckBoxlinkBtn() {
		this.sendEmailCheckBoxlink.click(); 
	}
	
	@FindBy(xpath = "//img[@title='Assignments']")
	private WebElement assignmentLink;
	public void clickassignmentLinkBtn() {
		this.assignmentLink.click(); 
	}
	
	@FindBy(xpath = "//img[@title='Create assignment']")
	private WebElement createAssignmentLink;
	public void clickcreateAssignmentLinkBtn() {
		this.createAssignmentLink.click(); 
	}
	
	@FindBy(xpath = "//img[@title='Correct and rate']")
	private WebElement correctAndRate;
	public void clickcorrectAndRateBtn() {
		this.correctAndRate.click(); 
	}
	
	@FindBy(xpath = "//div[@class='help-course']//a[@class='btn btn-default']//em[@class='fa fa-file-text']")
	private WebElement addIntroductionTextForCourse;
	public void clickaddIntroductionTextForCourseBtn() {
		this.addIntroductionTextForCourse.click(); 
	}
	
	@FindBy(id="form1_new_dir")
	private WebElement assignmentName;
	public void sendassignmentName(String assignmentName) {
		this.assignmentName.clear(); 
		this.assignmentName.sendKeys(assignmentName); 
	}
	
	@FindBy(id="qualification")
	private WebElement qualification;
	public void sendqualification(String qualification) {
		this.qualification.clear(); 
		this.qualification.sendKeys(qualification); 
	}
	
	@FindBy(id="add_course_wanted_code")
	private WebElement addCourseWantedCode;
	public void sendmaddCourseWantedCode(String addCourseWantedCode) {
		this.addCourseWantedCode.clear(); 
		this.addCourseWantedCode.sendKeys(addCourseWantedCode); 
	}
		
	@FindBy(id="course_description_submit")
	private WebElement courseDescriptionSubmit;
	public void clickcourseDescriptionSubmit() {
		this.courseDescriptionSubmit.click(); 
	}
	
	@FindBy(id="course_description_title")
	private WebElement courseDescriptionTitle;
	public void sendcourseDescriptionTitle(String courseDescriptionTitle) {
		this.courseDescriptionTitle.clear(); 
		this.courseDescriptionTitle.sendKeys(courseDescriptionTitle); 
	}
	
	@FindBy(id="form1_qualification")
	private WebElement maximumScore;
	public void sendmaximumScore(String maximumScore) {
		this.maximumScore.clear(); 
		this.maximumScore.sendKeys(maximumScore); 
	}
	
	@FindBy(id="advanced_params")
	private WebElement advancedParamsLink;
	public void clickadvancedParamsLinkBtn() {
		this.advancedParamsLink.click(); 
	}
	
	@FindBy(id="exerciseType_0")
	private WebElement atTheEndOfTestRadioBtn;
	public void clickatTheEndOfTestRadioBtn() {
		this.atTheEndOfTestRadioBtn.click(); 
	}
	
	@FindBy(id="start_time_alt_text")
	private WebElement startTimeAltText;
	public void clickstartTimeAltText() {
		this.startTimeAltText.click(); 
	}
	
	@FindBy(id="introduction_text_intro_cmdUpdate")
	private WebElement introductiontextIntroCmdUpdate;
	public void clickintroductiontextIntroCmdUpdateBtn() {
		this.introductiontextIntroCmdUpdate.click(); 
	}
	
	@FindBy(xpath = "//div[@id='activate_start_date_check']//input")
	private WebElement enableStartTimeCkbox;
	public void clickenableStartTimeCkbox() {
		this.enableStartTimeCkbox.click(); 
	}
	
	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']//tbody//tr[5]//a[text()='30']")
	private WebElement testStartDatePicker30;
	public void clicktestStartDatePicker30() {
		this.testStartDatePicker30.click(); 
	}
	
	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']//tbody//tr[3]//a[text()='19']")
	private WebElement testStartDatePicker19;
	public void clicktestStartDatePicker19() {
		this.testStartDatePicker19.click(); 
	}
	
	@FindBy(id="pass_percentage")
	private WebElement passPercentage;
	public void sendpassPercentage(String passPercentage) {
		this.passPercentage.clear(); 
		this.passPercentage.sendKeys(passPercentage); 
	}
	
	@FindBy(id="exercise_admin_submitExercise")
	private WebElement exerciseAdminSubmitExercise;
	public void clickexerciseAdminSubmitExerciseBtn() {
		this.exerciseAdminSubmitExercise.click(); 
	}
	
	@FindBy(xpath = "//button[@class='ui-datepicker-close ui-state-default ui-priority-primary ui-corner-all']")
	private WebElement startDateDoneBtn;
	public void clickstartDateDoneBtn() {
		this.startDateDoneBtn.click(); 
	}
	
	@FindBy(xpath = "//img[@alt='Course description']")
	private WebElement toolImageCourseDiscription;
	public void clicktoolImageCourseDiscriptionBtn() {
		this.toolImageCourseDiscription.click(); 
	}
	
	@FindBy(xpath = "//img[@alt='Multiple choice']")
	private WebElement multipleChoiceBtn;
	public void clickmultipleChoiceBtn() {
		this.multipleChoiceBtn.click(); 
	}
	
	@FindBy(xpath = "//div[@id='cke_answer[1]']//parent::td//preceding-sibling::td[1]//input")
	private WebElement firstRadioButtonOfquestion;
	public void clickfirstRadioButtonOfquestion() {
		this.firstRadioButtonOfquestion.click(); 
	}
	
	@FindBy(xpath = "//p[text()='Washington D.C']//parent::label//input")
	private WebElement firstRadioButtonOfAnswer;
	public void clickfirstRadioButtonOfAnswer() {
		this.firstRadioButtonOfAnswer.click(); 
	}
	
	@FindBy(xpath = "//p[text()='Ottawa']//parent::label//input")
	private WebElement secondRadioButtonOfAnswer;
	public void clicksecondRadioButtonOfAnswer() {
		this.secondRadioButtonOfAnswer.click(); 
	}
	
	@FindBy(xpath = "//button[@class='btn btn-primary question-validate-btn']")
	private WebElement nextQuestionButton;
	public void clicknextQuestionButton() {
		this.nextQuestionButton.click(); 
	}
	@FindBy(xpath = "//button[@class='btn btn-warning question-validate-btn']")
	private WebElement endTestButton;
	public void clickendTestButton() {
		this.endTestButton.click(); 
	}
	
	@FindBy(id="submit-question")
	private WebElement submitQuestion;
	public void clicksubmitQuestionBtn() {
		this.submitQuestion.click(); 
	}
	
	@FindBy(xpath = "//img[@title='Preview']") 
	private WebElement previewLink;
	public void clickpreviewLinkBtn() {
	this.previewLink.click(); 
	}
	
	@FindBy(id="question_admin_form_questionName")
	private WebElement QuestionAdminFromQuestionName;
	public void sendQuestionAdminFromQuestionName(String QuestionAdminFromQuestionName) {
		this.QuestionAdminFromQuestionName.clear(); 
		this.QuestionAdminFromQuestionName.sendKeys(QuestionAdminFromQuestionName); 
	}
	
	@FindBy(xpath = "//img[@alt='Description']")
	private WebElement CourseDiscription;
	public void clickCourseDiscriptionBtn() {
		this.CourseDiscription.click(); 
	}
	
	@FindBy(xpath = "//img[@title='Settings']")
	private WebElement settingLink;
	public void clicksettingLinkBtn() {
		this.settingLink.click(); 
	}
	
	@FindBy(xpath = "//img[@title='Objectives']")
	private WebElement objectiveLink;
	public void clickobjectiveLinkBtn() {
		this.objectiveLink.click(); 
	}
	
	@FindBy(xpath = "//img[@title='Topics']")
	private WebElement topicsLink;
	public void clicktopicsLinkBtn() {
		this.topicsLink.click(); 
	}
	
	@FindBy(xpath = "//img[@alt='amit kale']")
	private WebElement amitKaleLink;
	public void clickamitKaleLinkBtn() {
		this.amitKaleLink.click(); 
	}
	
	@FindBy(xpath = "//a[text()='beta1']//parent::td[@title='beta1 ']//preceding-sibling::td//input")
	private WebElement assignementradio;
	public void clickassignementradioBtn() {
		this.assignementradio.click(); 
	}
	
	@FindBy(xpath = "//parent::div[@class='col-sm-8']//div[1]//label//input[@name='student_delete_own_publication']")
	private WebElement studentDeleteOwnPublication;
	public void clickstudentDeleteOwnPublicationradioBtn() {
		this.studentDeleteOwnPublication.click(); 
	}
	
	@FindBy(xpath = "//div[@id=\"qf_group_26-group\"]//following-sibling::div[@class=\"form-group \"]//following-sibling::div[@class=\"col-sm-8\"]//button[@name='submit_save' and @id='update_course_submit_save' and @class=\" btn btn-primary \"]")
	private WebElement courseAssignmentSettingSave;
	public void clickcourseAssignmentSettingSaveBtn() {
		this.courseAssignmentSettingSave.click(); 
	}
	
	@FindBy(id="add_course_submit")
	private WebElement addCourseSubmit;
	public void clickaddCourseSubmitBtn() {
		this.addCourseSubmit.click(); 
	}
	
	@FindBy(id="work_comment_button")
	private WebElement workCommentButton;
	public void clickworkCommentButtonBtn() {
		this.workCommentButton.click(); 
	}

	@FindBy(linkText ="Assignments")
	private WebElement assignmentsLink;
	public void clickassignmentsLinkBtn() {
		this.assignmentsLink.click(); 
	}
	
	@FindBy(id="form1_submit")
	private WebElement form1submit;
	public void clickform1submitBtn() {
		this.form1submit.click(); 
	}
	
	@FindBy(id="update_course_submit_save")
	private WebElement updateCourseSubmitSave;
	public void clickupdateCourseSubmitSaveBtn() {
		this.updateCourseSubmitSave.click(); 
	}
	
	@FindBy(id="logout_button")
	private WebElement Logout;
	public void clickLogoutBtn() {
		this.Logout.click(); 
	}
	
	@FindBy(linkText ="Amit1test1")
	private WebElement AmitTest1Link;
	public void clickAmitTest1LinkBtn() {
		this.AmitTest1Link.click(); 
	}
	
	@FindBy(linkText ="Beta course 1")
	private WebElement betaCourse1;
	public void clickbetaCourse1LinkBtn() {
		this.betaCourse1.click(); 
	}
	
	@FindBy(linkText ="Gamma course 2")
	private WebElement gammaCourse1;
	public void clickgammaCourse1LinkBtn() {
		this.gammaCourse1.click(); 
	}
			
			
}

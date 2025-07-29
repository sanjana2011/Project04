package in.co.rays.Proj4.controller;

public interface ORSView {
	public String APP_CONTEXT = "/ORSProject";

	public String PAGE_FOLDER = "/Jsp";

	public  String USER_REGISTRATION_VIEW = PAGE_FOLDER + "/UserRegistrationView.jsp";

	public String USER_REGISTRATION_CTL = APP_CONTEXT + "/UserRegistrationCtl";
	
	public String Login_Ctl  = APP_CONTEXT + "/LoginCtl";
	
	public String Login_View = PAGE_FOLDER +  "/LoginView.jsp";
	

	public String WelcomeCtl  = APP_CONTEXT + "/WelcomeCtl";
	
	public String Welcome_View = PAGE_FOLDER +  "/Welcome.jsp";
	
	public String USER_VIEW = PAGE_FOLDER + "/UserView.jsp";
	
	public String USER_CTL = APP_CONTEXT + "/UserCtl";
	
	public String USER_LIST_VIEW = PAGE_FOLDER + "/UserListView.jsp";
	
	public String USER_LIST_CTL = APP_CONTEXT + "/UserListCtl";
	

	public String ROLE_VIEW = PAGE_FOLDER + "/RoleView.jsp";
	public String ROLE_CTL = APP_CONTEXT + "/RoleCtl";

	public String ROLE_LIST_VIEW = PAGE_FOLDER + "/RoleListView.jsp";
	public String ROLE_LIST_CTL = APP_CONTEXT + "/RoleListCtl";
	
	public String COLLEGE_VIEW = PAGE_FOLDER + "/CollegeView.jsp";
	public String COLLEGE_LIST_VIEW = PAGE_FOLDER + "/CollegeListView.jsp";
	
	public String COLLEGE_LIST_CTL = APP_CONTEXT + "/CollegeListCtl";
	public String COLLEGE_CTL = APP_CONTEXT + "/CollegeCtl";
	

	public String STUDENT_VIEW = PAGE_FOLDER + "/StudentView.jsp";
	public String STUDENT_CTL = APP_CONTEXT + "/StudentCtl";

	public String STUDENT_LIST_VIEW = PAGE_FOLDER + "/StudentListView.jsp";
	public String STUDENT_LIST_CTL = APP_CONTEXT + "/StudentListCtl";
	
	public String MARKSHEET_VIEW = PAGE_FOLDER + "/MarksheetView.jsp";
	public String MARKSHEET_CTL = APP_CONTEXT + "/MarksheetCtl";

	public String MARKSHEET_LIST_VIEW = PAGE_FOLDER + "/MarksheetListView.jsp";
	public String MARKSHEET_LIST_CTL = APP_CONTEXT + "/MarksheetListCtl";
	
	public String FACULTY_VIEW = PAGE_FOLDER + "/FacultyView.jsp";
	public String FACULTY_CTL = APP_CONTEXT + "/FacultyCtl";
	
	public String FACULTY_LIST_VIEW = PAGE_FOLDER + "/FacultyListView.jsp";
	public String FACULTY_LIST_CTL = APP_CONTEXT + "/FacultyListCtl";

}

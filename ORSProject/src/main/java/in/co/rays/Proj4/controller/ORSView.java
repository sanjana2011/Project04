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
}

package webdsl.generated.actions;
public class login_signinAction0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final Boolean stayLoggedIn_arg,final String credpassword_arg,final String credemail_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
Boolean stayLoggedIn_=null;
stayLoggedIn_=stayLoggedIn_arg;
String credpassword_=null;
credpassword_=credpassword_arg;
String credemail_=null;
credemail_=credemail_arg;
((webdsl.generated.domain.SessionManager)utils.ThreadLocalServlet.get().getSessionManager()).setStayLoggedIn(stayLoggedIn_);
if(!webdsl.generated.functions.authenticateEmail_Secret_.authenticateEmail_Secret_(credemail_,credpassword_)){
throw new utils.ValidationException(null,"The login credentials are not valid.");
}
utils.ThreadLocalServlet.get().getOutgoingSuccessMessages().add("You are now logged in.");
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl(""));
}
}
);
}
}

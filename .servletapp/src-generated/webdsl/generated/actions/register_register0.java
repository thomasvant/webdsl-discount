package webdsl.generated.actions;
public class register_register0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final String password_arg,final webdsl.generated.domain.User user_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
String password_=null;
password_=password_arg;
webdsl.generated.domain.User user_=null;
user_=user_arg;
if(webdsl.generated.functions.genactionpredicate_register__0_.genactionpredicate_register__0_()){
if(!(!org.webdsl.tools.Utils.equal(user_,null)&&org.webdsl.tools.Utils.equal(user_.getPassword(),password_))){
throw new utils.ValidationException(null,"Passwords do not match.");
}
user_.register_();
utils.ThreadLocalServlet.get().getOutgoingSuccessMessages().add("You have been registered, you can now sign in");
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("signIn"));
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
);
}
}

package webdsl.generated.actions;
public class profileUser_signOut0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.User user_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.User user_=null;
user_=user_arg;
if(webdsl.generated.functions.genactionpredicate_profile__0User_.genactionpredicate_profile__0User_(user_)){
user_.signOut_();
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl(""));
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
);
}
}

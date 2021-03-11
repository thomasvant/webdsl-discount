package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class signIn_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.signIn_ta0User_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(signIn_ta0User_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"signIn":keyOverwrite,signIn_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(signIn_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "signIn";
}
public String getTemplateSignature(){
return "page signIn()";
}
public String getElementsContext(){
if(calledName==null){
return "signIn";
}
else {
return calledName;
}
}
private webdsl.generated.domain.User user_;
public webdsl.generated.domain.User getUser_(){
return user_;
}
public void setUser_(webdsl.generated.domain.User user_){
this.user_=user_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(RENDER_PHASE==phase){
java.io.StringWriter s0=new java.io.StringWriter();
out=new java.io.PrintWriter(s0);
utils.ThreadLocalOut.push(out);
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("Sign in",out,threadLocalPageCached.isRawoutput());
}
s0.flush();
threadLocalPageCached.setPageTitle(s0.toString());
utils.ThreadLocalOut.popChecked(out);
out=utils.ThreadLocalOut.peek();
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_5506929970","main",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"main"),new org.webdsl.lang.Environment(env).putWithcall("elements#main",new utils.TemplateCall("signIn_ta0User",getElementsContext(),new Object[]{new webdsl.generated.templates.RefArg_signIn_Template0(signIn_Template.this)},attrs)),"main",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"main() at user/user-view.app:54/3");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(webdsl.generated.functions.genpagepredicate_signIn0_.genpagepredicate_signIn0_()){}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
protected void initializeLocalVars(){
user_=webdsl.generated.domain.User._static_createEmpty_();
}
}

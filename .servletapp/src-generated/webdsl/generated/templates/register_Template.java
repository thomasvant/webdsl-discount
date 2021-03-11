package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class register_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.register_ta0User_Secret_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(register_ta0User_Secret_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"register":keyOverwrite,register_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(register_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "register";
}
public String getTemplateSignature(){
return "page register()";
}
public String getElementsContext(){
if(calledName==null){
return "register";
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
private String password_;
public String getPassword_(){
return password_;
}
public void setPassword_(String password_){
this.password_=password_;
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
utils.RenderUtils.printPageString("Register",out,threadLocalPageCached.isRawoutput());
}
s0.flush();
threadLocalPageCached.setPageTitle(s0.toString());
utils.ThreadLocalOut.popChecked(out);
out=utils.ThreadLocalOut.peek();
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_16590507950","main",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"main"),new org.webdsl.lang.Environment(env).putWithcall("elements#main",new utils.TemplateCall("register_ta0User_Secret",getElementsContext(),new Object[]{new webdsl.generated.templates.RefArg_register_Template0(register_Template.this),new webdsl.generated.templates.RefArg_register_Template1(register_Template.this)},attrs)),"main",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"main() at user/user-view.app:24/3");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(webdsl.generated.functions.genpagepredicate_register0_.genpagepredicate_register0_()){}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
protected void initializeLocalVars(){
user_=webdsl.generated.domain.User._static_createEmpty_();
password_="";
}
}

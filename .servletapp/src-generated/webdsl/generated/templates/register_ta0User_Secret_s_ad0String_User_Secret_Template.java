package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class register_ta0User_Secret_s_ad0String_User_Secret_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.register_ta0User_Secret_s_ad0String_User_Secret_s_ad0String_String_User_Secret_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(register_ta0User_Secret_s_ad0String_User_Secret_s_ad0String_String_User_Secret_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"register_ta0User_Secret_s_ad0String_User_Secret":keyOverwrite,register_ta0User_Secret_s_ad0String_User_Secret_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(register_ta0User_Secret_s_ad0String_User_Secret_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
register_register10_=(String)args[0];
user_=(utils.RefArg)args[1];
password_=(utils.RefArg)args[2];
}
public String getUniqueName(){
return "register_ta0User_Secret_s_ad0String_User_Secret";
}
public String getTemplateSignature(){
return "template register_ta0User_Secret_s_ad0(register_register10 : String, user : ref User, password : ref Secret)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String register_register10_="";
private utils.RefArg user_=null;
private utils.RefArg password_=null;
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if_11575830010"+forelementcounter))==null){
if1=webdsl.generated.functions.genpagepredicate_register0_.genpagepredicate_register0_();
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_11575830010"+forelementcounter,if1);
}
}
if(if1){
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_11575830011"+forelementcounter))==null){
if0=webdsl.generated.functions.genactionpredicate_register__0_.genactionpredicate_register__0_();
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_11575830011"+forelementcounter,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_11575830010","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"register_register1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("register_ta0User_Secret_s_ad0String_User_Secret_s_ad0String_String_User_Secret",getElementsContext(),new Object[]{register_register10_,user_,password_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"register_register1\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
}

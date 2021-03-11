package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class signIn_ta0User_s_ad0String_User_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.signIn_ta0User_s_ad0String_User_s_ad0String_String_User_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(signIn_ta0User_s_ad0String_User_s_ad0String_String_User_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"signIn_ta0User_s_ad0String_User":keyOverwrite,signIn_ta0User_s_ad0String_User_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(signIn_ta0User_s_ad0String_User_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
signIn_signIn10_=(String)args[0];
user_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "signIn_ta0User_s_ad0String_User";
}
public String getTemplateSignature(){
return "template signIn_ta0User_s_ad0(signIn_signIn10 : String, user : ref User)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String signIn_signIn10_="";
private utils.RefArg user_=null;
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if5276711750"+forelementcounter))==null){
if1=webdsl.generated.functions.genpagepredicate_signIn0_.genpagepredicate_signIn0_();
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if5276711750"+forelementcounter,if1);
}
}
if(if1){
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if5276711751"+forelementcounter))==null){
if0=webdsl.generated.functions.genactionpredicate_signIn__0_.genactionpredicate_signIn__0_();
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if5276711751"+forelementcounter,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall5276711750","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"signIn_signIn1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("signIn_ta0User_s_ad0String_User_s_ad0String_String_User",getElementsContext(),new Object[]{signIn_signIn10_,user_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"signIn_signIn1\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
}

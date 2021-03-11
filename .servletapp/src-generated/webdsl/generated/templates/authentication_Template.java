package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class authentication_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"authentication":keyOverwrite,authentication_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(authentication_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "authentication";
}
public String getTemplateSignature(){
return "template authentication()";
}
public String getElementsContext(){
if(calledName==null){
return "authentication";
}
else {
return calledName;
}
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_7488424170"+forelementcounter))==null){
if0=webdsl.generated.functions.loggedIn_.loggedIn_();
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_7488424170"+forelementcounter,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_7488424170","logout",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"logout"),new org.webdsl.lang.Environment(env).putWithcall("elements#logout",utils.TemplateCall.EmptyElementsCall),"logout",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"logout() at unknown context");
}
}
else {
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_7488424172","login",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"login"),new org.webdsl.lang.Environment(env).putWithcall("elements#login",utils.TemplateCall.EmptyElementsCall),"login",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"login() at unknown context");
}
}
}
}

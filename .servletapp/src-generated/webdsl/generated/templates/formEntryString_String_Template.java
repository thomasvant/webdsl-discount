package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class formEntryString_String_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.formEntryString_String_ta0String_String_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(formEntryString_String_ta0String_String_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"formEntryString_String":keyOverwrite,formEntryString_String_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(formEntryString_String_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
text_=(String)args[0];
explanation_=(String)args[1];
}
public String getUniqueName(){
return "formEntryString_String";
}
public String getTemplateSignature(){
return "template formEntry(text : String, explanation : String)";
}
public String getElementsContext(){
if(calledName==null){
return "formEntryString_String";
}
else {
return calledName;
}
}
private String text_="";
private String explanation_="";
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall18634982390","formEntryString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{text_},"formEntryString"),new org.webdsl.lang.Environment(env).putWithcall("elements#formEntryString",new utils.TemplateCall("formEntryString_String_ta0String_String",getElementsContext(),new Object[]{text_,explanation_},attrs)),"formEntryString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"formEntryString(text) at layout/layout-view.app:13/3");
}
}
}

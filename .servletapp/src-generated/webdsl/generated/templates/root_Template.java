package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class root_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.pageHeaderString_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(pageHeaderString_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"root":keyOverwrite,root_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(root_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "root";
}
public String getTemplateSignature(){
return "page root()";
}
public String getElementsContext(){
if(calledName==null){
return "root";
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
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_820622870","main",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"main"),new org.webdsl.lang.Environment(env).putWithcall("elements#main",new utils.TemplateCall("pageHeaderString",utils.TemplateCall.SkipElementsMarker,new Object[]{"Discounter"},utils.TemplateCall.EmptyAttrs)),"main",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"main() at Discount.app:13/3");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
}
}

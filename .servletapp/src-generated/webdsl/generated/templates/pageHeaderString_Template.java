package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class pageHeaderString_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"pageHeaderString":keyOverwrite,pageHeaderString_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(pageHeaderString_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
text_=(String)args[0];
}
public String getUniqueName(){
return "pageHeaderString";
}
public String getTemplateSignature(){
return "template pageHeader(text : String)";
}
public String getElementsContext(){
if(calledName==null){
return "pageHeaderString";
}
else {
return calledName;
}
}
private String text_="";
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(RENDER_PHASE==phase){
out.print("<"+"h1");
{
StringBuilder classattrs=new StringBuilder();
StringBuilder styleattrs=new StringBuilder();
java.util.List<String> ignore=new java.util.ArrayList<String>();
java.util.List<String> ignorecols=new java.util.ArrayList<String>();
utils.TemplateCall.getDynamicIgnoredAttributes(attrs,ignore);
for(String attrcolname:utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs)){
if(!ignorecols.contains(attrcolname)){
AttributeCollectionLookup.getAttributeCollection(attrcolname,classattrs,styleattrs,ignore,ignorecols,out);
}
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_12919803300","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{text_},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(text) at layout/layout-view.app:21/4");
}
if(RENDER_PHASE==phase){
out.print("</"+"h1"+">");
}
}
}

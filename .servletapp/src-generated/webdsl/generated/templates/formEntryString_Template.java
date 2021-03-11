package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class formEntryString_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"formEntryString":keyOverwrite,formEntryString_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(formEntryString_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
text_=(String)args[0];
}
public String getUniqueName(){
return "formEntryString";
}
public String getTemplateSignature(){
return "template formEntry(text : String)";
}
public String getElementsContext(){
if(calledName==null){
return "formEntryString";
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
out.print("<"+"div");
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
utils.TemplateCall.appendWithPadding(classattrs,"entry__container");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
out.print("<"+"span");
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
utils.TemplateCall.appendWithPadding(classattrs,"entry__text");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall14999171850","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{text_},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(text) at layout/layout-view.app:7/30");
}
if(RENDER_PHASE==phase){
out.print("</"+"span"+">");
}
try{
utils.TemplateCall elems=env.getElementscall("elements#"+getElementsContext());
java.util.Map<String,String> attrsmapout=elems.attrs;
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall14999171852",elems.name,env.addExtraLocalTemplateArgumentsToArguments(elems.args,elems.name),new org.webdsl.lang.Environment(env),elems.parentName,attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"elements()");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
}
}

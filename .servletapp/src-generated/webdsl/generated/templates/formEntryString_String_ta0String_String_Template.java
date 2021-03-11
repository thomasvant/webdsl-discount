package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class formEntryString_String_ta0String_String_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"formEntryString_String_ta0String_String":keyOverwrite,formEntryString_String_ta0String_String_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(formEntryString_String_ta0String_String_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
text_=(String)args[0];
explanation_=(String)args[1];
}
public String getUniqueName(){
return "formEntryString_String_ta0String_String";
}
public String getTemplateSignature(){
return "template formEntryString_String_ta0(text : String, explanation : String)";
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
utils.TemplateCall elems=env.getElementscall("elements#"+getElementsContext());
java.util.Map<String,String> attrsmapout=elems.attrs;
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall18186209380",elems.name,env.addExtraLocalTemplateArgumentsToArguments(elems.args,elems.name),new org.webdsl.lang.Environment(env),elems.parentName,attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"elements()");
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
utils.TemplateCall.appendWithPadding(classattrs,"entry__hint");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall18186209381","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{explanation_},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(explanation) at layout/layout-view.app:15/30");
}
if(RENDER_PHASE==phase){
out.print("</"+"span"+">");
}
}
}

package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class content_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"content":keyOverwrite,content_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(content_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "content";
}
public String getTemplateSignature(){
return "template content()";
}
public String getElementsContext(){
if(calledName==null){
return "content";
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
utils.TemplateCall.appendWithPadding(classattrs,"container");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
utils.TemplateCall elems=env.getElementscall("elements#"+getElementsContext());
java.util.Map<String,String> attrsmapout=elems.attrs;
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_8293239390",elems.name,env.addExtraLocalTemplateArgumentsToArguments(elems.args,elems.name),new org.webdsl.lang.Environment(env),elems.parentName,attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"elements()");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
}
}

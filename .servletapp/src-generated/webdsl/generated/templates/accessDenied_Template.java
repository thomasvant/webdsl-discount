package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class accessDenied_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"accessDenied":keyOverwrite,accessDenied_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(accessDenied_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "accessDenied";
}
public String getTemplateSignature(){
return "page accessDenied()";
}
public String getElementsContext(){
if(calledName==null){
return "accessDenied";
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
java.io.StringWriter s0=new java.io.StringWriter();
out=new java.io.PrintWriter(s0);
utils.ThreadLocalOut.push(out);
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("Access Denied",out,threadLocalPageCached.isRawoutput());
}
s0.flush();
threadLocalPageCached.setPageTitle(s0.toString());
utils.ThreadLocalOut.popChecked(out);
out=utils.ThreadLocalOut.peek();
}
if(RENDER_PHASE==phase){
try{
utils.RenderUtils.printPageString("Access Denied: ",out,threadLocalPageCached.isRawoutput());
}
catch(NullPointerException npe){
utils.Warning.warn("null reference prevented rendering of template element");
}
catch(IndexOutOfBoundsException ine){
utils.Warning.warn("index out of bounds prevented rendering of template element");
}
}
java.io.StringWriter sw0=new java.io.StringWriter();
out=new java.io.PrintWriter(sw0);
utils.ThreadLocalOut.push(out);
boolean succeeded0=false;
try{
if(RENDER_PHASE==phase){
out.print("<a href=\"");
out.print(utils.HTMLFilter.filter(utils.Navigate.constructUrl("")));
out.print("\"");
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
if(!ignorecols.contains("navigate")){
AttributeCollectionLookup.getAttributeCollection("navigate",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("return to home page",out,threadLocalPageCached.isRawoutput());
}
if(RENDER_PHASE==phase){
out.print("</a>");
}
succeeded0=true;
}
catch(NullPointerException npe){
utils.Warning.warn("null reference prevented rendering of template element");
}
catch(IndexOutOfBoundsException ine){
utils.Warning.warn("index out of bounds prevented rendering of template element");
}
utils.ThreadLocalOut.popChecked(out);
out=utils.ThreadLocalOut.peek();
if(succeeded0){
out.print(sw0.toString());
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
}
}

package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class nav_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"nav":keyOverwrite,nav_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(nav_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "nav";
}
public String getTemplateSignature(){
return "template nav()";
}
public String getElementsContext(){
if(calledName==null){
return "nav";
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
utils.TemplateCall.appendWithPadding(classattrs,"nav__logo__wrapper");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
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
utils.TemplateCall.appendWithPadding(classattrs,"nav__logo");
if(!ignorecols.contains("navigate")){
AttributeCollectionLookup.getAttributeCollection("navigate",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("Discount",out,threadLocalPageCached.isRawoutput());
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
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
out.print("<"+"ul");
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
utils.TemplateCall.appendWithPadding(classattrs,"block");
utils.TemplateCall.appendWithPadding(classattrs,"nav__action__list");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
out.print("<"+"li");
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
utils.TemplateCall.appendWithPadding(classattrs,"block");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
java.io.StringWriter sw1=new java.io.StringWriter();
out=new java.io.PrintWriter(sw1);
utils.ThreadLocalOut.push(out);
boolean succeeded1=false;
try{
if(RENDER_PHASE==phase){
out.print("<a href=\"");
out.print(utils.HTMLFilter.filter(utils.Navigate.constructUrl("signIn")));
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
utils.RenderUtils.printPageString("Sign in",out,threadLocalPageCached.isRawoutput());
}
if(RENDER_PHASE==phase){
out.print("</a>");
}
succeeded1=true;
}
catch(NullPointerException npe){
utils.Warning.warn("null reference prevented rendering of template element");
}
catch(IndexOutOfBoundsException ine){
utils.Warning.warn("index out of bounds prevented rendering of template element");
}
utils.ThreadLocalOut.popChecked(out);
out=utils.ThreadLocalOut.peek();
if(succeeded1){
out.print(sw1.toString());
}
if(RENDER_PHASE==phase){
out.print("</"+"li"+">");
}
if(RENDER_PHASE==phase){
out.print("<"+"li");
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
utils.TemplateCall.appendWithPadding(classattrs,"block");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
java.io.StringWriter sw2=new java.io.StringWriter();
out=new java.io.PrintWriter(sw2);
utils.ThreadLocalOut.push(out);
boolean succeeded2=false;
try{
if(RENDER_PHASE==phase){
out.print("<a href=\"");
out.print(utils.HTMLFilter.filter(utils.Navigate.constructUrl("register")));
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
utils.TemplateCall.appendWithPadding(classattrs,"pill");
if(!ignorecols.contains("navigate")){
AttributeCollectionLookup.getAttributeCollection("navigate",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("Register",out,threadLocalPageCached.isRawoutput());
}
if(RENDER_PHASE==phase){
out.print("</a>");
}
succeeded2=true;
}
catch(NullPointerException npe){
utils.Warning.warn("null reference prevented rendering of template element");
}
catch(IndexOutOfBoundsException ine){
utils.Warning.warn("index out of bounds prevented rendering of template element");
}
utils.ThreadLocalOut.popChecked(out);
out=utils.ThreadLocalOut.peek();
if(succeeded2){
out.print(sw2.toString());
}
if(RENDER_PHASE==phase){
out.print("</"+"li"+">");
}
if(RENDER_PHASE==phase){
out.print("<"+"li");
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
utils.TemplateCall.appendWithPadding(classattrs,"block");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if2665071870"+forelementcounter))==null){
if0=webdsl.generated.functions.genpagepredicate_profile0User_.genpagepredicate_profile0User_(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal())||webdsl.generated.functions.inEmailContext_.inEmailContext_();
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if2665071870"+forelementcounter,if0);
}
}
if(if0){
java.io.StringWriter sw3=new java.io.StringWriter();
out=new java.io.PrintWriter(sw3);
utils.ThreadLocalOut.push(out);
boolean succeeded3=false;
try{
if(RENDER_PHASE==phase){
out.print("<a href=\"");
out.print(utils.HTMLFilter.filter(utils.Navigate.constructUrl("profile",utils.CollectionType.addAll(new java.util.ArrayList<String>(1),utils.URLFilter.filter(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal().getNaturalId())),"User")));
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
utils.TemplateCall.appendWithPadding(classattrs,"pill");
if(!ignorecols.contains("navigate")){
AttributeCollectionLookup.getAttributeCollection("navigate",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("Profile",out,threadLocalPageCached.isRawoutput());
}
if(RENDER_PHASE==phase){
out.print("</a>");
}
succeeded3=true;
}
catch(NullPointerException npe){
utils.Warning.warn("null reference prevented rendering of template element");
}
catch(IndexOutOfBoundsException ine){
utils.Warning.warn("index out of bounds prevented rendering of template element");
}
utils.ThreadLocalOut.popChecked(out);
out=utils.ThreadLocalOut.peek();
if(succeeded3){
out.print(sw3.toString());
}
}
if(RENDER_PHASE==phase){
out.print("</"+"li"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"ul"+">");
}
}
}

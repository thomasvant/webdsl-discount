package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class login_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.login_s_ad0String_Email_Secret_Bool_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.inputBool_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.inputSecret_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.inputEmail_Template.class,null,staticEnv))));
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(inputEmail_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(inputSecret_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(inputBool_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(login_s_ad0String_Email_Secret_Bool_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"login":keyOverwrite,login_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(login_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "login";
}
public String getTemplateSignature(){
return "template login()";
}
public String getElementsContext(){
if(calledName==null){
return "login";
}
else {
return calledName;
}
}
private String credemail_;
public String getCredemail_(){
return credemail_;
}
public void setCredemail_(String credemail_){
this.credemail_=credemail_;
}
private String credpassword_;
public String getCredpassword_(){
return credpassword_;
}
public void setCredpassword_(String credpassword_){
this.credpassword_=credpassword_;
}
private Boolean stayLoggedIn_;
public Boolean getStayLoggedIn_(){
return stayLoggedIn_;
}
public void setStayLoggedIn_(Boolean stayLoggedIn_){
this.stayLoggedIn_=stayLoggedIn_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(threadLocalPageCached.isInForm()){
org.webdsl.logging.Logger.error("Invalid nested <form> tag detected in DOM at URL: "+threadLocalPageCached.getRequestURL()+"\n Enclosing form found in "+threadLocalPageCached.getEnclosingForm()+"\n Nested form found in "+getTemplateSignature());
}
threadLocalPageCached.enterForm(getTemplateSignature());
ident=(inForLoop?forelementcounter:"")+("form8287239690"+getUniqueId());
threadLocalPageCached.setFormIdent(ident);
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.setInSubmittedForm(true);
threadLocalPageCached.submittedFormId=ident;
}
java.io.StringWriter sw1=null;
java.io.StringWriter sw0=null;
if(RENDER_PHASE==phase){
threadLocalPageCached.formRequiresMultipartEnc=false;
if(threadLocalPageCached.inSubmittedForm()&&threadLocalPageCached.isValidationFormRerender()){
sw1=new java.io.StringWriter();
out=new java.io.PrintWriter(sw1);
utils.ThreadLocalOut.push(out);
}
out.print("<form name=\""+ident+"\" id=\""+ident+"\" action=\""+utils.HTMLFilter.filter(threadLocalPageCached.getPageUrlWithParams()+threadLocalPageCached.getExtraQueryArguments("?"))+"\" accept-charset=\"UTF-8\" method=\"POST\"");
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
if(!ignorecols.contains("form")){
AttributeCollectionLookup.getAttributeCollection("form",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
sw0=new java.io.StringWriter();
out=new java.io.PrintWriter(sw0);
utils.ThreadLocalOut.push(out);
out.print(">");
out.print("<input type=\"hidden\" name=\""+ident+"\" value=\"1\" />");
out.print(threadLocalPageCached.getHiddenParams());
}
if(RENDER_PHASE==phase||threadLocalPageCached.inSubmittedForm()){
if(RENDER_PHASE==phase){
out.print("<"+"fieldset");
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
if(RENDER_PHASE==phase){
out.print("<"+"legend");
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall8287239690","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Login"},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(\"Login\") at unknown context");
}
if(RENDER_PHASE==phase){
out.print("</"+"legend"+">");
}
if(RENDER_PHASE==phase){
out.print("<"+"table");
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
if(RENDER_PHASE==phase){
out.print("<"+"tr");
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall8287239692","labelcolumnsString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Email: "},"labelcolumnsString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelcolumnsString",new utils.TemplateCall("inputEmail",utils.TemplateCall.SkipElementsMarker,new Object[]{new webdsl.generated.templates.RefArg_login_Template0(login_Template.this)},utils.TemplateCall.EmptyAttrs)),"labelcolumnsString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelcolumnsString(\"Email: \") at unknown context");
}
if(RENDER_PHASE==phase){
out.print("</"+"tr"+">");
}
if(RENDER_PHASE==phase){
out.print("<"+"tr");
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall8287239695","labelcolumnsString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Password: "},"labelcolumnsString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelcolumnsString",new utils.TemplateCall("inputSecret",utils.TemplateCall.SkipElementsMarker,new Object[]{new webdsl.generated.templates.RefArg_login_Template1(login_Template.this)},utils.TemplateCall.EmptyAttrs)),"labelcolumnsString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelcolumnsString(\"Password: \") at unknown context");
}
if(RENDER_PHASE==phase){
out.print("</"+"tr"+">");
}
if(RENDER_PHASE==phase){
out.print("<"+"tr");
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall8287239698","labelcolumnsString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Stay logged in:"},"labelcolumnsString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelcolumnsString",new utils.TemplateCall("inputBool",utils.TemplateCall.SkipElementsMarker,new Object[]{new webdsl.generated.templates.RefArg_login_Template2(login_Template.this)},utils.TemplateCall.EmptyAttrs)),"labelcolumnsString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelcolumnsString(\"Stay logged in:\") at unknown context");
}
if(RENDER_PHASE==phase){
out.print("</"+"tr"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"table"+">");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall82872396911","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"login_signinAction2"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("login_s_ad0String_Email_Secret_Bool",getElementsContext(),new Object[]{new webdsl.generated.templates.RefArg_login_Template0(login_Template.this),new webdsl.generated.templates.RefArg_login_Template1(login_Template.this),new webdsl.generated.templates.RefArg_login_Template2(login_Template.this)},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"login_signinAction2\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
if(RENDER_PHASE==phase){
out.print("</"+"fieldset"+">");
}
}
if(RENDER_PHASE==phase){
out.print("</form>");
utils.ThreadLocalOut.popChecked(out);
out=utils.ThreadLocalOut.peek();
if(threadLocalPageCached.formRequiresMultipartEnc){
out.write(" enctype=\"multipart/form-data\"");
}
out.write(sw0.toString());
if(threadLocalPageCached.inSubmittedForm()&&threadLocalPageCached.isValidationFormRerender()){
utils.ThreadLocalOut.pop();
if(threadLocalPageCached.submittedFormContent==null){
threadLocalPageCached.submittedFormContent=sw1.toString();
}
else {
out=utils.ThreadLocalOut.peek();
out.write(threadLocalPageCached.submittedFormContent);
}
}
threadLocalPageCached.formRequiresMultipartEnc=false;
}
threadLocalPageCached.setInSubmittedForm(false);
threadLocalPageCached.setFormIdent("");
threadLocalPageCached.leaveForm();
}
protected void initializeLocalVars(){
credemail_="";
credpassword_="";
stayLoggedIn_=false;
}
}

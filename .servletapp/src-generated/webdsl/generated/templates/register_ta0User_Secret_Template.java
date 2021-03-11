package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class register_ta0User_Secret_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.register_ta0User_Secret_s_ad0String_User_Secret_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.inputSecret_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.inputSecret_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.inputEmail_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.inputString_Template.class,null,staticEnv)))));
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputString_1_register_ta0User_Secretpc0",RefArg_inputString_1_register_ta0User_Secretpc0.class);
refargclasses.put("RefArg_inputEmail_1_register_ta0User_Secretpc1",RefArg_inputEmail_1_register_ta0User_Secretpc1.class);
refargclasses.put("RefArg_inputSecret_1_register_ta0User_Secretpc2",RefArg_inputSecret_1_register_ta0User_Secretpc2.class);
utils.AbstractPageServlet.loadRefArgClasses(inputString_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(inputEmail_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(inputSecret_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(inputSecret_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(register_ta0User_Secret_s_ad0String_User_Secret_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"register_ta0User_Secret":keyOverwrite,register_ta0User_Secret_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(register_ta0User_Secret_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
user_=(utils.RefArg)args[0];
password_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "register_ta0User_Secret";
}
public String getTemplateSignature(){
return "template register_ta0(user : ref User, password : ref Secret)";
}
public String getElementsContext(){
if(calledName==null){
return "register";
}
else {
return calledName;
}
}
private utils.RefArg user_=null;
private utils.RefArg password_=null;
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_20701438110"+forelementcounter))==null){
if0=webdsl.generated.functions.genpagepredicate_register0_.genpagepredicate_register0_();
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_20701438110"+forelementcounter,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_20701438110","pageHeaderString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Register"},"pageHeaderString"),new org.webdsl.lang.Environment(env).putWithcall("elements#pageHeaderString",utils.TemplateCall.EmptyElementsCall),"pageHeaderString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"pageHeaderString(\"Register\") at user/user-view.app:25/4");
}
if(threadLocalPageCached.isInForm()){
org.webdsl.logging.Logger.error("Invalid nested <form> tag detected in DOM at URL: "+threadLocalPageCached.getRequestURL()+"\n Enclosing form found in "+threadLocalPageCached.getEnclosingForm()+"\n Nested form found in "+getTemplateSignature());
}
threadLocalPageCached.enterForm(getTemplateSignature());
ident=(inForLoop?forelementcounter:"")+("form_20701438110"+getUniqueId());
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
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_20701438112","formEntryString_String",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Name","Your name will be visible to other users."},"formEntryString_String"),new org.webdsl.lang.Environment(env).putWithcall("elements#formEntryString_String",new utils.TemplateCall("inputString",utils.TemplateCall.SkipElementsMarker,new Object[]{new webdsl.generated.templates.RefArg_inputString_1_register_ta0User_Secretpc0((webdsl.generated.domain.User)user_.get())},utils.TemplateCall.EmptyAttrs)),"formEntryString_String",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"formEntryString_String(\"Name\", \"Your name will be visible to other users.\") at user/user-view.app:27/5");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_20701438115","formEntryString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Email"},"formEntryString"),new org.webdsl.lang.Environment(env).putWithcall("elements#formEntryString",new utils.TemplateCall("inputEmail",utils.TemplateCall.SkipElementsMarker,new Object[]{new webdsl.generated.templates.RefArg_inputEmail_1_register_ta0User_Secretpc1((webdsl.generated.domain.User)user_.get())},utils.TemplateCall.EmptyAttrs)),"formEntryString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"formEntryString(\"Email\") at user/user-view.app:28/5");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_20701438118","formEntryString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Password"},"formEntryString"),new org.webdsl.lang.Environment(env).putWithcall("elements#formEntryString",new utils.TemplateCall("inputSecret",utils.TemplateCall.SkipElementsMarker,new Object[]{new webdsl.generated.templates.RefArg_inputSecret_1_register_ta0User_Secretpc2((webdsl.generated.domain.User)user_.get())},utils.TemplateCall.EmptyAttrs)),"formEntryString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"formEntryString(\"Password\") at user/user-view.app:29/5");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_207014381111","formEntryString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Verify password"},"formEntryString"),new org.webdsl.lang.Environment(env).putWithcall("elements#formEntryString",new utils.TemplateCall("inputSecret",utils.TemplateCall.SkipElementsMarker,new Object[]{password_},utils.TemplateCall.EmptyAttrs)),"formEntryString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"formEntryString(\"Verify password\") at user/user-view.app:30/5");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_207014381114","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"register_register1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("register_ta0User_Secret_s_ad0String_User_Secret",getElementsContext(),new Object[]{user_,password_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"register_register1\" + getTemplate().getUniqueIdNoCache()) at unknown context");
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
}
}

package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class signIn_ta0User_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.signIn_ta0User_s_ad0String_User_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.inputSecret_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.inputEmail_Template.class,null,staticEnv)));
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputEmail_1_signIn_ta0Userpc0",RefArg_inputEmail_1_signIn_ta0Userpc0.class);
refargclasses.put("RefArg_inputSecret_1_signIn_ta0Userpc1",RefArg_inputSecret_1_signIn_ta0Userpc1.class);
utils.AbstractPageServlet.loadRefArgClasses(inputEmail_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(inputSecret_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(signIn_ta0User_s_ad0String_User_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"signIn_ta0User":keyOverwrite,signIn_ta0User_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(signIn_ta0User_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
user_=(utils.RefArg)args[0];
}
public String getUniqueName(){
return "signIn_ta0User";
}
public String getTemplateSignature(){
return "template signIn_ta0(user : ref User)";
}
public String getElementsContext(){
if(calledName==null){
return "signIn";
}
else {
return calledName;
}
}
private utils.RefArg user_=null;
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if8532239920"+forelementcounter))==null){
if1=webdsl.generated.functions.genpagepredicate_signIn0_.genpagepredicate_signIn0_();
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if8532239920"+forelementcounter,if1);
}
}
if(if1){
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall8532239920","pageHeaderString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Sign in"},"pageHeaderString"),new org.webdsl.lang.Environment(env).putWithcall("elements#pageHeaderString",utils.TemplateCall.EmptyElementsCall),"pageHeaderString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"pageHeaderString(\"Sign in\") at user/user-view.app:55/4");
}
if(threadLocalPageCached.isInForm()){
org.webdsl.logging.Logger.error("Invalid nested <form> tag detected in DOM at URL: "+threadLocalPageCached.getRequestURL()+"\n Enclosing form found in "+threadLocalPageCached.getEnclosingForm()+"\n Nested form found in "+getTemplateSignature());
}
threadLocalPageCached.enterForm(getTemplateSignature());
ident=(inForLoop?forelementcounter:"")+("form8532239920"+getUniqueId());
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall8532239922","formEntryString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Email"},"formEntryString"),new org.webdsl.lang.Environment(env).putWithcall("elements#formEntryString",new utils.TemplateCall("inputEmail",utils.TemplateCall.SkipElementsMarker,new Object[]{new webdsl.generated.templates.RefArg_inputEmail_1_signIn_ta0Userpc0((webdsl.generated.domain.User)user_.get())},utils.TemplateCall.EmptyAttrs)),"formEntryString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"formEntryString(\"Email\") at user/user-view.app:57/5");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall8532239925","formEntryString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Password"},"formEntryString"),new org.webdsl.lang.Environment(env).putWithcall("elements#formEntryString",new utils.TemplateCall("inputSecret",utils.TemplateCall.SkipElementsMarker,new Object[]{new webdsl.generated.templates.RefArg_inputSecret_1_signIn_ta0Userpc1((webdsl.generated.domain.User)user_.get())},utils.TemplateCall.EmptyAttrs)),"formEntryString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"formEntryString(\"Password\") at user/user-view.app:58/5");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall8532239928","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"signIn_signIn1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("signIn_ta0User_s_ad0String_User",getElementsContext(),new Object[]{user_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"signIn_signIn1\" + getTemplate().getUniqueIdNoCache()) at unknown context");
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
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if8532239921"+forelementcounter))==null){
if0=webdsl.generated.functions.genpagepredicate_register0_.genpagepredicate_register0_()||webdsl.generated.functions.inEmailContext_.inEmailContext_();
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if8532239921"+forelementcounter,if0);
}
}
if(if0){
java.io.StringWriter sw2=new java.io.StringWriter();
out=new java.io.PrintWriter(sw2);
utils.ThreadLocalOut.push(out);
boolean succeeded0=false;
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
out.print(sw2.toString());
}
}
}
}
}

package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class profileUser_ta0User_Bool_Template extends utils.TemplateServlet{
private static String c$0(webdsl.generated.domain.User user__){
try{
Object v=user__.getName();
if(v==null){
return "";
}
else {
return v.toString();
}
}
catch(RuntimeException r){
return "";
}
}
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==1){
java.util.ArrayList<webdsl.generated.domain.User> elems0=new java.util.ArrayList<webdsl.generated.domain.User>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("User")){
elems0.add((webdsl.generated.domain.User)ent);
}
}
}
}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.profileUser_ta0User_Bool_s_ad0String_User_Bool_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(profileUser_ta0User_Bool_s_ad0String_User_Bool_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"profileUser_ta0User_Bool":keyOverwrite,profileUser_ta0User_Bool_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(profileUser_ta0User_Bool_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
user_=(webdsl.generated.domain.User)args[0];
principal_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "profileUser_ta0User_Bool";
}
public String getTemplateSignature(){
return "template profileUser_ta0(user : User, principal : ref Bool)";
}
public String getElementsContext(){
if(calledName==null){
return "profileUser";
}
else {
return calledName;
}
}
private webdsl.generated.domain.User user_=null;
private utils.RefArg principal_=null;
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if_8832657710"+forelementcounter))==null){
if1=webdsl.generated.functions.genpagepredicate_profile0User_.genpagepredicate_profile0User_(user_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_8832657710"+forelementcounter,if1);
}
}
if(if1){
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_8832657710","pageHeaderString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{""+c$0(user_)},"pageHeaderString"),new org.webdsl.lang.Environment(env).putWithcall("elements#pageHeaderString",utils.TemplateCall.EmptyElementsCall),"pageHeaderString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"pageHeaderString(\"~user.name\") at user/user-view.app:81/4");
}
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_8832657711"+forelementcounter))==null){
if0=(Boolean)principal_.get();
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_8832657711"+forelementcounter,if0);
}
}
if(if0){
if(threadLocalPageCached.isInForm()){
org.webdsl.logging.Logger.error("Invalid nested <form> tag detected in DOM at URL: "+threadLocalPageCached.getRequestURL()+"\n Enclosing form found in "+threadLocalPageCached.getEnclosingForm()+"\n Nested form found in "+getTemplateSignature());
}
threadLocalPageCached.enterForm(getTemplateSignature());
ident=(inForLoop?forelementcounter:"")+("form_8832657710"+getUniqueId());
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_8832657712","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"profileUser_signOut1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("profileUser_ta0User_Bool_s_ad0String_User_Bool",getElementsContext(),new Object[]{user_,principal_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"profileUser_signOut1\" + getTemplate().getUniqueIdNoCache()) at unknown context");
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
}

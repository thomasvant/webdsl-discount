package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class profileUser_ta0User_Bool_s_ad0String_User_Bool_s_ad0String_String_User_Bool_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==3){
java.util.ArrayList<webdsl.generated.domain.User> elems0=new java.util.ArrayList<webdsl.generated.domain.User>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("User")){
elems0.add((webdsl.generated.domain.User)ent);
}
}
}
}
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"profileUser_ta0User_Bool_s_ad0String_User_Bool_s_ad0String_String_User_Bool":keyOverwrite,profileUser_ta0User_Bool_s_ad0String_User_Bool_s_ad0String_String_User_Bool_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(profileUser_ta0User_Bool_s_ad0String_User_Bool_s_ad0String_String_User_Bool_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
profileUser_signOut14_=(String)args[0];
profileUser_signOut10_=(String)args[1];
user_=(webdsl.generated.domain.User)args[2];
principal_=(utils.RefArg)args[3];
}
public String getUniqueName(){
return "profileUser_ta0User_Bool_s_ad0String_User_Bool_s_ad0String_String_User_Bool";
}
public String getTemplateSignature(){
return "template profileUser_ta0User_Bool_s_ad0String_User_Bool_s_ad0(profileUser_signOut14 : String, profileUser_signOut10 : String, user : User, principal : ref Bool)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String profileUser_signOut14_="";
private String profileUser_signOut10_="";
private webdsl.generated.domain.User user_=null;
private utils.RefArg principal_=null;
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
switch(phase){case DATABIND_PHASE:ident=profileUser_signOut14_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.profileUser_signOut0.isValidationDisabled();
}
break;case ACTION_PHASE:ident=profileUser_signOut14_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
if(isAjaxSubmitRequired(false)){
threadLocalPageCached.enableAjaxActionExecuted();
}
new webdsl.generated.actions.profileUser_signOut0().run(threadLocalPageCached,getEnv(),getElementsContext(),user_,ident);
}
break;case RENDER_PHASE:if(isAjaxSubmitRequired(false)){
out.print("<button submitid=\""+profileUser_signOut14_+"\" onclick='javascript:serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+threadLocalPageCached.getExtraQueryArguments("?")+"\",\""+profileUser_signOut14_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'");
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
if(!ignorecols.contains("submit")){
AttributeCollectionLookup.getAttributeCollection("submit",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("Sign out",out,threadLocalPageCached.isRawoutput());
}
out.print("</button>");
}
else {
out.print("<button name=\""+profileUser_signOut14_+"\"");
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
if(!ignorecols.contains("submit")){
AttributeCollectionLookup.getAttributeCollection("submit",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("Sign out",out,threadLocalPageCached.isRawoutput());
}
out.print("</button>");
}
break;}}
}

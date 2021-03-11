package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class profileUser_ta0User_Bool_s_ad0String_User_Bool_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==2){
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
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.profileUser_ta0User_Bool_s_ad0String_User_Bool_s_ad0String_String_User_Bool_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(profileUser_ta0User_Bool_s_ad0String_User_Bool_s_ad0String_String_User_Bool_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"profileUser_ta0User_Bool_s_ad0String_User_Bool":keyOverwrite,profileUser_ta0User_Bool_s_ad0String_User_Bool_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(profileUser_ta0User_Bool_s_ad0String_User_Bool_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
profileUser_signOut10_=(String)args[0];
user_=(webdsl.generated.domain.User)args[1];
principal_=(utils.RefArg)args[2];
}
public String getUniqueName(){
return "profileUser_ta0User_Bool_s_ad0String_User_Bool";
}
public String getTemplateSignature(){
return "template profileUser_ta0User_Bool_s_ad0(profileUser_signOut10 : String, user : User, principal : ref Bool)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
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
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if_822014620"+forelementcounter))==null){
if1=webdsl.generated.functions.genpagepredicate_profile0User_.genpagepredicate_profile0User_(user_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_822014620"+forelementcounter,if1);
}
}
if(if1){
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_822014621"+forelementcounter))==null){
if0=webdsl.generated.functions.genactionpredicate_profile__0User_.genactionpredicate_profile__0User_(user_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_822014621"+forelementcounter,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall_822014620","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"profileUser_signOut1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("profileUser_ta0User_Bool_s_ad0String_User_Bool_s_ad0String_String_User_Bool",getElementsContext(),new Object[]{profileUser_signOut10_,user_,principal_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"profileUser_signOut1\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
}

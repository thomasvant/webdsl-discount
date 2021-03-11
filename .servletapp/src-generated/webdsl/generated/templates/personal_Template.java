package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
public @SuppressWarnings("all")class personal_Template extends utils.TemplateServlet{
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
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.pageHeaderString_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(pageHeaderString_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"personal":keyOverwrite,personal_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(personal_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
user_=(webdsl.generated.domain.User)args[0];
}
public String getUniqueName(){
return "personal";
}
public String getTemplateSignature(){
return "page personal(user : User)";
}
public String getElementsContext(){
if(calledName==null){
return "personal";
}
else {
return calledName;
}
}
private webdsl.generated.domain.User user_=null;
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
utils.RenderUtils.printPageString("Personal profile",out,threadLocalPageCached.isRawoutput());
}
s0.flush();
threadLocalPageCached.setPageTitle(s0.toString());
utils.ThreadLocalOut.popChecked(out);
out=utils.ThreadLocalOut.peek();
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall272756100","main",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"main"),new org.webdsl.lang.Environment(env).putWithcall("elements#main",new utils.TemplateCall("pageHeaderString",utils.TemplateCall.SkipElementsMarker,new Object[]{""+"Welcome, "+c$0(user_)},utils.TemplateCall.EmptyAttrs)),"main",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"main() at user/user-view.app:78/3");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(webdsl.generated.functions.genpagepredicate_personal0User_.genpagepredicate_personal0User_(user_)){}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}

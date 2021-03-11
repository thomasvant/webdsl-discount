package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("unused")public class sendQueuedEmail_Email_Template extends utils.EmailServlet{
public String getTemplateClassName(){
return "sendQueuedEmail_Email_Template";
}
protected void storeArguments(Object[] args){
q_=(webdsl.generated.domain.QueuedEmail)args[0];
}
public static void loadEmailAndTemplateMap(org.webdsl.lang.Environment staticEnv,java.util.Map<String,Class<?>> emails){
emails.put("sendQueuedEmail",sendQueuedEmail_Email_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(sendQueuedEmail_Email_Template.class);
}
boolean validated=true;
protected java.util.Map<String,Object> getTemplatecalls(){
org.webdsl.logging.Logger.error("Internal error: getTemplatecalls() should not be called in email render context");
return null;
}
protected boolean onlyPerformingRenderPhase(){
return true;
}
java.io.PrintWriter out;
private org.hibernate.Session hibSession;
private javax.servlet.http.HttpServletRequest request;
private utils.ResponseWrapper response;
private boolean initialized=false;
public java.util.Map<String,String> attrs=null;
public java.util.Deque<String> templateContext=new java.util.ArrayDeque<String>();
public String getTemplateContextString(){
return "email";
}
public String getElementsContext(){
return "sendQueuedEmail";
}
javax.servlet.http.HttpSession session;
public void render(Object[] args,org.webdsl.lang.Environment env){
threadLocalPageCached=utils.ThreadLocalPage.get();
if(!initialized){
initialized=true;
this.request=threadLocalPageCached.getRequest();
this.response=threadLocalPageCached.getResponse();
this.hibSession=utils.HibernateUtil.getCurrentSession();
this.env=env;
storeArguments(args);
initialize();
initActions();
}
this.out=new java.io.PrintWriter(body);
utils.ThreadLocalOut.push(this.out);
utils.ThreadLocalEmailContext.set(this);
renderInternal();
utils.ThreadLocalEmailContext.set(null);
utils.ThreadLocalOut.popChecked(this.out);
}
private webdsl.generated.domain.QueuedEmail q_=null;
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(RENDER_PHASE==phase){
this.receivers=q_.getTo();
}
if(RENDER_PHASE==phase){
this.sender=q_.getFrom();
}
if(RENDER_PHASE==phase){
this.subject=q_.getSubject();
}
if(RENDER_PHASE==phase){
this.cc=q_.getCc();
}
if(RENDER_PHASE==phase){
this.bcc=q_.getBcc();
}
if(RENDER_PHASE==phase){
this.replyTo=q_.getReplyTo();
}
if(RENDER_PHASE==phase){
this.unsubscribeAddress=q_.getUnsubscribeAddress();
}
if(RENDER_PHASE==phase){
try{
utils.RenderUtils.printPageString(q_.getBody(),out,true);
}
catch(NullPointerException npe){
utils.Warning.warn("null reference prevented rendering of template element");
}
catch(IndexOutOfBoundsException ine){
utils.Warning.warn("index out of bounds prevented rendering of template element");
}
}
}
}

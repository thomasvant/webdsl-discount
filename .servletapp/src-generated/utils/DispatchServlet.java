package utils;
import java.io.*;import javax.servlet.*;import javax.servlet.http.*;@SuppressWarnings({"serial","unused"})public class DispatchServlet extends HttpServlet{
public static void tryLoadGlobalsAndPerformInit(){
utils.AbstractPageServlet ps=new GlobalsPageServlet();
utils.ThreadLocalPage.set(ps);
ps.initRequestVars();
org.hibernate.Session hibSession=utils.HibernateUtil.getCurrentSession();
try{
hibSession.beginTransaction();
utils.GlobalVariables.load();
utils.GlobalInit.load();
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
}
catch(Exception se){
org.webdsl.logging.Logger.error("*** Exception occurred in application init. WebDSL application will not run correctly. ***",se);
hibSession.getTransaction().rollback();
}
}
private java.util.Timer timer;
public void init(){
CachedResourceFileNameHelper.init(getServletConfig().getServletContext());
tryLoadGlobalsAndPerformInit();
webdsl.generated.search.IndexManager.tryDropIndex();
timer=new java.util.Timer("Timer for scheduled and recurring tasks");
java.util.TimerTask timer0=new java.util.TimerTask(){
public void run(){
if(utils.GlobalVariables.globalvarsChecked&&utils.GlobalInit.initChecked){
org.hibernate.Session hibSession=null;
try{
org.webdsl.servlet.ServletState.scheduledTaskStarted("invoke internalHandleEmailQueue() every 15 seconds");
utils.AbstractPageServlet ps=new GlobalsPageServlet();
utils.ThreadLocalPage.set(ps);
ps.initRequestVars();
hibSession=utils.HibernateUtil.getCurrentSession();
hibSession.beginTransaction();
if(utils.GlobalVariables.initGlobalVars(ps.envGlobalAndSession,utils.HibernateUtil.getCurrentSession())){
java.io.PrintWriter out=new java.io.PrintWriter(System.out);
utils.ThreadLocalOut.push(out);
webdsl.generated.functions.internalHandleEmailQueue_.internalHandleEmailQueue_();
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
utils.ThreadLocalOut.popChecked(out);
ps.invalidatePageCacheIfNeeded();
}
}
catch(Exception ex){
org.webdsl.logging.Logger.error("exception occurred while executing timed function: "+"invoke internalHandleEmailQueue() every 15 seconds");
org.webdsl.logging.Logger.error("exception message: "+ex.getMessage(),ex);
utils.HibernateUtil.getCurrentSession().getTransaction().rollback();
}
finally{
org.webdsl.servlet.ServletState.scheduledTaskEnded();
utils.ThreadLocalPage.set(null);
}
}
}
}
;
timer.schedule(timer0,0,1000*15+0);
java.util.TimerTask timer1=new java.util.TimerTask(){
public void run(){
if(utils.GlobalVariables.globalvarsChecked&&utils.GlobalInit.initChecked){
org.hibernate.Session hibSession=null;
try{
org.webdsl.servlet.ServletState.scheduledTaskStarted("invoke renewFacetIndexReaders() every 15 minutes");
utils.AbstractPageServlet ps=new GlobalsPageServlet();
utils.ThreadLocalPage.set(ps);
ps.initRequestVars();
hibSession=utils.HibernateUtil.getCurrentSession();
hibSession.beginTransaction();
if(utils.GlobalVariables.initGlobalVars(ps.envGlobalAndSession,utils.HibernateUtil.getCurrentSession())){
java.io.PrintWriter out=new java.io.PrintWriter(System.out);
utils.ThreadLocalOut.push(out);
webdsl.generated.functions.renewFacetIndexReaders_.renewFacetIndexReaders_();
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
utils.ThreadLocalOut.popChecked(out);
ps.invalidatePageCacheIfNeeded();
}
}
catch(Exception ex){
org.webdsl.logging.Logger.error("exception occurred while executing timed function: "+"invoke renewFacetIndexReaders() every 15 minutes");
org.webdsl.logging.Logger.error("exception message: "+ex.getMessage(),ex);
utils.HibernateUtil.getCurrentSession().getTransaction().rollback();
}
finally{
org.webdsl.servlet.ServletState.scheduledTaskEnded();
utils.ThreadLocalPage.set(null);
}
}
}
}
;
timer.schedule(timer1,0,60*1000*15+0);
java.util.TimerTask timer2=new java.util.TimerTask(){
public void run(){
if(utils.GlobalVariables.globalvarsChecked&&utils.GlobalInit.initChecked){
org.hibernate.Session hibSession=null;
try{
org.webdsl.servlet.ServletState.scheduledTaskStarted("invoke updateSuggestionIndex() every 12 hours");
utils.AbstractPageServlet ps=new GlobalsPageServlet();
utils.ThreadLocalPage.set(ps);
ps.initRequestVars();
hibSession=utils.HibernateUtil.getCurrentSession();
hibSession.beginTransaction();
if(utils.GlobalVariables.initGlobalVars(ps.envGlobalAndSession,utils.HibernateUtil.getCurrentSession())){
java.io.PrintWriter out=new java.io.PrintWriter(System.out);
utils.ThreadLocalOut.push(out);
webdsl.generated.functions.updateSuggestionIndex_.updateSuggestionIndex_();
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
utils.ThreadLocalOut.popChecked(out);
ps.invalidatePageCacheIfNeeded();
}
}
catch(Exception ex){
org.webdsl.logging.Logger.error("exception occurred while executing timed function: "+"invoke updateSuggestionIndex() every 12 hours");
org.webdsl.logging.Logger.error("exception message: "+ex.getMessage(),ex);
utils.HibernateUtil.getCurrentSession().getTransaction().rollback();
}
finally{
org.webdsl.servlet.ServletState.scheduledTaskEnded();
utils.ThreadLocalPage.set(null);
}
}
}
}
;
timer.schedule(timer2,0,60*60*1000*12+0);
java.util.TimerTask timer3=new java.util.TimerTask(){
public void run(){
if(utils.GlobalVariables.globalvarsChecked&&utils.GlobalInit.initChecked){
org.hibernate.Session hibSession=null;
try{
org.webdsl.servlet.ServletState.scheduledTaskStarted("invoke optimizeSearchIndex() every 12 hours");
utils.AbstractPageServlet ps=new GlobalsPageServlet();
utils.ThreadLocalPage.set(ps);
ps.initRequestVars();
hibSession=utils.HibernateUtil.getCurrentSession();
hibSession.beginTransaction();
if(utils.GlobalVariables.initGlobalVars(ps.envGlobalAndSession,utils.HibernateUtil.getCurrentSession())){
java.io.PrintWriter out=new java.io.PrintWriter(System.out);
utils.ThreadLocalOut.push(out);
webdsl.generated.functions.optimizeSearchIndex_.optimizeSearchIndex_();
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
utils.ThreadLocalOut.popChecked(out);
ps.invalidatePageCacheIfNeeded();
}
}
catch(Exception ex){
org.webdsl.logging.Logger.error("exception occurred while executing timed function: "+"invoke optimizeSearchIndex() every 12 hours");
org.webdsl.logging.Logger.error("exception message: "+ex.getMessage(),ex);
utils.HibernateUtil.getCurrentSession().getTransaction().rollback();
}
finally{
org.webdsl.servlet.ServletState.scheduledTaskEnded();
utils.ThreadLocalPage.set(null);
}
}
}
}
;
timer.schedule(timer3,0,60*60*1000*12+0);
java.util.TimerTask timer4=new java.util.TimerTask(){
public void run(){
if(utils.GlobalVariables.globalvarsChecked&&utils.GlobalInit.initChecked){
org.hibernate.Session hibSession=null;
try{
org.webdsl.servlet.ServletState.scheduledTaskStarted("invoke internalCleanupSessionManagerEntities() every 10 minutes");
utils.AbstractPageServlet ps=new GlobalsPageServlet();
utils.ThreadLocalPage.set(ps);
ps.initRequestVars();
hibSession=utils.HibernateUtil.getCurrentSession();
hibSession.beginTransaction();
if(utils.GlobalVariables.initGlobalVars(ps.envGlobalAndSession,utils.HibernateUtil.getCurrentSession())){
java.io.PrintWriter out=new java.io.PrintWriter(System.out);
utils.ThreadLocalOut.push(out);
webdsl.generated.functions.internalCleanupSessionManagerEntities_.internalCleanupSessionManagerEntities_();
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
utils.ThreadLocalOut.popChecked(out);
ps.invalidatePageCacheIfNeeded();
}
}
catch(Exception ex){
org.webdsl.logging.Logger.error("exception occurred while executing timed function: "+"invoke internalCleanupSessionManagerEntities() every 10 minutes");
org.webdsl.logging.Logger.error("exception message: "+ex.getMessage(),ex);
utils.HibernateUtil.getCurrentSession().getTransaction().rollback();
}
finally{
org.webdsl.servlet.ServletState.scheduledTaskEnded();
utils.ThreadLocalPage.set(null);
}
}
}
}
;
timer.schedule(timer4,0,60*1000*10+0);
java.util.TimerTask timer5=new java.util.TimerTask(){
public void run(){
if(utils.GlobalVariables.globalvarsChecked&&utils.GlobalInit.initChecked){
org.hibernate.Session hibSession=null;
try{
org.webdsl.servlet.ServletState.scheduledTaskStarted("invoke logStatistics() every 5 minutes");
utils.AbstractPageServlet ps=new GlobalsPageServlet();
utils.ThreadLocalPage.set(ps);
ps.initRequestVars();
hibSession=utils.HibernateUtil.getCurrentSession();
hibSession.beginTransaction();
if(utils.GlobalVariables.initGlobalVars(ps.envGlobalAndSession,utils.HibernateUtil.getCurrentSession())){
java.io.PrintWriter out=new java.io.PrintWriter(System.out);
utils.ThreadLocalOut.push(out);
webdsl.generated.functions.logStatistics_.logStatistics_();
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
utils.ThreadLocalOut.popChecked(out);
ps.invalidatePageCacheIfNeeded();
}
}
catch(Exception ex){
org.webdsl.logging.Logger.error("exception occurred while executing timed function: "+"invoke logStatistics() every 5 minutes");
org.webdsl.logging.Logger.error("exception message: "+ex.getMessage(),ex);
utils.HibernateUtil.getCurrentSession().getTransaction().rollback();
}
finally{
org.webdsl.servlet.ServletState.scheduledTaskEnded();
utils.ThreadLocalPage.set(null);
}
}
}
}
;
timer.schedule(timer5,0,60*1000*5+0);
}
public void destroy(){
org.webdsl.servlet.ServletState.servletDestroyStarted();
org.webdsl.logging.Logger.warn("Undeploying application");
org.webdsl.logging.Logger.info("cleanup: canceling future scheduled task");
timer.cancel();
org.webdsl.logging.Logger.info("cleanup: done");
if(org.webdsl.servlet.ServletState.inScheduledTask()){
String taskname=org.webdsl.servlet.ServletState.scheduledTaskName();
int cnt=0;
long intervalInSeconds=5;
org.webdsl.logging.Logger.info("cleanup: Waiting for recurring task to finish: '"+taskname+"'");
try{
while(org.webdsl.servlet.ServletState.inScheduledTask()){
Thread.sleep(intervalInSeconds*1000);
if(++cnt%10==0){
org.webdsl.logging.Logger.warn("cleanup: Waiting "+cnt*intervalInSeconds+" seconds for task: '"+taskname+"' to finish, application not destroyed yet");
}
}
org.webdsl.logging.Logger.info("cleanup: recurring task: '"+taskname+"' has ended");
}
catch(InterruptedException ex){
org.webdsl.logging.Logger.error(ex);
}
}
org.webdsl.logging.Logger.info("cleanup: closing faceting index readers");
webdsl.generated.search.IndexManager.closeFacetIndexReaders();
org.webdsl.logging.Logger.info("cleanup: closing Hibernate session factory");
HibernateUtil.getSessionFactory().close();
org.webdsl.logging.Logger.info("cleanup: done");
super.destroy();
org.webdsl.logging.Logger.info("cleanup: stopping JDBC AbandonedConnectionCleanupThread");
try{
com.mysql.jdbc.AbandonedConnectionCleanupThread.shutdown();
}
catch(InterruptedException ex){
org.webdsl.logging.Logger.error(ex);
}
utils.ThreadManager.tryFindAndKillBobobrowseDaemonThread();
utils.CachedResourceFileNameHelper.cleanupOnServletDestroy();
org.webdsl.logging.Logger.info("cleanup: done");
org.webdsl.logging.Logger.warn("Application has been undeployed");
}
public void doPost(javax.servlet.http.HttpServletRequest request,javax.servlet.http.HttpServletResponse response)throws java.io.IOException,javax.servlet.ServletException{
utils.DispatchServletHelper d=new utils.DispatchServletHelper(this,true,getServletConfig().getServletContext().getContextPath());
d.doServe(request,response);
}
public void doGet(javax.servlet.http.HttpServletRequest request,javax.servlet.http.HttpServletResponse response)throws java.io.IOException,javax.servlet.ServletException{
utils.DispatchServletHelper d=new utils.DispatchServletHelper(this,false,getServletConfig().getServletContext().getContextPath());
d.doServe(request,response);
}
public void doPut(javax.servlet.http.HttpServletRequest request,javax.servlet.http.HttpServletResponse response)throws java.io.IOException,javax.servlet.ServletException{
utils.DispatchServletHelper d=new utils.DispatchServletHelper(this,false,getServletConfig().getServletContext().getContextPath());
d.doServe(request,response);
}
}

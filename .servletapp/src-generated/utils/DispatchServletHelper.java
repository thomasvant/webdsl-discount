package utils;
import java.io.*;import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import javax.servlet.*;import javax.servlet.http.*;import webdsl.generated.templates.*;import org.webdsl.logging.Logger;
import webdsl.generated.domain.RequestLogEntry;
import webdsl.generated.domain.SessionManager;
@SuppressWarnings({"unused","unchecked","rawtypes"})public class DispatchServletHelper extends utils.AbstractDispatchServletHelper{
static {
utils.EntityReflectionHelper.init();
}
webdsl.generated.domain.SessionManager sessionManager=null;
public webdsl.generated.domain.SessionManager getSessionManager(){
return sessionManager;
}
public boolean sessionHasChanges(){
return getSessionManager().getSessionHasChanges()!=null&&getSessionManager().getSessionHasChanges();
}
public void setSessionHasChanges(){
if(getSessionManager()!=null){
getSessionManager().setSessionHasChangesNoEventsOrValidation(true);
}
}
public void reloadSessionManagerFromExistingSessionId(org.hibernate.Session hses,java.util.UUID newId){
sessionId=newId;
SessionManager oldManager=getSessionManager();
reloadSessionManager(utils.HibernateUtil.getCurrentSession());
if(getSessionManager()!=null){
getSessionManager().setLastUseNoEventsOrValidation(null);
if(oldManager!=null&&oldManager!=getSessionManager()){
getSessionManager().getMessages().addAll(oldManager.getMessages());
oldManager.removeAllFromMessages();
}
}
}
public void reloadSessionManager(org.hibernate.Session hses){
sessionManager=null;
isNewSessionManager=false;
loadSessionManager(hses);
}
public void loadSessionManager(org.hibernate.Session hses){
loadSessionManager(hses,null);
}
private boolean isNewSessionManager;
protected static java.util.regex.Pattern domainPattern=java.util.regex.Pattern.compile("(^\\w{0,6})://([^/]+)");
public String getDomain(){
String url=getRequestURL();
if(url==null){
return null;
}
java.util.regex.Matcher m=domainPattern.matcher(url);
m.find();
return m.group(2);
}
public void generateCookieValue(){
cookieValue=java.util.UUID.randomUUID();
sessionManager.setCookieValueNoEventsOrValidation(cookieValue);
}
public void generateCookieValueAndPersist(){
generateCookieValue();
sessionManager.setChanged("*new cookie value*");
}
public void loadSessionManager(org.hibernate.Session hses,String[] joins){
String domain=getDomain();
if(sessionManager==null){
if(sessionId!=null){
sessionManager=(SessionManager)hses.get(SessionManager.class,sessionId);
if(sessionManager!=null&&sessionManager.getDomain()==null){
sessionManager.setDomainNoEventsOrValidation(domain);
}
if(sessionManager!=null&&sessionManager.getCookieValue()==null){
renewCookieValue();
}
}
}
if(sessionManager==null||!sessionManager.getDomain().equals(domain)||!sessionManager.getCookieValue().equals(cookieValue)){
isNewSessionManager=true;
sessionManager=new SessionManager();
sessionId=java.util.UUID.randomUUID();
sessionManager.setId(sessionId);
sessionManager.setLastUseNoEventsOrValidation(new java.util.Date());
sessionManager.setDomainNoEventsOrValidation(domain);
generateCookieValue();
}
}
public void setCookie(org.hibernate.Session hses){
boolean sendCookie=false;
if(isNewSessionManager){
if(sessionHasChanges()||!getOutgoingSuccessMessages().isEmpty()){
sessionManager.setVersion(1);
sessionManager.setChanged("*new session*");
hses.save(sessionManager);
webdsl.generated.functions.internalUpdateSessionManagerTimeout_.internalUpdateSessionManagerTimeout_();
sendCookie=true;
}
}
else {
sendCookie=webdsl.generated.functions.internalUpdateSessionManagerTimeout_.internalUpdateSessionManagerTimeout_();
if(mustRenewCookieValue){
sendCookie=true;
}
}
if(sendCookie){
String basicCookieInfo="WEBDSLSESSIONID="+utils.UUIDUserType.persistUUIDString(sessionId)+utils.UUIDUserType.persistUUIDString(sessionManager.getCookieValue())+"; HttpOnly; path=/";
String setCookie="SET-COOKIE";
if(sessionManager.getStayLoggedIn()!=null&&sessionManager.getStayLoggedIn()){
Date expdate=utils.DateType.addMonths(new Date(),6);
DateFormat df=new SimpleDateFormat("dd MMM yyyy kk:mm:ss z");
df.setTimeZone(TimeZone.getTimeZone("GMT"));
basicCookieInfo+="; expires="+df.format(expdate);
}
response.setHeader(setCookie,basicCookieInfo);
}
}
public void storeOutgoingMessagesInHttpSession(boolean dropOldMessages){
if(sessionManager.getMessages().size()>0&&dropOldMessages){
sessionManager.removeAllFromMessages();
}
if(outgoingSuccessMessages.size()>0){
for(String s:outgoingSuccessMessages){
webdsl.generated.domain.SessionMessage m=webdsl.generated.domain.SessionMessage._static_createEmpty_();
m.setVersion(1);
m.setTextNoEventsOrValidation(s);
sessionManager.getMessages().add(m);
}
}
}
public void retrieveIncomingMessagesFromHttpSession(){
for(webdsl.generated.domain.SessionMessage m:sessionManager.getMessages()){
if(m!=null){
incomingSuccessMessages.add(m.getText());
}
}
}
RequestLogEntry requestLogEntry=null;
public RequestLogEntry getRequestLogEntry(){
return requestLogEntry;
}
static {
try{
java.util.Properties props=new java.util.Properties();
props.load(utils.DispatchServletHelper.class.getResourceAsStream("/tomcat.properties"));
httpsPort=Integer.parseInt(props.getProperty("webdsl.tomcat.https.port"));
httpPort=Integer.parseInt(props.getProperty("webdsl.tomcat.http.port"));
}
catch(Exception ex){
org.webdsl.logging.Logger.error("Could not read tomcat.properties file, custom http(s) port settings are ignored in the currently deployed application.");
}
}
DispatchServlet servlet;
public  DispatchServletHelper(utils.DispatchServlet servlet,boolean isPost,String contextPath){
this.servlet=servlet;
this.isPostRequest=isPost;
this.contextPath=contextPath;
}
DispatchServlet getServlet(){
return servlet;
}
static {
{
String[] s={};
Boolean[] b={};
pages.put("signIn",new utils.PageDispatch(SignInPage.class,s,b,false));
}
{
String[] s={};
Boolean[] b={};
pages.put("root",new utils.PageDispatch(RootPage.class,s,b,false));
}
{
String[] s={};
Boolean[] b={};
pages.put("register",new utils.PageDispatch(RegisterPage.class,s,b,false));
}
{
String[] s={"user"};
Boolean[] b={false};
pages.put("profile",new utils.PageDispatch(ProfilePage.class,s,b,false));
}
{
String[] s={};
Boolean[] b={};
pages.put("pagenotfound",new utils.PageDispatch(PagenotfoundPage.class,s,b,false));
}
{
String[] s={};
Boolean[] b={};
pages.put("accessDenied",new utils.PageDispatch(AccessDeniedPage.class,s,b,false));
}
{
String[] s={"list"};
Boolean[] b={false};
pages.put("showMessagesLStringL",new utils.PageDispatch(ShowMessagesLStringLPage.class,s,b,true));
}
{
String[] s={};
Boolean[] b={};
pages.put("noMessages",new utils.PageDispatch(NoMessagesPage.class,s,b,true));
}
}
public void storeRequestLogEntry(org.hibernate.Session hibSession){
hibSession.saveOrUpdate(requestLogEntry);
}
public void setEndTimeAndStoreRequestLog(org.hibernate.Session hibSession){
if(utils.BuildProperties.isRequestLoggingEnabled()){
requestLogEntry.setEndNoEventsOrValidation(new java.util.Date());
storeRequestLogEntry(hibSession);
}
}
public void doServe(javax.servlet.http.HttpServletRequest request,javax.servlet.http.HttpServletResponse response)throws java.io.IOException,javax.servlet.ServletException{
requestLogEntry=RequestLogEntry._static_createEmpty_();
requestLogEntry.setStartNoEventsOrValidation(new java.util.Date());
if(request.getCookies()!=null){
for(Cookie c:request.getCookies()){
if("WEBDSLSESSIONID".equals(c.getName())){
try{
sessionId=utils.UUIDUserType.retrieveUUID(c.getValue().substring(0,32));
if(c.getValue().length()==64){
cookieValue=utils.UUIDUserType.retrieveUUID(c.getValue().substring(32,64));
}
}
catch(Exception ex){
org.webdsl.logging.Logger.error("Could not create UUID from String, new session will be created");
}
}
}
}
this.request=request;
this.response=response;
response.setCharacterEncoding("UTF-8");
utils.ThreadLocalServlet.set(this);
boolean showerrorpage=false;
boolean showvalidationerror=false;
utils.MultipleValidationExceptions validationExceptions=null;
try{
String url=getRequestURL();
this.baseUrl=url.substring(0,url.length()-getRequestURI().length())+request.getContextPath()+"/";
String pageAndArgs=url.substring(baseUrl.length());
String[] req=pageAndArgs.split("/");
String[] argnames;
String[] args;
urlComponents=new java.util.ArrayList<String>();
if(pageAndArgs.length()<1){
requested="root";
args=new String[0];
urlComponents.add("root");
}
else {
requested=req[0];
args=java.util.Arrays.copyOfRange(req,1,req.length);
urlComponents.add(requested);
urlComponents.addAll(java.util.Arrays.asList(args));
}
java.util.List<String> customRoutingList=Routing.processRequest(urlComponents);
if(customRoutingList!=null){
requested=customRoutingList.get(0);
customRoutingList.remove(0);
args=new String[customRoutingList.size()];
customRoutingList.toArray(args);
}
fileUploads=new java.util.HashMap<String,java.util.List<utils.File>>();
parammap=new java.util.HashMap<String,String>();
parammapvalues=new java.util.HashMap<String,java.util.List<String>>();
utils.PageDispatch pd=pages.get(requested);
if(pd==null){
requested="pagenotfound";
pd=pages.get(requested);
pc=pd.getPageClass();
}
else {
pc=pd.getPageClass();
}
argnames=pages.get(requested).getArgs();
int count2=0;
for(count2=0;
count2<args.length;
count2++){
if(count2>=argnames.length){}
else {
String decoded=utils.URLFilter.unfilter(args[count2]);
parammap.put(argnames[count2],decoded);
addToValues(argnames[count2],decoded,parammapvalues);
}
}
for(java.util.Enumeration en=request.getParameterNames();
en.hasMoreElements();
){
String parameterName=(String)en.nextElement();
parammap.put(parameterName,paramDecode(request,request.getParameter(parameterName)));
for(String paramval:request.getParameterValues(parameterName)){
addToValues(parameterName,paramDecode(request,paramval),parammapvalues);
}
}
if(count2<argnames.length){
if(!isPostRequest&&parammap.get("action-call-with-get-request-type")==null){
if(unspecifiedArgumentsContainEntityTypes(argnames,count2)){
throw new utils.TooFewArgumentsException();
}
}
}
boolean isMultipart=org.apache.commons.fileupload.servlet.ServletFileUpload.isMultipartContent(request);
if(isMultipart){
org.apache.commons.fileupload.FileItemFactory factory=new org.apache.commons.fileupload.disk.DiskFileItemFactory();
org.apache.commons.fileupload.servlet.ServletFileUpload upload=new org.apache.commons.fileupload.servlet.ServletFileUpload(factory);
try{
java.util.List<org.apache.commons.fileupload.FileItem> items=(java.util.List<org.apache.commons.fileupload.FileItem>)upload.parseRequest(request);
java.util.Iterator<org.apache.commons.fileupload.FileItem> iter=items.iterator();
while(iter.hasNext()){
org.apache.commons.fileupload.FileItem item=(org.apache.commons.fileupload.FileItem)iter.next();
if(item.isFormField()){
String name=item.getFieldName();
String value=item.getString();
parammap.put(name,paramDecode(request,value));
addToValues(name,paramDecode(request,value),parammapvalues);
}
else {
String fieldName=item.getFieldName();
String fileName=item.getName();
String contentType=item.getContentType();
boolean isInMemory=item.isInMemory();
long sizeInBytes=item.getSize();
utils.File temp=new utils.File();
temp.setFileName(fileName);
temp.setContentType(contentType);
temp.setContentStream(item.getInputStream());
java.util.List<utils.File> files=fileUploads.get(fieldName);
if(files==null){
files=new java.util.ArrayList<utils.File>();
fileUploads.put(fieldName,files);
}
files.add(temp);
}
}
}
catch(org.apache.commons.fileupload.FileUploadException ex){
org.webdsl.logging.Logger.error("exception occurred in file upload handling DispatchServlet");
org.webdsl.logging.Logger.error("EXCEPTION",ex);
}
}
if(utils.BuildProperties.isRequestLoggingEnabled()){
requestLogEntry.setRequestedURLNoEventsOrValidation(getRequestURL().toString());
requestLogEntry.setNameNoEventsOrValidation(requested);
requestLogEntry.setClientIPNoEventsOrValidation(request.getRemoteAddr());
requestLogEntry.setClientPortNoEventsOrValidation(request.getRemotePort());
if(this.isPostRequest){
requestLogEntry.setMethodNoEventsOrValidation("POST");
}
else {
requestLogEntry.setMethodNoEventsOrValidation("GET");
}
requestLogEntry.setUserAgentNoEventsOrValidation(request.getHeader("User-Agent"));
requestLogEntry.setRefererNoEventsOrValidation(request.getHeader("Referer"));
}
showerrorpage=!handlePage();
}
catch(utils.TooFewArgumentsException ex){
showerrorpage=true;
}
catch(utils.AjaxWithGetRequestException ex){
showerrorpage=true;
}
catch(utils.MultipleValidationExceptions ex){
showvalidationerror=true;
validationExceptions=ex;
}
catch(Exception ex){
org.webdsl.logging.Logger.error("Exception in dispatch servlet: "+ex.getMessage());
org.webdsl.logging.Logger.error("EXCEPTION",ex);
response.setStatus(503);
response.getWriter().write("<h3>503 Service Unavailable</h3>");
}
if(showerrorpage){
if(parammap.get("__ajax_runtime_request__")==null){
pc=pages.get("pagenotfound").getPageClass();
disablePageCache=true;
try{
if(!handlePage()){
response.setStatus(404);
response.getWriter().write("<h3>404 Not Found</h3>");
}
}
catch(Exception ex){
org.webdsl.logging.Logger.error("couldn't render pagenotfound page",ex);
response.setStatus(404);
response.getWriter().write("<h3>404 Not Found</h3>");
}
}
}
else if(showvalidationerror){
if(parammap.get("__ajax_runtime_request__")==null){
response.setStatus(500);
response.getWriter().write(utils.ValidationErrorPopupCreator.getErrorPopup(validationExceptions));
}
}
cleanupThreadLocals();
}
private boolean handlePage()throws Exception{
while(retries<=AbstractDispatchServletHelper.maxRetries){
if(pc!=null){
try{
utils.PageServlet pageservlet=(utils.PageServlet)pc.newInstance();
if(disablePageCache){
pageservlet.isPageCacheDisabled=true;
}
sessionManager=null;
pageservlet.serve(request,response,parammap,parammapvalues,fileUploads);
}
catch(IllegalAccessException iae){
org.webdsl.logging.Logger.error("Problem in dispatch servlet page lookup: "+iae.getMessage());
org.webdsl.logging.Logger.error("EXCEPTION",iae);
return false;
}
catch(InstantiationException ie){
org.webdsl.logging.Logger.error("Problem in dispatch servlet page lookup: "+ie.getMessage());
org.webdsl.logging.Logger.error("EXCEPTION",ie);
return false;
}
catch(utils.MultipleValidationExceptions mve){
throw mve;
}
catch(utils.EntityNotFoundException enfe){
return false;
}
catch(Exception re){
Logger.warn(re);
retries++;
if(re instanceof org.hibernate.StaleObjectStateException&&retries<=AbstractDispatchServletHelper.maxRetries){
Logger.warn("retry request attempt "+retries);
continue;}
else {
throw re;
}
}
}
else {
return false;
}
return true;
}
return false;
}
}

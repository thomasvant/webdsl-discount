package utils;
import webdsl.generated.test.*;import java.net.ServerSocket;
import org.codehaus.cargo.container.*;import org.codehaus.cargo.container.deployable.*;import org.codehaus.cargo.container.tomcat.*;import org.codehaus.cargo.container.property.*;public class TestAll{
public  TestAll(){}
public static void clearDB(){
org.hibernate.Session hibSession=null;
try{
hibSession=utils.HibernateUtil.getCurrentSession();
hibSession.beginTransaction();
utils.HibernateUtil.getCurrentSession().createQuery("delete from "+"ApplicationContextProperty").executeUpdate();
utils.HibernateUtil.getCurrentSession().createQuery("delete from "+"File").executeUpdate();
utils.HibernateUtil.getCurrentSession().createQuery("delete from "+"SecurityContext").executeUpdate();
utils.HibernateUtil.getCurrentSession().createQuery("delete from "+"dummy_webdsl_entity").executeUpdate();
utils.HibernateUtil.getCurrentSession().createQuery("delete from "+"SessionManager").executeUpdate();
utils.HibernateUtil.getCurrentSession().createQuery("delete from "+"SessionMessage").executeUpdate();
utils.HibernateUtil.getCurrentSession().flush();
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
}
catch(Exception ex){
org.webdsl.logging.Logger.error("exception occurred while clearing database: "+ex.getMessage(),ex);
utils.HibernateUtil.getCurrentSession().getTransaction().rollback();
}
}
public static void reloadGlobalVarsInit(org.hibernate.Session hibSession){
hibSession.beginTransaction();
utils.GlobalVariables.forceLoad();
utils.GlobalInit.forceLoad();
hibSession.flush();
}
public void beforeQuit(){
utils.Test.closeDrivers();
}
public void runTests(){
boolean exitWithError=false;
beforeQuit();
if(exitWithError){
System.exit(1);
}
}
public static void main(String[] args){
new TestAll().runTests();
System.exit(0);
}
public static final boolean isPost=false;
public static int SERVLET_PORT=8080;
public static int RMI_PORT=0;
public static int DEBUG_PORT=8000;
public static String contextpath;
public static String warfilename;
static {
try{
java.util.Properties properties=new java.util.Properties();
properties.load(new java.io.FileInputStream("build.properties"));
warfilename=properties.getProperty("webdsl.warfilename");
if(warfilename.equals("ROOT")){
contextpath="";
}
else {
contextpath="/"+warfilename;
}
String servletPortArg=System.getProperty("servletport");
if(servletPortArg!=null){
try{
SERVLET_PORT=Integer.parseInt(servletPortArg);
}
catch(NumberFormatException ex){
throw new RuntimeException(ex);
}
}
}
catch(java.io.IOException ioe){
throw new RuntimeException(ioe);
}
}
public void runInWebAppContainer(boolean findPorts,boolean enableDebugging){
utils.DispatchServletHelper d=new utils.DispatchServletHelper(null,isPost,contextpath);
utils.ThreadLocalServlet.set(d);
d.loadSessionManager(utils.HibernateUtil.getCurrentSession(),null);
String warfile="./"+warfilename+".war";
System.out.println(warfile);
Deployable war=new WAR(warfile);
org.codehaus.cargo.container.configuration.LocalConfiguration configuration=new Tomcat7xStandaloneLocalConfiguration("tomcat7x");
if(findPorts){
try{
ServerSocket ss1=new ServerSocket(0);
ServerSocket ss2=new ServerSocket(0);
ServerSocket ss3=new ServerSocket(0);
SERVLET_PORT=ss1.getLocalPort();
RMI_PORT=ss2.getLocalPort();
DEBUG_PORT=ss3.getLocalPort();
ss1.close();
ss2.close();
ss3.close();
}
catch(java.io.IOException ioex){
org.webdsl.logging.Logger.error("Cannot find free port for test context.",ioex);
System.exit(1);
}
configuration.setProperty(GeneralPropertySet.RMI_PORT,new Integer(RMI_PORT).toString());
}
org.webdsl.logging.Logger.info("************Going to start tomcat on SERVLET_PORT: "+SERVLET_PORT);
configuration.setProperty(ServletPropertySet.PORT,new Integer(SERVLET_PORT).toString());
configuration.setProperty(TomcatPropertySet.AJP_PORT,new Integer(SERVLET_PORT+1).toString());
if(enableDebugging){
configuration.setProperty("cargo.jvmargs","-Djava.security.egd=file:/dev/./urandom -Dservletport="+SERVLET_PORT+" -agentlib:jdwp=transport=dt_socket,address="+DEBUG_PORT+",server=y,suspend=n -Xmx2g -XX:MaxPermSize=384m");
}
else {
configuration.setProperty("cargo.jvmargs","-Djava.security.egd=file:/dev/./urandom -Dservletport="+SERVLET_PORT);
}
configuration.addDeployable(war);
InstalledLocalContainer container=new Tomcat7xInstalledLocalContainer(configuration);
String tomcathome="./tomcat/tomcat/";
System.out.println(tomcathome);
container.setHome(tomcathome);
container.setTimeout(500000L);
container.setLogger(new org.codehaus.cargo.util.log.SimpleLogger(){
protected void doLog(org.codehaus.cargo.util.log.LogLevel level,String message,String category){
System.out.println(message);
}
}
);
container.start();
runTests();
container.stop();
utils.ThreadLocalServlet.set(null);
}
}

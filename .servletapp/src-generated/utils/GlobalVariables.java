package utils;
@SuppressWarnings({"unused","unchecked"})public class GlobalVariables{
private static org.hibernate.Session hibSession;
private static org.webdsl.lang.Environment env;
private static java.io.PrintWriter out=null;
static boolean applicationContextPropertyExists(String name,java.util.List<ApplicationContextProperty> res){
for(ApplicationContextProperty a:res){
if(a.getName().equals(name))return true;
}
return false;
}
public static boolean globalvarsChecked=false;
public static void forceLoad(){
globalvarsChecked=false;
load();
}
public static void load(){
if(!globalvarsChecked){
out=new java.io.PrintWriter(System.out);
utils.ThreadLocalOut.push(out);
org.hibernate.Session hibSession=utils.HibernateUtil.getCurrentSession();
utils.AbstractPageServlet ps=utils.ThreadLocalPage.get();
env=ps.envGlobalAndSession;
org.hibernate.Query q=utils.HibernateUtil.getCurrentSession().createQuery("from ApplicationContextProperty");
java.util.List<ApplicationContextProperty> res=q.list();
org.hibernate.Query q2=utils.HibernateUtil.getCurrentSession().createQuery("from ApplicationContextProperty");
java.util.List<ApplicationContextProperty> results=q2.list();
for(ApplicationContextProperty a:results){}
hibSession=null;
utils.ThreadLocalOut.popChecked(out);
out=null;
globalvarsChecked=true;
}
}
public static boolean initGlobalVars(org.webdsl.lang.Environment env,org.hibernate.Session hibSession){
return true;
}
}

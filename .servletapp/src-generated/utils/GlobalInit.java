package utils;
@SuppressWarnings({"unused","unchecked"})public class GlobalInit{
private static org.hibernate.Session hibSession;
static boolean applicationContextPropertyExists(String name,java.util.List<ApplicationContextProperty> res){
for(ApplicationContextProperty a:res){
if(a.getName().equals(name))return true;
}
return false;
}
static java.io.PrintWriter out;
private static org.webdsl.lang.Environment env;
public static boolean initChecked=false;
public static void forceLoad(){
initChecked=false;
load();
}
public static void load(){
if(!initChecked){
hibSession=utils.HibernateUtil.getCurrentSession();
java.io.PrintWriter out=new java.io.PrintWriter(System.out);
utils.ThreadLocalOut.push(out);
utils.AbstractPageServlet ps=utils.ThreadLocalPage.get();
env=ps.envGlobalAndSession;
org.hibernate.Query q=utils.HibernateUtil.getCurrentSession().createQuery("from ApplicationContextProperty where name = '__global__init__'");
java.util.List<ApplicationContextProperty> res=q.list();
if(res.isEmpty()){
initialize();
initActions();
ApplicationContextProperty flag=new ApplicationContextProperty();
flag.setName("__global__init__");
utils.HibernateUtil.getCurrentSession().save(flag);
}
utils.HibernateUtil.getCurrentSession().flush();
utils.ThreadLocalOut.popChecked(out);
out=null;
hibSession=null;
initChecked=true;
}
}
public static void initActions(){}
protected static void initialize(){}
}

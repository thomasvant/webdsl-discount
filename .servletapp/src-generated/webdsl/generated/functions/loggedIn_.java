package webdsl.generated.functions;
@SuppressWarnings("all")public class loggedIn_{
public static Boolean loggedIn_(){
return !org.webdsl.tools.Utils.equal(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal(),null);
}
}

package webdsl.generated.functions;
@SuppressWarnings("all")public class logout_{
public static void logout_(){
((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).setPrincipal(null);
}
}

package webdsl.generated.functions;
@SuppressWarnings("all")public class principalAsEntity_{
public static org.webdsl.WebDSLEntity principalAsEntity_(){
return ((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal();
}
}

package webdsl.generated.functions;
@SuppressWarnings("all")public class genpagepredicate_personal0User_{
public static Boolean genpagepredicate_personal0User_(webdsl.generated.domain.User user_){
return webdsl.generated.functions.loggedIn_.loggedIn_()&&org.webdsl.tools.Utils.equal(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal(),user_);
}
}

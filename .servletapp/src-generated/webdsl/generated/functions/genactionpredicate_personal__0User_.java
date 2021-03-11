package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_personal__0User_{
public static Boolean genactionpredicate_personal__0User_(webdsl.generated.domain.User genuniquevar0_){
return webdsl.generated.functions.loggedIn_.loggedIn_()&&org.webdsl.tools.Utils.equal(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal(),genuniquevar0_);
}
}

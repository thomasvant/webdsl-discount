package webdsl.generated.functions;
@SuppressWarnings("all")public class authenticateEmail_Secret_{
public static Boolean authenticateEmail_Secret_(String credemail_,String credpassword_){
java.util.List<webdsl.generated.domain.User> tmpentitylist_=webdsl.generated.domain.User._static_findByEmail_(credemail_);
if(!(org.webdsl.tools.Utils.equal(tmpentitylist_.size(),null)||org.webdsl.tools.Utils.equal(0,null))&&tmpentitylist_.size()>0){
java.util.Collection<? extends webdsl.generated.domain.User> exp0=tmpentitylist_;
java.util.ArrayList<webdsl.generated.domain.User> lst0=new java.util.ArrayList<webdsl.generated.domain.User>(exp0);
int i0=-1;
for(webdsl.generated.domain.User tmpentity_:lst0){
i0++;
Boolean allow_=true;
if(!org.webdsl.tools.Utils.secretCheck(tmpentity_.getPassword(),credpassword_)){
allow_=false;
}
else {}
if(allow_){
((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).setPrincipal(tmpentity_);
webdsl.generated.functions.getDispatchServlet_.getDispatchServlet_().renewCookieValue();
return true;
}
else {}
}
}
else {}
((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).setPrincipal(null);
return false;
}
}

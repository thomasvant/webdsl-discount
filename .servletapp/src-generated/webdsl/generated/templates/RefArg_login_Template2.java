package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_login_Template2 extends utils.RefArg{
public login_Template template;
public  RefArg_login_Template2(login_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setStayLoggedIn_((Boolean)org.webdsl.tools.Utils.cast(obj,Boolean.class));
return this;
}
public Object get(){
return template.getStayLoggedIn_();
}
}

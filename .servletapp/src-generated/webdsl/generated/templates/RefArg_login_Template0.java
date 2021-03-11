package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_login_Template0 extends utils.RefArg{
public login_Template template;
public  RefArg_login_Template0(login_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setCredemail_((String)org.webdsl.tools.Utils.cast(obj,String.class));
return this;
}
public Object get(){
return template.getCredemail_();
}
}

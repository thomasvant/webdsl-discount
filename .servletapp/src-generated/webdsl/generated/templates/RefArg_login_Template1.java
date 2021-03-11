package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_login_Template1 extends utils.RefArg{
public login_Template template;
public  RefArg_login_Template1(login_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setCredpassword_((String)org.webdsl.tools.Utils.cast(obj,String.class));
return this;
}
public Object get(){
return template.getCredpassword_();
}
}

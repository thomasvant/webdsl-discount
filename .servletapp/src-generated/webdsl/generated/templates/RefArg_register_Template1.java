package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_register_Template1 extends utils.RefArg{
public register_Template template;
public  RefArg_register_Template1(register_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setPassword_((String)org.webdsl.tools.Utils.cast(obj,String.class));
return this;
}
public Object get(){
return template.getPassword_();
}
}

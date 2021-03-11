package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_signIn_Template0 extends utils.RefArg{
public signIn_Template template;
public  RefArg_signIn_Template0(signIn_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setUser_(webdsl.generated.domain.User._static_cast_(obj));
return this;
}
public Object get(){
return template.getUser_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
}

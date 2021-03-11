package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_profile_Template0 extends utils.RefArg{
public profile_Template template;
public  RefArg_profile_Template0(profile_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setPrincipal_((Boolean)org.webdsl.tools.Utils.cast(obj,Boolean.class));
return this;
}
public Object get(){
return template.getPrincipal_();
}
}

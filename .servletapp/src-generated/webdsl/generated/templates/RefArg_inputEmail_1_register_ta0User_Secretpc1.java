package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_inputEmail_1_register_ta0User_Secretpc1 extends utils.RefArg{
public webdsl.generated.domain.User user_;
public  RefArg_inputEmail_1_register_ta0User_Secretpc1(){}
public  RefArg_inputEmail_1_register_ta0User_Secretpc1(Object user_){
this.user_=(webdsl.generated.domain.User)user_;
}
public webdsl.generated.domain.User set(Object obj){
user_.setEmail((String)org.webdsl.tools.Utils.cast(obj,String.class));
return user_;
}
public Object get(){
return (String)user_.getEmail();
}
public void load(String uuid){
if(uuid.contains(":")){
user_=(webdsl.generated.domain.User)utils.PageParamLoad.loadEntityFromParam(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain",uuid);
}
else {
try{
Class<?> cl=org.hibernate.util.ReflectHelper.classForName("webdsl.generated.domain.User");
user_=(webdsl.generated.domain.User)utils.HibernateUtil.getCurrentSession().load(cl,java.util.UUID.fromString(uuid));
}
catch(ClassNotFoundException cnfe){
throw new RuntimeException(cnfe);
}
}
}
public String getUrlString(){
return user_.getId()+"!"+"RefArg_inputEmail_1_register_ta0User_Secretpc1";
}
public String get_WebDslEntityType(){
if(get()==null){
return "Email";
}
else {
return ((org.webdsl.WebDSLEntity)get()).get_WebDslEntityType();
}
}
public org.webdsl.WebDSLEntity getEntity(){
return user_;
}
public void validate(String location,java.util.List<utils.ValidationException> exceptions){
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
user_.validateEmail_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
exceptions.add(new utils.ValidationException(location,v.getMessage()));
}
}
public java.util.List<String> getValidationErrors(){
java.util.List<String> result=new java.util.ArrayList<String>();
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
user_.validateEmail_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
result.add(v.getMessage());
}
return result;
}
public org.webdsl.lang.ReflectionProperty getReflectionProperty(){
return utils.ThreadLocalServlet.get().getReflectionEntityByName("User").getPropertyByName("email");
}
public java.util.List<Object> getAllowed(){
return getReflectionProperty().getAllowed(user_);
}
}

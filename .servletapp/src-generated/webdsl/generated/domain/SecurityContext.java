package webdsl.generated.domain;
import javax.persistence.*;import webdsl.generated.templates.*;public @Entity @javax.persistence.Table(name="_SecurityContext")@SuppressWarnings("all")class SecurityContext implements org.webdsl.WebDSLEntity,org.hibernate.bytecode.javassist.FieldHandled{
public void validateDelete(){
java.util.List<utils.ValidationException> exceptions=new java.util.LinkedList<utils.ValidationException>();
if(exceptions.size()>0){
throw new utils.MultipleValidationExceptions(exceptions);
}
}
public void validateSave(){
webdsl.generated.domain.ValidationExceptionMultiple mex=this.validateSave_();
java.util.List<webdsl.generated.domain.ValidationException> ex=mex.getExceptions();
java.util.List<utils.ValidationException> exceptions=new java.util.LinkedList<utils.ValidationException>();
for(webdsl.generated.domain.ValidationException v:ex){
exceptions.add(new utils.ValidationException(null,v.getMessage()));
}
if(exceptions.size()>0){
throw new utils.MultipleValidationExceptions(exceptions);
}
}
public  SecurityContext(){}
transient protected org.hibernate.bytecode.javassist.FieldHandler fieldHandler;
transient protected java.util.Set<String> uninitializedLazyProperties=null;
public org.hibernate.bytecode.javassist.FieldHandler getFieldHandler(){
return fieldHandler;
}
public boolean removeUninitializedLazyProperty(String name){
return uninitializedLazyProperties!=null&&uninitializedLazyProperties.remove(name);
}
public void setFieldHandler(org.hibernate.bytecode.javassist.FieldHandler fieldHandler){
this.fieldHandler=fieldHandler;
java.util.Set fieldHandlerUninit=((org.hibernate.intercept.javassist.FieldInterceptorImpl)fieldHandler).getUninitializedFields();
if(fieldHandlerUninit!=null){
this.uninitializedLazyProperties=new java.util.HashSet<String>(fieldHandlerUninit);
}
}
public String getNaturalId(){
return _id.toString();
}
@javax.persistence.Id @org.hibernate.annotations.Type(type="utils.UUIDUserType")@javax.persistence.Column(name="id",length=32)@org.hibernate.search.annotations.DocumentId @org.hibernate.search.annotations.FieldBridge(impl=utils.UUIDFieldBridge.class)protected java.util.UUID _id=null;
public java.util.UUID getId(){
return _id;
}
public org.webdsl.WebDSLEntity setId(java.util.UUID idarg){
this._id=idarg;
return this;
}
@Version @Column(name="version_opt_lock")protected Integer _version=1;
public Integer getVersion(){
return _version;
}
public org.webdsl.WebDSLEntity setVersion(Integer v){
this._version=v;
setChanged(v==1?"save()":"version");
return this;
}
@Transient boolean versionWasIncreased=false;
public void increaseVersion(){
if(!versionWasIncreased){
_version++;
versionWasIncreased=true;
setChanged("version");
}
}
@Transient protected boolean isChanged=false;
public boolean isChanged(){
return isChanged;
}
public void setChanged(String prop){
if(_version>0){
utils.AbstractPageServlet thepage=utils.ThreadLocalPage.get();
if(thepage!=null){
thepage.setHasWrites(true);
utils.ThreadLocalServlet.get().setSessionHasChanges();
if(!thepage.invalidateUserSpecificPageCache&&!thepage.invalidateAllPageCache){
thepage.invalidateUserSpecificPageCache("SecurityContext"+"."+prop);
}
}
if(thepage!=null&&thepage.isReadOnly){
org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in "+"SecurityContext"+"."+prop);
utils.Warning.printSmallStackTrace(5);
}
else {
utils.HibernateUtil.getCurrentSession().setFlushMode(org.hibernate.FlushMode.AUTO);
}
}
if(!isChanged){
isChanged=true;
if(fieldHandler!=null){
((org.hibernate.intercept.FieldInterceptor)fieldHandler).dirty();
}
}
}
@Transient protected boolean isRequestVar=false;
public boolean isRequestVar(){
return isRequestVar;
}
public void setRequestVar(){
isRequestVar=true;
}
public boolean equals(Object o){
return o!=null&&o instanceof org.webdsl.WebDSLEntity&&((org.webdsl.WebDSLEntity)o).instanceOf("SecurityContext")&&org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy?SecurityContext.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()):SecurityContext.class.cast(o)).getId(),getId());
}
public SecurityContext save(String webdslTypeName){
return this;
}
public SecurityContext delete(){
return this;
}
public int hashCode(){
if(getId()==null)return super.hashCode();
else return getId().hashCode();
}
public int compareTo(org.webdsl.WebDSLEntity o){
return getId().compareTo(((SecurityContext)o).getId());
}
public boolean isInstance(Class<?> c){
return c.isInstance(this);
}
public boolean instanceOf(String s){
return s.equals("SecurityContext")||s.equals("Object")||s.equals("Entity");
}
@Temporal(TemporalType.TIMESTAMP)@javax.persistence.Column(name="\"_created\"")@org.hibernate.annotations.AccessType(value="field")protected java.util.Date _created=null;
public java.util.Date getCreated(){
return _created;
}
public boolean isCreatedUninitialized(){
return false;
}
public SecurityContext setCreated(java.util.Date newitem){
if(!createdBeingSet){
createdBeingSet=true;
setChanged("created");
this.setCreatedDateTime_(newitem);
java.util.Date olditem=_created;
_created=newitem;
createdBeingSet=false;
}
return this;
}
public void setCreatedNoEventsOrValidation(java.util.Date newitem){
setChanged("created");
java.util.Date olditem=_created;
_created=newitem;
}
@Transient boolean createdBeingSet=false;
@Temporal(TemporalType.TIMESTAMP)@javax.persistence.Column(name="\"_modified\"")@org.hibernate.annotations.AccessType(value="field")protected java.util.Date _modified=null;
public java.util.Date getModified(){
return _modified;
}
public boolean isModifiedUninitialized(){
return false;
}
public SecurityContext setModified(java.util.Date newitem){
if(!modifiedBeingSet){
modifiedBeingSet=true;
setChanged("modified");
this.setModifiedDateTime_(newitem);
java.util.Date olditem=_modified;
_modified=newitem;
modifiedBeingSet=false;
}
return this;
}
public void setModifiedNoEventsOrValidation(java.util.Date newitem){
setChanged("modified");
java.util.Date olditem=_modified;
_modified=newitem;
}
@Transient boolean modifiedBeingSet=false;
@ManyToOne(fetch=javax.persistence.FetchType.LAZY)@JoinColumn(name="\"SecurityContext_principal\"")@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})@org.hibernate.annotations.AccessType(value="field")protected webdsl.generated.domain.User _principal=null;
public webdsl.generated.domain.User getPrincipal(){
return _principal;
}
public boolean isPrincipalUninitialized(){
return _principal instanceof org.hibernate.proxy.HibernateProxy&&((org.hibernate.proxy.HibernateProxy)_principal).getHibernateLazyInitializer().isUninitialized();
}
public SecurityContext setPrincipal(webdsl.generated.domain.User newitem){
if(!principalBeingSet){
principalBeingSet=true;
setChanged("principal");
this.setPrincipalUser_(newitem);
webdsl.generated.domain.User olditem=_principal;
_principal=newitem;
principalBeingSet=false;
}
return this;
}
public void setPrincipalNoEventsOrValidation(webdsl.generated.domain.User newitem){
setChanged("principal");
webdsl.generated.domain.User olditem=_principal;
_principal=newitem;
}
@Transient boolean principalBeingSet=false;
public Boolean getLoggedIn(){
return !org.webdsl.tools.Utils.equal(this.getPrincipal(),null);
}
public String getName(){
if(getId()!=null){
return getId().toString();
}
else {
return "";
}
}
@Transient protected java.util.UUID principalIdent=null;
public java.util.UUID getPrincipalIdent(){
return principalIdent;
}
public void setPrincipalIdent(java.util.UUID newitem){
principalIdent=newitem;
}
public String get_WebDslEntityType(){
return "SecurityContext";
}
public java.util.List<webdsl.generated.domain.User> allowedPrincipal_(){
return (java.util.List<webdsl.generated.domain.User>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
public void validatePrincipal_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validatePrincipal_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validatePrincipal_internalValidationExceptionMultiple_(v_);
return v_;
}
public webdsl.generated.domain.ValidationExceptionMultiple validateSave_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
return v_;
}
public static java.util.List<org.webdsl.WebDSLEntity> $static$all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from SecurityContext").list();
}
public java.util.List<org.webdsl.WebDSLEntity> all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from SecurityContext").list();
}
public webdsl.generated.domain.SecurityContext SecurityContext$this_(){
this.SecurityContext_();
return this;
}
public void SecurityContext_(){}
public void setCreatedDateTime_(java.util.Date value_){}
public void setModifiedDateTime_(java.util.Date value_){}
public void setPrincipalUser_(webdsl.generated.domain.User value_){}
public static SecurityContext _static_createEmpty_(){
SecurityContext ent=new SecurityContext();
ent.setId(java.util.UUID.randomUUID());
return ent;
}
public static SecurityContext _static_cast_(Object o){
return (SecurityContext)org.webdsl.tools.Utils.cast(o,SecurityContext.class);
}
}

package webdsl.generated.domain;
import javax.persistence.*;import webdsl.generated.templates.*;public @javax.persistence.Entity @javax.persistence.Table(name="_Discount")@org.hibernate.annotations.FilterDefs({})@org.hibernate.annotations.Persister(impl=utils.SingleTableEntityPersister.class)@javax.persistence.DiscriminatorColumn(name="DISCRIMINATOR",discriminatorType=javax.persistence.DiscriminatorType.STRING,length=255)@SuppressWarnings("all")class Discount implements org.webdsl.WebDSLEntity,org.hibernate.bytecode.javassist.FieldHandled,org.webdsl.search.NoDynamicSearchFields{
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
public  Discount(){}
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
@javax.persistence.Id @org.hibernate.annotations.Type(type="utils.UUIDUserType")@javax.persistence.Column(name="id",length=32)@org.hibernate.search.annotations.DocumentId @org.hibernate.search.annotations.FieldBridge(impl=utils.UUIDFieldBridge.class)protected java.util.UUID _id=null;
public java.util.UUID getId(){
return _id;
}
public org.webdsl.WebDSLEntity setId(java.util.UUID idarg){
this._id=idarg;
return this;
}
public String getNaturalId(){
return _id.toString();
}
@Version @Column(name="version_opt_lock")protected Integer _version=0;
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
if(!thepage.invalidateAllPageCache){
thepage.invalidateAllPageCache("Discount"+"."+prop);
}
}
if(thepage!=null&&thepage.isReadOnly){
org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in "+"Discount"+"."+prop);
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
return o!=null&&o instanceof org.webdsl.WebDSLEntity&&((org.webdsl.WebDSLEntity)o).instanceOf("Discount")&&org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy?Discount.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()):Discount.class.cast(o)).getId(),getId());
}
public Discount save(String webdslTypeName){
setVersion(1);
if(utils.ThreadLocalPage.isReadOnly()){
org.webdsl.logging.Logger.error("page or ajax template is forced to be read-only, but an entity of type '"+webdslTypeName+"' is saved");
utils.Warning.printSmallStackTrace(5);
}
utils.HibernateUtil.getCurrentSession().save(this);
return this;
}
public Discount delete(){
validateDelete();
setChanged("delete()");
utils.HibernateUtil.getCurrentSession().delete(this);
return this;
}
public int hashCode(){
if(getId()==null)return super.hashCode();
else return getId().hashCode();
}
public int compareTo(org.webdsl.WebDSLEntity o){
return getId().compareTo(((Discount)o).getId());
}
public boolean isInstance(Class<?> c){
return c.isInstance(this);
}
public boolean instanceOf(String s){
return s.equals("Discount")||s.equals("Object")||s.equals("Entity");
}
@Temporal(TemporalType.TIMESTAMP)@javax.persistence.Column(name="\"_created\"")@org.hibernate.annotations.AccessType(value="field")protected java.util.Date _created=null;
public java.util.Date getCreated(){
return _created;
}
public boolean isCreatedUninitialized(){
return false;
}
public Discount setCreated(java.util.Date newitem){
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
public Discount setModified(java.util.Date newitem){
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
@javax.persistence.Column(name="\"_code\"",length=255)@org.hibernate.annotations.AccessType(value="field")protected String _code="";
public String getCode(){
return _code;
}
public boolean isCodeUninitialized(){
return false;
}
public Discount setCode(String newitem){
if(!codeBeingSet){
codeBeingSet=true;
setChanged("code");
this.setCodeString_(newitem);
String olditem=_code;
_code=newitem;
codeBeingSet=false;
}
return this;
}
public void setCodeNoEventsOrValidation(String newitem){
setChanged("code");
String olditem=_code;
_code=newitem;
}
@Transient boolean codeBeingSet=false;
public Boolean getClaimed(){
return false;
}
@Temporal(TemporalType.DATE)@javax.persistence.Column(name="\"_dueDate\"")@org.hibernate.annotations.AccessType(value="field")protected java.util.Date _dueDate=null;
public java.util.Date getDueDate(){
return _dueDate;
}
public boolean isDueDateUninitialized(){
return false;
}
public Discount setDueDate(java.util.Date newitem){
if(!dueDateBeingSet){
dueDateBeingSet=true;
setChanged("dueDate");
this.setDueDateDate_(newitem);
java.util.Date olditem=_dueDate;
_dueDate=newitem;
dueDateBeingSet=false;
}
return this;
}
public void setDueDateNoEventsOrValidation(java.util.Date newitem){
setChanged("dueDate");
java.util.Date olditem=_dueDate;
_dueDate=newitem;
}
@Transient boolean dueDateBeingSet=false;
@ManyToOne(fetch=javax.persistence.FetchType.LAZY)@JoinColumn(name="\"Discount_creator\"")@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})@org.hibernate.annotations.AccessType(value="field")protected webdsl.generated.domain.User _creator=null;
public webdsl.generated.domain.User getCreator(){
return _creator;
}
public boolean isCreatorUninitialized(){
return _creator instanceof org.hibernate.proxy.HibernateProxy&&((org.hibernate.proxy.HibernateProxy)_creator).getHibernateLazyInitializer().isUninitialized();
}
public Discount setCreator(webdsl.generated.domain.User newitem){
if(!creatorBeingSet){
creatorBeingSet=true;
setChanged("creator");
webdsl.generated.domain.User item=newitem;
webdsl.generated.domain.User oldthing=getCreator();
if(oldthing!=newitem){
if(oldthing!=null&&item==null){
item=oldthing;
item.removeFromDiscounts(this);
}
else if(oldthing!=null&&item!=null){
item.addToDiscounts(this);
item=oldthing;
item.removeFromDiscounts(this);
}
else if(oldthing==null&&item!=null){
item.addToDiscounts(this);
}
this.increaseVersion();
if(item!=null){
item.increaseVersion();
}
if(oldthing!=null){
oldthing.increaseVersion();
}
}
this.setCreatorUser_(newitem);
webdsl.generated.domain.User olditem=_creator;
_creator=newitem;
creatorBeingSet=false;
}
return this;
}
public void setCreatorNoEventsOrValidation(webdsl.generated.domain.User newitem){
setChanged("creator");
webdsl.generated.domain.User olditem=_creator;
_creator=newitem;
}
@Transient boolean creatorBeingSet=false;
@ManyToOne(fetch=javax.persistence.FetchType.LAZY)@JoinColumn(name="\"Discount_store\"")@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})@org.hibernate.annotations.AccessType(value="field")protected webdsl.generated.domain.Store _store=null;
public webdsl.generated.domain.Store getStore(){
return _store;
}
public boolean isStoreUninitialized(){
return _store instanceof org.hibernate.proxy.HibernateProxy&&((org.hibernate.proxy.HibernateProxy)_store).getHibernateLazyInitializer().isUninitialized();
}
public Discount setStore(webdsl.generated.domain.Store newitem){
if(!storeBeingSet){
storeBeingSet=true;
setChanged("store");
webdsl.generated.domain.Store item=newitem;
webdsl.generated.domain.Store oldthing=getStore();
if(oldthing!=newitem){
if(oldthing!=null&&item==null){
item=oldthing;
item.removeFromDiscounts(this);
}
else if(oldthing!=null&&item!=null){
item.addToDiscounts(this);
item=oldthing;
item.removeFromDiscounts(this);
}
else if(oldthing==null&&item!=null){
item.addToDiscounts(this);
}
this.increaseVersion();
if(item!=null){
item.increaseVersion();
}
if(oldthing!=null){
oldthing.increaseVersion();
}
}
this.setStoreStore_(newitem);
webdsl.generated.domain.Store olditem=_store;
_store=newitem;
storeBeingSet=false;
}
return this;
}
public void setStoreNoEventsOrValidation(webdsl.generated.domain.Store newitem){
setChanged("store");
webdsl.generated.domain.Store olditem=_store;
_store=newitem;
}
@Transient boolean storeBeingSet=false;
public String getName(){
if(getId()!=null){
return getId().toString();
}
else {
return "";
}
}
public String get_WebDslEntityType(){
return "Discount";
}
public java.util.List<webdsl.generated.domain.Store> allowedStore_(){
return (java.util.List<webdsl.generated.domain.Store>)(java.util.List<?>)webdsl.generated.domain.Store.$static$all_();
}
public java.util.List<webdsl.generated.domain.User> allowedCreator_(){
return (java.util.List<webdsl.generated.domain.User>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
public void validateStore_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateStore_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateStore_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateCreator_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateCreator_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateCreator_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateDueDate_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateDueDate_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateDueDate_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateCode_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getCode(),null)&&(!(org.webdsl.tools.Utils.equal(this.getCode().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getCode().length()>255)){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Value exceeds maximum length ("+255+")"));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateCode_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateCode_internalValidationExceptionMultiple_(v_);
return v_;
}
public Boolean isDue_(){
return this.getDueDate().before(utils.DateType.addDays(utils.DateType.today(),1));
}
public webdsl.generated.domain.ValidationExceptionMultiple validateSave_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateCode_internalValidationExceptionMultiple_(v_);
this.validateCreator_internalValidationExceptionMultiple_(v_);
this.validateDueDate_internalValidationExceptionMultiple_(v_);
this.validateStore_internalValidationExceptionMultiple_(v_);
return v_;
}
public static java.util.List<org.webdsl.WebDSLEntity> $static$all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from Discount").list();
}
public java.util.List<org.webdsl.WebDSLEntity> all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from Discount").list();
}
public static java.util.List<webdsl.generated.domain.Discount> _static_findByCode_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Discount as g where g._code = :param0").setParameter("param0",prop_).list();
}
public static java.util.List<webdsl.generated.domain.Discount> _static_findByCodeLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Discount as g where g._code like :param1").setParameter("param1",s_).list();
}
public static webdsl.generated.domain.Discount _static_load_(java.util.UUID prop_){
return webdsl.generated.domain.Discount._static_cast_(utils.PageParamLoad.loadEntity(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain"+"."+"Discount",prop_));
}
public webdsl.generated.domain.Discount Discount$this_(){
this.Discount_();
return this;
}
public void Discount_(){}
public void setCreatedDateTime_(java.util.Date value_){}
public void setModifiedDateTime_(java.util.Date value_){}
public void setCodeString_(String value_){}
public void setDueDateDate_(java.util.Date value_){}
public void setCreatorUser_(webdsl.generated.domain.User value_){}
public void setStoreStore_(webdsl.generated.domain.Store value_){}
public static Discount _static_createEmpty_(){
Discount ent=new Discount();
ent.setId(java.util.UUID.randomUUID());
return ent;
}
public static Discount _static_cast_(Object o){
return (Discount)org.webdsl.tools.Utils.cast(o,Discount.class);
}
}

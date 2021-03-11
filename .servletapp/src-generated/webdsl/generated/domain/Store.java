package webdsl.generated.domain;
import javax.persistence.*;import webdsl.generated.templates.*;public @javax.persistence.Entity @javax.persistence.Table(name="_Store")@org.hibernate.annotations.FilterDefs({})@org.hibernate.annotations.Persister(impl=utils.SingleTableEntityPersister.class)@javax.persistence.DiscriminatorColumn(name="DISCRIMINATOR",discriminatorType=javax.persistence.DiscriminatorType.STRING,length=255)@SuppressWarnings("all")class Store implements org.webdsl.WebDSLEntity,org.hibernate.bytecode.javassist.FieldHandled,org.webdsl.search.NoDynamicSearchFields{
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
public  Store(){}
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
thepage.invalidateAllPageCache("Store"+"."+prop);
}
}
if(thepage!=null&&thepage.isReadOnly){
org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in "+"Store"+"."+prop);
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
return o!=null&&o instanceof org.webdsl.WebDSLEntity&&((org.webdsl.WebDSLEntity)o).instanceOf("Store")&&org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy?Store.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()):Store.class.cast(o)).getId(),getId());
}
public Store save(String webdslTypeName){
setVersion(1);
if(utils.ThreadLocalPage.isReadOnly()){
org.webdsl.logging.Logger.error("page or ajax template is forced to be read-only, but an entity of type '"+webdslTypeName+"' is saved");
utils.Warning.printSmallStackTrace(5);
}
utils.HibernateUtil.getCurrentSession().save(this);
return this;
}
public Store delete(){
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
return getId().compareTo(((Store)o).getId());
}
public boolean isInstance(Class<?> c){
return c.isInstance(this);
}
public boolean instanceOf(String s){
return s.equals("Store")||s.equals("Object")||s.equals("Entity");
}
@Temporal(TemporalType.TIMESTAMP)@javax.persistence.Column(name="\"_created\"")@org.hibernate.annotations.AccessType(value="field")protected java.util.Date _created=null;
public java.util.Date getCreated(){
return _created;
}
public boolean isCreatedUninitialized(){
return false;
}
public Store setCreated(java.util.Date newitem){
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
public Store setModified(java.util.Date newitem){
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
@javax.persistence.Column(name="\"_name\"",length=255)@org.hibernate.annotations.AccessType(value="field")protected String _name="";
public String getName(){
return _name;
}
public boolean isNameUninitialized(){
return false;
}
public Store setName(String newitem){
if(!nameBeingSet){
nameBeingSet=true;
setChanged("name");
this.setNameString_(newitem);
String olditem=_name;
_name=newitem;
nameBeingSet=false;
}
return this;
}
public void setNameNoEventsOrValidation(String newitem){
setChanged("name");
String olditem=_name;
_name=newitem;
}
@Transient boolean nameBeingSet=false;
@OneToMany(fetch=javax.persistence.FetchType.LAZY)@JoinColumn(name="\"Discount_store\"",insertable=false,updatable=false)@org.hibernate.annotations.Persister(impl=utils.OneToManyPersister.class)@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})protected java.util.Set<webdsl.generated.domain.Discount> _discounts=new webdsl.generated.domain.StoreDiscountsSet(this);
public java.util.Set<webdsl.generated.domain.Discount> getDiscounts(){
return _discounts;
}
public boolean isDiscountsUninitialized(){
return _discounts instanceof org.hibernate.collection.PersistentCollection&&!((org.hibernate.collection.PersistentCollection)_discounts).wasInitialized();
}
public Store setDiscounts(java.util.Set<webdsl.generated.domain.Discount> newitem){
setChanged("discounts");
_discounts=newitem;
return this;
}
@Transient boolean discountsBeingSet=false;
public java.util.List<webdsl.generated.domain.Discount> getDiscountsList(){
return new java.util.ArrayList(getDiscounts());
}
public void setDiscountsList(java.util.List<webdsl.generated.domain.Discount> list1){
setChanged("discounts");
setDiscounts(new webdsl.generated.domain.StoreDiscountsSet(this,list1));
}
public int getDiscountsLength(){
return getDiscounts().size();
}
public void removeFromDiscounts(webdsl.generated.domain.Discount item){
setChanged("discounts");
getDiscounts().remove(item);
}
public void replaceAllInDiscounts(java.util.Collection<webdsl.generated.domain.Discount> col){
removeAllFromDiscounts();
addAllToDiscounts(col);
}
public void removeAllFromDiscounts(){
org.hibernate.Hibernate.initialize(getDiscounts());
java.util.Iterator<webdsl.generated.domain.Discount> itt=getDiscounts().iterator();
java.util.List<webdsl.generated.domain.Discount> copy=new java.util.ArrayList(getDiscounts());
while(itt.hasNext()){
itt.next();
itt.remove();
}
itt=copy.iterator();
while(itt.hasNext()){
removeFromDiscounts(itt.next());
}
}
public void addToDiscounts(webdsl.generated.domain.Discount item){
setChanged("discounts");
getDiscounts().add(item);
if(_version>0){
item._version=Math.max(1,item._version);
}
}
public java.util.Set<webdsl.generated.domain.Discount> addAllToDiscounts(java.util.Collection<webdsl.generated.domain.Discount> col){
java.util.List<webdsl.generated.domain.Discount> copy=new java.util.ArrayList<webdsl.generated.domain.Discount>(col);
java.util.Iterator<webdsl.generated.domain.Discount> it=copy.iterator();
while(it.hasNext()){
addToDiscounts(it.next());
}
return getDiscounts();
}
public String get_WebDslEntityType(){
return "Store";
}
public java.util.List<webdsl.generated.domain.Discount> allowedDiscounts_(){
return (java.util.List<webdsl.generated.domain.Discount>)(java.util.List<?>)webdsl.generated.domain.Discount.$static$all_();
}
public void validateDiscounts_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateDiscounts_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateDiscounts_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateName_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getName(),null)&&(!(org.webdsl.tools.Utils.equal(this.getName().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getName().length()>255)){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Value exceeds maximum length ("+255+")"));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateName_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateName_internalValidationExceptionMultiple_(v_);
return v_;
}
public webdsl.generated.domain.ValidationExceptionMultiple validateSave_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateDiscounts_internalValidationExceptionMultiple_(v_);
this.validateName_internalValidationExceptionMultiple_(v_);
return v_;
}
public static java.util.List<org.webdsl.WebDSLEntity> $static$all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from Store").list();
}
public java.util.List<org.webdsl.WebDSLEntity> all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from Store").list();
}
public static java.util.List<webdsl.generated.domain.Store> _static_findByName_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Store as g where g._name = :param0").setParameter("param0",prop_).list();
}
public static java.util.List<webdsl.generated.domain.Store> _static_findByNameLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Store as g where g._name like :param1").setParameter("param1",s_).list();
}
public static webdsl.generated.domain.Store _static_load_(java.util.UUID prop_){
return webdsl.generated.domain.Store._static_cast_(utils.PageParamLoad.loadEntity(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain"+"."+"Store",prop_));
}
public webdsl.generated.domain.Store Store$this_(){
this.Store_();
return this;
}
public void Store_(){}
public void setCreatedDateTime_(java.util.Date value_){}
public void setModifiedDateTime_(java.util.Date value_){}
public void setNameString_(String value_){}
public webdsl.generated.domain.Store replaceAllDiscountsSDiscountS_(java.util.Set<webdsl.generated.domain.Discount> value_){
this.replaceAllInDiscounts(value_);
return this;
}
public void removeFromDiscountsDiscount_(webdsl.generated.domain.Discount value_){}
public void addToDiscountsDiscount_(webdsl.generated.domain.Discount value_){}
public static Store _static_createEmpty_(){
Store ent=new Store();
ent.setId(java.util.UUID.randomUUID());
return ent;
}
public static Store _static_cast_(Object o){
return (Store)org.webdsl.tools.Utils.cast(o,Store.class);
}
}

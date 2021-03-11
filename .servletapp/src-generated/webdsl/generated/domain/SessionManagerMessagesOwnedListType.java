package webdsl.generated.domain;
import org.hibernate.HibernateException;
import org.hibernate.collection.PersistentCollection;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.persister.collection.CollectionPersister;
@SuppressWarnings("unchecked")public class SessionManagerMessagesOwnedListType extends utils.AbstractOwnedListType{
private static final String[] _filters=(String[])null;
@Override public Object instantiate(int anticipatedSize){
return new SessionManagerMessagesList(anticipatedSize<1?0:anticipatedSize);
}
public boolean isAffectedBy(final String filter){
if(_filters==null)return false;
for(String s:_filters){
if(s.equals(filter))return true;
}
return false;
}
public boolean isFilterCompatible(final org.hibernate.impl.FilterImpl oldFilter,final org.hibernate.impl.FilterImpl newFilter){
if(oldFilter==null)return true;
if(newFilter==null)return false;
if(utils.QueryOptimization.equalFilters(oldFilter,newFilter))return true;
String oldName=oldFilter.getName();
String newName=newFilter.getName();
java.util.Map oldParams=oldFilter.getParameters();
java.util.Map newParams=newFilter.getParameters();
return false;
}
public boolean oldFilterContains(final String oldName,final java.util.Map oldParams,final String fltrName,final java.util.Map fltrParams,final int fltrStart,final int len){
if(oldName==null||fltrName==null)return false;
if(oldName.equals(fltrName))return utils.QueryOptimization.equalFilterParams(oldParams,0,fltrParams,fltrStart,len);
return false;
}
}

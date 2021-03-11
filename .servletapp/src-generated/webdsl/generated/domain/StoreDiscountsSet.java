package webdsl.generated.domain;
@SuppressWarnings("unchecked")public class StoreDiscountsSet extends utils.OwnedSet<webdsl.generated.domain.Discount>{
public  StoreDiscountsSet(){
super();
}
public  StoreDiscountsSet(int anticipatedSize){
super(anticipatedSize);
}
public  StoreDiscountsSet(java.util.List<webdsl.generated.domain.Discount> list){
super(list);
}
public  StoreDiscountsSet(Object owner){
super(owner);
}
public  StoreDiscountsSet(Object owner,int anticipatedSize){
super(owner,anticipatedSize);
}
public  StoreDiscountsSet(Object owner,java.util.List<webdsl.generated.domain.Discount> list){
super(owner,list);
}
@Override public boolean addAll(java.util.Collection<? extends webdsl.generated.domain.Discount> col){
if(!doEvents){
return super.addAll(col);
}
else if(this.owner==null){
return super.addAll(col);
}
else if(!beingSet&&doEvents){
java.util.Iterator<? extends webdsl.generated.domain.Discount> it=col.iterator();
while(it.hasNext()){
add(it.next());
}
return true;
}
return super.addAll(col);
}
@Override public void clear(){
if(!doEvents){
super.clear();
}
else if(this.owner==null){
super.clear();
}
else if(!beingSet&&doEvents){
while(!isEmpty()){
remove(iterator().next());
}
}
}
@Override public boolean add(webdsl.generated.domain.Discount item){
if(!doEvents){
return super.add(item);
}
else if(this.owner==null){
return super.add(item);
}
else if(item!=null&&!beingSet&&doEvents){
Store owner=(Store)this.owner;
owner.setChanged("discounts");
beingSet=true;
webdsl.generated.domain.Discount oldthing=webdsl.generated.domain.Discount._static_createEmpty_();
boolean result=super.add(item);
item.setStore(owner);
owner.addToDiscountsDiscount_(item);
beingSet=false;
return result;
}
return false;
}
@Override public boolean remove(Object obj){
if(!doEvents){
return super.remove(obj);
}
else if(this.owner==null){
return super.remove(obj);
}
else if(obj!=null&&!beingSet&&doEvents&&obj instanceof webdsl.generated.domain.Discount){
webdsl.generated.domain.Discount item=(webdsl.generated.domain.Discount)obj;
beingSet=true;
Store owner=(Store)this.owner;
owner.setChanged("discounts");
boolean result=super.remove(item);
if(!contains(item)){
item.setStore(null);
owner.removeFromDiscountsDiscount_(item);
}
beingSet=false;
return result;
}
return false;
}
}

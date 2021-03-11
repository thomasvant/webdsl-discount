package webdsl.generated.search;
import java.util.Arrays;
import java.util.Collection;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import org.apache.lucene.analysis.WhitespaceAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.IndexWriterConfig.OpenMode;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.spell.SpellChecker;
import org.apache.lucene.search.spell.Dictionary;
import org.apache.lucene.search.spell.LuceneDictionary;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.BooleanClause.Occur;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.MatchAllDocsQuery;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.SearchFactory;
import org.hibernate.search.reader.ReaderProvider;
import org.hibernate.search.store.DirectoryProvider;
import org.hibernate.search.store.FSDirectoryProvider;
import org.webdsl.search.AutoCompleter;
import org.webdsl.search.SearchSuggester;
import org.webdsl.search.SearchHelper;
import org.hibernate.SessionFactory;
import webdsl.generated.domain.*;@SuppressWarnings("all")public class IndexManager extends org.webdsl.search.AbstractIndexManager{
static {
indexdir="searchindex/Discount";
org.webdsl.logging.Logger.info("Absolute path of indexdir: "+new File(indexDir()).getAbsolutePath());
}
public static void main(String[] args){
reindexClasses(Arrays.asList(args));
System.exit(0);
}
public static void reindex(){
reindexClasses(new java.util.ArrayList<String>());
}
private static void reindexClasses(java.util.List<String> entities){
log("Starting reindexing of searchable data...");
long time=System.currentTimeMillis();
if(entities==null||entities.isEmpty()||entities.contains("dummy_webdsl_entity")||entities.contains("webdsl.generated.domain.dummy_webdsl_entity")){
reindexEntityClass(webdsl.generated.domain.dummy_webdsl_entity.class);
}
indexSuggestions();
time=System.currentTimeMillis()-time;
log("Reindexing finished in "+time+"ms total.");
}
private static boolean facetRenewalScheduled=false;
public static void renewFacetIndexReaders(){
if(!facetRenewalScheduled){
facetRenewalScheduled=true;
new FacetRenewerThread().start();
}
}
public static void closeFacetIndexReaders(){
dummy_webdsl_entitySearcher.closeBoboReader();
lastFacetReaderRenewal=0l;
}
private static void renewFacetIndexReadersInternal(){
if(getModifiedTimeIndex(dummy_webdsl_entity.class)>lastFacetReaderRenewal){
dummy_webdsl_entitySearcher.tryRenewBoboReader();
}
lastFacetReaderRenewal=System.currentTimeMillis();
}
public static void indexSuggestions(){
indexSuggestions(null);
}
public static void indexSuggestions(java.util.List<String> namespaces){}
public static void clearAutoCompleteIndex(String entity){
}
public static void clearSpellCheckIndex(String entity){
}
public static void clearAutoCompleteIndex(String entity,String[] fields){
Class<?> entityClass=null;
if(entityClass==null)return;for(int c=0;
c<fields.length;
c++){
log("Clearing autocomplete index for entity: "+entity+", field: "+fields[c]);
File path=new File(indexDirAutoComplete(entityClass,fields[c]));
if(clearIndex(path))log("Clearing autocomplete index successful");
else log("Clearing autocomplete index unsuccessful");
}
}
public static void clearSpellCheckIndex(String entity,String[] fields){
Class<?> entityClass=null;
if(entityClass==null)return;for(int c=0;
c<fields.length;
c++){
log("Clearing spellcheck index for entity: "+entity+", field: "+fields[c]);
File path=new File(indexDirSpellCheck(entityClass,fields[c]));
if(clearIndex(path))log("Clearing spellcheck index successful");
else log("Clearing spellcheck index unsuccessful");
}
}
public static String indexName(Class<?> entityClass){
if(webdsl.generated.domain.dummy_webdsl_entity.class.equals(entityClass)){
return "webdsl.generated.domain.dummy_webdsl_entity";
}
return null;
}
private static class FacetRenewerThread extends Thread{
public void run(){
try{
Thread.sleep(3000);
}
catch(Exception ex){
org.webdsl.logging.Logger.error(ex);
}
IndexManager.facetRenewalScheduled=false;
webdsl.generated.search.IndexManager.renewFacetIndexReadersInternal();
}
}
}

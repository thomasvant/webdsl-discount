package utils;
import webdsl.generated.test.*;public class TestWeb extends utils.TestAll{
public  TestWeb(){}
public void runTests(){
boolean exitWithError=false;
beforeQuit();
if(exitWithError){
System.exit(1);
}
}
public static void main(String[] args){
new TestWeb().runInWebAppContainer(true,false);
}
}

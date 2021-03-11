package utils;
public class TestRun extends utils.TestAll{
public  TestRun(){}
public void runTests(){
org.webdsl.logging.Logger.info("Tomcat web server started, your web application is "+"available at http://localhost:8080"+contextpath+". Press ctrl+c to stop the web server.");
java.io.BufferedReader br=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
try{
br.readLine();
org.webdsl.logging.Logger.info("Stopping Tomcat.");
}
catch(java.io.IOException ioe){
org.webdsl.logging.Logger.error(ioe.getMessage());
System.exit(1);
}
}
public static void main(String[] args){
new TestRun().runInWebAppContainer(false,true);
}
}

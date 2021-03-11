This version of tomcat has been modified for use with WebDSL.

Current tomcat version: 7.0.40

Removed: 
 - ./webapps/examples
 - ./webapps/docs


Modified conf/server.xml, added default keystore for SSL:

    <Connector port="8443" protocol="HTTP/1.1" SSLEnabled="true"
           maxThreads="150" scheme="https" secure="true"
           keystoreFile="../../../../Servers/.keystore" keystorePass="g5o2jD93FQ83Ge52"
           clientAuth="false" sslProtocol="TLS" />

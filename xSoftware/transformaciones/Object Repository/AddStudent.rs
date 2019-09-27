<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>AddStudent</name>
   <tag></tag>
   <elementGuidId>7099b6db-2412-45e5-942d-b527642ea12d</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;first_name\&quot;: \&quot;${first_name}\&quot;,\n  \&quot;last_name\&quot;: \&quot;${last_name}\&quot;,\n  \&quot;gender\&quot;: \&quot;${gender}\&quot;,\n  \&quot;code\&quot;: \&quot;${code}\&quot;,\n  \&quot;country\&quot;: \&quot;${country}\&quot;,\n  \&quot;city\&quot;: \&quot;${city}\&quot;,\n  \&quot;university\&quot;: \&quot;${university}\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
 }</httpBodyContent>   
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://miso4202-apitest.herokuapp.com/api/v1/students</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>		
   <variables>
      <defaultValue>'1'</defaultValue>
      <description></description>
      <id>10d1a722-5272-4668-a0d7-412c9cb1201f</id>
      <masked>false</masked>
      <name>first_name</name>
   </variables>		
   <variables>
      <defaultValue>'1'</defaultValue>
      <description></description>
      <id>20d1a722-5272-4668-a0d7-412c9cb1201f</id>
      <masked>false</masked>
      <name>last_name</name>
   </variables>		
   <variables>
      <defaultValue>'1'</defaultValue>
      <description></description>
      <id>30d1a722-5272-4668-a0d7-412c9cb1201f</id>
      <masked>false</masked>
      <name>gender</name>
   </variables>		
   <variables>
      <defaultValue>'1'</defaultValue>
      <description></description>
      <id>40d1a722-5272-4668-a0d7-412c9cb1201f</id>
      <masked>false</masked>
      <name>code</name>
   </variables>		
   <variables>
      <defaultValue>'1'</defaultValue>
      <description></description>
      <id>50d1a722-5272-4668-a0d7-412c9cb1201f</id>
      <masked>false</masked>
      <name>country</name>
   </variables>		
   <variables>
      <defaultValue>'1'</defaultValue>
      <description></description>
      <id>60d1a722-5272-4668-a0d7-412c9cb1201f</id>
      <masked>false</masked>
      <name>city</name>
   </variables>		
   <variables>
      <defaultValue>'1'</defaultValue>
      <description></description>
      <id>70d1a722-5272-4668-a0d7-412c9cb1201f</id>
      <masked>false</masked>
      <name>university</name>
   </variables>   
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>

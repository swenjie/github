package com.sy.cxf.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.2
 * Mon Jul 11 17:09:19 CST 2016
 * Generated source version: 2.2.2
 * 
 */
 
@WebService(targetNamespace = "http://server.hsy.com/", name = "HelloWorld")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloWorld {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sayHi", targetNamespace = "http://server.hsy.com/", className = "com.sy.cxf.client.SayHi")
    @ResponseWrapper(localName = "sayHiResponse", targetNamespace = "http://server.hsy.com/", className = "com.sy.cxf.client.SayHiResponse")
    @WebMethod
    public java.lang.String sayHi(
        @WebParam(name = "text", targetNamespace = "")
        java.lang.String text
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sayHiToUser", targetNamespace = "http://server.hsy.com/", className = "com.sy.cxf.client.SayHiToUser")
    @ResponseWrapper(localName = "sayHiToUserResponse", targetNamespace = "http://server.hsy.com/", className = "com.sy.cxf.client.SayHiToUserResponse")
    @WebMethod
    public java.lang.String sayHiToUser(
        @WebParam(name = "arg0", targetNamespace = "")
        com.sy.cxf.client.User arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "SayHiToUserList", targetNamespace = "http://server.hsy.com/", className = "com.sy.cxf.client.SayHiToUserList")
    @ResponseWrapper(localName = "SayHiToUserListResponse", targetNamespace = "http://server.hsy.com/", className = "com.sy.cxf.client.SayHiToUserListResponse")
    @WebMethod(operationName = "SayHiToUserList")
    public java.util.List<java.lang.String> sayHiToUserList(
        @WebParam(name = "arg0", targetNamespace = "")
        java.util.List<com.sy.cxf.client.User> arg0
    );
}

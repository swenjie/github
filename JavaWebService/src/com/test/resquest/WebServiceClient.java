package com.test.resquest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class WebServiceClient {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket=new Socket("localhost",8080);
		OutputStream os=socket.getOutputStream();
		InputStream is=socket.getInputStream();
		System.out.println(socket.isConnected());
		String httpSend="POST /dataService/services/Job HTTP/1.1/r/n"
				+ "Content-Type:text/xml/r/n"    
                + "Host:localhost:9003/r/n"    
                + "Content-Length:1024/r/n"    
                + "/r/n"    
                + "<SOAP-ENV:Envelope xmlns:SOAP-ENV=/\"http://schemas.xmlsoap.org/soap/envelope//\" " +
                "xmlns:SOAP-ENC=/\"http://schemas.xmlsoap.org/soap/encoding//\" " +
                "xmlns:xsi=/\"http://www.w3.org/2001/XMLSchema-instance/\"" +
                " xmlns:xsd=/\"http://www.w3.org/2001/XMLSchema/\">"  
                + "<SOAP-ENV:Body>"  
				 +    "<m:getItemDetailSingle xmlns:m=/\"http://localhost//\">"  
                 +        "<itemMo>"  
                 +            "<category>工厂类</category>"  
                 +            "<city>北京</city>"  
                 +            "<flag>1</flag>"  
                 +            "<itemId>0</itemId>"  
                 +            "<itemIndex>1</itemIndex>"  
                 +            "<keyword>String</keyword>"  
                 +            "<mobile>2147483647</mobile>"  
                 +            "<password>123456</password>"  
                 +            "<userName>sohu</userName>"  
                 +        "</itemMo>"  
                 +    "</m:getItemDetailSingle>"  
                 + "</SOAP-ENV:Body>"  
                 + "</SOAP-ENV:Envelope>";  
				;
		os.write(httpSend.getBytes());
		os.flush();
		
		InputStreamReader ireader=new InputStreamReader(is);
		BufferedReader breader=new BufferedReader(ireader);
		
		String responseLine="";
		
		while((responseLine=breader.readLine())!=null){
			String str=new String(responseLine.getBytes(),"utf-8");
			System.out.println(str);
		}
		System.out.println("是吗？");
	}

}

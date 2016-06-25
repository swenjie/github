package com.test.resquest;

import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.io.OutputStreamWriter;  
import java.io.UnsupportedEncodingException;  
import java.net.MalformedURLException;  
import java.net.URL;  
import java.net.URLConnection; 
public class HttpPostTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://localhost:8080/";
		new HttpPostTest().testPost(url);
	}

	void testPost(String urlStr){
		try {
			URL url=new URL(urlStr);
			URLConnection con = url.openConnection();
			System.out.println();
			con.setDoOutput(true);
			con.setRequestProperty("Pragma", "no-cache");
			con.setRequestProperty("Cache-Control", "no-cache");
			con.setRequestProperty("Content-Type", "text/xml");
			
			OutputStreamWriter out=new OutputStreamWriter(con.getOutputStream());
			String xmlInfo = getXmlInfo();  
            out.write(new String(xmlInfo));  
            out.flush();  
            out.close();  
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));  
            String line = "";  
            StringBuffer buf = new StringBuffer();  
            for (line = br.readLine(); line != null; line = br.readLine()) {  
            	buf.append(new String(line.getBytes(),"utf-8"));
            }  
            System.out.println(buf.toString());  
		} catch (MalformedURLException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
		
	}
	
	 private String getXmlInfo() {  
	        // 通过wsdl文件可以查看接口xml格式数据，构造调用接口xml数据  
	        String xml = 
	        		"<SOAP-ENV::Envelope xmlns:SAOP-ENV=\"http://schemas.xmlsoap.org/soap/envelope//\" " +
	        		"xmlns:xsi=/\"http://www.w3.org/2001/XMLSchema-instance/\" xmlns:xsd=/\"http://www.w3.org/2001/XMLSchema/\">"
	        		+"<SOAP-ENV:Body>"
	        		+"<m:getItemDetailSingle xmlns:m=/\"http:xxxxxxxxxxxxxxxxxx//\">"  
                    +        "<itemMo>"  
                    +            "<category>工厂类</category>"  
                    +            "<city>北京</city>"  
                    +            "<flag>1</flag>"  
                    +            "<itemId>0</itemId>"  
                    +            "<itemIndex>1</itemIndex>"  
                    +            "<keyword></keyword>"  
                    +            "<mobile>2147483647</mobile>"  
                    +            "<password>123456</password>"  
                    +            "<userName>sohu</userName>"  
                    +        "</itemMo>"  
                    +    "</m:getItemDetailSingle>"  
                    + "</SOAP-ENV:Body>"  
                    + "</SOAP-ENV:Envelope>";    
	        return xml;  
	    }  
	
	
}

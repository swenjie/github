package com.ws.restful.dy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class JavaNetURLRESTFulClient {
	
	//private static final String targetURL = "http://localhost:8080/JerseyJSONExample/rest/jsonServices/send";
	private static final String targetURL = "http://localhost:8080/handle/ws/dy/jsonServices/sendJson";
	public static void main(String[] args) {
		 
		try {
			 
			URL targetUrl = new URL(targetURL);
			HttpURLConnection httpConnection = (HttpURLConnection) targetUrl.openConnection();
			httpConnection.setDoOutput(true);
			httpConnection.setRequestMethod("POST");//method
			httpConnection.setRequestProperty("Content-Type", "application/json");
	 
			String input = "{\"student\":{\"id\":1,\"firstName\":\"Liam\",\"age\":22,\"lastName\":\"Marco\"}}";
	 
			OutputStream outputStream = httpConnection.getOutputStream();
			outputStream.write(input.getBytes());
			outputStream.flush();
	 
			if (httpConnection.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
					+ httpConnection.getResponseCode());
			}
	 
			BufferedReader responseBuffer = new BufferedReader(new InputStreamReader(
					(httpConnection.getInputStream())));
	 
			String output;
			System.out.println("Output from Server:\n");
			while ((output = responseBuffer.readLine()) != null) {
				System.out.println(output);
			}
	 
			httpConnection.disconnect();
	 
		  } catch (MalformedURLException e) {
	 
			e.printStackTrace();
	 
		  } catch (IOException e) {
	 
			e.printStackTrace();
	 
		 }
	 
		}
	 
}

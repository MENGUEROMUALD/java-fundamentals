package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.sendgrid.Content;
import com.sendgrid.Email;
import com.sendgrid.Mail;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;

public class Urlprogramming26 {
	
	public static void main(String[] args) throws IOException {
		
		/*try {
			URL url = new URL("https://lifehacker.com/top-10-ways-to-teach-yourself-to-code-1684250889");
			System.out.printf("URL\n Protocol: %1s \n Authority: %2s \n Host: %3s \n Path: %4s \n Port: %5d \n Query: %6s"
			+ "\n File Name: %7s \n Ref: %8s",
			url.getProtocol(),url.getAuthority(),url.getHost(),url.getPath(),
			url.getDefaultPort(), url.getQuery(),url.getFile(), url.getRef());
			 
		URLConnection connection =url.openConnection();
		if(connection instanceof HttpURLConnection) {// tests if this is an http connection
			HttpURLConnection httpConnection = (HttpURLConnection) connection;
			BufferedReader reader = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
			// read data from url
			
			String data = "", content= "";
			while((data=reader.readLine()) != null)
				content += data;
			System.out.println(content);
			reader.close();
			httpConnection.disconnect();
		}
		}
		catch (MalformedURLException e) {
			e.printStackTrace();
			}	
	}*/
		String t ="icep603@gmail.com";
		String frm="udumandy@gmail.com";
		Email from = new Email(frm);
		String subject = "Hello from Uduma";
		Email to = new Email(t);
		Content content = new Content("text/plain", "Learning email sending in Java is so much fun when we understand the codes");
		Mail mail = new Mail(from, subject, to, content);
		SendGrid sg = new SendGrid("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");
	
		Request request = new Request();
		try {
			request.setMethod(Method.POST);
			request.setEndpoint("mail/send");
			request.setBody(mail.build());
			Response response = sg.api(request);
			System.out.println(response.getStatusCode());
			System.out.println(response.getBody());
			System.out.println(response.getHeaders());
	} catch (IOException ex) {
	throw ex;
	}
	}

}

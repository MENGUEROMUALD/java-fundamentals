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

public class UrlPrograming {
	public static void main(String[] args) throws IOException {
		String t ="icep603@gmail.com"; 
		String frm="ndemeyvan@gmail.com";
		Email from = new Email(frm);
		String subject = "second essaie";
		Email to = new Email(t);
		Content content = new Content("text/plain", "Learning email sending in Java ");
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
		/*URL url = null ;
		try {
			
		 url = new URL("https://www.eneo.com/"); 
		System.out.printf("URL\n Protocol: %1s \n Authority: %2s \n Host: %3s \n Path: %4s \n Port: %5d \n Query: %6s"
		+ "\n File Name: %7s \n Ref: %8s", url.getProtocol(),url.getAuthority(),url.getHost(),url.getPath(),url.getDefaultPort(), url.getQuery(),url.getFile(), url.getRef());

		URLConnection urlcon = null;
		try {
			urlcon = url.openConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(urlcon instanceof HttpURLConnection) {
			HttpURLConnection httpURLConnection=(HttpURLConnection)urlcon;
			BufferedReader reader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
			String data =" ",content=" ";
			while((data = reader.readLine())!=null) 
				content+=data;
			System.out.println(content);
			reader.close();
			httpURLConnection.disconnect();
			
		}
		} catch (MalformedURLException e) {
			e.printStackTrace(); 
		}*/
		
		
		
		
		}
	
	

}

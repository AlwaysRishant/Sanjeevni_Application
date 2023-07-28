/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

/**
 *
 * @author sharm
 */
public class SmsSender implements Sender{
    public boolean send(String number, String message) throws Exception{
        

    // This URL is used for sending messages
    String myURI = "https://api.bulksms.com/v1/messages";
    StringBuilder result = null;
    
    // change these values to match your own account
    String myUsername = "alwaysrishant";
      String myPassword = "Rishant@1234";

    
    number = "91"+number;
    String myData = "{to: \'"+number+"\', body: \""+message+"\"}";
        System.out.println("mydata:"+myData);

    // build the request based on the supplied settings
    URL url = new URL(myURI);
    HttpURLConnection request = (HttpURLConnection) url.openConnection();
    request.setDoOutput(true);

    // supply the credentials
    String authStr = myUsername + ":" + myPassword;
    String authEncoded = Base64.getEncoder().encodeToString(authStr.getBytes());
    request.setRequestProperty("Authorization", "Basic " + authEncoded);

    // we want to use HTTP POST
    request.setRequestMethod("POST");
    request.setRequestProperty( "Content-Type", "application/json");

    // write the data to the request
    OutputStreamWriter out = new OutputStreamWriter(request.getOutputStream());
    out.write(myData);
    out.close();

    // try ... catch to handle errors nicely
    try {
      // make the call to the API
      result = new StringBuilder();
      InputStream response = request.getInputStream();
      BufferedReader in = new BufferedReader(new InputStreamReader(response));
      String replyText;
      while ((replyText = in.readLine()) != null) {
        System.out.println(replyText);
        result.append(replyText);
        
      }
        System.out.println("out of loop");
      in.close();
    } catch (IOException ex) {
        result = new StringBuilder();
      System.out.println("An error occurred:" + ex.getMessage());
      BufferedReader in = new BufferedReader(new InputStreamReader(request.getErrorStream()));
      // print the detail that comes with the error
      String replyText;
      while ((replyText = in.readLine()) != null) {
        System.out.println(replyText);
        result.append(replyText);
      }
      in.close();
    }
    request.disconnect();
        System.out.println("now returning");
    return result.toString().contains("SENT");
    } 
}

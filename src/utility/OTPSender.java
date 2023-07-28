/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.utility;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;

/**
 *
 * @author sharm
 */
public class OTPSender implements Sender {

    @Override
    public boolean send(String number, String data)throws Exception {
        
            Unirest.setTimeouts(0, 0);
            String mobNo=number;
            int otp=Integer.parseInt(data);
            String url = "https://2factor.in/API/V1/89c94d70-aba9-11ed-813b-0200cd936042/SMS/"+mobNo+"/"+otp+"/OTP1";
            System.out.println("OTP is:"+otp);
            GetRequest gr=Unirest.get(url);
            HttpResponse<String>response=gr.asString();
            String result=response.getBody();
            return result.contains("Success");
        }
    }
    
    


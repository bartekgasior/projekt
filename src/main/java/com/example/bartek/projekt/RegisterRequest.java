package com.example.bartek.projekt;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Bartek on 09.11.2016.
 */

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "/Register.php"; //<<<<<<<<<<<<<<
    private Map<String,String> params;

    public RegisterRequest(String name, String surname, String email, int age, String password, Response.Listener<String> listener){
        super(Method.POST,REGISTER_REQUEST_URL,listener, null);
        params = new HashMap<>();
        params.put("Name",name);
        params.put("Surname",surname);
        params.put("EMail",email);
        params.put("Age",age + "");
        params.put("password",password);
    }

    @Override
    public Map<String,String> getParams(){
        return params;
    }
}

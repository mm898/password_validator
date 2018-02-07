package com.example.mukhtaralhejji.password_validator;

/**
 * Created by mukhtaralhejji on 2018-02-07.
 */

public class validator {

    public static boolean validate(String pass){
        if(!pass.toLowerCase().equals("password") && pass.length() >= 8) {
            return true;
        }
        else{
            return false;
        }
    }

}

package com.example.mukhtaralhejji.password_validator;

/**
 * Created by mukhtaralhejji on 2018-02-07.
 */

public class validator {

    public static boolean validate(String pass){
        //password must have special char, number, lower/upper cases
        if(!pass.equals("password") &&
                pass.length() >= 8 &&
                pass.matches(".*[$&+,:;=?@#||].*") &&
                pass.matches(".*[0-9].*") &&
                pass.matches(".*[a-z].*") &&
                pass.matches(".*[A-Z].*")) {

                    return true;
        }
        else{
            return false;
        }
    }

}

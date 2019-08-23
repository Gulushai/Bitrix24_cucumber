package com.bitrix24.utilities;

import com.bitrix24.pages.LoginPage;

public class Common_Impl {

    public void loginAsAUser(String userType){
        String username ="";
        String password ="";
        if(userType.equalsIgnoreCase("marketing")){
            username = ConfigurationReader.get("marketing_username");
            password = ConfigurationReader.get("password");
        }else if(userType.equalsIgnoreCase("hr")){
            username = ConfigurationReader.get("hr_username");
            password = ConfigurationReader.get("password");
        }else if(userType.equalsIgnoreCase("help desk")){
            username = ConfigurationReader.get("helpdesk_username");
            password = ConfigurationReader.get("password");
        }
        System.out.println("username = "+username);
        System.out.println("password = "+password);
        new LoginPage().login(username, password);
    }
}

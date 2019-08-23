package com.bitrix24.step_defs.login;

import com.bitrix24.pages.LoginPage;
import com.bitrix24.utilities.BrowserUtils;
import com.bitrix24.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class LoginStepDef {

    @Given("I login using these credentials {string} {string}")
    public void i_login_using_these_credentials(String user, String pass) {
        LoginPage loginPage = new LoginPage();
        System.out.println("username = " + user);
        System.out.println("password = " + pass);
        new LoginPage().login(user, pass);
    }

//        String username = user.send("username");
//        String password = pass.get("password");
//        new LoginPage().login(username, password);

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String title) {
        System.out.println(title);
        String T = Driver.get().getTitle();
        BrowserUtils.waitFor(3);
        Assert.assertEquals(title, T);

    }


//    @Given("I login as a {string}")
//    public void iLoginAsA(String userType) {
//
//            String username="";
//            String password="";
//            if (userType.equals("marketing")) {
//                username = ConfigurationReader.get("marketing_username");
//                password = ConfigurationReader.get("password");
//            } else if (userType.equals("help desk")) {
//                username = ConfigurationReader.get("helpdesk_username");
//                password = ConfigurationReader.get("password");
//            }
//
//            System.out.println("username = " + username);
//            System.out.println("password = " + password);
//            new LoginPage().login(username, password);
//

}

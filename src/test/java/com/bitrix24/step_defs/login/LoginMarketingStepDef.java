package com.bitrix24.step_defs.login;

import com.bitrix24.utilities.BrowserUtils;
import com.bitrix24.utilities.Common_Impl;
import cucumber.api.java.en.Given;

public class LoginMarketingStepDef {

    @Given("I login as a {string}")
    public void i_login_as_a(String string) {
        Common_Impl common = new Common_Impl();
        common.loginAsAUser(string);
    }
}

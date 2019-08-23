package com.bitrix24.pages;

import com.bitrix24.utilities.BrowserUtils;
import com.bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;

    public void login(String usernameStr, String passwordStr){
        BrowserUtils.highlight(username);
        username.sendKeys(usernameStr);
        BrowserUtils.highlight(password);
        password.sendKeys(passwordStr);
        BrowserUtils.highlight(submit);
        submit.click();

        WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
        wait.until(ExpectedConditions.titleIs(Driver.get().getTitle()));
    }

}

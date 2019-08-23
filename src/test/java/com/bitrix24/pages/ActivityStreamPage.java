package com.bitrix24.pages;

import com.bitrix24.utilities.BrowserUtils;
import com.bitrix24.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage {
    public ActivityStreamPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    public WebElement getModule(String moduleName){
        String moduleXpath = "//span[normalize-space(text())='"+moduleName+"']";
        return Driver.get().findElement(By.xpath(moduleXpath));
    }

    public WebElement getTag(String tag){
        String xpath = "//span[text()='"+tag+"']/..";
        BrowserUtils.waitFor(2);
        return Driver.get().findElement(By.xpath(xpath));
    }

    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement thingsToDo;

    @FindBy(xpath = "//div[@id='bx-html-editor-lifefeed_task_form']")
    public WebElement descriptionField;

    @FindBy(xpath = "(//span[@title='Upload files'])[3]")
    public WebElement uploadFiles;

    @FindBy(xpath = "(//input[@class='diskuf-fileUploader wd-test-file-light-inp '])[5]")
    public WebElement uploadFilesImages;

    @FindBy(xpath = "(//input[@data-bx-id='datepicker-display'])[1]")
    public WebElement deadlinePicker;

    @FindBy(xpath = "(//a[contains(text(),'31')])[2]")
    public WebElement date;

    @FindBy(css = "a.bx-calendar-button-select")
    public WebElement selectButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement send;

}

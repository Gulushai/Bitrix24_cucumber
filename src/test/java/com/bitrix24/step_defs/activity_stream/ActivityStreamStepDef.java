package com.bitrix24.step_defs.activity_stream;

import com.bitrix24.pages.ActivityStreamPage;
import com.bitrix24.utilities.BrowserUtils;
import com.bitrix24.utilities.Common_Impl;
import com.bitrix24.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class ActivityStreamStepDef {
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    Actions action = new Actions(Driver.get());

    @Given("User logs in using {string}")
    public void user_logs_in_using(String marketing) {
        Common_Impl common = new Common_Impl();
        common.loginAsAUser(marketing);
    }

    @When("User navigates to {string} module")
    public void userNavigatesToModule(String module) {
        BrowserUtils.highlight(activityStreamPage.getModule(module));
        activityStreamPage.getModule(module).click();
    }

    @Then("User selects {string} tag")
    public void user_selects_tag(String tag) {
        BrowserUtils.highlight(activityStreamPage.getTag(tag));
        activityStreamPage.getTag(tag).click();
    }

    @Then("User gives the name of the task in the Things To Do section")
    public void user_gives_the_name_of_the_task_in_the_Things_To_Do_section() {
        BrowserUtils.waitFor(2);
        activityStreamPage.thingsToDo.click();
        activityStreamPage.thingsToDo.sendKeys("Assignment Description");
    }

    @Then("User writes description of the task")
    public void user_writes_description_of_the_task() {
        //Driver.get().switchTo().frame(Driver.get().findElement(By.className("bx-editor-iframe")));
        activityStreamPage.descriptionField.click();
        action.sendKeys("User story and AC: As a user I should be able to create a task from activity stream.").perform();
        //Driver.get().switchTo().defaultContent();
    }


    @Then("User uploads a file")
    public void user_uploads_a_file() {
        BrowserUtils.highlight(activityStreamPage.uploadFiles);
        activityStreamPage.uploadFiles.click();
        BrowserUtils.waitFor(2);
        activityStreamPage.uploadFilesImages.sendKeys("C:/Users/Gulushai/Desktop");
        BrowserUtils.waitFor(3);

    }

    @Then("User should be able to set up a deadline")
    public void user_should_be_able_to_set_up_a_deadline() {
        BrowserUtils.highlight(activityStreamPage.deadlinePicker);
        activityStreamPage.deadlinePicker.click();
        BrowserUtils.waitFor(2);
        BrowserUtils.highlight(activityStreamPage.date);
        activityStreamPage.date.click();
        BrowserUtils.waitFor(2);
        BrowserUtils.highlight(activityStreamPage.selectButton);
        activityStreamPage.selectButton.click();

        Assert.assertEquals(activityStreamPage.deadlinePicker.getAttribute("value"), "08/31/2019 07:00 pm");
    }

    @Then("User sends new created task")
    public void user_sends_new_created_task() {
        activityStreamPage.send.click();
        BrowserUtils.waitFor(2);
    }


}

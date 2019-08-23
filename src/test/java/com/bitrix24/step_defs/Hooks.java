package com.bitrix24.step_defs;

import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("Before hooks");
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);



//        String url = ConfigurationReader.get("url");
//        driver=Driver.get();

//        driver.get("https://login.nextbasecrm.com");
//        BrowserUtils.waitFor(3);3

    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("After hooks");
//        // check if the scenario is failed
//        if(scenario.isFailed()){
//            // take the screenshot
//            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
//            // attach the scenario to the report
//            scenario.embed(screenshot, "image/png");
//        }
        Driver.closeDriver();

    }
}

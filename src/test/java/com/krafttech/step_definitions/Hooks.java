package com.krafttech.step_definitions;

import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("\tThis is coming from Before Method");
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        BrowserUtils.waitFor(2);
        //Driver.closeDriver();

    }

}

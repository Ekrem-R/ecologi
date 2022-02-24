package com.stepdefinitions;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
  @Before
  public void setUp() {
       System.out.println("calling driver");
       Driver.getDriver().manage().window().maximize();
       Driver.getDriver().get(ConfigurationReader.getProperty("next_blog_starter"));
   }

   @After
  public void tearDown(Scenario scenario) {
      final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

       if (scenario.isFailed()) {
          scenario.attach(screenshot, "image/png", "ScreenShot ");

      }
       Driver.closeDriver();
   }
}

package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Base {
    public Base(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    public void scrollDown(WebElement link){
        try {
            Thread.sleep(2000);
        }catch(Exception e){

        }
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor)Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",link);

    }
}

package com.stepdefinitions;

import com.pages.Base;
import com.pages.DynamicRoutinePage;
import com.pages.NextBlogPage;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class DynamicRoutineStepDefinition extends Base {
    NextBlogPage nextBlogPage=new NextBlogPage();
    DynamicRoutinePage dynamicRoutinePage=new DynamicRoutinePage();

    @Given("user on the dyamic-routine page")
    public void user_on_the_dyamic_routine_page() {
         scrollDown(nextBlogPage.dynamicRoutingLink);
         nextBlogPage.dynamicRoutingLink.click();


    }
    @Then("assertion the title")
    public void assertion_the_title() {
        String expected="Dynamic Routing and Static Generation | Next.js Blog Example with Markdown";
        String actual= Driver.getDriver().getTitle();
        Assert.assertEquals(expected,actual);

    }
    @Then("check the image is visible")
    public void check_the_image_is_visible() {
        Assert.assertTrue(dynamicRoutinePage.image.isEnabled());
    }

    @Then("assert there is a date,author's name and picture are visible")
    public void assert_there_is_a_date_author_s_name_and_picture_are_visible() {
      Assert.assertTrue(dynamicRoutinePage.authorName.isDisplayed());
      Assert.assertTrue(dynamicRoutinePage.authorPicture.isDisplayed());
      scrollDown(dynamicRoutinePage.date);
      Assert.assertTrue(dynamicRoutinePage.date.isDisplayed());
    }

    @Then("assert {string} text")
    public void assert_text(String string) {
        String expected= "Statically Generated with Next.js.";
        scrollDown(dynamicRoutinePage.staticallyGeneratedText);
        String actual=dynamicRoutinePage.staticallyGeneratedText.getText();
        Assert.assertEquals(expected,actual);
    }

    @Then("check the read documention link is clickable")
    public void check_the_read_documention_link_is_clickable() {
        scrollDown(dynamicRoutinePage.readDocumentation);
        if(dynamicRoutinePage.readDocumentation.isEnabled()){
            dynamicRoutinePage.readDocumentation.click();
        }

    }


}

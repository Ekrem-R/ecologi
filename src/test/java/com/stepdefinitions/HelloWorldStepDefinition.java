package com.stepdefinitions;

import com.pages.Base;
import com.pages.HelloWorldPage;
import com.pages.NextBlogPage;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HelloWorldStepDefinition extends Base {
    NextBlogPage nextBlogPage=new NextBlogPage();
    HelloWorldPage helloWorldPage=new HelloWorldPage();

    @Given("user on the {string} page")
    public void user_on_the_page(String string) {
        scrollDown(nextBlogPage.helloWorldLink);
        nextBlogPage.helloWorldLink.click();

    }
    @Then("assertion the page title")
    public void assertion_the_page_title() {
        String expected="Learn How to Pre-render Pages Using Static Generation with Next.js | Next.js Blog Example with Markdown";
        String actual= Driver.getDriver().getTitle();
        Assert.assertEquals(expected,actual);

    }
    @Then("check the image is visible on the page")
    public void check_the_image_is_visible_on_the_page() {
        Assert.assertTrue(helloWorldPage.image.isDisplayed());

    }
    @Then("assert there is a date,author's name and picture are visible on the page")
    public void assert_there_is_a_date_author_s_name_and_picture_are_visible_on_the_page() {
        Assert.assertTrue(helloWorldPage.authorName.isDisplayed());
        Assert.assertTrue(helloWorldPage.authorPicture.isDisplayed());
        scrollDown(helloWorldPage.date);
        Assert.assertTrue(helloWorldPage.date.isDisplayed());
    }
    @Then("assert {string} text on the page")
    public void assert_text_on_the_page(String string) {
        String expected= "Statically Generated with Next.js.";
        scrollDown(helloWorldPage.staticallyGeneratedText);
        String actual=helloWorldPage.staticallyGeneratedText.getText();
        Assert.assertEquals(expected,actual);

    }
    @Then("check the read documention link is clickable on the page")
    public void check_the_read_documention_link_is_clickable_on_the_page() {
        scrollDown(helloWorldPage.readDocumentation);
        if(helloWorldPage.readDocumentation.isEnabled()){
            helloWorldPage.readDocumentation.click();
        }
    }
}

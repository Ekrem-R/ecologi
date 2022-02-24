package com.stepdefinitions;

import com.pages.Base;
import com.pages.NextBlogPage;
import com.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class NextBlogPageStepDefinition extends Base {
    NextBlogPage nextBlogPage=new NextBlogPage();
    @Then("image1 should be visible and clickable")
    public void image1_should_be_visible_and_clickable() {
        Assert.assertTrue(nextBlogPage.image1.isDisplayed());
        System.out.println("image1 size: "+nextBlogPage.image1.getSize());
        if(nextBlogPage.image1.isDisplayed()){
            nextBlogPage.image1.click();
        }
        Driver.getDriver().navigate().back();

    }
    @Then("image2 should be visible and clickable")
    public void image2_should_be_visible_and_clickable() {
        scrollDown(nextBlogPage.image2);
        Assert.assertTrue(nextBlogPage.image2.isEnabled());
        if(nextBlogPage.image2.isEnabled() && nextBlogPage.image2.isDisplayed()){
            nextBlogPage.image2.click();
        }
        Driver.getDriver().navigate().back();
    }
    @Then("image3 should be visible and clickable")
    public void image3_should_be_visible_and_clickable() {
        scrollDown(nextBlogPage.image3);
        Assert.assertTrue(nextBlogPage.image3.isEnabled());
        if(nextBlogPage.image3.isEnabled() && nextBlogPage.image3.isDisplayed()){
            nextBlogPage.image3.click();
        }
        Driver.getDriver().navigate().back();
    }
    @Then("assert Blog. texts")
    public void assert_blog_texts() {
        String expected= "Blog.";
        String actual=nextBlogPage.blogFontSize.getText();
        System.out.println(actual);
        Assert.assertEquals(expected,actual);
    }
    @Then("assert Dynamic links' text visible and clickable")
    public void assert_dynamic_links_text_visible_and_clickable() {
        scrollDown(nextBlogPage.dynamicRoutingLink);
        String expected="Dynamic Routing and Static Generation";
        String actual=nextBlogPage.dynamicRoutingLink.getText();
        System.out.println(actual);
        Assert.assertEquals(expected,actual);
        if(nextBlogPage.dynamicRoutingLink.isDisplayed() && nextBlogPage.dynamicRoutingLink.isEnabled()){
            nextBlogPage.dynamicRoutingLink.click();
        }
        Driver.getDriver().navigate().back();
    }
    @Then("assert LearnHowToPrerender links' text visible and clickable")
    public void assert_learn_how_to_prerender_links_text_visible_and_clickable() {
        scrollDown(nextBlogPage.helloWorldLink);
        String expected="Learn How to Pre-render Pages Using Static Generation with Next.js";
        String actual=nextBlogPage.helloWorldLink.getText();
        System.out.println(actual);
        Assert.assertEquals(expected,actual);
        if(nextBlogPage.helloWorldLink.isEnabled() && nextBlogPage.helloWorldLink.isDisplayed()){
            nextBlogPage.helloWorldLink.click();
        }
        Driver.getDriver().navigate().back();
    }
    @Then("assert PreviewMode link's text visible and clcikable")
    public void assert_preview_mode_link_s_text_visible_and_clcikable() {
        scrollDown(nextBlogPage.previewModeLink);
        String expected="Preview Mode for Static Generation";
        String actual=nextBlogPage.previewModeLink.getText();
        System.out.println(actual);
        Assert.assertEquals(expected,actual);
        if(nextBlogPage.previewModeLink.isDisplayed() && nextBlogPage.previewModeLink.isEnabled()){
            nextBlogPage.previewModeLink.click();
        }
        Driver.getDriver().navigate().back();
    }

    @Then("github link should be clickable")
    public void github_link_should_be_clickable() {
        Assert.assertTrue(nextBlogPage.gitHubLink.isEnabled());

    }
    @Then("user should be able to navigate to github link on home page")
    public void user_should_be_able_to_navigate_to_github_link_on_home_page() {
        nextBlogPage.gitHubLink.click();
    }















}

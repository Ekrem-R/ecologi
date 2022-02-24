package com.stepdefinitions;

import com.pages.Base;
import com.pages.NextBlogPage;
import com.pages.PreviewPage;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PreviewPageStepDefiniton extends Base {
    NextBlogPage nextBlogPage=new NextBlogPage();
    PreviewPage previewPage=new PreviewPage();

    @Given("user on the {string} page url")
    public void user_on_the_page_url(String string) {
        scrollDown(nextBlogPage.previewModeLink);
        nextBlogPage.previewModeLink.click();
    }
    @Then("assertion the preview page title")
    public void assertion_the_preview_page_title() {
        String expected="Preview Mode for Static Generation | Next.js Blog Example with Markdown";
        String actual= Driver.getDriver().getTitle();
        Assert.assertEquals(expected,actual);
    }
    @Then("check the image is visible on the  preview page")
    public void check_the_image_is_visible_on_the_preview_page() {
        Assert.assertTrue(previewPage.image.isDisplayed());
    }
    @Then("assert there is a date,author's name and picture are visible on the preview page")
    public void assert_there_is_a_date_author_s_name_and_picture_are_visible_on_the_preview_page() {
        Assert.assertTrue(previewPage.authorName.isDisplayed());
        Assert.assertTrue(previewPage.authorPicture.isDisplayed());
        scrollDown(previewPage.date);
        Assert.assertTrue(previewPage.date.isDisplayed());
    }
    @Then("assert {string} text on the preview page")
    public void assert_text_on_the_preview_page(String string) {
        String expected= "Statically Generated with Next.js.";
        scrollDown(previewPage.staticallyGeneratedText);
        String actual=previewPage.staticallyGeneratedText.getText();
        Assert.assertEquals(expected,actual);
    }
    @Then("check the read documentation link is clickable on the preview page")
    public void check_the_read_documentation_link_is_clickable_on_the_preview_page() {
        scrollDown(previewPage.readDocumentation);
        if(previewPage.readDocumentation.isEnabled()){
            previewPage.readDocumentation.click();
        }
    }

}

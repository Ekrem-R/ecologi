package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextBlogPage {
    public NextBlogPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/section[2]/div[1]/div[1]/a[1]/div[1]/img[1]")
    public WebElement image1;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/section[3]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]")
    public WebElement image2;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/section[3]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/img[1]")
    public WebElement image3;

    @FindBy(tagName = "h1")
    public WebElement blogFontSize;

    @FindBy(partialLinkText = "Dynamic Routing and")
    public WebElement dynamicRoutingLink;

    @FindBy(partialLinkText = "Learn How to Pre-ren")
    public WebElement helloWorldLink;

    @FindBy(partialLinkText = "Preview Mode for Sta")
    public WebElement previewModeLink;

    @FindBy(linkText = "available on GitHub")
    public WebElement gitHubLink;
}

package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreviewPage {
    public PreviewPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/main[1]/div[1]/article[1]/div[2]/div[1]/div[1]/img[1]")
    public WebElement image;

    @FindBy(linkText = "Read Documentation")
    public WebElement readDocumentation;

    @FindBy(xpath = "//h3[contains(text(),'Statically Generated with Next.js.')]")
    public WebElement staticallyGeneratedText;

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/main[1]/div[1]/article[1]/div[1]/div[1]/div[1]")
    public WebElement authorName;

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/main[1]/div[1]/article[1]/div[1]/div[1]/img[1]")
    public WebElement authorPicture;

    @FindBy(tagName = "time")
    public WebElement date;
}

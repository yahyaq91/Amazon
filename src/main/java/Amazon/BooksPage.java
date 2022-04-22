package Amazon;

import base.BasePage;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BooksPage extends BasePage {
    private static final String URL = "https://www.amazon.com";
@FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[5]/span")
public WebElement childernBooks;
@FindBy(xpath = "//*[@id='nav-subnav']/a[7]/span")
public WebElement textbooksRentals;
@FindBy(xpath = "//*[@id='nav-subnav']/a[3]/span")
    public WebElement newReleases;
@FindBy(xpath ="//*[@id='nav-subnav']/a[6]/span" )
public WebElement textBooks;
@FindBy(xpath ="//*[@id=\'nav-subnav\']/a[8]/span" )
public WebElement bestBooksOfTheMonths;


    public BooksPage() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }
}
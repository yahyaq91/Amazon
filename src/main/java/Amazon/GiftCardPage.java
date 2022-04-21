package Amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GiftCardPage extends BasePage {

    private static final String URL = "https://www.amazon.com";

    @FindBy(xpath = "//*[@id=\"s-refinements\"]/div[1]/ul/li[1]/span/a/div/label/i" )
    public WebElement eGiftCard;

    @FindBy(xpath = "//body/div[@id='a-page']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]/img[1]")
    public WebElement thankYouCard;

    @FindBy(xpath = "//body/div[@id='a-page']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/a[1]/img[1]")
    public  WebElement weddingCard;

    @FindBy(xpath = "//body/div[@id='a-page']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/a[1]/img[1]")
    public WebElement birthdayCard;

    @FindBy(xpath = "//body/div[@id='a-page']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/a[1]/img[1]")
    public WebElement congratsCard;


    public GiftCardPage() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }
}
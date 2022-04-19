package Amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class KindleBooksPage extends BasePage {

    private static final String URL = "https://www.amazon.com/";

    @FindBy(xpath = "//div[@aria-label='4 Stars & Up']")
    public WebElement fourStarAvg;

    @FindBy(xpath = "//*[@id=\"s-refinements\"]/div[6]/ul/li[1]/span/a/span")
    public WebElement last30Days;

    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    public WebElement kindleBooksSearchBar;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    public WebElement kindleBooksSearchButton;

    @FindBy(xpath = "//*[@id='s-refinements']/div[1]/ul/li/span/a/div/label/i")
    public WebElement kindleUnlimitedEligibleCheckbox;

    public KindleBooksPage() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }
}

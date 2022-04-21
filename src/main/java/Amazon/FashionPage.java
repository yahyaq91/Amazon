package Amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FashionPage extends BasePage {
    private static final String URL = "https://www.amazon.com/";
    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[2]/span[1]")
    public WebElement women;
    @FindBy(xpath = "//*[@id=\"sobe_d_b_6_1\"]/a")
    public WebElement womenClothing;
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/ul/span[10]/li/span/div/a/div[2]/span")
    public WebElement womenPants;


    @FindBy(xpath = "///*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/ul/span[8]/li/span/div/a/div[2]/span")
    public WebElement womenJeans;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[3]/span[1]")
    public WebElement men;
    @FindBy(xpath = "//*[@id=\"sobe_d_b_5_1\"]/a")
    public WebElement menClothing;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[2]//div[2]/ul/span[8]/li/span/div/a/div[2]/span")
    public WebElement menPants;

    @FindBy(xpath = "//*[@id=\"sobe_d_b_5_3\"]/a")
    public WebElement menWatches;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/ul/span[1]/li/span/div/a/div[2]/span")
    public WebElement menWristWatch;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/ul/span[2]/li/span/div/a/div[2]/span")
    public WebElement menWatchBand;
//    @FindBy(xpath = "//*[@id=\"sobe_d_b_6_1\"]/a")
//    public WebElement womenShoes;
//
//    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/ul/span[1]/li/span/div/a/div[2]/span")
//    public WebElement womenSandals;





    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[5]/span[1]")
    public WebElement luggage;
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/ul/span[1]/li/span/div/a/div[2]/span")
    //*[@id="a-page"]/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/ul/span[1]/li/span/div/a/div[2]/span
    public WebElement travelAccessories;
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/ul/span[2]/li/span/div/a/div[2]/span")
    public WebElement backpacks;
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/ul/span[2]/li/span/div/a/div[2]/span")
    public WebElement kidsBackpacks;


    public FashionPage() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }
}

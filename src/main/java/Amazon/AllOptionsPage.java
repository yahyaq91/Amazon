package Amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.WeakHashMap;

public class AllOptionsPage extends BasePage {

    private static final String URL = "https://www.amazon.com/";

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[11]/a")
    public WebElement fireTv;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[6]/li[7]/a")
    public WebElement fireTvSupport;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement supportSearchBar;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[9]/a")
    public WebElement echoAlexa;

    @FindBy(xpath = "//a[@href='/dp/B08KJN3333?ref_=nav_em__ods_ha_echo_ch_0_2_4_2']")
    public WebElement echoShowFive;

    @FindBy(xpath = "//*[@id=\"acrCustomerReviewText\"]")
    public WebElement getRatings;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[20]/a/div")
    public WebElement amazonFresh;

    @FindBy(xpath = "//a[@href='/b?bbn=10329849011&node=371460011&ref_=nav_em__afs_dce_0_2_12_5']")
    public WebElement amazonFreshDairy;

    @FindBy(xpath = "//*[@id=\"a-autoid-0-announce\"]")
    public WebElement selectCheese;


    public AllOptionsPage() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }
}

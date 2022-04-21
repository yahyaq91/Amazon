package Amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.security.cert.X509Certificate;
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

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[15]/a")
    public WebElement appStore;

    @FindBy (xpath = "//a[@href='/gp/browse.html?node=2350149011&ref_=nav_em__adr_app_0_2_10_2']")
    public WebElement allApps;

    @FindBy(xpath = "//*[@id=\"s-refinements\"]/div[9]/ul/li[1]/span/a")
    public WebElement freeApps;

    @FindBy(xpath = "//input[@id='low-price']")
    public WebElement minPriceInput;

    @FindBy(xpath = "//input[@id='high-price']")
    public WebElement maxPriceInput;

    @FindBy(xpath = "//*[@id=\"a-autoid-1\"]/span/input")
    public WebElement goButton;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[8]/a")
    public WebElement amazonMusic;

    @FindBy(xpath = "//a[@href='/music/lp/podcasts?ref_=nav_em__dm_nav_rh_0_2_3_5']")
    public WebElement amazonPodcast;

    @FindBy(xpath = "//*[@id=\"75\"]/span/span")
    public WebElement listenNowButton;

    @FindBy(xpath = "//*[@id=\"navbarMenuItem2\"]")
    public WebElement podcasts;

    @FindBy(xpath = "//input[@id=\"navbarSearchInput\"]")
    public WebElement podcastSearchBar;

    @FindBy(xpath = "//music-button[@id=\"navbarSearchInputButton\"]")
    public WebElement podcastSearchButton;



    public AllOptionsPage() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }
}

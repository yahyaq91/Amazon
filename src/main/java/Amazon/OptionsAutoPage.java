package Amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OptionsAutoPage extends BasePage {

    private static final String URL = "https://www.amazon.com/";


    @FindBy(xpath = "//option[@value='search-alias=automotive']")
    public WebElement automotiveListOption;

    @FindBy(xpath = "//*[@id='nav-search-submit-button']")
    public WebElement searchSubmitButton;

    @FindBy(xpath = "//a[@href='javascript: void(0)']")
    public WebElement allOptionPage;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/ul[1]/li[12]/a/div")
    public WebElement automotiveOptions;

    @FindBy(xpath = "//*[@id='hmenu-content']/ul[25]/li[3]/a")
    public WebElement automotivePartsAccessories;

    @FindBy(xpath = "//*[@id=\"a-autoid-0\"]/span/input")
    public WebElement addNewVehicle;

    @FindBy(xpath = "//*[@id=\"a-autoid-8-announce\"]")
    public WebElement carCare;

    @FindBy(xpath = "//*[@id=\"automotive-pf-partfinder-secondary-view-id-9773gd-garage-vehicle-selection-vehicle-attributes-selection-vehicleType-native-id\"]")
    public WebElement exteriorCareCarWashEquipment;

    @FindBy(xpath = "//*[@id='a-page']/div[2]/div/div/div[7]/div/div/div/div/div[9]/div[6]/div[1]/a/div[2]/div")
    public WebElement hyundaiVirtualShowroom;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[3]/span")
    public WebElement dealsAndRebates;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[9]/span[1]")
    public WebElement motorcycleAndPowersports;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div[2]/div[2]/div[2]/div/div[1]/ul[12]/li[2]/a")
    public WebElement motorcycleHelmets;






    public OptionsAutoPage() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);



    }
}



package Amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Locale;

public class LaptopsPage extends BasePage {

    private static final String URL = "https://www.amazon.com";

    public LaptopsPage() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }

    //Finding the Result Header
    @FindBy(xpath = "//span[text()='Find your laptop']")
    public WebElement laptopResult;

    //HP Brand Name
    @FindBy(xpath = "//li[@id='p_89/HP']")
    public WebElement hpBrandName;

    //Price Range
    @FindBy(xpath = "//li[@id='p_36/price-range']//input[@id='low-price']")     ////li[@id='p_36/1253507011']//span[text()='$200 & Above']
    public WebElement priceRange;

    //Sort By
    @FindBy(xpath = "//span[text()='Price: High to Low']")
    public WebElement sortBy;

    //First Result Title
    @FindBy(xpath = "//span[text()='15-dy1039nr']")
    public WebElement firstResultTitle;

    //***************************************************************************************


    //Result Header
    public String getLaptopHeaderText() {
        String laptopHeader = laptopResult.getText().toLowerCase();
        return laptopHeader;
    }

    //Brand confirmation
    public String getBrandText() {
        String brandName = hpBrandName.getText().toLowerCase();
        return brandName;
    }

    //Price range confirmation
    public String getPriceRange() {
        String princeRange = priceRange.getAttribute("value");
        return princeRange;
    }

    //Sort Result by 'Price: High to Low'
    public String getSortResult() {
        String sortResultBy = sortBy.getText().toLowerCase();
        return sortResultBy;
    }

    //getting first result test
    public String getFirstResultTitle() {
        String firstTitle = firstResultTitle.getText().trim();
        return firstTitle;
    }

}

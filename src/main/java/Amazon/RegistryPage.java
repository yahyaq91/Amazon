package Amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistryPage extends BasePage {

    private static final String URL = "https://www.amazon.com/";

    @FindBy(xpath = "//select[@name='searchUrl']")
    public WebElement dropdown;

    @FindBy(xpath = "//option[@value='/wedding/search?nameOrEmail=']")
    public WebElement dropdownWeddingRegistry;

    @FindBy(xpath = "//option[@value='/baby-reg/search-results?nameOrEmail=']")
    public WebElement dropdownBabyRegistry;

    @FindBy(xpath = "//option[@value='/registries/birthday/search?name=']")
    public WebElement dropdownBirthdayGiftList;

    @FindBy(xpath = "//option[@value='/registries/custom/search?name=']")
    public WebElement dropdownCustomGiftList;

    @FindBy(xpath = "//option[@value='/registries/holiday/search?name=']")
    public WebElement dropdownHolidayGiftList;
    // endregion

    @FindBy(xpath =("//button[@class='gr-btn gr-btn--rounded gr-text gr-find-stripe__cta gr-find-stripe__submit']"))
    public WebElement searchButton;

    @FindBy(name = "name")
    public WebElement searchBar;

    @FindBy(xpath = "//*[@id=\"wr_search_result_record_0-owner\"]/div/a")
    public WebElement weddingRegistryFirstResult;

    @FindBy(xpath = "//*[@id=\"search-results-box\"]//div[3]//tbody/tr[2]")
    public WebElement babyRegistryFirstResult;

    @FindBy(xpath = "//*[@id=\"search-result-container\"]/li[2]/div[1]/a")
    public WebElement birthdayGiftListFirstResult;

    @FindBy(xpath = "//*[@id=\"search-result-container\"]/li[2]/div[1]/a")
    public WebElement customGiftListFirstResult;

    @FindBy(xpath = "//*[@id=\"search-result-container\"]/li[2]/div[1]/a")
    public WebElement holidayRegistryFirstResult;


    public RegistryPage() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }

    public void selectDropdownOption(int number) {
        selectFromDropdownByIndex(dropdown, number);
    }

}

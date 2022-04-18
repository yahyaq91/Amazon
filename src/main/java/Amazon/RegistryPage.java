package Amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistryPage extends BasePage {

    private static final String URL = "https://www.amazon.com/";

    @FindBy(xpath= "//select[@name='searchUrl']")
    public WebElement dropdown;

    @FindBy(id = "dropdown1_0")
    public WebElement dropdownWeddingRegistry;

    @FindBy(id = "dropdown1_1")
    public WebElement dropdownBabyRegistry;

    @FindBy(id = "dropdown1_2")
    public WebElement dropdownBirthdayGiftList;

    @FindBy(id = "dropdown1_3")
    public WebElement dropdownCustomGiftList;

    @FindBy(id = "dropdown1_4")
    public WebElement dropdownHolidayGiftList;


    public RegistryPage() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }

    public void selectDropdownOption(String visibleText) {
        selectFromDropdownByValue(dropdown, visibleText);
    }

}

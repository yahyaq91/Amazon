package Amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class AmazonBasicsPage extends BasePage {
    private static final String URL = "https://www.amazon.com/";
    @FindBy(className = "style__navigation__FMWJE Header__navigationWithFollowButton__3F3fa Header__hasLogo__3osQs style__hasLogo__3Lfx0 style__hasFollowButton__enDxN")
    public WebElement searchBar;

    @FindBy(xpath = "//*[@id=\"k9rs2mhe3v\"]/div/div/div/a")
    public WebElement newArrivals;

    @FindBy(xpath = "//*[@id=\"uaxidqaeev\"]/div/div/div/a")
    public WebElement officeSupplies;

    @FindBy(xpath = "//*[@id=\"vpwtwtp1lu\"]//a")
    public WebElement bedding;

    @FindBy(xpath = "//*[@id=\"cxrj9a6ao3\"]/div/div/div/a")
    public WebElement petSupplies;

    public AmazonBasicsPage() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }

//    public void selectDifferentOption(String visibleText) {
//        selectFromDropdownByValue(dropdown, visibleText);
//    }

}

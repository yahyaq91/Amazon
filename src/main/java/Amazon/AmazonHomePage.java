package Amazon;

import base.BasePage;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AmazonHomePage extends BasePage {

    private static final String URL ="https://www.amazon.com";

    @FindBy(xpath="//*[@id=\"nav-subnav\"]/a[6]/span[1]")
    public WebElement furniture;

    @FindBy(xpath="//*[@id=\"nav-subnav\"]/a[8]/span[1]")
    public WebElement bedbath;

    @FindBy(xpath ="//*[@id=\"nav-subnav\"]/a[7]/span[1]")
    public WebElement kitchenDining;

    @FindBy(xpath= "//*[@id=\"nav-subnav\"]/a[2]/span[1]")
    public WebElement shopByRoom;

    @FindBy(xpath="//*[@id=\"nav-subnav\"]/a[9]/span[1]")
    public WebElement gardenOutdoor;

    public AmazonHomePage() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }

}

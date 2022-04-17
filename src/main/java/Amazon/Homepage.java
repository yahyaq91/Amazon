package Amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

    @FindBy(xpath = "//a[@href='/gp/browse.html?node=16115931011&ref_=nav_cs_registry']")
    public WebElement registryPage;

    @FindBy(xpath = "//a[@href='/stores/node/20648519011?channel=discovbar?field-lbr_brands_browse-bin=" +
            "AmazonBasics&ref_=nav_cs_amazonbasics']")
    public WebElement amazonBasicsPage;

    @FindBy(xpath = "//a[@href='/drag_and_drop']")
    public WebElement dragDropButton;

    @FindBy(xpath = "//a[@href='/basic_auth']")
    public WebElement basicAuthButton;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }
    public RegistryPage navigateToRegistryPage() {
        clickOnElement(registryPage);

        return new RegistryPage();
    }
    public AmazonBasicsPage navigateToAmazonBasicsPage() {
        clickOnElement(amazonBasicsPage);

        return new AmazonBasicsPage();
    }

//    public DropdownPage navigateToDropdownPage() {
//        clickOnElement(dropdownButton);
//
//        return new DropdownPage();
//    }
//
//    public DragDropPage navigateToDragDropPage() {
//        clickOnElement(dragDropButton);
//
//        return new DragDropPage();
//    }
//
//    public BasicAuthPage navigateToBasicAuthPage() {
//        clickOnElement(basicAuthButton);
//
//        return new BasicAuthPage();
//    }

}

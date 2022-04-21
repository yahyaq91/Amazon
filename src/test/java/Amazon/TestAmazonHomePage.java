package Amazon;

import base.TestBasePage;
import org.testng.annotations.Test;

public class TestAmazonHomePage extends TestBasePage {

    @Test
    public void testNavigateToFurnitureSearchOption() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        amazonHomePage.furniture.click();
    }

    @Test
    public void testNavigateTobedbathSearchOption() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        amazonHomePage.bedbath.click();
    }


    @Test
    public void testNavigateTokitchenDiningSearchOption() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        amazonHomePage.kitchenDining.click();

    }

    @Test
    public void testNavigateToshopByRoomSearchOption() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        amazonHomePage.shopByRoom.click();

    }

    @Test
    public void testNavigateTogardenOutdoorSearchOption() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        amazonHomePage.gardenOutdoor.click();

    }

    /* public void testWeddingRegistryDropdownOption() {
        Homepage homepage = new Homepage();
        RegistryPage registryPage = homepage.navigateToRegistryPage();
        selectFromDropdownByIndex(registryPage.dropdown, 1);
        registryPage.searchBar.sendKeys("Sam");
        registryPage.searchButton.click();
        registryPage.weddingRegistryFirstResult.click();
    }*/
}

package Amazon;

import base.TestBasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAmazonHomePage extends TestBasePage {

    @Test
    public void testNavigateToFurnitureSearchOption() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        amazonHomePage.furniture.click();

        String expectedText = "Furniture | Amazon.com";
        String text = driver.getTitle();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);

    }

    @Test
    public void testNavigateTobedbathSearchOption() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        amazonHomePage.bedbath.click();

        String expectedText = "Bedding & Bath | Amazon.com";
        String text = driver.getTitle();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);
    }


    @Test
    public void testNavigateTokitchenDiningSearchOption() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        amazonHomePage.kitchenDining.click();

        String expectedText = "Amazon.com: Kitchen & Dining: Home & Kitchen: Dining & Entertaining, Kitchen & Table Linens & More";
        String text = driver.getTitle();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);
    }

    @Test
    public void testNavigateToshopByRoomSearchOption() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        amazonHomePage.shopByRoom.click();

        String expectedText = "Shop by Room | Amazon.com";
        String text = driver.getTitle();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);

    }

    @Test
    public void testNavigateTogardenOutdoorSearchOption() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        amazonHomePage.gardenOutdoor.click();

        String expectedText = "Amazon.com: Patio, Lawn & Garden";
        String text = driver.getTitle();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);

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

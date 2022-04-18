package Amazon;

import base.TestBasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRegistryPage extends TestBasePage {
    @Test
    public void testWeddingRegistryDropdownOption() {
        Homepage homepage = new Homepage();
        RegistryPage registryPage = homepage.navigateToRegistryPage();
        selectFromDropdownByIndex(registryPage.dropdown, 1);
        registryPage.searchBar.sendKeys("Sam");
        registryPage.searchButton.click();
        registryPage.weddingRegistryFirstResult.click();

        String expectedText = "Sam Sam\n"
                + "& Sam Sam\n"
                + "Dec 31, 2040";
        String text = driver.findElement(By.xpath("//div[@class='wedding-details-stripe__greeting-header']")).getText();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);
//        String greetingHeader = driver.getTitle();
//        String expectedHeader = "Amazon Wedding";
//        Assert.assertEquals(greetingHeader, expectedHeader);
    }
    @Test
    public void testBabyRegistryDropdownOption() {
        Homepage homepage = new Homepage();
        RegistryPage registryPage = homepage.navigateToRegistryPage();
        selectFromDropdownByIndex(registryPage.dropdown, 2);
        registryPage.searchBar.sendKeys("Bob");
        registryPage.searchButton.click();
        registryPage.babyRegistryFirstResult.click();

        String expectedText = "Baby Registry";
        String text = driver.findElement(By.xpath("//div[@class='br-header-title']")).getText();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);

//        String greetingHeader = driver.getTitle();
//        String expectedHeader = "Amazon: Baby Registry";
//        Assert.assertEquals(greetingHeader, expectedHeader);

    }
    @Test
    public void testBirthdayGiftListDropdownOption() {
        Homepage homepage = new Homepage();
        RegistryPage registryPage = homepage.navigateToRegistryPage();
        selectFromDropdownByIndex(registryPage.dropdown, 3);
        registryPage.searchBar.sendKeys("Jack");
        registryPage.searchButton.click();
        registryPage.birthdayGiftListFirstResult.click();

        String greetingHeader = driver.getTitle();
        String expectedHeader = "Amazon Birthday Gift List";
        Assert.assertEquals(greetingHeader, expectedHeader);
    }
    @Test
    public void testCustomGiftListDropdownOption() {
        Homepage homepage = new Homepage();
        RegistryPage registryPage = homepage.navigateToRegistryPage();
        selectFromDropdownByIndex(registryPage.dropdown, 4);
        registryPage.searchBar.sendKeys("John");
        registryPage.searchButton.click();
        registryPage.customGiftListFirstResult.click();

//        String expectedText = "Registrant name";
//        String text = driver.findElement(By.xpath("//div[@class='gr-search-registry-name-header " +
//                "gr-search-registry-detect-mode']")).getText();
//        System.out.println(text);
//        Assert.assertEquals(expectedText, text);

        String greetingHeader = driver.getTitle();
        String expectedHeader = "Amazon Custom Gift List";
        Assert.assertEquals(greetingHeader, expectedHeader);
    }
    @Test
    public void testHolidayGiftListDropdownOption() {
        Homepage homepage = new Homepage();
        RegistryPage registryPage = homepage.navigateToRegistryPage();
        selectFromDropdownByIndex(registryPage.dropdown, 5);
        registryPage.searchBar.sendKeys("Peter");
        registryPage.searchButton.click();
        registryPage.holidayRegistryFirstResult.click();

//        String expectedText = "Location";
//        String text = driver.findElement(By.xpath("//div[@class='gr-search-registry-event-location-header " +
//                "gr-search-registry-detect-mode']")).getText();
//        System.out.println(text);
//        Assert.assertEquals(expectedText, text);

        String greetingHeader = driver.getTitle();
        String expectedHeader = "Amazon Holiday Gift List";
        Assert.assertEquals(greetingHeader, expectedHeader);
    }

}

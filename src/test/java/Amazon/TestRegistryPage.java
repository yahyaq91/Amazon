package Amazon;

import base.TestBasePage;
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
    }
    @Test
    public void testBabyRegistryDropdownOption() {
        Homepage homepage = new Homepage();
        RegistryPage registryPage = homepage.navigateToRegistryPage();
        selectFromDropdownByIndex(registryPage.dropdown, 2);
        registryPage.searchBar.sendKeys("Bob");
        registryPage.searchButton.click();
        registryPage.babyRegistryFirstResult.click();
    }
    @Test
    public void testBirthdayGiftListDropdownOption() {
        Homepage homepage = new Homepage();
        RegistryPage registryPage = homepage.navigateToRegistryPage();
        selectFromDropdownByIndex(registryPage.dropdown, 3);
        registryPage.searchBar.sendKeys("Jack");
        registryPage.searchButton.click();
        registryPage.birthdayGiftListFirstResult.click();
    }
    @Test
    public void testCustomGiftListDropdownOption() {
        Homepage homepage = new Homepage();
        RegistryPage registryPage = homepage.navigateToRegistryPage();
        selectFromDropdownByIndex(registryPage.dropdown, 4);
        registryPage.searchBar.sendKeys("John");
        registryPage.searchButton.click();
        registryPage.customGiftListFirstResult.click();
    }
    @Test
    public void testHolidayGiftListDropdownOption() {
        Homepage homepage = new Homepage();
        RegistryPage registryPage = homepage.navigateToRegistryPage();
        selectFromDropdownByIndex(registryPage.dropdown, 5);
        registryPage.searchBar.sendKeys("Peter");
        registryPage.searchButton.click();
        registryPage.holidayRegistryFirstResult.click();
    }

}

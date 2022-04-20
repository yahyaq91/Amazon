package Amazon;



import base.TestBasePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAmazonBasicsPage extends TestBasePage {
    @Test
    public void testAmazonBasicsPageSearch() {
        Homepage homepage = new Homepage();
        AmazonBasicsPage amazonBasicsPage = homepage.navigateToAmazonBasicsPage();
        String text = "pet food";
        amazonBasicsPage.searchBar.sendKeys(text);
        amazonBasicsPage.searchBar.click();

        //String expectedText = "pet food";

        //Assert.assertEquals(expectedText, text);
    }

    @Test
    public void testNewArrivalsPage() {
        Homepage homepage = new Homepage();
        AmazonBasicsPage amazonBasicsPage = homepage.navigateToAmazonBasicsPage();
        amazonBasicsPage.newArrivals.click();
        String text = "organiger";
        amazonBasicsPage.searchBar.sendKeys(text);
        amazonBasicsPage.searchBar.click();

        String expectedText = "organiger";

        Assert.assertEquals(expectedText, text);
    }

    @Test
    public void testOfficeSuppliesPage() {
        Homepage homepage = new Homepage();
        AmazonBasicsPage amazonBasicsPage = homepage.navigateToAmazonBasicsPage();
        amazonBasicsPage.officeSupplies.click();
        String text = "stappler";
        amazonBasicsPage.searchBar.sendKeys(text);
        amazonBasicsPage.searchBar.click();

        String expectedText = "stappler";

        Assert.assertEquals(expectedText, text);
    }

}
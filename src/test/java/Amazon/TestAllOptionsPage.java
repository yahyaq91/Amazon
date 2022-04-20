package Amazon;

import base.TestBasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAllOptionsPage extends TestBasePage {
    @Test
    public void testFireTvSupport() {
        Homepage homepage = new Homepage();
        AllOptionsPage allOptionsPage = homepage.selectAllOption();
        allOptionsPage.fireTv.click();
        allOptionsPage.fireTvSupport.click();
        allOptionsPage.supportSearchBar.sendKeys("Streaming");
        allOptionsPage.supportSearchBar.submit();

        String expectedText = "Streaming";
        String text = driver.findElement(By.xpath("//*[@id=\"search-help\"]/div/p/b")).getText();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);
    }
    @Test
    public void testNavigateToCustomerReviewsForEchoShow5(){
        Homepage homepage = new Homepage();
        AllOptionsPage allOptionsPage = homepage.selectAllOption();
        allOptionsPage.echoAlexa.click();
        allOptionsPage.echoShowFive.click();
        allOptionsPage.getRatings.click();

        String expectedText = "Customer reviews";
        String text = driver.findElement(By.xpath("//*[@id=\"reviewsMedley\"]/div/div[1]/div[1]/h2")).getText();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);
    }
    @Test
    public void testNavigateToCheeseInAmazonFresh(){
        Homepage homepage = new Homepage();
        AllOptionsPage allOptionsPage = homepage.selectAllOption();
        allOptionsPage.amazonFresh.click();
        allOptionsPage.amazonFreshDairy.click();
        allOptionsPage.selectCheese.click();

        String expectedText = "Cheese";
        String text = driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[4]/div/h1")).getText();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);
    }
}
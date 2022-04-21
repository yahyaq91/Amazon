package Amazon;

import base.TestBasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGiftCardPage extends TestBasePage {
    @Test
    public void testNavigationToEGiftCard(){
        Homepage homepage = new Homepage();
        GiftCardPage giftCardPage = homepage.navigateToGiftCardPage();
        giftCardPage.eGiftCard.click();

        String expectedText = "RESULTS";
        String text = driver.findElement(By.xpath("//div[@tabindex='0']")).getText();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);

    }
    @Test
    public void testNavigationToThankYouCard(){
        Homepage homepage = new Homepage();
        GiftCardPage giftCardPage = homepage.navigateToGiftCardPage();
        giftCardPage.thankYouCard.click();

        String expectedText = "Amazon.com: Thank You and Appreciation Gift Cards: Gift Cards";
        String text = driver.getTitle();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);

    }
    @Test
    public void testNavigationToWeddingCard(){
        Homepage homepage = new Homepage();
        GiftCardPage giftCardPage = homepage.navigateToGiftCardPage();
        giftCardPage.weddingCard.click();

        String expectedText = "Amazon.com: Wedding & Engagement: Gift Cards";
        String text = driver.getTitle();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);
    }
    @Test
    public void testNavigationToBirthdayCard(){
        Homepage homepage = new Homepage();
        GiftCardPage giftCardPage = homepage.navigateToGiftCardPage();
        giftCardPage.birthdayCard.click();

        String expectedText = "Amazon.com Birthday Gift Cards";
        String text = driver.getTitle();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);
    }
    @Test
    public void testNavigationToCongratsCard(){
        Homepage homepage = new Homepage();
        GiftCardPage giftCardPage = homepage.navigateToGiftCardPage();
        giftCardPage.congratsCard.click();

        String expectedText = "Amazon.com: Congratulations - Occasions: Gift Cards";
        String text = driver.getTitle();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);
    }


}

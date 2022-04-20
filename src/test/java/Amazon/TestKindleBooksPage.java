package Amazon;

import base.TestBasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestKindleBooksPage extends TestBasePage {
    @Test
    public void testAvgCustomerReviews(){
        Homepage homepage = new Homepage();
        KindleBooksPage kindleBooksPage = homepage.navigateToKindleBooksPage();
        kindleBooksPage.fourStarAvg.click();

        String expectedText = "RESULTS";
        String text = driver.findElement(By.xpath("//div[@tabindex='0']")).getText();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);
    }
    @Test
    public void testNewReleaseLast30Days(){
        Homepage homepage = new Homepage();
        KindleBooksPage kindleBooksPage = homepage.navigateToKindleBooksPage();
        kindleBooksPage.last30Days.click();

        String expectedText = "RESULTS";
        String text = driver.findElement(By.xpath("//div[@tabindex='0']")).getText();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);
    }
    @Test
    public void testKindleBooksSearchBar(){
        Homepage homepage = new Homepage();
        KindleBooksPage kindleBooksPage = homepage.navigateToKindleBooksPage();
        kindleBooksPage.kindleBooksSearchBar.sendKeys("Game of Thrones");
        kindleBooksPage.kindleBooksSearchButton.click();

        String expectedText = "\"Game of Thrones\"";
        String text = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);

    }
    @Test
    public void testKindleUnlimitedEligibleOption(){
        Homepage homepage = new Homepage();
        KindleBooksPage kindleBooksPage = homepage.navigateToKindleBooksPage();
        kindleBooksPage.kindleUnlimitedEligibleCheckbox.click();

        String expectedText = "RESULTS";
        String text = driver.findElement(By.xpath("//div[@tabindex='0']")).getText();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);
    }

}
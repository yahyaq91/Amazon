package Amazon;

import base.TestBasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TestFashionPage extends TestBasePage {
    @Test
    public void testWomenPants(){
    Homepage homepage = new Homepage();
    FashionPage fashionPage = homepage.navigateToFashionPage();
    fashionPage.women.click();
    fashionPage.womenClothing.click();
    fashionPage.womenPants.click();
    String expectedText = "\"Women's Pants\"";
    String text = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
    System.out.println(text);
    Assert.assertEquals(expectedText, text);

    }
    @Test
    public void testMenPants() {
        Homepage homepage = new Homepage();
        FashionPage fashionPage = homepage.navigateToFashionPage();
        fashionPage.men.click();
        fashionPage.menClothing.click();
        fashionPage.menPants.click();


        String expectedText = "\"Men's Pants\"";
        String text = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);
    }
    @Test
    public void testMenWristWatch() {
        Homepage homepage = new Homepage();
        FashionPage fashionPage = homepage.navigateToFashionPage();
        fashionPage.men.click();
        fashionPage.menWatches.click();
        fashionPage.menWristWatch.click();


        String expectedText = "\"Men's Wrist Watches\"";
        String text = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);
    }

    @Test
    public void testLuggageSection() {
        Homepage homepage = new Homepage();
        FashionPage fashionPage = homepage.navigateToFashionPage();
        fashionPage.luggage.click();
        fashionPage.travelAccessories.click();


        String expectedText = "\"Travel Accessories\"";
        String text = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);
    }
    @Test
    public void testBackpackSection() {
        Homepage homepage = new Homepage();
        FashionPage fashionPage = homepage.navigateToFashionPage();
        fashionPage.luggage.click();
        fashionPage.backpacks.click();
        fashionPage.kidsBackpacks.click();

        String expectedText = "\"Kids' Backpacks\"";
        String text = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);
    }

}

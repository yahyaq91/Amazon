package Amazon;

import base.TestBasePage;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBooksPage extends TestBasePage {
    @Test
    public void testNavigateToChildrenBooks(){
        Homepage homepage=new Homepage();
        BooksPage booksPage=homepage.navigateToBooksPage();
        booksPage.childernBooks.click();

        String expectedText = "Amazon.com: ";
                String text = driver.getTitle();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);
    }


    @Test
    public void testNavigateToTextBooksRentals(){
    Homepage homepage=new Homepage();
    BooksPage bookspage=homepage.navigateToBooksPage();
    bookspage.textbooksRentals.click();

    }
    @Test
    public void testNavigateToNewReleases(){
        Homepage homepage=new Homepage();
        BooksPage booksPage=homepage.navigateToBooksPage();
        booksPage.newReleases.click();
    }
    @Test
    public void testNavigateToTextBooks(){
        Homepage homepage=new Homepage();
        BooksPage booksPage=homepage.navigateToBooksPage();
        booksPage.textBooks.click();
    }
    @Test
    public void testNavigateToBestBooksOfTheMonths(){
        Homepage homepage=new Homepage();
        BooksPage booksPage=homepage.navigateToBooksPage();
        booksPage.bestBooksOfTheMonths.click();
    }
}

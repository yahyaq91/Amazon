package Amazon;

import base.TestBasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLaptopPage extends TestBasePage {

    String searchTerm = "Laptops";

    @Test
    public void testLaptopHeaderText() {

        String expectedText = "find your laptop";
        Homepage homepage = new Homepage();
        LaptopsPage laptopsPage = homepage.doSearch(searchTerm);

        Assert.assertEquals(laptopsPage.getLaptopHeaderText(), expectedText);
    }

    @Test
    public void testClickOnHpBrand() {
        String expectedText = "hp";
        testLaptopHeaderText();

        Homepage homepage = new Homepage();
        LaptopsPage laptopsPage = homepage.clickOnHpBrand();

        Assert.assertEquals(laptopsPage.getBrandText(), expectedText);
    }

    @Test
    public void testClickOnPrinceRange() {
        String expectedText = "200";     //"$200 & above";
        testClickOnHpBrand();

        Homepage homepage = new Homepage();
        LaptopsPage laptopsPage = homepage.clickOnPriceRange();

        Assert.assertEquals(laptopsPage.getPriceRange(), expectedText);
    }

    @Test
    public void testSortResultBy() {
        String expectedText = "price: high to low";
        testClickOnPrinceRange();

        Homepage homepage = new Homepage();
        LaptopsPage laptopsPage = homepage.sortResultBy();

        Assert.assertEquals(laptopsPage.getSortResult(), expectedText);
    }

    @Test
    public void testSelectFirstOption() {
        String expectedModelText = "15-dy1039nr";
        testSortResultBy();

        Homepage homepage = new Homepage();
        LaptopsPage laptopsPage = homepage.selectFirstOption();

        Assert.assertEquals(laptopsPage.getFirstResultTitle(), expectedModelText);

    }


}

package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultsPage;

public class CartTest extends BaseTest {

    @Test
    public void addProductToCart(){
        HomePage home=new HomePage(driver);
        SearchResultsPage results=new SearchResultsPage(driver);
        ProductPage product=new ProductPage(driver);

        home.open();
        home.searchFor("Miš");

        Assert.assertTrue(results.hasResults(), "Expected search results.");
        results.openFirstProduct();

        product.addToCart();

        Assert.assertTrue(product.badgeIsVisible(), "Expected cart badge to be visible after clicking Add.");
    }

}

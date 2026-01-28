package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultsPage;

public class SearchTest extends BaseTest {

    @Test
    public void openHomePage() {
        HomePage home = new HomePage(driver);
        home.open();
        Assert.assertTrue(driver.getCurrentUrl().contains("links.hr"), "URL does not contain links.hr");
    }

    @Test
    public void searchReturnsResults(){
        HomePage home=new HomePage(driver);
        SearchResultsPage results=new SearchResultsPage(driver);

        home.open();
        home.searchFor("Miš");

        Assert.assertTrue(results.hasResults(), "Expected search results, but none were found.");
        Assert.assertFalse(results.showsNoResultsMessage(), "No-results message should NOT be displayed.");
    }

    @Test
    public void searchNoResults(){
        HomePage home=new HomePage(driver);
        SearchResultsPage results= new SearchResultsPage(driver);

        home.open();
        home.searchFor("asdkjasdkljasdklj12345");

        Assert.assertTrue(results.showsNoResultsMessage(), "Expected NO results, but some were found.");
    }

    @Test
    public void openFirstProductFromResults(){
        HomePage home= new HomePage(driver);
        SearchResultsPage results=new SearchResultsPage(driver);

        home.open();
        home.searchFor("Miš");

        Assert.assertTrue(results.hasResults(), "Expected results for 'Miš'.");

        results.openFirstProduct();
        Assert.assertTrue(driver.getCurrentUrl().contains("/hr/"), "Did not navigate to product page.");
    }


}

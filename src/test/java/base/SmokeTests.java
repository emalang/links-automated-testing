package base;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTests extends BaseTest {

    @Test
    public void openLinksHomePage(){
        driver.get("https://www.links.hr/hr/");
        Assert.assertTrue(
                driver.getTitle()!=null && !driver.getTitle().isEmpty(),
                "Page title is empty"
        );
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Waits;

public class SearchResultsPage {
    private final WebDriver driver;
    private final By noResultsText = By.xpath(
            "//*[contains(normalize-space(.), 'Nisu pronađeni proizvodi') " +
                    "or contains(normalize-space(.), 'zadovoljavaju Vaše kriterije')]"
    );


    private final By productLinks= By.cssSelector("a.card-link");

    public SearchResultsPage(WebDriver driver){
        this.driver=driver;
    }

    public boolean hasResults(){
        By cookieAcceptAllBtn = By.xpath("//button[normalize-space()='Prihvaćam sve']");
        utils.Waits.clickIfClickable(driver, cookieAcceptAllBtn, 2);

        try {
            utils.Waits.wait(driver).until(d ->
                    !d.findElements(productLinks).isEmpty() || !d.findElements(noResultsText).isEmpty()
            );
        } catch (Exception ignored) {}

        return !driver.findElements(productLinks).isEmpty();
    }

    public boolean showsNoResultsMessage() {
        return !driver.findElements(noResultsText).isEmpty();
    }

    public void openFirstProduct() {
        By cookieAcceptAllBtn = By.xpath("//button[normalize-space()='Prihvaćam sve']");
        utils.Waits.clickIfClickable(driver, cookieAcceptAllBtn, 2);

        utils.Waits.untilAtLeastOne(driver, productLinks);
        driver.findElements(productLinks).get(0).click();
    }

}

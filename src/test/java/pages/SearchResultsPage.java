package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {
    private final WebDriver driver;

    private final By productLinks= By.cssSelector("a.card-link");

    public SearchResultsPage(WebDriver driver){
        this.driver=driver;
    }

    public boolean hasResults(){
        return !driver.findElements(productLinks).isEmpty();
    }

    public void openFirstProduct() {
        driver.findElements(productLinks).get(0).click();
    }
}

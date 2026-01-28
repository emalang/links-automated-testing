package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final By cookieAcceptAllBtn = By.xpath("//button[normalize-space()='Prihvaćam sve']");
    private final By cookieModal = By.xpath("//*[contains(.,'Cijenimo tvoju privatnost')]");

    private final  WebDriver driver;
    private final By searchInput = By.name("q");

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public void acceptCookiesIfPresent() {
        utils.Waits.clickIfClickable(driver, cookieAcceptAllBtn, 3);
    }

    public void open() {
        driver.get("https://www.links.hr/hr/");
        acceptCookiesIfPresent();
    }


    public void searchFor(String keyword){
        driver.findElement(searchInput).clear();
        driver.findElement(searchInput).sendKeys(keyword, Keys.ENTER);
        acceptCookiesIfPresent();
    }
}

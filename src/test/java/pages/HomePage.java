package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {


    private final  WebDriver driver;

    private final By searchInput = By.name("q");

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public void open(){
        driver.get("https://www.links.hr/hr/");
    }

    public void searchFor(String keyword){
        driver.findElement(searchInput).clear();
        driver.findElement(searchInput).sendKeys(keyword, Keys.ENTER);
    }
}

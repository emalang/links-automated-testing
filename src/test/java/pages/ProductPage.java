package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    private final WebDriver driver;

    private final By addToCartButton=By.cssSelector("button.btn-add-to-cart");

    public ProductPage(WebDriver driver){
        this.driver=driver;
    }

    public void addToCart(){
        driver.findElement(addToCartButton).click();
    }
}

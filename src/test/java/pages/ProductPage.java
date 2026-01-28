package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Waits;

public class ProductPage {

    private final WebDriver driver;

    private final By addToCartButton=By.cssSelector("button.btn-add-to-cart");
    private final By addToCartBadge = By.cssSelector("button.btn-add-to-cart .icon-badge-cart-count");
    private final By cookieAcceptAllBtn = By.xpath("//button[normalize-space()='Prihvaćam sve']");

    public ProductPage(WebDriver driver){
        this.driver=driver;
    }

    public void addToCart() {
        try { driver.findElement(cookieAcceptAllBtn).click(); } catch (Exception ignored) {}

        WebElement btn = Waits.wait(driver).until(ExpectedConditions.presenceOfElementLocated(addToCartButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", btn);

        try {
            Waits.wait(driver).until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
        } catch (ElementClickInterceptedException e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btn);
        }

        try { Waits.untilVisible(driver, addToCartBadge); } catch (Exception ignored) {}
    }

    public boolean badgeIsVisible() {
        return !driver.findElements(addToCartBadge).isEmpty();
    }

}

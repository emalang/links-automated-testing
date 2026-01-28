package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Waits;

public class CartPage
{
    private final WebDriver driver;
    private  final By cartLink=By.xpath("//a[contains(@href,'/cart')] | //span[contains(text(),'Dodaj')]");
    private final By cartItem = By.cssSelector(".cart-item, .shopping-cart-item, .item-row");
    private final By emptyCartMessage = By.xpath("//*[contains(text(),'prazna')]");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openCart() {
        Waits.untilAtLeastOne(driver, cartLink);
        driver.findElements(cartLink).get(0).click();
    }

    public boolean hasItems() {
        return !driver.findElements(cartItem).isEmpty();
    }

    public boolean isEmpty() {
        return !driver.findElements(emptyCartMessage).isEmpty();
    }
}

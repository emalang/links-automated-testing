package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;


import java.time.Duration;

public class Waits {

    public static WebDriverWait wait(WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static void untilVisible(WebDriver driver, By locator) {
        wait(driver).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void untilAtLeastOne(WebDriver driver, By locator) {
        wait(driver).until(d -> !d.findElements(locator).isEmpty());
    }

    public static void clickIfClickable(WebDriver driver, By locator, int seconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(seconds))
                    .until(ExpectedConditions.elementToBeClickable(locator))
                    .click();
        } catch (TimeoutException e) {
        }
    }


}

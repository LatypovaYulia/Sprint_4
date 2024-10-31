//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pageobject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrackPage {
    protected WebDriver driver;
    private By notFoundImg = By.xpath(".//div[contains(@class, 'Track_NotFound')]/img");

    public TrackPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDisplayedNotFoundOrderImg() {
        (new WebDriverWait(this.driver, Duration.ofSeconds(5L))).until(ExpectedConditions.visibilityOfElementLocated(this.notFoundImg));
        return this.driver.findElement(this.notFoundImg).isDisplayed();
    }
}

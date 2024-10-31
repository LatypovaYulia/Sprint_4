//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pageobject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPageSecondForm {
    private WebDriver driver;
    private By deliveryDateInput = By.xpath(".//input[contains(@class, 'Input_Input') and contains(@placeholder, 'Когда привезти самокат')]");
    private By deliveryDateInСalendar = By.xpath(".//div[contains(@class, 'datepicker__day--selected')]");
    private By rentalPeriodField = By.xpath(".//div[@class='Dropdown-placeholder']");
    private By rentalPeriodNumberOfDays = By.xpath(".//div[text()='трое суток']");
    private By scooterColorBlackCheckbox = By.xpath(".//input[@id='black']");
    private By scooterColorGreyCheckbox = By.xpath(".//input[@id='grey']");
    private By commentField = By.xpath(".//input[contains(@class, 'Input_Input') and contains(@placeholder, 'Комментарий')]");
    private By finalLowerOrderButton = By.xpath(".//button[contains(@class, 'Button_Middle') and text()='Заказать']");
    private By yesForConsentToOrderButton = By.xpath(".//button[contains(@class, 'Button_Middle') and text()='Да']");
    private By orderModalHeader = By.xpath(".//div[contains(@class, Order_ModalHeader) and text()='Заказ оформлен']");

    public OrderPageSecondForm(WebDriver driver) {
        this.driver = driver;
    }

    public void selectDeliveryDateInCalendar(String date) {
        WebElement var10000 = (WebElement)(new WebDriverWait(this.driver, Duration.ofSeconds(5L))).until(ExpectedConditions.visibilityOfElementLocated(this.deliveryDateInput));
        this.driver.findElement(this.deliveryDateInput).click();
        this.driver.findElement(this.deliveryDateInput).sendKeys(new CharSequence[]{date});
        (new WebDriverWait(this.driver, Duration.ofSeconds(5L))).until(ExpectedConditions.visibilityOfElementLocated(this.deliveryDateInСalendar));
        this.driver.findElement(this.deliveryDateInСalendar).click();
    }

    public void selectRentalPeriod() {
        this.driver.findElement(this.rentalPeriodField).click();
        this.driver.findElement(this.rentalPeriodNumberOfDays).click();
    }

    public void selectScooterColorCheckbox() {
        this.driver.findElement(this.scooterColorBlackCheckbox).click();
    }

    public void scooterColorGreyCheckbox() {
        this.driver.findElement(this.scooterColorGreyCheckbox).click();
    }

    public void setCommentInField(String comment) {
        this.driver.findElement(this.commentField).sendKeys(new CharSequence[]{comment});
    }

    public void clickFinalLowerOrderButton() {
        this.driver.findElement(this.finalLowerOrderButton).click();
    }

    public void fillOutSecondOrderForm(String date, String comment) {
        this.selectDeliveryDateInCalendar(date);
        this.selectRentalPeriod();
        this.setCommentInField(comment);
    }

    public void clickYesForConsentToOrderButton() {
        (new WebDriverWait(this.driver, Duration.ofSeconds(5L))).until(ExpectedConditions.visibilityOfElementLocated(this.yesForConsentToOrderButton));
        this.driver.findElement(this.yesForConsentToOrderButton).click();
    }

    public String orderModalHeaderText() {
        return this.driver.findElement(this.orderModalHeader).getText();
    }
}


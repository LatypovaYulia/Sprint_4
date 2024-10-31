//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pageobject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPageFirstForm {
    private WebDriver driver;
    private By nameField = By.xpath(".//input[contains(@class,'Input_Input') and contains(@placeholder, 'Имя')]");
    private By nameFieldError = By.xpath(".//div[contains(@class, Input_ErrorMessage) and text()='Введите корректное имя']");
    private By surnameField = By.xpath(".//input[contains(@class,'Input_Input') and contains(@placeholder, 'Фамилия')]");
    private By surnameFieldError = By.xpath(".//div[contains(@class, Input_ErrorMessage) and text()='Введите корректную фамилию']");
    private By addressField = By.xpath(".//input[contains(@class,'Input_Input') and contains(@placeholder, 'Адрес')]");
    private By addressFieldError = By.xpath(".//div[contains(@class, Input_ErrorMessage) and text()='Введите корректный адрес']");
    private By metroStationField = By.xpath(".//input[contains(@class,'select-search')]");
    private By metroStationFieldError = By.xpath(".//div[contains(@class, 'Order_MetroError')]");
    private By phoneNumberField = By.xpath(".//input[contains(@class,'Input_Input') and contains(@placeholder, 'Телефон')]");
    private By phoneNumberFieldError = By.xpath(".//div[contains(@class, 'Input_ErrorMessage') and text()='Введите корректный номер']");
    private By orderNextButton = By.xpath(".//div[contains(@class, 'Order_NextButton')]/button[contains(@class, 'Button_Button')]");

    public OrderPageFirstForm(WebDriver driver) {
        this.driver = driver;
    }

    public void setNameInField(String name) {
        this.driver.findElement(this.nameField).sendKeys(new CharSequence[]{name});
    }

    public void setSurnameInField(String surname) {
        this.driver.findElement(this.surnameField).sendKeys(new CharSequence[]{surname});
    }

    public void setAddressInField(String address) {
        this.driver.findElement(this.addressField).sendKeys(new CharSequence[]{address});
    }

    public void setMetroStationInField(String metroStation) {
        WebElement findElementMetroStationField = this.driver.findElement(this.metroStationField);
        findElementMetroStationField.sendKeys(new CharSequence[]{metroStation});
        findElementMetroStationField.sendKeys(new CharSequence[]{Keys.ARROW_DOWN});
        findElementMetroStationField.sendKeys(new CharSequence[]{Keys.ENTER});
    }

    public void setPhoneNumberInField(String phoneNumber) {
        (new WebDriverWait(this.driver, Duration.ofSeconds(10L))).until(ExpectedConditions.elementToBeClickable(this.phoneNumberField));
        this.driver.findElement(this.phoneNumberField).sendKeys(new CharSequence[]{phoneNumber});
    }

    public void clickOrderNextButton() {
        ((JavascriptExecutor)this.driver).executeScript("arguments[0].scrollIntoView();", new Object[]{this.driver.findElement(this.orderNextButton)});
        (new WebDriverWait(this.driver, Duration.ofSeconds(5L))).until(ExpectedConditions.elementToBeClickable(this.orderNextButton));
        this.driver.findElement(this.orderNextButton).click();
    }

    public void fillOutFirstOrderForm(String name, String surname, String address, String metroStation, String phoneNumber) {
        (new WebDriverWait(this.driver, Duration.ofSeconds(5L))).until(ExpectedConditions.elementToBeClickable(this.nameField));
        this.setNameInField(name);
        this.setSurnameInField(surname);
        this.setAddressInField(address);
        this.setMetroStationInField(metroStation);
        this.setPhoneNumberInField(phoneNumber);
    }

    public String nameFieldGetText() {
        return this.driver.findElement(this.nameFieldError).getText();
    }

    public String surnameFieldErrorGetText() {
        return this.driver.findElement(this.surnameFieldError).getText();
    }

    public String addressFieldErrorGetText() {
        return this.driver.findElement(this.addressFieldError).getText();
    }

    public String metroStationFieldErrorGetText() {
        return this.driver.findElement(this.metroStationFieldError).getText();
    }

    public String phoneNumberFieldErrorGetText() {
        return this.driver.findElement(this.phoneNumberFieldError).getText();
    }

    public void waitMetroStationFieldError() {
        (new WebDriverWait(this.driver, Duration.ofSeconds(10L))).until(ExpectedConditions.elementToBeClickable(this.metroStationFieldError));
    }
}

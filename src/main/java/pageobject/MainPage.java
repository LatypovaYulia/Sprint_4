//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pageobject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;
    private By yesForCookiesButton = By.xpath(".//button[contains(@class, 'App_CookieButton')]");
    private By headerOrderButton = By.xpath(".//div[contains(@class, 'Header_Nav')]/button[text()='Заказать']");
    private By lowerOrderButton = By.xpath(".//div[contains(@class, 'Home_FinishButton')]/button[text()='Заказать']");
    private By logoScooterImg = By.xpath(".//img[@alt='Scooter']");
    private By logoYandexImg = By.xpath(".//img[@alt='Yandex']");
    private By statusOrderButton = By.xpath(".//button[contains(@class, 'Header_Link')]");
    private By orderNumberField = By.xpath(".//input[@type = 'text']");
    private By goButton = By.xpath(".//button[contains(@class, 'Header_Button') and text()='Go!']");
    public static final String MAIN_PAGE_URL = "https://qa-scooter.praktikum-services.ru/";
    public static final String MAIN_PAGE_YANDEX_URL = "https://ya.ru/";
    private static final String FAQ_QUESTION_PATTERN = ".//div[contains(@id, 'accordion__heading') and text() = '%s']";
    private static final String FAQ_ANSWER_PATTERN = ".//div[contains(@class, 'accordion__panel') and not(@hidden)]/p[text()='%s']";
    public static final String HOW_MUCH_COSTS_QUESTION = "Сколько это стоит? И как оплатить?";
    public static final String WANT_SOME_CSOOTERS_QUESTION = "Хочу сразу несколько самокатов! Так можно?";
    public static final String HOW_CALCULATE_RENTAL_TIME_QUESTION = "Как рассчитывается время аренды?";
    public static final String CAN_ORDER_SCOOTER_TODAY_QUESTION = "Можно ли заказать самокат прямо на сегодня?";
    public static final String CAN_EXTEND_OR_RETURN_EARLIER_QUESTION = "Можно ли продлить заказ или вернуть самокат раньше?";
    public static final String BRING_CHARGER_WITH_SCOOTER_QUESTION = "Вы привозите зарядку вместе с самокатом?";
    public static final String CAN_CANCEL_ORDER_QUESTION = "Можно ли отменить заказ?";
    public static final String BRING_IF_I_LIVE_MKAD_QUESTION = "Я жизу за МКАДом, привезёте?";
    public static final String HOW_MUCH_COSTS_ANSWER = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public static final String WANT_SOME_CSOOTERS_ANSWER = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public static final String HOW_CALCULATE_RENTAL_TIME_ANSWER = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public static final String CAN_ORDER_SCOOTER_TODAY_ANSWER = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public static final String CAN_EXTEND_OR_RETURN_EARLIER_ANSWER = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public static final String BRING_CHARGER_WITH_SCOOTER_ANSWER = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public static final String CAN_CANCEL_ORDER_ANSWER = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public static final String BRING_IF_I_LIVE_MKAD_ANSWER = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openMainPage() {
        this.driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    public void clickYesForCookiesButton() {
        this.driver.findElement(this.yesForCookiesButton).click();
    }

    public void headerOrderButtonClick() {
        (new WebDriverWait(this.driver, Duration.ofSeconds(5L))).until(ExpectedConditions.elementToBeClickable(this.headerOrderButton));
        this.driver.findElement(this.headerOrderButton).click();
    }

    public void lowerOrderButtonClick() {
        (new WebDriverWait(this.driver, Duration.ofSeconds(5L))).until(ExpectedConditions.elementToBeClickable(this.lowerOrderButton));
        ((JavascriptExecutor)this.driver).executeScript("arguments[0].scrollIntoView();", new Object[]{this.driver.findElement(this.lowerOrderButton)});
        this.driver.findElement(this.lowerOrderButton).click();
    }

    public void clickFAQQuestion(String questionText) {
        String questionLocator = String.format(".//div[contains(@id, 'accordion__heading') and text() = '%s']", questionText);
        (new WebDriverWait(this.driver, Duration.ofSeconds(8L))).until(ExpectedConditions.elementToBeClickable(By.xpath(questionLocator)));
        ((JavascriptExecutor)this.driver).executeScript("arguments[0].scrollIntoView();", new Object[]{this.driver.findElement(By.xpath(questionLocator))});
        this.driver.findElement(By.xpath(questionLocator)).click();
    }

    public boolean isAnswerVisible(String answerText) {
        String answerLocator = String.format(".//div[contains(@class, 'accordion__panel') and not(@hidden)]/p[text()='%s']", answerText);
        (new WebDriverWait(this.driver, Duration.ofSeconds(5L))).until(ExpectedConditions.elementToBeClickable(By.xpath(answerLocator)));
        return this.driver.findElement(By.xpath(answerLocator)).isDisplayed();
    }

    public void logoScooterImgClick() {
        (new WebDriverWait(this.driver, Duration.ofSeconds(5L))).until(ExpectedConditions.elementToBeClickable(this.logoScooterImg));
        this.driver.findElement(this.logoScooterImg).click();
    }

    public void logoYandexImgClick() {
        (new WebDriverWait(this.driver, Duration.ofSeconds(5L))).until(ExpectedConditions.elementToBeClickable(this.logoYandexImg));
        this.driver.findElement(this.logoYandexImg).click();
    }

    public void statusOrderButtonClick() {
        (new WebDriverWait(this.driver, Duration.ofSeconds(5L))).until(ExpectedConditions.elementToBeClickable(this.statusOrderButton));
        this.driver.findElement(this.statusOrderButton).click();
    }

    public void setOrderNumber(String orderNumberValue) {
        (new WebDriverWait(this.driver, Duration.ofSeconds(5L))).until(ExpectedConditions.visibilityOfElementLocated(this.orderNumberField));
        WebElement orderNumberWebElement = this.driver.findElement(this.orderNumberField);
        orderNumberWebElement.clear();
        this.driver.findElement(this.orderNumberField).sendKeys(new CharSequence[]{orderNumberValue});
    }

    public void goButtonClick() {
        (new WebDriverWait(this.driver, Duration.ofSeconds(5L))).until(ExpectedConditions.elementToBeClickable(this.goButton));
        this.driver.findElement(this.goButton).click();
    }
}

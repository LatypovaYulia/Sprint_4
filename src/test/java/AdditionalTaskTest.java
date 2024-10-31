//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Iterator;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;
import pageobject.MainPage;
import pageobject.TrackPage;

public class AdditionalTaskTest extends BaseTest {
    public AdditionalTaskTest() {
    }

    @Test
    public void clickLogoScooterOpenMainPagePositiveResult() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        mainPage.headerOrderButtonClick();
        mainPage.logoScooterImgClick();
        String expected = "https://qa-scooter.praktikum-services.ru/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("После нажатии на логотип Самокат не переходит на главную страницу Самоката", expected, actualUrl);
    }

    @Test
    public void clickLogoYandexOpenNewWindowYandexPositiveResult() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        mainPage.logoYandexImgClick();
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator var3 = windowHandles.iterator();

        String actualUrl;
        while(var3.hasNext()) {
            actualUrl = (String)var3.next();
            driver.switchTo().window(actualUrl);
        }

        String expected = "https://ya.ru/";
        actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("После нажатии на логотип Яндекс не открывается новое окно с главной страницой Яндекса", expected, actualUrl);
    }

    @Test
    public void checkStatusOrderNotExistOrderErrorMessage() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        mainPage.statusOrderButtonClick();
        mainPage.setOrderNumber("56566463");
        mainPage.goButtonClick();
        TrackPage trackPage = new TrackPage(driver);
        boolean isDisplayedNotFoundOrderImg = trackPage.isDisplayedNotFoundOrderImg();
        Assert.assertTrue(isDisplayedNotFoundOrderImg);
    }
}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;
import pageobject.MainPage;
import pageobject.OrderPageFirstForm;
import pageobject.OrderPageSecondForm;

public class CheckOrderTest extends BaseTest {
    public CheckOrderTest() {
    }

    @Test
    public void checkOrderFormHeaderOrderButtonPositiveResult() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        mainPage.clickYesForCookiesButton();
        mainPage.headerOrderButtonClick();
        OrderPageFirstForm orderPageFirstForm = new OrderPageFirstForm(driver);
        orderPageFirstForm.fillOutFirstOrderForm("Антон", "Батонов", "Ленина 51, 25", "Планерная", "89226598641");
        orderPageFirstForm.clickOrderNextButton();
        OrderPageSecondForm orderPageSecondForm = new OrderPageSecondForm(driver);
        String deliveryData = LocalDate.now().plusDays(1L).toString();
        orderPageSecondForm.fillOutSecondOrderForm(deliveryData, "комментариев нет");
        orderPageSecondForm.selectScooterColorCheckbox();
        orderPageSecondForm.clickFinalLowerOrderButton();
        orderPageSecondForm.clickYesForConsentToOrderButton();
        String expectedText = "Заказ оформлен";
        String actualText = orderPageSecondForm.orderModalHeaderText();
        Assert.assertEquals("В заголовке страницы не появляется: " + expectedText, true, actualText.contains(expectedText));
    }

    @Test
    public void checkOrderFormLowerOrderButtonPositiveResult() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        mainPage.clickYesForCookiesButton();
        mainPage.lowerOrderButtonClick();
        OrderPageFirstForm orderPageFirstForm = new OrderPageFirstForm(driver);
        orderPageFirstForm.fillOutFirstOrderForm("Мария", "Павлова", "Толстого 35,94", "Парк Победы", "89365861479");
        orderPageFirstForm.clickOrderNextButton();
        OrderPageSecondForm orderPageSecondForm = new OrderPageSecondForm(driver);
        String deliveryData = LocalDate.now().plusDays(1L).toString();
        orderPageSecondForm.fillOutSecondOrderForm(deliveryData, "комментариев нет");
        orderPageSecondForm.scooterColorGreyCheckbox();
        orderPageSecondForm.clickFinalLowerOrderButton();
        orderPageSecondForm.clickYesForConsentToOrderButton();
        String expectedText = "Заказ оформлен";
        String actualText = orderPageSecondForm.orderModalHeaderText();
        Assert.assertEquals("В заголовке страницы не появляется: " + expectedText, true, actualText.contains(expectedText));
    }
}

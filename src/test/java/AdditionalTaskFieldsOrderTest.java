//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.junit.Assert;
import org.junit.Test;
import pageobject.MainPage;
import pageobject.OrderPageFirstForm;

public class AdditionalTaskFieldsOrderTest extends BaseTest {
    public AdditionalTaskFieldsOrderTest() {
    }

    @Test
    public void checkFirstFormOrderNullFieldsErrorMessages() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        mainPage.clickYesForCookiesButton();
        mainPage.headerOrderButtonClick();
        OrderPageFirstForm orderPageFirstForm = new OrderPageFirstForm(driver);
        orderPageFirstForm.clickOrderNextButton();
        Assert.assertEquals("Неверное сообщение об ошибке для поля Имя", "Введите корректное имя", orderPageFirstForm.nameFieldGetText());
        Assert.assertEquals("Неверное сообщение об ошибке для поля Фамилия", "Введите корректную фамилию", orderPageFirstForm.surnameFieldErrorGetText());
        Assert.assertEquals("Неверное сообщение об ошибке для поля Адрес", "Введите корректный адрес", orderPageFirstForm.addressFieldErrorGetText());
        Assert.assertEquals("Неверное сообщение об ошибке для поля Станция метро", "Выберите станцию", orderPageFirstForm.metroStationFieldErrorGetText());
        Assert.assertEquals("Неверное сообщение об ошибке для поля Телефон", "Введите корректный номер", orderPageFirstForm.phoneNumberFieldErrorGetText());
    }

    @Test
    public void checkFirstFormOrderNotValidValuesErrorMessages() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        mainPage.clickYesForCookiesButton();
        mainPage.headerOrderButtonClick();
        OrderPageFirstForm orderPageFirstForm = new OrderPageFirstForm(driver);
        orderPageFirstForm.setNameInField("Anton3");
        orderPageFirstForm.setSurnameInField("Batonov!");
        orderPageFirstForm.setAddressInField("Lenina 35-6");
        orderPageFirstForm.setPhoneNumberInField("89226253");
        orderPageFirstForm.clickOrderNextButton();
        orderPageFirstForm.waitMetroStationFieldError();
        Assert.assertEquals("Неверное сообщение об ошибке для поля Имя", "Введите корректное имя", orderPageFirstForm.nameFieldGetText());
        Assert.assertEquals("Неверное сообщение об ошибке для поля Фамилия", "Введите корректную фамилию", orderPageFirstForm.surnameFieldErrorGetText());
        Assert.assertEquals("Неверное сообщение об ошибке для поля Адрес", "Введите корректный адрес", orderPageFirstForm.addressFieldErrorGetText());
        Assert.assertEquals("Неверное сообщение об ошибке для поля Станция метро", "Выберите станцию", orderPageFirstForm.metroStationFieldErrorGetText());
        Assert.assertEquals("Неверное сообщение об ошибке для поля Телефон", "Введите корректный номер", orderPageFirstForm.phoneNumberFieldErrorGetText());
    }
}

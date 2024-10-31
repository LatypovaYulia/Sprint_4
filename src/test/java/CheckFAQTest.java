//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import pageobject.MainPage;

@RunWith(Parameterized.class)
public class CheckFAQTest extends BaseTest {
    private final String questionText;
    private final String answerText;
    private final boolean expected;

    public CheckFAQTest(String questionText, String answerText, boolean expected) {
        this.questionText = questionText;
        this.answerText = answerText;
        this.expected = expected;
    }

    @Parameters
    public static Object[][] getTestData() {
        return new Object[][]{{"Сколько это стоит? И как оплатить?", "Сутки — 400 рублей. Оплата курьеру — наличными или картой.", true}, {"Хочу сразу несколько самокатов! Так можно?", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", true}, {"Как рассчитывается время аренды?", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", true}, {"Можно ли заказать самокат прямо на сегодня?", "Только начиная с завтрашнего дня. Но скоро станем расторопнее.", true}, {"Можно ли продлить заказ или вернуть самокат раньше?", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", true}, {"Вы привозите зарядку вместе с самокатом?", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", true}, {"Можно ли отменить заказ?", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", true}, {"Я жизу за МКАДом, привезёте?", "Да, обязательно. Всем самокатов! И Москве, и Московской области.", true}};
    }

    @Test
    public void checkFAQQuestionAndAnswerPositiveResult() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        mainPage.clickYesForCookiesButton();
        mainPage.clickFAQQuestion(this.questionText);
        Assert.assertEquals("Вопросу: " + this.questionText + " не соответсует ответ: " + this.answerText, this.expected, mainPage.isAnswerVisible(this.answerText));
    }
}

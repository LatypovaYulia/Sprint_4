//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.time.Duration;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseTest {
    protected static WebDriver driver;

    public BaseTest() {
    }

    @Before
    public void startUp() {
        this.initFirefox();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4L));
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public void initChrome() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }

    public void initFirefox() {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
    }
}

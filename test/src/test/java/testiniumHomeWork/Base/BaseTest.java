package testiniumHomeWork.Base;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {
    static WebDriver webDriver=null;
    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\bakma\\OneDrive\\Masaüstü\\selenium&driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-notifications");
        options.addArguments("disable-popup-blocking");
        setWebdriver(new ChromeDriver(options));
        getWebdriver().navigate().to("https://www.setur.com.tr");
    }

    public static WebDriver getWebdriver() {
        return webDriver;
    }

    public static void setWebdriver(WebDriver webDriver) {
        BaseTest.webDriver=webDriver;
    }
    public void tearDown()
    {
        getWebdriver().quit();
    }
}

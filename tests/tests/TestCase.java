package LibreM.tests.tests;

import LibreM.core.manageFiles.GetXMLfile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by miguel on 9/1/18.
 */
public class TestCase {

    protected WebDriver driver = null;

    @BeforeSuite
    public void beforeSuite() {

    }

    @BeforeTest
    public void beforeTest() throws IOException {

        String browser = GetXMLfile.getConfProperties("browser");
        String os = GetXMLfile.getConfProperties("os");

        if (browser.equals("firefox")) {
            switch (os) {
                case "win":
                    System.setProperty("webdriver.gecko.driver",
                            System.getProperty("user.dir")+"/LibreM/core/drivers/win/firefox/geckodriver.exe");
                    driver = new FirefoxDriver();
                    break;
                default:
                    System.setProperty("webdriver.gecko.driver",
                            System.getProperty("user.dir")+"/LibreM/core/drivers/mac/firefox/geckodriver");
                    driver = new FirefoxDriver();
                    break;
            }
        } else {
            switch (os) {
                case "win":
                    System.setProperty("webdriver.chrome.driver",
                            System.getProperty("user.dir")+"/LibreM/core/drivers/win/chrome/chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                default:

                    System.setProperty("webdriver.chrome.driver",
                            System.getProperty("user.dir")+"/LibreM/core/drivers/mac/chrome/chromedriver");
                    driver = new ChromeDriver();
                    break;
            }
        }
        driver.get(GetXMLfile.getConfProperties("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(GetXMLfile.getConfProperties(
                "timeOut")), TimeUnit.MILLISECONDS);
    }

    @AfterTest
    public void afterTest() {

        if(driver !=null)
            driver.quit();
    }

    @AfterSuite
    public void afterSuite() {

    }
}

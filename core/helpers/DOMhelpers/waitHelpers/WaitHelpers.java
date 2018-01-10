package LibreM.core.helpers.DOMhelpers.waitHelpers;

import LibreM.core.manageFiles.GetXMLfile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

/**
 * Created by miguel on 9/1/18.
 */
public class WaitHelpers {

    WebDriverWait wait;

    public WebElement waitToBeClickable(WebDriver driver, WebElement element) throws IOException {

        wait = new WebDriverWait(driver, Integer.parseInt(GetXMLfile.getConfProperties("timeOut")));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public WebElement waitVisibility(WebDriver driver, WebElement element) throws IOException {

        wait = new WebDriverWait(driver, Integer.parseInt(GetXMLfile.getConfProperties("timeOut")));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public boolean waitInvisibility(WebDriver driver, WebElement element) throws IOException {

        wait = new WebDriverWait(driver, Integer.parseInt(GetXMLfile.getConfProperties("timeOut")));
        return wait.until(ExpectedConditions.invisibilityOf(element));
    }
}

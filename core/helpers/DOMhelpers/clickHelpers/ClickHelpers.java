package LibreM.core.helpers.DOMhelpers.clickHelpers;

import LibreM.core.helpers.DOMhelpers.waitHelpers.WaitHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

/**
 * Created by miguel on 9/1/18.
 */
public class ClickHelpers {

    static private WaitHelpers waitHelpers = new WaitHelpers();

    public static void click(WebDriver driver, WebElement element) throws IOException {

        waitHelpers.waitToBeClickable(driver, element);
        element.click();

    }
}

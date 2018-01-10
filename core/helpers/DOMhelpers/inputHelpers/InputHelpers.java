package LibreM.core.helpers.DOMhelpers.inputHelpers;

import LibreM.core.helpers.DOMhelpers.waitHelpers.WaitHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.IOException;

/**
 * Created by miguel on 9/1/18.
 */
public class InputHelpers {

    static private WaitHelpers waitHelpers = new WaitHelpers();

    public static void sendKeys(WebDriver driver, WebElement element, String value) throws IOException {

        waitHelpers.waitToBeClickable(driver, element);
        element.clear();
        element.sendKeys(value);

    }
}

package LibreM.tests.methods.buy;

import LibreM.core.helpers.DOMhelpers.clickHelpers.ClickHelpers;
import LibreM.core.helpers.DOMhelpers.inputHelpers.InputHelpers;
import LibreM.tests.pages.buy.BuyPage;
import LibreM.tests.pages.login.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

/**
 * Created by miguel on 9/1/18.
 */
public class BuyMethod {

    static private BuyPage buyPage;

    public static void buy(WebDriver driver) throws IOException {

        try {
            //Init Elements
            buyPage = PageFactory.initElements(driver, BuyPage.class);

            //Button Comprar
            ClickHelpers.click(driver, buyPage.btnBuy);


        } catch (Exception e) {

            System.out.println("Ha Ocurrido un Error");
            Assert.fail();
        }
    }
}

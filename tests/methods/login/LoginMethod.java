package LibreM.tests.methods.login;

import LibreM.core.helpers.DOMhelpers.clickHelpers.ClickHelpers;
import LibreM.core.helpers.DOMhelpers.inputHelpers.InputHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import LibreM.tests.pages.login.LoginPage;

import java.io.IOException;

/**
 * Created by miguel on 9/1/18.
 */
public class LoginMethod {

    static private LoginPage loginPage;

    public static void login(WebDriver driver, String user, String password) throws IOException {

        try {
            //Init Elements
            loginPage = PageFactory.initElements(driver, LoginPage.class);

            //Button Ingresa
            ClickHelpers.click(driver, loginPage.lblIngresa);

            //Inserta Username
            InputHelpers.sendKeys(driver, loginPage.inputUsername, user);

            //continuar
            ClickHelpers.click(driver, loginPage.btnContinuar);

            //Inserta Username
            InputHelpers.sendKeys(driver, loginPage.password, password);

            //Click login
            ClickHelpers.click(driver, loginPage.btnIngresar);


        } catch (Exception e) {

            System.out.println("Ha Ocurrido un Error");
            Assert.fail();
        }


    }
}

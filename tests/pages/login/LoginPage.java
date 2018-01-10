package LibreM.tests.pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by miguel on 9/1/18.
 */
public class LoginPage {

    static WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    @FindBy(how = How.ID, using = "user_id")
    public WebElement inputUsername;

    @FindBy(how = How.ID, using = "user_id")
    public WebElement password;


    @FindBy(how = How.XPATH, using = "//a[@class='option-login nav-header-lnk-login']")
    public WebElement lblIngresa;

    @FindBy(how = How.XPATH, using = "//input[@value='Continuar']")
    public WebElement btnContinuar;

    @FindBy(how = How.ID, using = "action-complete")
    public WebElement btnIngresar;

    @FindBy(how = How.CLASS_NAME, using = "nav-header-username")
    public WebElement lblUser;







}

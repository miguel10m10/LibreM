package LibreM.tests.pages.buy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by miguel on 9/1/18.
 */
public class BuyPage {

    static WebDriver driver;

    public BuyPage(WebDriver driver) {
        this.driver = driver;

    }

    @FindBy(how = How.ID, using = "BidButtonTop")
    public WebElement btnBuy;

}

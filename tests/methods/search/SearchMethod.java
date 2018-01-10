package LibreM.tests.methods.search;

import LibreM.core.helpers.DOMhelpers.clickHelpers.ClickHelpers;
import LibreM.core.helpers.DOMhelpers.inputHelpers.InputHelpers;
import LibreM.tests.pages.search.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

/**
 * Created by miguel on 9/1/18.
 */
public class SearchMethod {

    static private SearchPage searchPage;

    public static void searchElement(WebDriver driver, String item) throws IOException {

        try {
            //Init Elements
            searchPage = PageFactory.initElements(driver, SearchPage.class);

            //Inserta item
            InputHelpers.sendKeys(driver, searchPage.inputSearch, item);

            //Button Search
            ClickHelpers.click(driver, searchPage.btnSeatchEle);

            //Button First Element
            ClickHelpers.click(driver, searchPage.lblTitleElement);


        } catch (Exception e) {

            System.out.println("Ha Ocurrido un Error");
            Assert.fail();
        }
    }
}

package LibreM.tests.pages.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by miguel on 9/1/18.
 */
public class SearchPage {

    static WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;

    }


    @FindBy(how = How.XPATH, using = "//input[@name='as_word']")
    public WebElement inputSearch;

    @FindBy(how = How.CLASS_NAME, using = "nav-search-btn")
    public WebElement btnSeatchEle;

    @FindBy(how = How.XPATH, using = "//li[1][contains(@class,'results-item']//span[@class='main-title']")
    public WebElement lblTitleElement;




}

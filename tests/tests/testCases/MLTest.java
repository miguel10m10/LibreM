package LibreM.tests.tests.testCases;

import LibreM.core.manageFiles.GetExcelData;
import LibreM.tests.methods.buy.BuyMethod;
import LibreM.tests.methods.login.LoginMethod;
import LibreM.tests.methods.search.SearchMethod;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import LibreM.tests.tests.TestCase;

/**
 * Created by miguel on 9/1/18.
 */
public class MLTest extends TestCase {

    @DataProvider(name = "MLTest")
    public Object[][] Data() {
        Object[][] arrayObject = GetExcelData.getExcelData(
                System.getProperty("user.dir")+ "/LibreM/tests/data/buy/ML.xls",
                "ML");
        return arrayObject;
    }

    @Test(dataProvider="MLTest")
    public void mlTest(String user, String password, String item) throws Exception {
        try {

            //LOGIN
            LoginMethod.login(this.driver, user, password);

            //SEARCH ELEMENT
            SearchMethod.searchElement(this.driver, item);

            //COMPRAR
            BuyMethod.buy(this.driver);


        } catch (Exception e) {

            System.out.println("Ha Ocurrido un Error");
            Assert.fail();
        }
    }
}

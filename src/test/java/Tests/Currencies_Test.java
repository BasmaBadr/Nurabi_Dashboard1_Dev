package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Currencies_Test extends TestBase{




    // Add currency
    @Test
    public void createCurrency() throws InterruptedException {
        defineObjects();
        loginPage.loginWithValidData(Email , Password);
        sidePanel_page.openCurrenciesList();
        currenciesPage.addCurrency(nameEN,nameEN , nameEN);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
    }
}

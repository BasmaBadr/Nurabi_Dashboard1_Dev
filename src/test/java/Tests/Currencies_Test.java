package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class Currencies_Test extends TestBase{




    // Add currency
    // Passed
    @Test(priority = 1)
    public void createCurrency() throws InterruptedException {
        defineObjects();
        login();
        sidePanel_page.openCurrenciesList();
        currenciesPage.clickAddBtn();
        currenciesPage.addCurrency(nameEN,nameEN , nameEN);
    //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
    }

    // Add currency side panel
    // Passed
    @Test(priority = 2)
    public void createCurrencySidePanel() throws InterruptedException {
        defineObjects();
        login();
        sidePanel_page.openAddCurrenciesSidePanel();
        currenciesPage.addCurrency(nameEN,nameEN , nameEN);
    //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
    }

    // Edit all fields in currency
    // Passed
    @Test(priority = 3)
    public void editAllFieldsCurrency() throws InterruptedException {
        defineObjects();
        login();
        sidePanel_page.openCurrenciesList();
        currenciesPage.clickAddBtn();

        currenciesPage.editCurrency(nameEN,nameEN , nameEN,EditNameEN,EditNameEN,EditNameEN);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Updated Successfully"));
        softAssert.assertTrue(commonMethods_page.table().contains(EditNameEN));
    }

    // Delete currency
    // Passed
    @Test(priority = 4)
    public void deleteCurrency() throws InterruptedException {
        defineObjects();
        login();
        sidePanel_page.openCurrenciesList();
        currenciesPage.clickAddBtn();

        currenciesPage.addCurrency(nameEN,nameEN , nameEN);
    //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        currenciesPage.delete();
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));

    }


    // Search currency
    @Test(priority = 5)
    public void verifySearchByNameEN() throws InterruptedException, AWTException {
        createCurrency();
        commonMethods_page.search(nameEN);
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));

    }
}

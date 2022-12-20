package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class BankQuestion_Test extends TestBase {


    // Add published bank question from admin
    // Passed
    @Test(priority = 1)
    public void addPublishedBankQuestionFromAdmin() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAdminList();
        bankQuestionPage.clickAddBrn();
        bankQuestionPage.addQuestionFromAdmin(nameEN, nameAR, nameEN, nameAR,true, seoNameEN, seoNameAR, requiredSEONDescEN, requiredSEONDescAR);
      //  Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

    // Add published bank question from admin side panel
    // Passed
    @Test(priority = 2)
    public void addPublishedBankQuestionFromAdminSidePanel() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddAdminSidePanel();
        bankQuestionPage.addQuestionFromAdmin(nameEN, nameAR, nameEN, nameAR,true, seoNameEN, seoNameAR, requiredSEONDescEN, requiredSEONDescAR);
      //  Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));
    }


    // Edit bank question [Name and status to Draft] from Admin
    // Passed
    @Test(priority = 3)
    public void editBankQuestionNamesAndStatusToDraftedFromAdmin() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAdminList();
        bankQuestionPage.clickAddBrn();

        bankQuestionPage.editQuestionFromAdmin(nameEN, nameAR, nameEN, nameAR,true, seoNameEN, seoNameAR,
                requiredSEONDescEN, requiredSEONDescAR,EditNameEN,EditNameAR,EditNameEN,EditNameAR,true);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Updated Successfully"));
        softAssert.assertTrue(commonMethods_page.table().contains(EditNameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(EditNameAR));
    }

    // Search bank question
    // Passed
    @Test(priority = 4)
    public void verifySearchByNameEN() throws InterruptedException, AWTException {
        addPublishedBankQuestionFromAdmin();
        commonMethods_page.search(nameEN);
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));

    }

}

package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class Fields_Consultations_Test extends TestBase {


    // Add consultations field
    // Passed
    @Test(priority = 1)
    public void createConsultationFiled() throws InterruptedException {
        defineObjects();
        login();
        sidePanel_page.openFieldsConsultationsList();
        fieldsConsultationsPage.clickAddBtn();
        fieldsConsultationsPage.addConsultantField(nameEN, nameAR);
    //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

    // Add consultations field side panel
    // Passed
    @Test(priority = 2)
    public void createConsultationFiledSidePanel() throws InterruptedException {
        defineObjects();
        login();
        sidePanel_page.openAddFieldsConsultationsSidePanel();
        fieldsConsultationsPage.addConsultantField(nameEN, nameAR);
    //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

    // Edit consultations names field
    // Passed
    @Test(priority = 3)
    public void editConsultationFiledNames() throws InterruptedException {
        defineObjects();
        login();
        sidePanel_page.openFieldsConsultationsList();
        fieldsConsultationsPage.clickAddBtn();

        fieldsConsultationsPage.editConsultantField(nameEN, nameAR,EditNameEN,EditNameAR);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Updated Successfully"));
        softAssert.assertTrue(commonMethods_page.table().contains(EditNameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(EditNameAR));
    }


    // Delete consultations field
    @Test(priority = 4)
    public void deleteConsultationFiled() throws InterruptedException {
        createConsultationFiled();
        commonMethods_page.delete();
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
        Thread.sleep(3000);
        softAssert.assertFalse(commonMethods_page.table().contains(nameEN));

    }

    // Search consultant field
    @Test(priority = 5)
    public void verifySearchByNameEN() throws InterruptedException, AWTException {
        createConsultationFiled();
        commonMethods_page.search(nameEN);
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
    }


}

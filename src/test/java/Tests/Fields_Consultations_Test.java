package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Fields_Consultations_Test extends TestBase{



    // Add consultations field
    @Test
    public void createConsultationFiled() throws InterruptedException {
        defineObjects();
        loginPage.loginWithValidData(Email,Password);
        sidePanel_page.openFieldsConsultationsList();
        fieldsConsultationsPage.addConsultantField(nameEN,nameAR);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameAR));
    }


    // Delete consultations field
    @Test
    public void deleteConsultationFiled() throws InterruptedException {
        createConsultationFiled();
        commonMethods_page.delete();
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
        Thread.sleep(3000);
        Assert.assertFalse(commonMethods_page.table().contains(nameEN));

    }


}

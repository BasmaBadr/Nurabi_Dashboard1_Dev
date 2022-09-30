package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.lang.reflect.Method;

public class Fields_Test extends TestBase {

    String Email = "momen@nurabi.net";
    String Password = "19821120Mm";

    String requiredNameEN = "Fields NameEN Automation1";
    String requiredNameAR = "Fields NameAR Automation1";

    String requiredSEONameEN = "Fields SEOEN Automation";
    String requiredSEONameAR = "Fields SEOAR Automation";
    String requiredSEODescEN = "Fields SEODescEN Automation";
    String requiredSEODescAR = "Fields SEODescAR Automation";


    // Create Field Parent / Published
    @Test
    public void createPublishedParentFieldsWithValidData(Method method) throws InterruptedException, AWTException {
        defineObjects();
        loginPage.loginWithValidData(Email, Password);
        sidePanel_page.openFieldsList();
        fields_page.createParentFieldWithValidData(true, true, nameEN, nameAR, requiredSEONameEN,
                requiredSEONameAR, requiredSEODescEN, requiredSEODescAR);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameAR));
        Assert.assertTrue(commonMethods_page.table().contains("Published"));

    }

    // Create Field Parent / Draft

    @Test
    public void createDraftParentFieldsWithValidData(Method method) throws InterruptedException, AWTException {
        defineObjects();
        loginPage.loginWithValidData(Email, Password);
        sidePanel_page.openFieldsList();
        fields_page.createParentFieldWithValidData(true, false, nameEN, nameAR, requiredSEONameEN,
                requiredSEONameAR, requiredSEODescEN, requiredSEODescAR);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameAR));
        Assert.assertTrue(commonMethods_page.table().contains("Drafted"));

    }

    // Create Field Child  / Published

    @Test
    public void createPublishedChildFieldsWithValidData(Method method) throws InterruptedException, AWTException {
        defineObjects();
        loginPage.loginWithValidData(Email, Password);
        sidePanel_page.openFieldsList();
        fields_page.createParentFieldWithValidData(false, true ,nameEN, nameAR, requiredSEONameEN,
                requiredSEONameAR, requiredSEODescEN, requiredSEODescAR);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
//        Assert.assertTrue(commonMethods_page.table().contains(requiredNameEN));
//        Assert.assertTrue(commonMethods_page.table().contains("Published"));

    }


    // Create Field Child / Draft
    @Test
    public void createDraftChildFieldsWithValidData(Method method) throws InterruptedException, AWTException {
        defineObjects();
        loginPage.loginWithValidData(Email, Password);
        sidePanel_page.openFieldsList();
        fields_page.createParentFieldWithValidData(false, false ,nameEN, nameAR, requiredSEONameEN,
                requiredSEONameAR, requiredSEODescEN, requiredSEODescAR);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
  //      Assert.assertTrue(commonMethods_page.table().contains(requiredNameEN));
   //     Assert.assertTrue(commonMethods_page.table().contains("Drafted"));
    }

/*
    @Test(priority = 2)
    public void verifySearchByNameEN(Method method) throws InterruptedException, AWTException {
        defineObjects();
        createDraftParentFieldsWithValidData(method);
        commonMethods_page.search(requiredNameEN);
        Assert.assertTrue(commonMethods_page.table().contains(requiredNameEN));
    }

    @Test(priority = 3)
    public void verifyDataOfFieldsDetails(Method method) throws InterruptedException, AWTException {
        defineObjects();
        createDraftParentFieldsWithValidData(method);
        commonMethods_page.openDetailsScreen();
    }

    @Test(priority = 4)
    public void verifyAbilityToEditFields(Method method) throws InterruptedException, AWTException {
        defineObjects();
        createDraftParentFieldsWithValidData(method);
        commonMethods_page.openEditScreen();
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Updated Successfully"));

    }

    @Test(priority = 5)
    public void verifyAbilityToDeleteField(Method method) throws InterruptedException, AWTException {
        defineObjects();
        createDraftParentFieldsWithValidData(method);
        commonMethods_page.delete();
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));

    }

 */
}

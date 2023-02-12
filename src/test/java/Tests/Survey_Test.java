package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class Survey_Test extends TestBase {


    // Add Survey
    // Passed
    @Test(priority = 1)
    public void createSurvey() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openSurveyList();
        surveyPage.clickAddBtn();
        surveyPage.addSurvey(nameEN, nameAR, seoNameEN, seoNameAR, requiredSEONDescEN, requiredSEONDescAR, nameEN, nameAR, nameEN, nameAR);
        //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

    // Add Survey side panel
    // Passed
    @Test(priority = 2)
    public void createSurveySidePanel() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openSAddSurveySidePanel();
        surveyPage.addSurvey(nameEN, nameAR, seoNameEN, seoNameAR, requiredSEONDescEN, requiredSEONDescAR, nameEN, nameAR, nameEN, nameAR);
        //   softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

    // Edit Survey
    // Passed
    @Test(priority = 3)
    public void editSurvey() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openSurveyList();
        surveyPage.clickAddBtn();

        surveyPage.editSurvey(nameEN, nameAR, seoNameEN, seoNameAR, requiredSEONDescEN, requiredSEONDescAR, nameEN, nameAR,
                nameEN, nameAR, EditNameEN, EditNameAR, EditNameEN, EditNameAR, EditNameEN, EditNameAR);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Updated Successfully"));
        softAssert.assertTrue(commonMethods_page.table().contains(EditNameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(EditNameAR));
    }

    // Search survey
    // Passed
    @Test(priority = 4)
    public void verifySearchByNameEN() throws InterruptedException, AWTException {
        createSurvey();
        commonMethods_page.search(nameEN);
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
    }

    // Check survey details
    // Passed
    @Test(priority = 5)
    public void checkSurveyDetails() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openSurveyList();
        surveyPage.clickAddBtn();
        surveyPage.addSurvey(nameEN, nameAR, seoNameEN, seoNameAR, requiredSEONDescEN, requiredSEONDescAR, nameEN, nameAR, nameEN, nameAR);
        //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));
        commonMethods_page.openDetailsScreen();
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Title En ").contains(nameEN));
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Title Ar ").contains(nameAR));
   //     softAssert.assertAll();
    }
}

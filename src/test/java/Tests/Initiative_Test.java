package Tests;

import Pages.Initiative_Page;
import Pages.Login_Page;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class Initiative_Test extends TestBase {

    String requiredShortDesEN = "Tracking ShortDesEN Automation";
    String requiredShortDesAR = "Tracking ShortDesAR Automation";
    String requiredLongDesEN = "Tracking LongDesEN Automation";
    String requiredLongDesAR = "Tracking LongDesAR Automation";
    String requiredDuration = "5";
    String requiredSEONameEN = "Tracking SEOEN Automation";
    String requiredSEONameAR = "Tracking SEOAR Automation";
    String requiredSEONDescEN = "Tracking SEODescEN Automation";
    String requiredSEONDescAR = "Tracking SEODescAR Automation";


    // Create initiative / Image / Daily / Published

    @Test(priority = 1)
    public void createInitiative_Image_Daily_Published() throws InterruptedException, AWTException {
        String startHourPast = String.valueOf(Integer.parseInt(getTimeAMPM()[0]) - 1);
        String endHourPast = getTimeAMPM()[0];
        String AMorPM = getTimeAMPM()[2];

        defineObjects();
        login();
        sidePanel_page.openInitiativeList();
        initiativePage.clickAddBtn();

        initiativePage.addInitiative(true, nameEN, nameAR,
                requiredShortDesEN, requiredShortDesAR, requiredLongDesEN, requiredLongDesAR, requiredSEONameEN, requiredSEONameAR, requiredSEONDescEN, requiredSEONDescAR);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

    // Create initiative / Image / Daily / Published side panel

    @Test(priority = 2)
    public void createInitiative_Image_Daily_PublishedSidePanel() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddInitiativeSidePanel();
        initiativePage.addInitiative(true, nameEN, nameAR,
                requiredShortDesEN, requiredShortDesAR, requiredLongDesEN, requiredLongDesAR, requiredSEONameEN, requiredSEONameAR, requiredSEONDescEN, requiredSEONDescAR);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

    // Create initiative / Image / Daily / Drafted
    @Test(priority = 3)
    public void createInitiative_Image_Daily_Drafted() throws InterruptedException, AWTException {
        String startHourPast = String.valueOf(Integer.parseInt(getTimeAMPM()[0]) - 1);
        String endHourPast = getTimeAMPM()[0];
        String AMorPM = getTimeAMPM()[2];

        defineObjects();
        loginPage.loginWithValidData(Email, Password);
        sidePanel_page.openInitiativeList();
        initiativePage.clickAddBtn();

        initiativePage.addInitiative(false, nameEN, nameAR,
                requiredShortDesEN, requiredShortDesAR, requiredLongDesEN, requiredLongDesAR, requiredSEONameEN, requiredSEONameAR, requiredSEONDescEN, requiredSEONDescAR);
        //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

    // Delete initiative not have enrolled users
    @Test(priority = 4)
    public void verifyDeleteInitiativeNotHaveEnrolledUsers() throws InterruptedException, AWTException {
        createInitiative_Image_Daily_Published();
        // sidePanel_page.openInitiativeList();
        commonMethods_page.delete();
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
        Thread.sleep(3000);
        softAssert.assertFalse(commonMethods_page.table().contains(nameEN));
    }

    @Test(priority = 5)
    public void verifyDetailsOfInitiative() throws InterruptedException, AWTException {
        createInitiative_Image_Daily_Published();
        commonMethods_page.openDetailsScreen();

    }

    // Search initiative
    @Test(priority = 6)
    public void verifySearchByNameEN() throws InterruptedException, AWTException {
        createInitiative_Image_Daily_Published();
        commonMethods_page.search(nameEN);
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
    }

    // Check initiative details
    // Pass
    @Test
    public void checkInitiativeDetails() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openInitiativeList();
        initiativePage.clickAddBtn();

        initiativePage.addInitiative(true, nameEN, nameAR,
                requiredShortDesEN, requiredShortDesAR, requiredLongDesEN, requiredLongDesAR, requiredSEONameEN, requiredSEONameAR, requiredSEONDescEN, requiredSEONDescAR);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));
        commonMethods_page.openDetailsScreen();
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Name EN ").contains(nameEN));
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Name AR ").contains(nameAR));
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Short Description EN ").contains(requiredShortDesEN));
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Short Description AR ").contains(requiredShortDesAR));
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Long Description EN ").contains(requiredLongDesEN));
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Long Description AR ").contains(requiredLongDesAR));
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Status ").contains("Published"));
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Paid ").contains("Free"));
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Tracking System ").contains("Automation Tracking25123"));
        softAssert.assertAll();
    }

}

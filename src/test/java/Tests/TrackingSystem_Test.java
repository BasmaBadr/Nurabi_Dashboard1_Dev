package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class TrackingSystem_Test extends TestBase {

    String Email = "momen@nurabi.net";
    String Password = "19821120Mm";

    String requiredNameEN = "Tracking NameEN Automation";
    String requiredNameAR = "Tracking NameAR Automation";
    String requiredShortDesEN = "Tracking ShortDesEN Automation";
    String requiredShortDesAR = "Tracking ShortDesAR Automation";
    String requiredLongDesEN = "Tracking LongDesEN Automation";
    String requiredLongDesAR = "Tracking LongDesAR Automation";
    String requiredDuration = "5";
    String requiredSEONameEN = "Tracking SEOEN Automation";
    String requiredSEONameAR = "Tracking SEOAR Automation";
    String requiredSEONDescEN = "Tracking SEODescEN Automation";
    String requiredSEONDescAR = "Tracking SEODescAR Automation";
    String imagePath = "D:\\Photos\\ISTQB.png";
    String videoPath = "D:\\Courses\\Appium\\Find Elements by Accessibility ID.mp4";

    // Create Tracking system Image / Free / Published
    @Test
    public void createFreeTrackingSystemWithValidData_Image() throws InterruptedException, AWTException {
        defineObjects();
        loginPage.loginWithValidData(Email, Password);
        sidePanel_page.openTrackingList();
        trackingSystem_page.createTrackingSystemWithValidData(true, true, imagePath, nameEN, nameAR,
                requiredShortDesEN, requiredShortDesAR,
                requiredLongDesEN, requiredLongDesAR,
                requiredDuration, requiredSEONameEN, requiredSEONameAR, requiredSEONDescEN, requiredSEONDescAR);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameAR));
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Free"));
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Published"));
    }

    // Create Tracking system Video / Free / Published
    @Test
    public void createFreeTrackingSystemWithValidData_Video() throws InterruptedException, AWTException {
        defineObjects();
        loginPage.loginWithValidData(Email, Password);
        sidePanel_page.openTrackingList();
        trackingSystem_page.createTrackingSystemWithValidData(false, true, videoPath, nameEN, nameAR,
                requiredShortDesEN, requiredShortDesAR,
                requiredLongDesEN, requiredLongDesAR,
                requiredDuration, requiredSEONameEN, requiredSEONameAR, requiredSEONDescEN, requiredSEONDescAR);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameAR));
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Free"));
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Published"));

    }


    // Search by name English
    @Test(priority = 2)
    public void verifySearchByNameEN() throws InterruptedException, AWTException {
        createFreeTrackingSystemWithValidData_Image();
        commonMethods_page.search(nameEN);
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
    }
/*
    @Test(priority = 3)
    public void verifyDataOfTrackingDetails() throws InterruptedException, AWTException {
        defineObjects();
        createTrackingSystemWithValidData_Image();
        commonMethods_page.openDetailsScreen();
    }

    @Test(priority = 4)
    public void verifyAbilityToEditTrackingSystem() throws InterruptedException, AWTException {
        defineObjects();
        createTrackingSystemWithValidData_Image();
        commonMethods_page.openEditScreen();
        commonMethods_page.assertValidationMessage("Updated Successfully");

    }
*/

    // Verify ability to delete tracking not have enrolled users
    @Test(priority = 5)
    public void verifyAbilityToDeleteTrackingSystem() throws InterruptedException, AWTException {
        createFreeTrackingSystemWithValidData_Image();
        commonMethods_page.delete();
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
        Thread.sleep(3000);
        Assert.assertFalse(commonMethods_page.table().contains(nameEN));
    }


}

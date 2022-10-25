package Tests;

import Pages.Initiative_Page;
import Pages.Login_Page;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class Initiative_Test extends TestBase{

    String Email = "momen@nurabi.net";
    String Password = "19821120Mm";

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
    @Test
    public void createInitiative() throws InterruptedException, AWTException {
        defineObjects();
        loginPage.loginWithValidData(Email, Password);
        sidePanel_page.openInitiativeList();
        initiativePage.addInitiative(nameEN , nameAR,
                requiredShortDesEN, requiredShortDesAR, requiredLongDesEN, requiredLongDesAR, requiredSEONameEN, requiredSEONameAR, requiredSEONDescEN, requiredSEONDescAR);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

    // Delete initiative not have enrolled users
    @Test()
    public void verifyDeleteInitiativeNotHaveEnrolledUsers() throws InterruptedException, AWTException {
        createInitiative();
       // sidePanel_page.openInitiativeList();
        commonMethods_page.delete();
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
        Thread.sleep(3000);
        Assert.assertFalse(commonMethods_page.table().contains(nameEN));
    }

    @Test
    public void verifyDetailsOfInitiative() throws InterruptedException, AWTException {
        createInitiative();
        commonMethods_page.openDetailsScreen();

    }


}
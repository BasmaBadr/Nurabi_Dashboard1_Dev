package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class Sections_Test extends TestBase {

    String Email = "momen@nurabi.net";
    String Password = "19821120Mm";


    // Create  active section on online course with all valid data
    // Passed
    @Test
    public void createActiveSectionsOnOnlineCourseWithAllValidData() throws InterruptedException, AWTException {
        defineObjects();
        loginPage.loginWithValidData(Email, Password);
        sidePanel_page.openSectionsList();
        sectionsPage.addSection(false, nameEN, nameAR, seoNameEN, seoNameAR, requiredLongDesEN, requiredLongDesAR);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

    // Create  active section on live course with all valid data
    // Passed
    @Test
    public void createActiveSectionsOnLiveCourseWithAllValidData() throws InterruptedException, AWTException {
        defineObjects();
        loginPage.loginWithValidData(Email, Password);
        sidePanel_page.openSectionsList();
        sectionsPage.addSection(true, nameEN, nameAR, seoNameEN, seoNameAR, requiredLongDesEN, requiredLongDesAR);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

    // Verify Ability To Delete online Section
    @Test
    public void verifyAbilityToDeleteOnlineSection() throws InterruptedException, AWTException {
        createActiveSectionsOnLiveCourseWithAllValidData();
        commonMethods_page.delete();
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
        Thread.sleep(3000);
        Assert.assertFalse(commonMethods_page.table().contains(nameEN));

    }

    // Verify Ability To Delete live Section
    @Test
    public void verifyAbilityToDeleteLiveSection() throws InterruptedException, AWTException {
        createActiveSectionsOnLiveCourseWithAllValidData();
        commonMethods_page.delete();
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
        Thread.sleep(3000);
        Assert.assertFalse(commonMethods_page.table().contains(nameEN));

    }


}

package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class Activity_Test extends TestBase {

    String Email = "momen@nurabi.net";
    String Password = "19821120Mm";

    String requiredNameEN = "Fields NameEN Automation";
    String requiredNameAR = "Fields NameAR Automation";

    String requiredShortDesEN = "Activity ShortDesEN Automation";
    String requiredShortDesAR = "Activity ShortDesAR Automation";
    String requiredLongDesEN = "Activity LongDesEN Automation";
    String requiredLongDesAR = "Activity LongDesAR Automation";

    // Create activity daily
    @Test
    public void createActivityWithValidData() throws InterruptedException, AWTException {
        defineObjects();
        loginPage.loginWithValidData(Email, Password);
        sidePanel_page.openActivityList();
        activity_page.createActivityWithValidData(nameEN, nameAR,
                requiredShortDesEN, requiredShortDesAR,
                requiredLongDesEN, requiredLongDesAR);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameAR));


    }

    /*
    @Test(priority = 2)
    public void verifySearchByNameEN() throws InterruptedException, AWTException {
        defineObjects();
        createActivityWithValidData();
        commonMethods_page.search(requiredNameEN);
        commonMethods_page.assertValidationMessage(requiredNameEN);

    }

    @Test(priority = 3)
    public void verifyDataOfActivityDetails() throws InterruptedException, AWTException {
        defineObjects();
        createActivityWithValidData();
        commonMethods_page.openDetailsScreen();
    }

    @Test(priority = 4)
    public void verifyAbilityToEditActivity() throws InterruptedException, AWTException {
        defineObjects();
        createActivityWithValidData();
        commonMethods_page.openEditScreen();
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Updated Successfully"));

    }

    @Test(priority = 5)
    public void verifyAbilityToDeleteActivity() throws InterruptedException, AWTException {
        defineObjects();
        createActivityWithValidData();
        commonMethods_page.delete();
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
    }

     */
}

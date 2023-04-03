package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class Activity_Test extends TestBase {

    // Create activity daily
    // Passed
    @Test(priority = 1)
    public void createDailyActivityWithValidData() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openActivityList();
        activity_page.clickAddBtn();
        activity_page.createActivityWithValidData(true, false, false, false, false, nameEN, nameAR,
                requiredShortDesEN, requiredShortDesAR,
                requiredLongDesEN, requiredLongDesAR);
        //   Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        //    Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        //     Assert.assertTrue(commonMethods_page.table().contains(nameAR));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));

    }

    // Create activity daily side panel
    // Passed
    @Test(priority = 2)
    public void createDailyActivityWithValidDataSidePanel() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddActivitySidePanel();
        activity_page.createActivityWithValidData(true, false, false, false, false, nameEN, nameAR,
                requiredShortDesEN, requiredShortDesAR,
                requiredLongDesEN, requiredLongDesAR);
        //  Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        //    Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        //    Assert.assertTrue(commonMethods_page.table().contains(nameAR));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));

    }

    // Create activity weekly
    // Passed
    @Test(priority = 3)
    public void createWeeklyActivityWithValidData() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openActivityList();
        activity_page.clickAddBtn();

        activity_page.createActivityWithValidData(false, true, false, false, false, nameEN, nameAR,
                requiredShortDesEN, requiredShortDesAR,
                requiredLongDesEN, requiredLongDesAR);
        //    Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        //    Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));

        //   Assert.assertTrue(commonMethods_page.table().contains(nameAR));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));

    }

    // Create activity monthly
    // Passed
    @Test(priority = 4)
    public void createMonthlyActivityWithValidData() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openActivityList();
        activity_page.clickAddBtn();

        activity_page.createActivityWithValidData(false, true, false, false, false, nameEN, nameAR,
                requiredShortDesEN, requiredShortDesAR,
                requiredLongDesEN, requiredLongDesAR);
        //    Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        //   Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));

        //    Assert.assertTrue(commonMethods_page.table().contains(nameAR));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));

    }

    // Create activity One Time Date
    // Passed
    @Test(priority = 5)
    public void createOneTimeDateActivityWithValidData() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openActivityList();
        activity_page.clickAddBtn();

        activity_page.createActivityWithValidData(false, false, false, true, false, nameEN, nameAR,
                requiredShortDesEN, requiredShortDesAR,
                requiredLongDesEN, requiredLongDesAR);
        //    Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        //    Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));

        //    Assert.assertTrue(commonMethods_page.table().contains(nameAR));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));

    }

    // Create activity One Time Date Range
    // Passed
    @Test(priority = 6)
    public void createOneTimeDateRangeActivityWithValidData() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openActivityList();
        activity_page.clickAddBtn();

        activity_page.createActivityWithValidData(false, false, false, true, true, nameEN, nameAR,
                requiredShortDesEN, requiredShortDesAR,
                requiredLongDesEN, requiredLongDesAR);
        //    Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        //    Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));

        //    Assert.assertTrue(commonMethods_page.table().contains(nameAR));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));

    }

    // Search by activity
    // Passed

    @Test(priority = 7)
    public void verifySearchByNameEN() throws InterruptedException, AWTException {
        createDailyActivityWithValidData();
        commonMethods_page.search(nameEN);
        //    Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));


    }

    // Delete daily activity
    @Test(priority = 8)
    public void verifyDeleteDailyActivity() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openActivityList();
        activity_page.clickAddBtn();
        activity_page.createActivityWithValidData(true, false, false, false, false, nameEN, nameAR,
                requiredShortDesEN, requiredShortDesAR,
                requiredLongDesEN, requiredLongDesAR);
        //   Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        //    Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        //     Assert.assertTrue(commonMethods_page.table().contains(nameAR));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));
        commonMethods_page.delete();
        //    Assert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));

        //    Assert.assertFalse(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));

    }

    // Edit activity name , description , attachment , from daily to weekly
    // Fail due to validation message
    @Test(priority = 9)
    public void editActivityNameDescriptionAttachmentFromDailyToWeekly() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openActivityList();
        activity_page.clickAddBtn();

        activity_page.editActivity(true, false, false, false,
                false, nameEN, nameAR,
                requiredShortDesEN, requiredShortDesAR,
                requiredLongDesEN, requiredLongDesAR, EditNameEN, EditNameAR, false, true, false, false, false);
        //   Assert.assertTrue(commonMethods_page.assertValidationMessage("Updated Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Updated Successfully"));

        //   Assert.assertTrue(commonMethods_page.table().contains(EditNameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(EditNameEN));

        //   Assert.assertTrue(commonMethods_page.table().contains(EditNameAR));
        softAssert.assertTrue(commonMethods_page.table().contains(EditNameAR));

        //   Assert.assertTrue(commonMethods_page.table().contains("Weekly"));
        softAssert.assertTrue(commonMethods_page.table().contains("Weekly"));


    }

    // Edit activity name , description , attachment , from daily to monthly
    // Fail due to validation message
    @Test(priority = 10)
    public void editActivityNameDescriptionAttachmentFromDailyToMonthly() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openActivityList();
        activity_page.clickAddBtn();

        activity_page.editActivity(true, false, false, false,
                false, nameEN, nameAR,
                requiredShortDesEN, requiredShortDesAR,
                requiredLongDesEN, requiredLongDesAR, EditNameEN, EditNameAR, false, false, true, false, false);
        //   Assert.assertTrue(commonMethods_page.assertValidationMessage("Updated Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Updated Successfully"));

        //   Assert.assertTrue(commonMethods_page.table().contains(EditNameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(EditNameEN));

        //   Assert.assertTrue(commonMethods_page.table().contains(EditNameAR));
        softAssert.assertTrue(commonMethods_page.table().contains(EditNameAR));

        //  Assert.assertTrue(commonMethods_page.table().contains("monthly"));
        softAssert.assertTrue(commonMethods_page.table().contains("monthly"));
    }

    // Edit activity name , description , attachment , from daily to one time
    // Fail due to validation message
    @Test(priority = 11)
    public void editActivityNameDescriptionAttachmentFromDailyToOneTime() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openActivityList();
        activity_page.clickAddBtn();

        activity_page.editActivity(true, false, false, false,
                false, nameEN, nameAR,
                requiredShortDesEN, requiredShortDesAR,
                requiredLongDesEN, requiredLongDesAR, EditNameEN, EditNameAR, false, false, false, true, false);
        //  Assert.assertTrue(commonMethods_page.assertValidationMessage("Updated Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Updated Successfully"));

        //  Assert.assertTrue(commonMethods_page.table().contains(EditNameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(EditNameEN));

        //  Assert.assertTrue(commonMethods_page.table().contains(EditNameAR));
        softAssert.assertTrue(commonMethods_page.table().contains(EditNameAR));

        //   Assert.assertTrue(commonMethods_page.table().contains("one time"));
        softAssert.assertTrue(commonMethods_page.table().contains("one time"));


    }

    // Edit activity name , description , attachment , from daily to custom
    // Fail due to validation message
    @Test(priority = 12)
    public void editActivityNameDescriptionAttachmentFromDailyToCustom() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openActivityList();
        activity_page.clickAddBtn();

        activity_page.editActivity(true, false, false, false,
                false, nameEN, nameAR,
                requiredShortDesEN, requiredShortDesAR,
                requiredLongDesEN, requiredLongDesAR, EditNameEN, EditNameAR, false, false, false, false, true);
        //   Assert.assertTrue(commonMethods_page.assertValidationMessage("Updated Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Updated Successfully"));

        //      Assert.assertTrue(commonMethods_page.table().contains(EditNameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(EditNameEN));

        //   Assert.assertTrue(commonMethods_page.table().contains(EditNameAR));
        softAssert.assertTrue(commonMethods_page.table().contains(EditNameAR));

        //   Assert.assertTrue(commonMethods_page.table().contains("monthly"));
        softAssert.assertTrue(commonMethods_page.table().contains("monthly"));


    }

      /*

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

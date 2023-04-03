package Tests;

import org.testng.annotations.Test;

import java.awt.*;

public class Stories_Test extends TestBase{




    // Verify ability to add story from admin list
    // Passed
    @Test
    public void checkAbilityToAddStoryFromAdminList() throws InterruptedException {
        defineObjects();
        login();
        sidePanel_page.openAdminListTab();
        storiesPage.clickAddButton();
        storiesPage.addStory(true,false,nameEN);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Saved Successfully"));
        softAssert.assertAll();
    }

    // Verify ability to add story from add tab
    // Passed
    @Test
    public void checkAbilityToAddStoryFromAddTab() throws InterruptedException {
        defineObjects();
        login();
        sidePanel_page.openAddStoryTab();
        storiesPage.addStory(true,false,nameEN);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Saved Successfully"));
        softAssert.assertAll();
    }

    // Verify ability to view story details
    // Passed

    @Test(priority = 3)
    public void checkStoryDetails() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAdminListTab();
        storiesPage.clickAddButton();
        storiesPage.addStory(true,false,nameEN);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Saved Successfully"));
    //    softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        commonMethods_page.openDetailsScreen();
        System.out.println(nameEN);
        Thread.sleep(3000);
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Owner Name ").contains("Nurabi"));
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Owner Type ").contains("Admin"));
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Story Type ").contains("text"));
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Content ").contains(nameEN));
        softAssert.assertAll();
    }
    // Verify ability to delete story
    // Passed
    @Test(priority = 4)
    public void verifyAbilityToDeleteAds() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAdminListTab();
        storiesPage.clickAddButton();
        storiesPage.addStory(true,false,nameEN);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Saved Successfully"));
     //   softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        storiesPage.delete();
     //   Thread.sleep(3000);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
        softAssert.assertAll();
    }
}

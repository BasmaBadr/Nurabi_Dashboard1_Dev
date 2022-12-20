package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class PracticalTask_Test extends TestBase {


    // Add practical task on online course
    @Test(priority = 1)
    public void createPracticalTaskOnOnlineCourse() throws InterruptedException {
        defineObjects();
        login();
        sidePanel_page.openPracticalTaskList();
        practicalTaskPage.clickAddBtn();
        practicalTaskPage.addPracticalTask(false, nameEN, nameAR);
    //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

    // Add practical task on online course side panel
    @Test(priority = 2)
    public void createPracticalTaskOnOnlineCourseSidePanel() throws InterruptedException {
        defineObjects();
        login();
        sidePanel_page.openAddPracticalTaskListSidePanel();
        practicalTaskPage.addPracticalTask(false, nameEN, nameAR);
    //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

    // Add practical task on live course
    @Test(priority = 3)
    public void createPracticalTaskOnLiveCourse() throws InterruptedException {
        defineObjects();
        loginPage.loginWithValidData(Email, Password);
        sidePanel_page.openPracticalTaskList();
        practicalTaskPage.clickAddBtn();

        practicalTaskPage.addPracticalTask(true, nameEN, nameAR);
    //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

    // Edit  practical task name
    // Passed
    @Test(priority = 4)
    public void editPracticalTaskToLiveCourse() throws InterruptedException {
        defineObjects();
        login();
        sidePanel_page.openPracticalTaskList();
        practicalTaskPage.clickAddBtn();

        practicalTaskPage.editPracticalTask(false, nameEN, nameAR,EditNameEN,EditNameAR);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Updated Successfully"));
        softAssert.assertTrue(commonMethods_page.table().contains(EditNameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(EditNameAR));
    }

    // Delete practical task on online course
    @Test(priority = 5)
    public void deletePracticalTaskOnOnlineCourse() throws InterruptedException, AWTException {
        createPracticalTaskOnOnlineCourse();
        commonMethods_page.delete();
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
        softAssert.assertFalse(commonMethods_page.table().contains(nameEN));
    }

    // Delete practical task on live course
    @Test(priority = 6)
    public void deletePracticalTaskOnLiveCourse() throws InterruptedException, AWTException {
        createPracticalTaskOnLiveCourse();
        commonMethods_page.delete();
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
        softAssert.assertFalse(commonMethods_page.table().contains(nameEN));
    }

    // Search practical task
    //
    @Test(priority = 7)
    public void verifySearchByNameEN() throws InterruptedException, AWTException {
        createPracticalTaskOnOnlineCourse();
        commonMethods_page.search(nameEN);
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
    }
}

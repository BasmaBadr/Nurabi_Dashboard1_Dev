package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class Tasks_Test extends TestBase {


    // Create task from my tasks list with quiz | proof | attachment
    @Test
    public void checkAbilityToAddTask() throws InterruptedException, AWTException {
        defineObjects();
        loginWithConsultant();
        sidePanel_page.openTasksList();
        tasksPage.clickAddTaskButton();
        tasksPage.addTask(nameEN, nameAR, requiredShortDesEN, requiredShortDesAR, requiredLongDesEN, requiredLongDesAR);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertAll();

    }

    // Create task from add task yab with quiz | proof | attachment
    @Test
    public void checkAbilityToAddTaskFromAddTaskTab() throws InterruptedException, AWTException {
        defineObjects();
        loginWithConsultant();
        sidePanel_page.openAddTab();
        tasksPage.addTask(nameEN, nameAR, requiredShortDesEN, requiredShortDesAR, requiredLongDesEN, requiredLongDesAR);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertAll();
    }

    // Check ability to search task
    @Test
    public void checkAbilityToSearchTask() throws InterruptedException, AWTException {
        defineObjects();
        loginWithConsultant();
        sidePanel_page.openAddTab();
        tasksPage.addTask(nameEN, nameAR, requiredShortDesEN, requiredShortDesAR, requiredLongDesEN, requiredLongDesAR);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        commonMethods_page.search(nameEN);
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertAll();
    }

    // Check ability to delete task
    @Test
    public void checkAbilityToDeleteTask() throws InterruptedException, AWTException {
        defineObjects();
        loginWithConsultant();
        sidePanel_page.openAddTab();
        tasksPage.addTask(nameEN, nameAR, requiredShortDesEN, requiredShortDesAR, requiredLongDesEN, requiredLongDesAR);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        commonMethods_page.delete();
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
        softAssert.assertAll();
    }

    // Check tasks details
    @Test
    public void checkTasksDetails() throws InterruptedException, AWTException {
        defineObjects();
        loginWithConsultant();
        sidePanel_page.openAddTab();
        tasksPage.addTask(nameEN, nameAR, requiredShortDesEN, requiredShortDesAR, requiredLongDesEN, requiredLongDesAR);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        commonMethods_page.openDetailsScreen();
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Name EN ").contains(nameEN));
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Name AR ").contains(nameEN));
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Duration ").contains(nameEN));
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Short Description EN ").contains(nameEN));
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Short Description AR ").contains(nameEN));
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Long Description EN ").contains(nameEN));
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Long Description AR ").contains(nameEN));
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Quiz ").contains(nameEN));
        softAssert.assertTrue(commonMethods_page.assertValidationText(" Prof ").contains(nameEN));
        softAssert.assertAll();
    }

    // Check ability to edit task
    @Test
    public void checkAbilityToEditTask() throws InterruptedException, AWTException {
        defineObjects();
        loginWithConsultant();
        sidePanel_page.openAddTab();
        tasksPage.editTask(nameEN, nameAR, requiredShortDesEN, requiredShortDesAR, requiredLongDesEN, requiredLongDesAR
                , nameEN, nameAR);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Updated Successfully"));
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertAll();
    }

    // Verify ability to assign task to user
    @Test
    public void assignTaskToUser() throws InterruptedException, AWTException {
        defineObjects();
        loginWithConsultant();
        sidePanel_page.openAddTab();
        tasksPage.addTask(nameEN, nameAR, requiredShortDesEN, requiredShortDesAR, requiredLongDesEN, requiredLongDesAR);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        commonMethods_page.openAssignUser();
        tasksPage.assignTaskToUser();
    }
}

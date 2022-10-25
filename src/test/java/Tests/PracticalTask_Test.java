package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class PracticalTask_Test extends TestBase{




    // Add practical task on online course
    @Test
    public void createPracticalTaskOnOnlineCourse() throws InterruptedException {
        defineObjects();
        loginPage.loginWithValidData(Email,Password);
        sidePanel_page.openPracticalTaskList();
        practicalTaskPage.addPracticalTask(false, nameEN , nameAR);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

    // Add practical task on live course
    @Test
    public void createPracticalTaskOnLiveCourse() throws InterruptedException {
        defineObjects();
        loginPage.loginWithValidData(Email,Password);
        sidePanel_page.openPracticalTaskList();
        practicalTaskPage.addPracticalTask(true, nameEN , nameAR);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

    // Delete practical task on online course
    @Test
    public void deletePracticalTaskOnOnlineCourse() throws InterruptedException, AWTException {
        createPracticalTaskOnOnlineCourse();
        commonMethods_page.delete();
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
        Thread.sleep(3000);
        Assert.assertFalse(commonMethods_page.table().contains(nameEN));
    }

    // Delete practical task on live course
    @Test
    public void deletePracticalTaskOnLiveCourse() throws InterruptedException, AWTException {
        createPracticalTaskOnLiveCourse();
        commonMethods_page.delete();
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
        Thread.sleep(3000);
        Assert.assertFalse(commonMethods_page.table().contains(nameEN));
    }
}

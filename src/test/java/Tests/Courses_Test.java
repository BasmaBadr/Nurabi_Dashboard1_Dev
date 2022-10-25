package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class Courses_Test extends TestBase {


    String Email = "momen@nurabi.net";
    String Password = "19821120Mm";


    // Create online , free , published  course with all valid data
    // Passed
    @Test
    public void createCourseOnlineFreePublished() throws InterruptedException, AWTException {
        defineObjects();
        loginPage.loginWithValidData(Email , Password);
        sidePanel_page.openCoursesList();
        coursesPage.createCourse(false,true,true, nameEN, nameAR, slugName, price,
                                      requiredLongDesEN, requiredLongDesAR, requiredSEONameEN, requiredSEONameAR,
                                      requiredSEONDescEN, requiredSEONDescAR);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameAR));
        Assert.assertTrue(commonMethods_page.table().contains("Free"));
        Assert.assertTrue(commonMethods_page.table().contains("Active"));
        Assert.assertTrue(commonMethods_page.table().contains("Online"));
    }


    // Create live , free , published  course with all valid data
    // Passed

    @Test
    public void createCourseLiveFreePublished() throws InterruptedException, AWTException {
        defineObjects();
        loginPage.loginWithValidData(Email , Password);
        sidePanel_page.openCoursesList();
        coursesPage.createCourse(true,true,true, nameEN, nameAR, slugName, price,
                requiredLongDesEN, requiredLongDesAR, requiredSEONameEN, requiredSEONameAR,
                requiredSEONDescEN, requiredSEONDescAR);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameAR));
        Assert.assertTrue(commonMethods_page.table().contains("Free"));
        Assert.assertTrue(commonMethods_page.table().contains("Active"));
        Assert.assertTrue(commonMethods_page.table().contains("Live"));
    }


    // Verify ability to delete online course not have enrolled users
    @Test
    public void verifyDeleteOnlineCourseNotHaveEnrolledUsers() throws InterruptedException, AWTException {
        defineObjects();
        createCourseOnlineFreePublished();
        commonMethods_page.delete();
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
        Thread.sleep(3000);
        Assert.assertFalse(commonMethods_page.table().contains(nameEN));
    }

    // Verify ability to delete live course not have enrolled users
    @Test
    public void verifyDeleteLiveCourseNotHaveEnrolledUsers() throws InterruptedException, AWTException {
        defineObjects();
        createCourseLiveFreePublished();
        commonMethods_page.delete();
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
        Thread.sleep(3000);
        Assert.assertFalse(commonMethods_page.table().contains(nameEN));
    }

}

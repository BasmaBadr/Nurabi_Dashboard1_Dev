package Tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class Lesson_Test extends TestBase {


    String Email = "momen@nurabi.net";
    String Password = "19821120Mm";


    // Create Lesson on online course with PDF and all valid data
    // Passed
    @Test
    public void createLessonOnOnlineCourseWithPDF() throws InterruptedException, AWTException {
        defineObjects();
        loginPage.loginWithValidData(Email, Password);
        sidePanel_page.openLessonList();

        lessonPage.addLesson(false ,nameEN,nameAR,seoNameEN,seoNameEN,requiredLongDesEN,requiredLongDesAR);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameAR));

    }

    // Create Lesson on live course with PDF and all valid data
    // Passed
    @Test
    public void createLessonOnOnLiveCourseWithPDF() throws InterruptedException, AWTException {
        defineObjects();
        loginPage.loginWithValidData(Email, Password);
        sidePanel_page.openLessonList();

        lessonPage.addLesson(true ,nameEN,nameAR,seoNameEN,seoNameEN,requiredLongDesEN,requiredLongDesAR);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameAR));

    }


    // Verify ability to delete online lesson
    @Test
    public void verifyAbilityToDeleteOnlineLesson() throws InterruptedException, AWTException {
        createLessonOnOnlineCourseWithPDF();
        commonMethods_page.delete();
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
        Thread.sleep(3000);
        Assert.assertFalse(commonMethods_page.table().contains(nameEN));

    }

    // Verify ability to delete live lesson
    @Test
    public void verifyAbilityToDeleteLiveLesson() throws InterruptedException, AWTException {
        createLessonOnOnLiveCourseWithPDF();
        commonMethods_page.delete();
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
        Thread.sleep(3000);
        Assert.assertFalse(commonMethods_page.table().contains(nameEN));

    }
}

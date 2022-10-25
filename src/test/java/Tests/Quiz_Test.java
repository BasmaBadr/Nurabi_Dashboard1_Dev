package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class Quiz_Test extends TestBase{

    String Email = "momen@nurabi.net";
    String Password = "19821120Mm";



    // Create quiz multi selection on online course
    // Passed
    @Test
    public void createQuizMultiSelectionOnOnlineCourse() throws InterruptedException, AWTException {
        defineObjects();
        loginPage.loginWithValidData(Email, Password);
        sidePanel_page.openQuizList();
        quizPage.addNewQuiz(false , nameEN ,nameAR,seoNameEN,seoNameAR,requiredSEONDescEN,requiredSEONDescAR
        ,nameEN,nameEN,nameEN,nameAR,nameEN,nameEN);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

    // Create quiz multi selection on live course
    // Passed
    @Test
    public void createQuizMultiSelectionOnOnLiveCourse() throws InterruptedException, AWTException {
        defineObjects();
        loginPage.loginWithValidData(Email, Password);
        sidePanel_page.openQuizList();
        quizPage.addNewQuiz(true , nameEN ,nameAR,seoNameEN,seoNameAR,requiredSEONDescEN,requiredSEONDescAR
                ,nameEN,nameEN,nameEN,nameAR,nameEN,nameEN);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

    // Delete quiz on online course
    @Test
    public void deleteQuizOnOnlineCourse() throws InterruptedException, AWTException {
        createQuizMultiSelectionOnOnlineCourse();
        commonMethods_page.delete();
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
        Thread.sleep(3000);
        Assert.assertFalse(commonMethods_page.table().contains(nameEN));
    }

    // Delete quiz on live course
    @Test
    public void deleteQuizOnLiveCourse() throws InterruptedException, AWTException {
        createQuizMultiSelectionOnOnLiveCourse();
        commonMethods_page.delete();
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
        Thread.sleep(3000);
        Assert.assertFalse(commonMethods_page.table().contains(nameEN));
    }
}

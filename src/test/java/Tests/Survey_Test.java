package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class Survey_Test extends TestBase{




    // Add Survey
    // Passed
    @Test
    public void createSurvey() throws InterruptedException, AWTException {
        defineObjects();
        loginPage.loginWithValidData(Email,Password);
        sidePanel_page.openSurveyList();
        surveyPage.addSurvey(nameEN,nameAR,seoNameEN,seoNameAR,requiredSEONDescEN,requiredSEONDescAR,nameEN,nameAR,nameEN,nameAR);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

}

package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JobTitle_Test extends TestBase {


    // Add active job title
    @Test
    public void addActiveJobTitle() throws InterruptedException {
        defineObjects();
        loginPage.loginWithValidData(Email,Password);
        sidePanel_page.openJobTaskList();
        jobTitlePage.addActiveJob(nameEN,nameAR);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameAR));

    }

    // Delete job title
    @Test
    public void deleteJobTitle() throws InterruptedException {
        addActiveJobTitle();
        jobTitlePage.delete();
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
        Thread.sleep(3000);
        Assert.assertFalse(commonMethods_page.table().contains(nameEN));
    }
}

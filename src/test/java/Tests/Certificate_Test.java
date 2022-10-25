package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class Certificate_Test extends TestBase{



    // Add certificate
    // Passed
    @Test
    public void addCertificate() throws InterruptedException, AWTException {
        defineObjects();
        loginPage.loginWithValidData(Email , Password);
        sidePanel_page.openCertificatesList();
        certificatePage.addCertificate(nameEN,seoNameEN,seoNameAR,requiredSEONDescEN,requiredSEONDescAR);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));

    }
}

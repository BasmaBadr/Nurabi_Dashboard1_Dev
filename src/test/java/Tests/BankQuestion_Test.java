package Tests;

import org.testng.annotations.Test;

import java.awt.*;

public class BankQuestion_Test extends TestBase{


    // Add published bank question from admin
    @Test
    public void addPublishedBankQuestionFromAdmin() throws InterruptedException, AWTException {
        defineObjects();
        loginPage.loginWithValidData(Email, Password);
        sidePanel_page.openAdminList();
        bankQuestionPage.addQuestionFromAdmin(nameEN,nameAR,nameEN,nameAR,seoNameEN,seoNameAR,requiredSEONDescEN,requiredSEONDescAR);
    }

}

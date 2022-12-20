package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class User_Test extends TestBase{





    // Create Admin
    // Pass
    @Test
    public void createNewAdmin() throws InterruptedException {
        defineObjects();
        login();
        sidePanel_page.openAddUser();
        userPage.addUser(false,nameEN,nameEN,fakeMail);
    //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        sidePanel_page.openAdminUserList();
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
    }

    // Search by admin name
    // Pass
    @Test
    public void verifyAbilityToSearchByAdminName() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddUser();
        userPage.addUser(false,nameEN,nameEN,fakeMail);
    //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        sidePanel_page.openAdminUserList();
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        commonMethods_page.search(nameEN);
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
    }

    // Edit admin name
    // Pass
    @Test
    public void verifyAbilityToEditAdminName() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddUser();
        userPage.addUser(false,nameEN,nameAR,fakeMail);
      //  softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        sidePanel_page.openAdminUserList();
        userPage.editUser(EditNameEN);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Updated Successfully"));
        sidePanel_page.openAdminUserList();
        softAssert.assertTrue(commonMethods_page.table().contains(EditNameEN));
    }

    // Delete admin
    // Pass
    @Test
    public void verifyAbilityToDeleteAdmin() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddUser();
        userPage.addUser(false,nameEN,nameEN,fakeMail);
    //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        sidePanel_page.openAdminUserList();
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        commonMethods_page.delete();
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
    }

    // Create user
    // Pass
    @Test
    public void createNewUser() throws InterruptedException {
        defineObjects();
        login();
        sidePanel_page.openAddUser();
        userPage.addUser(true,nameEN,nameEN,fakeMail);
    //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
    }

    // Search by user name
    // Pass
    @Test
    public void verifyAbilityToSearchByUserName() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddUser();
        userPage.addUser(true,nameEN,nameEN,fakeMail);
    //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        commonMethods_page.search(nameEN);
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
    }

    // Edit user name
    // Pass
    @Test
    public void verifyAbilityToEditUserName() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddUser();
        userPage.addUser(true,nameEN,nameAR,fakeMail);
    //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        userPage.editUser(EditNameEN);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Updated Successfully"));
        softAssert.assertTrue(commonMethods_page.table().contains(EditNameEN));
    }

    // Delete user
    // Pass
    @Test
    public void verifyAbilityToDeleteUser() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddUser();
        userPage.addUser(true,nameEN,nameEN,fakeMail);
    //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        commonMethods_page.delete();
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
    }
}

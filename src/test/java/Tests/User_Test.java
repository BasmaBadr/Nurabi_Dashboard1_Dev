package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class User_Test extends TestBase {


    // Create Admin
    // Pass
    @Test(priority = 1)
    public void createNewAdmin() throws InterruptedException {
        defineObjects();
        login();
        sidePanel_page.openAddUser();
        userPage.addUser(false, nameEN, nameEN, fakeMail);
        //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        sidePanel_page.openAdminUserList();
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
    }

    // Search by admin name
    // Pass
    @Test(priority = 2)
    public void verifyAbilityToSearchByAdminName() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddUser();
        userPage.addUser(false, nameEN, nameEN, fakeMail);
        //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        sidePanel_page.openAdminUserList();
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        commonMethods_page.search(nameEN);
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
    }

    // Edit admin name
    // Pass
    @Test(priority = 3)
    public void verifyAbilityToEditAdminName() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddUser();
        userPage.addUser(false, nameEN, nameAR, fakeMail);
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
    @Test(priority = 4)
    public void verifyAbilityToDeleteAdmin() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddUser();
        userPage.addUser(false, nameEN, nameEN, fakeMail);
        //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        sidePanel_page.openAdminUserList();
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        commonMethods_page.delete();
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
    }

    // Create user
    // Pass
    @Test(priority = 5)
    public void createNewUser() throws InterruptedException {
        defineObjects();
        login();
        sidePanel_page.openAddUser();
        userPage.addUser(true, nameEN, nameEN, fakeMail);
        //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
    }

    // Search by user name
    // Pass
    @Test(priority = 6)
    public void verifyAbilityToSearchByUserName() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddUser();
        userPage.addUser(true, nameEN, nameEN, fakeMail);
        //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        commonMethods_page.search(nameEN);
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
    }

    // Edit user name
    // Pass
    @Test(priority = 7)
    public void verifyAbilityToEditUserName() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddUser();
        userPage.addUser(true, nameEN, nameAR, fakeMail);
        //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        userPage.editUser(EditNameEN);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Updated Successfully"));
        softAssert.assertTrue(commonMethods_page.table().contains(EditNameEN));
        softAssert.assertAll();
    }

    // Delete user
    // Pass
    @Test(priority = 8)
    public void verifyAbilityToDeleteUser() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddUser();
        userPage.addUser(true, nameEN, nameEN, fakeMail);
        //    softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        commonMethods_page.delete();
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
    }

    // Check user details
    //
    @Test(priority = 9)
    public void checkUserDetails() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddUser();
        userPage.addUser(true, nameEN, nameEN, fakeMail);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        commonMethods_page.search(nameEN);
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        commonMethods_page.openDetailsScreen();
        Thread.sleep(3000);
        softAssert.assertTrue(userPage.getUserName().contains(nameEN));
        softAssert.assertTrue(userPage.getLanguage().contains("English"));
        softAssert.assertTrue(userPage.getRole().contains("User"));
        softAssert.assertTrue(userPage.getGender().contains("Male"));
        softAssert.assertAll();
    }
}

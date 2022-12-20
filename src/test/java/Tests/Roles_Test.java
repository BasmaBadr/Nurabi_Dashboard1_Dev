package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class Roles_Test extends TestBase{


    // Create role have all permissions
    // Pass
    @Test(priority = 1)
    public void createNewRoleHaveAllPermissions() throws InterruptedException {
        defineObjects();
        login();
        sidePanel_page.openRolesList();
        rolesPage.clickAddButton();
        rolesPage.addRole(nameEN);
      //  softAssert.assertTrue(commonMethods_page.assertValidationMessage("Saved Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Saved Successfully"));
    }

    // Create role from add in side panel  have all permissions
    // Pass
    @Test(priority = 2)
    public void createNewRoleFromAddSidePanel() throws InterruptedException {
        defineObjects();
        login();
        sidePanel_page.openAddRolesSidePanel();
        rolesPage.addRole(nameEN);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Saved Successfully"));

    }

    // Search role
    // Pass
    @Test(priority = 3)
    public void verifyAbilityToSearchRole() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openRolesList();
        rolesPage.clickAddButton();
        rolesPage.addRole(nameEN);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Saved Successfully"));
        commonMethods_page.search(nameEN);
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
    }

    // Delete role
    // Pass
    @Test(priority = 4)
    public void verifyAbilityToDeleteRole() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openRolesList();
        rolesPage.clickAddButton();
        rolesPage.addRole(nameEN);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Saved Successfully"));
        rolesPage.delete();
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));

    }

    // Edit role name
    // Pass
    @Test(priority = 5)
    public void verifyAbilityToEditRoleName() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openRolesList();
        rolesPage.editRole(nameEN , EditNameEN);
        softAssert.assertTrue(commonMethods_page.table().contains(EditNameEN));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Updated Successfully"));
    }
}

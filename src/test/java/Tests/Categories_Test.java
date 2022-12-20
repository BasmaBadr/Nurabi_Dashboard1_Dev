package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class Categories_Test extends TestBase {


    // Add active category
    // Passed
    @Test(priority = 1)
    public void createActiveCategory() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openCategoriesList();
        categoriesPage.clickAdd();
        categoriesPage.addActiveCategory(nameEN, nameAR, seoNameEN, seoNameAR, requiredSEONDescEN, requiredSEONDescAR);
     //   softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

    // Add active category side panel
    // Passed

    @Test(priority = 2)
    public void createActiveCategorySidePanel() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddCategoriesSidePanel();
        categoriesPage.addActiveCategory(nameEN, nameAR, seoNameEN, seoNameAR, requiredSEONDescEN, requiredSEONDescAR);
     //   softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

    // Edit category name and change status to inactive
    //      Fail waiting status ids
    @Test(priority = 3)
    public void editCategoryNameAndChangeStatusToInactive() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openCategoriesList();
        categoriesPage.clickAdd();

        categoriesPage.editActiveCategory(nameEN, nameAR, seoNameEN, seoNameAR, requiredSEONDescEN, requiredSEONDescAR, EditNameEN, EditNameAR);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));
        softAssert.assertTrue(commonMethods_page.table().contains(nameAR));
    }

    // Search categories
    // Passed
    @Test(priority = 4)
    public void verifySearchByNameEN() throws InterruptedException, AWTException {
        createActiveCategory();
        commonMethods_page.search(nameEN);
        softAssert.assertTrue(commonMethods_page.table().contains(nameEN));

    }
}

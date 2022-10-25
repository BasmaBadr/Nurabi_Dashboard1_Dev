package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class Categories_Test extends TestBase{




    // Add active category
    // Passed
    @Test
    public void createActiveCategory() throws InterruptedException, AWTException {
        defineObjects();
        loginPage.loginWithValidData(Email , Password);
        sidePanel_page.openCategoriesList();
        categoriesPage.addActiveCategory(nameEN,nameAR,seoNameEN,seoNameAR,requiredSEONDescEN,requiredSEONDescAR);
        Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        Assert.assertTrue(commonMethods_page.table().contains(nameEN));
        Assert.assertTrue(commonMethods_page.table().contains(nameAR));
    }
}

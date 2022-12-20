package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class Add_Consultant_Test extends TestBase{


    // Add consultant
    // Passed

    @Test
    public void checkAbilityToAddConsultant() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddConsultant();
        addConsultantPage.addConsultant(false,false,true, nameEN+"Lorem ipsum dolor sit amet, consectetuer adipiscin ",
                nameAR+"Lorem ipsum dolor sit amet, consectetuer adipiscin");
    //    Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

    }


    // Add teacher
    // Passed

    @Test
    public void checkAbilityToAddTeacher() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddConsultant();
        addConsultantPage.addConsultant(true,false,false, nameEN+"Lorem ipsum dolor sit amet, consectetuer adipiscin ",
                nameAR+"Lorem ipsum dolor sit amet, consectetuer adipiscin");
    //    Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

    }

    // add coach
    // Passed

    @Test
    public void checkAbilityToAddCoach() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddConsultant();
        addConsultantPage.addConsultant(false,true,false, nameEN+"Lorem ipsum dolor sit amet, consectetuer adipiscin ",
                nameAR+"Lorem ipsum dolor sit amet, consectetuer adipiscin");
    //    Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

    }

    // Search by user name
    // Passed
    @Test
    public void checkAbilityToSearchByUserName() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openConsultantsTab();
        addConsultantPage.search("Llccc");
        addConsultantPage.table().contains("Llccc");
    }

    // Delete consultants
    //
    @Test
    public void checkAbilityToRemoveConsultant() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddConsultant();
        addConsultantPage.addConsultant(false,false,true,
                nameEN+"Lorem ipsum dolor sit amet, consectetuer adipiscin ",
                nameAR+"Lorem ipsum dolor sit amet, consectetuer adipiscin");
    //    Assert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Added Successfully"));

        addConsultantPage.removeConsultants();
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Deleted Successfully"));
    }

    // Edit consultant user | Type | Field | Speciality | Job title | Price |About
    @Test
    public void checkAbilityToEditConsultant() throws InterruptedException, AWTException {
        defineObjects();
        login();
        sidePanel_page.openAddConsultant();
        addConsultantPage.editConsultant(false,false,true,
                nameEN+"Lorem ipsum dolor sit amet, consectetuer adipiscin ",
                nameAR+"Lorem ipsum dolor sit amet, consectetuer adipiscin",true,false,false,nameEN,nameAR);
        softAssert.assertTrue(commonMethods_page.assertValidationMessage("Updated Successfully"));

    }

}

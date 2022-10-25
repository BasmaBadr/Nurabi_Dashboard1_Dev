package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class Categories_Page extends PageBase{
    public Categories_Page(WebDriver driver) {
        super(driver);
    }


    By addCategoryBTN = By.xpath("//span[contains(text() , 'Add Category')]");

    By nameEN = By.id("name");
    By nameAR = By.id("name_ar");


    public void addActiveCategory(String NameEN , String NameAR , String requiredSEONameEN , String requiredSEONameAR
    , String requiredSEONDescEN , String requiredSEONDescAR) throws InterruptedException, AWTException {
        waitElementToBeVisible(addCategoryBTN);
        Click(addCategoryBTN);
        waitElementToBeVisible(nameEN);
        writeOnText(nameEN , NameEN);
        waitElementToBeVisible(nameAR);
        writeOnText(nameAR , NameAR);

        waitElementToBeVisible(seoNameENTxt);
        writeOnText(seoNameENTxt, requiredSEONameEN);

        waitElementToBeVisible(seoNameARTxt);
        writeOnText(seoNameARTxt, requiredSEONameAR);

        waitElementToBeVisible(seoDesEN);
        writeOnText(seoDesEN, requiredSEONDescEN);

        waitElementToBeVisible(seoDesAR);
        writeOnText(seoDesAR, requiredSEONDescAR);

        waitElementToBeVisible(seoImage);
        Click(seoImage);
        Thread.sleep(2000);
        uploadFile("D:\\Photos\\ISTQB.png");
        waitElementToBeVisible(submitBtn);
        Click(submitBtn);
    }


}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class Categories_Page extends PageBase {
    public Categories_Page(WebDriver driver) {
        super(driver);
    }


    By addCategoryBTN = By.xpath("//span[contains(text() , 'Add Category')]");

    By nameEN = By.id("name");
    By nameAR = By.id("name_ar");


    public void clickAdd()
    {
        Click(addCategoryBTN);

    }
    public void addActiveCategory(String NameEN, String NameAR, String requiredSEONameEN, String requiredSEONameAR
            , String requiredSEONDescEN, String requiredSEONDescAR) throws InterruptedException, AWTException {
        writeOnText(nameEN, NameEN);
        writeOnText(nameAR, NameAR);

        writeOnText(seoNameENTxt, requiredSEONameEN);

        writeOnText(seoNameARTxt, requiredSEONameAR);

        writeOnText(seoDesEN, requiredSEONDescEN);

        writeOnText(seoDesAR, requiredSEONDescAR);

        Click(seoImage);
        Thread.sleep(2000);
        uploadFile("ISTQB.png");
        Click(submitBtn);
    }


    public void editActiveCategory(String NameEN, String NameAR, String requiredSEONameEN, String requiredSEONameAR
            , String requiredSEONDescEN, String requiredSEONDescAR,String NameENEdit , String NameAREdit) throws InterruptedException, AWTException {
        addActiveCategory(NameEN, NameAR, requiredSEONameEN, requiredSEONameAR
                , requiredSEONDescEN, requiredSEONDescAR);

        openEditScreen();

        writeOnText(nameEN, NameENEdit);
        writeOnText(nameAR, NameAREdit);

        writeOnText(seoNameENTxt, requiredSEONameEN);

        writeOnText(seoNameARTxt, requiredSEONameAR);

        writeOnText(seoDesEN, requiredSEONDescEN);

        writeOnText(seoDesAR, requiredSEONDescAR);

        Click(seoImage);
        Thread.sleep(2000);
        uploadFile("ISTQB.png");
        Click(submitBtn);
    }


}

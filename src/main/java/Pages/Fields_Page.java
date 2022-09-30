package Pages;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class Fields_Page extends PageBase {
    public Fields_Page(WebDriver driver) {
        super(driver);
    }

    CommonElements commonElements;

    By addFieldBtn = By.xpath("//span[contains(text() , 'Add Field & Goal')]");
    By nameEN = By.id("name");
    By nameAR = By.id("name_ar");
    By type = By.id("type");
    By selectChild = By.cssSelector("#fieldsSelectOptions ul li .Parent658");

    By status = By.cssSelector("[for='status']");
    By selectPublished = By.cssSelector("#statusSelectOptions ul li .Published");
    By seoNameEN = By.id("seo_name_en");
    By seoNameAR = By.id("seo_name_ar");
    By seoDescEN = By.id("seo_description_en");
    By seoDescAR = By.id("seo_description_ar");
    By seoImage = By.cssSelector("div.custom-file.b-form-file");
    By ss = By.id("image_seo");
    By submitBtn = By.xpath("//button[@type = 'submit']");
    By loader = By.id("loading-spinner");


    public void createParentFieldWithValidData(boolean parent,boolean Published , String requiredNameEN, String requiredNameAR, String requiredSEONameEN,
                                               String requiredSEONameAR, String requiredSEODesEN, String requiredSEODesAR) throws AWTException, InterruptedException {
        waitElementToBeVisible(addFieldBtn);
        Click(addFieldBtn);
        waitElementToBeUnVisible(loader);
        waitElementToBeVisible(nameEN);
        writeOnText(nameEN, requiredNameEN);
        waitElementToBeVisible(nameAR);
        writeOnText(nameAR, requiredNameAR);
        waitElementToBeUnVisible(loader);
        Click(type);
        if (!parent) {
            waitElementToBeVisible(type);
            Click(type);
            waitElementToBeVisible(selectChild);
            Click(selectChild);
//            selectFromDDLWithoutOptionTags(type ,"Fields NameEN Automation" );
        }
        if(Published){
            waitElementToBeVisible(status);
            Click(status);
            waitElementToBeVisible(selectPublished);
            Click(selectPublished);
        }
        waitElementToBeVisible(seoNameEN);
        writeOnText(seoNameEN, requiredSEONameEN);
        waitElementToBeVisible(seoNameAR);
        writeOnText(seoNameAR, requiredSEONameAR);
        waitElementToBeVisible(seoDescEN);
        writeOnText(seoDescEN, requiredSEODesEN);
        waitElementToBeVisible(seoDescAR);
        writeOnText(seoDescAR, requiredSEODesAR);
        scrollToElement(seoImage);
        waitElementToBeVisible(seoImage);
        Click(seoImage);
        Thread.sleep(2000);
        uploadFile("D:\\Photos\\ISTQB.png");
        waitElementToBeVisible(submitBtn);
        Click(submitBtn);

    }


}

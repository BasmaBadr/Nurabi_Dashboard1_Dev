package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class TrackingSystem_Page extends PageBase {
    public TrackingSystem_Page(WebDriver driver) {
        super(driver);
    }

    By addTrackingSystemBtn = By.xpath("//span[contains(text() , 'Add Tracking System')]");
    By loader = By.id("loading-spinner");
    By introPath = By.cssSelector("[for='intro_path_type']");
    By introPathParent = By.cssSelector("#introPathSelectOptions ul li");

    By selectImage = By.cssSelector("#introPathSelectOptions ul li .Image");


    By intro = By.id("introPathId");
    By nameENTxt = By.id("name");
    By nameARTxt = By.id("name_ar");
    By imageTracking = By.id("imageId");
    By shortDescriptionENTxt = By.id("short_description");
    By shortDescriptionARTxt = By.id("short_description_ar");
    By longDescriptionENTxt = By.id("long_description");
    By longDescriptionARTxt = By.id("long_description_ar");
    By field = By.cssSelector("[for = 'field']");
    By selectField = By.cssSelector("#fieldsSelectOptions ul li .AutomationField");
    By durationTxt = By.id("duration");
    By status = By.cssSelector("[for='status']");

    By selectPublish = By.cssSelector("#statusSelectOptions ul li .Published");
    By freePaid = By.id("free");
    By seoNameENTxt = By.id("seo_name_en");
    By seoNameARTxt = By.id("seo_name_ar");
    By seoDesEN = By.id("seo_description_en");
    By seoDesAR = By.id("seo_description_ar");
    By seoImage = By.cssSelector("[for='image_seo']");
    By submitBtn = By.xpath("//span[contains(text() , 'Submit')]");

    By searchTxt = By.cssSelector("input.d-inline-block.mr-1.form-control");



    public void createTrackingSystemWithValidData(boolean image, boolean published, String filePath, String requiredNameEN, String requiredNameAR,
                                                  String requiredShortDesEN, String requiredShortDesAR,
                                                  String requiredLongDesEN, String requiredLongDesAR,
                                                  String requiredDuration, String requiredSEONameEN, String requiredSEONameAR,
                                                  String requiredSEONDescEN, String requiredSEONDescAR) throws InterruptedException, AWTException {

        waitElementToBeVisible(addTrackingSystemBtn);
        Click(addTrackingSystemBtn);
        waitElementToBeUnVisible(loader);
        waitElementToBeVisible(introPath);
        Click(introPath);
        waitElementToBeUnVisible(loader);
        //   selectByVisibleTXT(introPathParent , "Image");
        if (image) {
            waitElementToBeVisible(selectImage);
            Click(selectImage);
        }
        //    Thread.sleep(30000);

        //    System.out.println(currentDriver.findElement(By.cssSelector("#introPathSelectOptions ul li ")).getAttribute("innerHTML"));
        //   currentDriver.findElement(By.cssSelector("#introPathSelectOptions ul li .Image")).click();

        waitElementToBeVisible(intro);
        Click(intro);
        Thread.sleep(2000);
        uploadFile(filePath);

        waitElementToBeVisible(nameENTxt);
        writeOnText(nameENTxt, requiredNameEN);

        waitElementToBeVisible(nameARTxt);
        writeOnText(nameARTxt, requiredNameAR);

        waitElementToBeVisible(imageTracking);
        Click(imageTracking);
        Thread.sleep(2000);
        uploadFile("D:\\Photos\\ISTQB.png");

        waitElementToBeVisible(shortDescriptionENTxt);
        writeOnText(shortDescriptionENTxt, requiredShortDesEN);

        waitElementToBeVisible(shortDescriptionARTxt);
        writeOnText(shortDescriptionARTxt, requiredShortDesAR);

        waitElementToBeVisible(longDescriptionENTxt);
        writeOnText(longDescriptionENTxt, requiredLongDesEN);

        waitElementToBeVisible(longDescriptionARTxt);
        writeOnText(longDescriptionARTxt, requiredLongDesAR);

        waitElementToBeVisible(field);
        Click(field);
        //   System.out.println(currentDriver.findElement(By.cssSelector("#introPathSelectOptions ul")).getAttribute("innerHTML"));

        waitElementToBeVisible(selectField);
        Click(selectField);

        waitElementToBeVisible(durationTxt);
        writeOnText(durationTxt, requiredDuration);

        waitElementToBeVisible(status);
        Click(status);

        if (published) {
            waitElementToBeVisible(selectPublish);
            Click(selectPublish);

        }

        waitElementToBeVisible(seoNameENTxt);
        writeOnText(seoNameENTxt, requiredSEONameEN);

        waitElementToBeVisible(seoNameARTxt);
        writeOnText(seoNameARTxt, requiredSEONameAR);

        waitElementToBeVisible(seoDesEN);
        writeOnText(seoDesEN, requiredSEONDescEN);

        waitElementToBeVisible(seoDesAR);
        writeOnText(seoDesAR, requiredSEONDescAR);

        scrollToElement(seoImage);
        waitElementToBeVisible(seoImage);
        Click(seoImage);
        Thread.sleep(2000);
        uploadFile("D:\\Photos\\ISTQB.png");
        Thread.sleep(2000);
        waitElementToBeVisible(submitBtn);
        Click(submitBtn);
      //  waitElementToBeUnVisible(loader);
    }

    public void searchByNameEN(String nameEN) {
        waitElementToBeVisible(searchTxt);
        writeOnText(searchTxt, nameEN);
    }
}

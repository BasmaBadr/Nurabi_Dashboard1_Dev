package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class Initiative_Page extends PageBase {
    public Initiative_Page(WebDriver driver) {
        super(driver);
    }

    By addInitiativeBtn = By.xpath("//span[contains(text() , 'Add Initiative')]");


    By introPath = By.cssSelector("[for='intro_path_type']");
    By selectImage = By.cssSelector("#introPathSelectOptions ul li .Image");


    By nameEN = By.id("name");
    By nameAR = By.id("name_ar");
    By intro = By.id("introPathId");

    By imagee = By.id("imageId");

    By shortDescriptionENTxt = By.id("short_description");
    By shortDescriptionARTxt = By.id("short_description_ar");
    By longDescriptionENTxt = By.id("long_description");
    By longDescriptionARTxt = By.id("long_description_ar");

    By trackingSystemList = By.id("tracking_id");
    By selectTracking = By.cssSelector("#trackingSelectOptions ul li .Automation.Tracking");

    By startDate = By.cssSelector("[for='start_date_picker']");
    By currentActiveDate = By.cssSelector(".dropdown-menu.show span.btn-outline-primary");


    By status = By.cssSelector("[for='status']");
    By selectPublish = By.cssSelector("#statusSelectOptions ul li .Published");

    By seoNameENTxt = By.id("seo_name_en");
    By seoNameARTxt = By.id("seo_name_ar");
    By seoDesEN = By.id("seo_description_en");
    By seoDesAR = By.id("seo_description_ar");
    By seoImage = By.cssSelector("[for='image_seo']");

    By video = By.xpath("(//label[@class = 'custom-file-label'])[2]");

    By quizList = By.id("quiz");
    By repetitionList = By.cssSelector("[for='repetition']");
    By selectRepetition = By.cssSelector("#repetitionSelectOptions ul li .Daily");
    By attachment = By.xpath("(//label[@class = 'custom-file-label'])[3]");
    By submitBtn = By.xpath("//button[@type = 'submit']");
    By loader = By.cssSelector("[role='status']");


    public void addInitiative( String requiredNameEN, String requiredNameAR,
                              String requiredShortDesEN, String requiredShortDesAR,
                              String requiredLongDesEN, String requiredLongDesAR,
                              String requiredSEONameEN, String requiredSEONameAR,
                              String requiredSEONDescEN, String requiredSEONDescAR) throws InterruptedException, AWTException {
        waitElementToBeVisible(addInitiativeBtn);
        Click(addInitiativeBtn);
        waitElementToBeUnVisible(loader);
        waitElementToBeVisible(introPath);
        Click(introPath);
        waitElementToBeVisible(selectImage);
        Click(selectImage);
        waitElementToBeVisible(intro);
        Click(intro);
        Thread.sleep(2000);
        uploadFile("D:\\Photos\\ISTQB.png");
        waitElementToBeVisible(nameEN);
        writeOnText(nameEN, requiredNameEN);

        waitElementToBeVisible(nameAR);
        writeOnText(nameAR, requiredNameAR);
        waitElementToBeVisible(imagee);
        Click(imagee);
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

        waitElementToBeVisible(trackingSystemList);
        Click(trackingSystemList);
        waitElementToBeVisible(selectTracking);
        Click(selectTracking);

        waitElementToBeVisible(startDate);
        Click(startDate);

        waitElementToBeVisible(currentActiveDate);
        Click(currentActiveDate);

        waitElementToBeVisible(status);
        Click(status);
        waitElementToBeVisible(selectPublish);
        Click(selectPublish);
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

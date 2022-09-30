package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class Activity_Page extends PageBase {
    public Activity_Page(WebDriver driver) {
        super(driver);
    }

    By addActivityBtn = By.xpath("//span[contains(text() , 'Add Activity')]");
    By trackingSystemList = By.id("tracking_id");
    By selectTracking = By.cssSelector("#trackingSelectOptions ul li .track.en");

    By nameEN = By.id("name");
    By nameAR = By.id("name_ar");
    By intro = By.id("introId");

    By shortDescriptionENTxt = By.id("short_description");
    By shortDescriptionARTxt = By.id("short_description_ar");
    By longDescriptionENTxt = By.id("long_description");
    By longDescriptionARTxt = By.id("long_description_ar");
    By video = By.xpath("(//label[@class = 'custom-file-label'])[2]");

    By quizList = By.id("quiz");
    By repetitionList = By.cssSelector("[for='repetition']");
    By selectRepetition = By.cssSelector("#repetitionSelectOptions ul li .Daily");
    By attachment = By.xpath("(//label[@class = 'custom-file-label'])[3]");
    By seoImage = By.id("image_seo");
    By submitBtn = By.xpath("//button[@type = 'submit']");
  //  By loader = By.id("loading-spinner");
    By loader = By.cssSelector("[role='status']");



    public void createActivityWithValidData(String requiredNameEN, String requiredNameAR,
                                            String requiredShortDesEN, String requiredShortDesAR,
                                            String requiredLongDesEN, String requiredLongDesAR) throws InterruptedException, AWTException {
        waitElementToBeVisible(addActivityBtn);
        Click(addActivityBtn);
        waitElementToBeUnVisible(loader);
        waitElementToBeVisible(trackingSystemList);
        Click(trackingSystemList);
        //   waitElementToBeUnVisible(loader);
        waitElementToBeVisible(selectTracking);
        Click(selectTracking);

        waitElementToBeVisible(nameEN);
        writeOnText(nameEN, requiredNameEN);
        waitElementToBeVisible(nameAR);
        writeOnText(nameAR, requiredNameAR);
        //   waitElementToBeUnVisible(loader);
        waitElementToBeVisible(intro);
          Click(intro);
          Thread.sleep(2000);
        uploadFile("D:\\Courses\\Appium\\Explicit Wait.mp4");
        waitElementToBeVisible(shortDescriptionENTxt);
        writeOnText(shortDescriptionENTxt, requiredShortDesEN);
        waitElementToBeVisible(shortDescriptionARTxt);
        writeOnText(shortDescriptionARTxt, requiredShortDesAR);
        waitElementToBeVisible(longDescriptionENTxt);
        writeOnText(longDescriptionENTxt, requiredLongDesEN);
        waitElementToBeVisible(longDescriptionARTxt);
        writeOnText(longDescriptionARTxt, requiredLongDesAR);
        scrollToElement(video);
        waitElementToBeVisible(video);
        Click(video);
        uploadFile("D:\\Courses\\Appium\\Explicit Wait.mp4");
        //      waitElementToBeVisible(quizList);
        //     waitElementToBeVisible(repetitionList);
        waitElementToBeVisible(repetitionList);
        Click(repetitionList);
        waitElementToBeVisible(selectRepetition);
        Click(selectRepetition);

        waitElementToBeVisible(attachment);
        Click(attachment);
        uploadFile("C:\\Users\\Basma\\Desktop\\Sample-Test-Summary-Report-by-SoftwareTestingHelp.pdf");
        waitElementToBeVisible(submitBtn);
        Click(submitBtn);

    }



}

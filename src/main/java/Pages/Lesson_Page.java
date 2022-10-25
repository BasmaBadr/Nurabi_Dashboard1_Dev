package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class Lesson_Page extends PageBase{
    public Lesson_Page(WebDriver driver) {
        super(driver);
    }

    By addLessonBTN = By.xpath("//span[contains(text() , 'Add Lesson')]");

    By contentType = By.cssSelector("[for='contentType']");
    By selectPDF = By.cssSelector("#contentTypeSelectOptions ul li .PDF");

    By chooseTimeTXT = By.id("example-input");
    By consultant = By.id("consultantSelectOptions");
    By selectConsultant = By.cssSelector("#consultantSelectOptions ul li .Qqqq");
    By sessionDuration = By.id("session_duration");


    By file = By.cssSelector("[for='file']");

    public void addLesson(boolean live , String requiredTitleEN, String requiredTitleAR, String requiredSEONameEN, String requiredSEONameAR
            , String requiredSEONDescEN , String requiredSEONDescAR) throws InterruptedException, AWTException {
        waitElementToBeVisible(addLessonBTN);
        Click(addLessonBTN);
        waitElementToBeVisible(titleEN);
        writeOnText(titleEN, requiredTitleEN);
        waitElementToBeVisible(titleAR);
        writeOnText(titleAR, requiredTitleAR);
        waitElementToBeUnVisible(loader);
        waitElementToBeVisible(course);
        Click(course);
        if (live){
            waitElementToBeVisible(selectLiveCourse);
            Click(selectLiveCourse);
            waitElementToBeVisible(section);
            Click(section);
            waitElementToBeVisible(selectLiveSection);
            Click(selectLiveSection);
            waitElementToBeVisible(chooseTimeTXT);
            writeOnText(chooseTimeTXT , "23:00:00");
            waitElementToBeVisible(consultant);
            Click(consultant);
            waitElementToBeVisible(selectConsultant);
            Click(selectConsultant);
            waitElementToBeVisible(sessionDuration);
            writeOnText(sessionDuration , "5");

        }
        else {
            waitElementToBeVisible(selectOnlineCourse);
            Click(selectOnlineCourse);
            waitElementToBeVisible(section);
            Click(section);
            waitElementToBeVisible(selectOnlineSection);
            Click(selectOnlineSection);
           // waitElementToBeVisible();
            waitElementToBeVisible(contentType);
            Click(contentType);
            waitElementToBeVisible(selectPDF);
            Click(selectPDF);
            waitElementToBeVisible(file);
            Click(file);
            Thread.sleep(2000);
            uploadFile("D:\\Photos\\Sample.pdf");
        }

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

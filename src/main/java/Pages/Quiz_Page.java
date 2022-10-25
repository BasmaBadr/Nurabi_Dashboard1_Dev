package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class Quiz_Page extends PageBase {
    public Quiz_Page(WebDriver driver) {
        super(driver);
    }

    By addQuizBTN = By.xpath("//span[contains(text() , 'Add Quiz')]");

    By passingPercentageTXT = By.id("passing_precentage");

    By q1EN = By.id("item-name");
    By q1AR = By.id("item-name-ar");
    By answer1EN = By.id("answer00");
    By answer1AR = By.id("answer00 AR");
    By isCorrectCheck1 = By.cssSelector("[for='00']");
    By addAnswerBTN = By.xpath("//span[contains(text() , 'Add Answer')]");
    By answer2EN = By.id("answer11");
    By answer2AR = By.id("answer11 AR");


    public void addNewQuiz(boolean live, String requiredTitleEN, String requiredTitleAR, String requiredSEONameEN
            , String requiredSEONameAR, String requiredSEONDescEN, String requiredSEONDescAR
            , String Q1EN, String Q1AR, String Answer1EN, String Answer1AR, String Answer2EN, String Answer2AR) throws InterruptedException, AWTException {
        waitElementToBeVisible(addQuizBTN);
        Click(addQuizBTN);
        waitElementToBeUnVisible(loader);
        waitElementToBeVisible(titleEN);
        writeOnText(titleEN, requiredTitleEN);
        waitElementToBeVisible(titleAR);
        writeOnText(titleAR, requiredTitleAR);
        waitElementToBeUnVisible(loader);
        waitElementToBeVisible(course);
        Click(course);
        if (live) {
            waitElementToBeVisible(selectLiveCourse);
            Click(selectLiveCourse);
            Click(section);
            waitElementToBeVisible(selectLiveSection);
            Click(selectLiveSection);
        } else {
            waitElementToBeVisible(selectOnlineCourse);
            Click(selectOnlineCourse);
            waitElementToBeVisible(section);
            Click(section);
            waitElementToBeVisible(selectOnlineSection);
            Click(selectOnlineSection);
        }
        waitElementToBeVisible(passingPercentageTXT);
        writeOnText(passingPercentageTXT, "80");
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
        waitElementToBeVisible(q1EN);
        writeOnText(q1EN, Q1EN);
        waitElementToBeVisible(q1AR);
        writeOnText(q1AR, Q1AR);
        waitElementToBeVisible(answer1EN);
        writeOnText(answer1EN, Answer1EN);
        waitElementToBeVisible(answer1AR);
        writeOnText(answer1AR, Answer1AR);
        waitElementToBeVisible(isCorrectCheck1);
        Click(isCorrectCheck1);
        waitElementToBeVisible(addAnswerBTN);
        Click(addAnswerBTN);
        waitElementToBeVisible(answer2EN);
        writeOnText(answer2EN, Answer2EN);
        waitElementToBeVisible(answer2AR);
        writeOnText(answer2AR, Answer2AR);
        waitElementToBeVisible(submitBtn);
        Click(submitBtn);

    }
}

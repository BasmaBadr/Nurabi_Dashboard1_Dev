package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticalTask_Page extends PageBase{
    public PracticalTask_Page(WebDriver driver) {
        super(driver);
    }

    By addPracticalTaskBTN = By.xpath("//span[contains(text() , 'Add Practical Task')]");
    By questionEN = By.id("question_en");
    By questionAR = By.id("question_ar");



    public void addPracticalTask(boolean live , String QuestEN , String QuestAR)
    {
        waitElementToBeVisible(addPracticalTaskBTN);
        Click(addPracticalTaskBTN);
        waitElementToBeVisible(questionEN);
        writeOnText(questionEN , QuestEN);
        waitElementToBeVisible(questionAR);
        writeOnText(questionAR , QuestAR);
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
        waitElementToBeVisible(submitBtn);
        Click(submitBtn);
    }
}

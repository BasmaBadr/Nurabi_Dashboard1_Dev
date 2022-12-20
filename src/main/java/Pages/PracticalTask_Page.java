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



    public void clickAddBtn()
    {
        Click(addPracticalTaskBTN);

    }
    public void addPracticalTask(boolean live , String QuestEN , String QuestAR)
    {
        writeOnText(questionEN , QuestEN);
        writeOnText(questionAR , QuestAR);
        waitElementToBeUnVisible(loader);
        Click(course);
        if (live) {
            Click(selectLiveCourse);
            Click(section);
            Click(selectLiveSection);
        } else {
            Click(selectOnlineCourse);
            Click(section);
            Click(selectOnlineSection);
        }
        Click(submitBtn);
    }

    public void editPracticalTask(boolean live , String QuestEN , String QuestAR, String QuestENEdit,
                                  String QuestAREdit)
    {
        addPracticalTask(live , QuestEN , QuestAR);
        openEditScreen();
        writeOnText(questionEN , QuestENEdit);
        writeOnText(questionAR , QuestAREdit);
        waitElementToBeUnVisible(loader);

        writeOnText(questionEN , QuestENEdit);
        writeOnText(questionAR , QuestAREdit);
        Click(submitBtn);
    }
}

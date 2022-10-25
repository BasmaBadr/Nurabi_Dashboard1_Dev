package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class BankQuestion_Page extends PageBase{
    public BankQuestion_Page(WebDriver driver) {
        super(driver);
    }

    By addQuestionBTN = By.xpath("//span[contains(text() , 'Add Question')]");

    By QNEN = By.id("question");
    By QNAR = By.id("question_ar");
    By ANEN = By.id("answer");
    By ANAR = By.id("answer_ar");





    public void addQuestionFromAdmin(String QNENN , String QNARR , String ANENN , String ANARR
    ,String requiredSEONameEN , String requiredSEONameAR , String requiredSEONDescEN, String requiredSEONDescAR) throws InterruptedException, AWTException {
        waitElementToBeVisible(addQuestionBTN);
        Click(addQuestionBTN);

        waitElementToBeVisible(QNEN);
        writeOnText(QNEN, QNENN);
        waitElementToBeVisible(QNAR);
        writeOnText(QNAR, QNARR);
        waitElementToBeVisible(ANEN);
        writeOnText(ANEN, ANENN);
        waitElementToBeVisible(ANAR);
        writeOnText(ANAR, ANARR);


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

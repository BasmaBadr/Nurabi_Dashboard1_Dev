package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class Survey_Page extends PageBase {
    public Survey_Page(WebDriver driver) {
        super(driver);
    }

    By addSurveyBTN = By.xpath("//span[contains(text() , 'Add Survey')]");

    By titleEN = By.id("title_en");
    By titleAR = By.id("title_ar");

    By QEN1 = By.id("question-1-en");
    By QAR1 = By.id("question-1-ar");

    By QEN2 = By.id("question-2-en");
    By QAR2 = By.id("question-2-ar");

    By addNewQuestionBTN = By.xpath("//span[contains(text() , 'Add New Question')]");


    public void addSurvey(String NameEN, String NameAR, String requiredSEONameEN, String requiredSEONameAR
            , String requiredSEONDescEN, String requiredSEONDescAR, String QNEN1, String QNAR1,
    String QENN2 , String QEARR2) throws InterruptedException, AWTException {
        waitElementToBeVisible(addSurveyBTN);
        Click(addSurveyBTN);
        waitElementToBeVisible(titleEN);
        writeOnText(titleEN, NameEN);
        waitElementToBeVisible(titleAR);
        writeOnText(titleAR, NameAR);

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

        waitElementToBeVisible(QEN1);
        writeOnText(QEN1, QNEN1);

        waitElementToBeVisible(QAR1);
        writeOnText(QAR1, QNAR1);

        waitElementToBeVisible(addNewQuestionBTN);
        Click(addNewQuestionBTN);

        waitElementToBeVisible(QEN2);
        writeOnText(QEN2, QENN2);

        waitElementToBeVisible(QAR2);
        writeOnText(QAR2, QEARR2);

        waitElementToBeVisible(submitBtn);
        Click(submitBtn);
    }

}

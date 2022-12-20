package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class BankQuestion_Page extends PageBase {
    public BankQuestion_Page(WebDriver driver) {
        super(driver);
    }

    By addQuestionBTN = By.xpath("//span[contains(text() , 'Add Question')]");

    By QNEN = By.id("question");
    By QNAR = By.id("question_ar");
    By ANEN = By.id("answer");
    By ANAR = By.id("answer_ar");


    By status = By.id("Status");

    public void clickAddBrn()
    {
        Click(addQuestionBTN);

    }

    public void addQuestionFromAdmin(String QNENN, String QNARR, String ANENN, String ANARR,boolean published
            , String requiredSEONameEN, String requiredSEONameAR, String requiredSEONDescEN, String requiredSEONDescAR) throws InterruptedException, AWTException {

        writeOnText(QNEN, QNENN);
        writeOnText(QNAR, QNARR);
        writeOnText(ANEN, ANENN);
        writeOnText(ANAR, ANARR);
        if (published){
            Click(status);
            Click(selectPublished);

        }
        else {
            Click(status);
            Click(selectUnPublished);

        }

        writeOnText(seoNameENTxt, requiredSEONameEN);
        writeOnText(seoNameARTxt, requiredSEONameAR);
        writeOnText(seoDesEN, requiredSEONDescEN);
        writeOnText(seoDesAR, requiredSEONDescAR);
        Click(seoImage);
        Thread.sleep(2000);
        uploadFile("ISTQB.png");
        Click(submitBtn);
    }

    public void editQuestionFromAdmin(String QNENN, String QNARR, String ANENN, String ANARR,boolean published
            , String requiredSEONameEN, String requiredSEONameAR, String requiredSEONDescEN, String requiredSEONDescAR
            , String QNENNEdit, String QNARREdit, String ANENNEdit, String ANARREdit,boolean Unpublished) throws InterruptedException, AWTException {
        addQuestionFromAdmin( QNENN,  QNARR,  ANENN,  ANARR,true
                ,  requiredSEONameEN,  requiredSEONameAR,  requiredSEONDescEN,  requiredSEONDescAR);
        openEditScreen();
        waitElementToBeUnVisible(loader);
        writeOnText(seoNameENTxt, requiredSEONameEN);
        waitElementToBeUnVisible(loader);
        writeOnText(seoNameARTxt, requiredSEONameAR);
        writeOnText(seoDesEN, requiredSEONDescEN);
        writeOnText(seoDesAR, requiredSEONDescAR);


        writeOnText(QNEN, QNENNEdit);
        writeOnText(QNAR, QNARREdit);
        writeOnText(ANEN, ANENNEdit);
        writeOnText(ANAR, ANARREdit);
        if (Unpublished){
            Click(status);
            Click(selectUnPublished);
        }
        writeOnText(seoNameENTxt, requiredSEONameEN);
        writeOnText(seoNameARTxt, requiredSEONameAR);
        writeOnText(seoDesEN, requiredSEONDescEN);
        writeOnText(seoDesAR, requiredSEONDescAR);

        Click(seoImage);
        Thread.sleep(2000);
        uploadFile("ISTQB.png");
        Click(submitBtn);

    }
}

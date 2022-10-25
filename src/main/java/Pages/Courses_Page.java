package Pages;

import org.openqa.selenium.WebDriver;

import java.awt.*;

public class Courses_Page extends PageBase {
    public Courses_Page(WebDriver driver) {
        super(driver);
    }

    public void createCourse(boolean Live ,boolean Published ,boolean Free ,String requiredTitleEN, String requiredTitleAR, String requiredSlug, String requiredPrice,
                             String requiredDesEN, String requiredDesAR, String requiredSEONameEN, String requiredSEONameAR,
                             String requiredSEONDescEN, String requiredSEONDescAR
    ) throws InterruptedException, AWTException {
        waitElementToBeVisible(addCourse);
        Click(addCourse);
        waitElementToBeVisible(titleEN);
        writeOnText(titleEN, requiredTitleEN);
        waitElementToBeVisible(titleAR);
        writeOnText(titleAR, requiredTitleAR);

        waitElementToBeVisible(category);
        Click(category);
        waitElementToBeVisible(selectCategory);
        Click(selectCategory);

        if (Live) {
            waitElementToBeVisible(type);
            Click(type);
            waitElementToBeVisible(selectLiveType);
            Click(selectLiveType);
        }

        waitElementToBeVisible(image);
        Click(image);
        Thread.sleep(2000);
        uploadFile("D:\\Photos\\ISTQB.png");
        waitElementToBeVisible(thumbnailImage);
        Click(thumbnailImage);
        Thread.sleep(2000);
        uploadFile("D:\\Photos\\ISTQB.png");
/*
        waitElementToBeVisible(previewImage);
        Click(previewImage);
        Thread.sleep(2000);
        uploadFile("D:\\Photos\\Robin - 21723.mp4");
*/
        waitElementToBeVisible(slug);
        writeOnText(slug, requiredSlug);

        waitElementToBeVisible(level);
        Click(level);
        waitElementToBeVisible(selectLevel);
        Click(selectLevel);
        if(!Published) {
            waitElementToBeVisible(status);
            Click(status);
            waitElementToBeVisible(selectDrafted);
            Click(selectDrafted);
        }
        waitElementToBeVisible(language);
        Click(language);
        waitElementToBeVisible(selectLanguage);
        Click(selectLanguage);
        waitElementToBeVisible(survey);
        Click(survey);
        waitElementToBeVisible(selectSurvey);
        Click(selectSurvey);
        if (Free) {
            waitElementToBeVisible(paid);
            Click(paid);
            waitElementToBeVisible(selectFree);
            Click(selectFree);
        }
        else{
            waitElementToBeVisible(paid);
            Click(paid);
            waitElementToBeVisible(price);
            writeOnText(price, requiredPrice);
            waitElementToBeVisible(currency);
            Click(currency);
            waitElementToBeVisible(selectCurrency);
            Click(selectCurrency);
        }

        waitElementToBeVisible(certificate);
        Click(certificate);
        waitElementToBeVisible(selectCertificate);
        Click(selectCertificate);
        waitElementToBeVisible(descEN);
        writeOnText(descEN, requiredDesEN);
        waitElementToBeVisible(descAR);
        writeOnText(descAR, requiredDesAR);
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

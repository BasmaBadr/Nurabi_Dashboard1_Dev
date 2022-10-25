package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class Sections_Page extends PageBase {
    public Sections_Page(WebDriver driver) {
        super(driver);
    }

    By addSectionBTN = By.xpath("//span[contains(text() ,'Add Section')]");

    By course = By.id("courseSelectOptions");
    By selectOnlineCourse = By.cssSelector("#courseSelectOptions ul li .AutoOnlineCourse");

    By selectLiveCourse = By.cssSelector("#courseSelectOptions ul li .AutoLiveCourse");




    public void addSection(boolean live ,String requiredTitleEN, String requiredTitleAR,String requiredSEONameEN, String requiredSEONameAR
    ,String requiredSEONDescEN , String requiredSEONDescAR) throws InterruptedException, AWTException {
        waitElementToBeVisible(addSectionBTN);
        Click(addSectionBTN);
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
        }
        else {
            waitElementToBeVisible(selectOnlineCourse);
            Click(selectOnlineCourse);
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

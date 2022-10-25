package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class Certificate_Page extends PageBase {
    public Certificate_Page(WebDriver driver) {
        super(driver);
    }

    By addCertificateBTN = By.xpath("//span[contains(text() , 'Add Certificate')]");

    By submitBtn = By.xpath("//button[contains(text() , ' Submit ')]");


    public void addCertificate(String NameEN , String requiredSEONameEN , String requiredSEONameAR
    ,String requiredSEONDescEN , String requiredSEONDescAR) throws InterruptedException, AWTException {
        waitElementToBeVisible(addCertificateBTN);
        Click(addCertificateBTN);
        waitElementToBeVisible(image);
        Click(image);
        Thread.sleep(2000);
        uploadFile("D:\\Photos\\ISTQB.png");
        waitElementToBeVisible(nameENTxt);
        writeOnText(nameENTxt , NameEN);


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

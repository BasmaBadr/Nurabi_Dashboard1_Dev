package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fields_Consultations_Page extends PageBase {
    public Fields_Consultations_Page(WebDriver driver) {
        super(driver);
    }

    By addFiledBTN = By.xpath("//span[contains(text() , 'Add Field')]");


    public void addConsultantField(String TitleEN , String TitleAR)
    {
        waitElementToBeVisible(addFiledBTN);
        Click(addFiledBTN);
        waitElementToBeVisible(titleEN);
        writeOnText(titleEN , TitleEN);
        waitElementToBeVisible(titleAR);
        writeOnText(titleAR , TitleAR);
        waitElementToBeVisible(submitBtn);
        Click(submitBtn);
    }
}

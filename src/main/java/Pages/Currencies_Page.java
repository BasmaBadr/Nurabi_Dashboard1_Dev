package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Currencies_Page extends PageBase{
    public Currencies_Page(WebDriver driver) {
        super(driver);
    }

    By addCurrencyBTN = By.xpath("//span[contains(text() , 'Add Currency')]");

    By codeTXT = By.id("code");
    By symbolTXT = By.id("symbol");




    public void addCurrency(String Name ,String code , String symbol)
    {
        waitElementToBeVisible(addCurrencyBTN);
        Click(addCurrencyBTN);
        waitElementToBeVisible(nameENTxt);
        writeOnText(nameENTxt , Name);
        waitElementToBeVisible(codeTXT);
        writeOnText(codeTXT , code);
        waitElementToBeVisible(symbolTXT);
        writeOnText(symbolTXT , symbol);
        waitElementToBeVisible(submitBtn);
        Click(submitBtn);
    }
}

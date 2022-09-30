package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonMethods_Page extends PageBase {
    public CommonMethods_Page(WebDriver driver) {
        super(driver);
    }

    By searchTxt = By.cssSelector("input.d-inline-block.mr-1.form-control");
    By optionList = By.xpath("(//button[@class = 'btn dropdown-toggle btn-link dropdown-toggle-no-caret'])[1]");

    By details = By.cssSelector(".b-dropdown.show ul li:nth-child(1) span");
    By edit = By.cssSelector(".b-dropdown.show ul li:nth-child(2) span");
    By delete = By.cssSelector(".b-dropdown.show ul li:nth-child(3) span");

    By confirmDelete = By.cssSelector(".modal-footer .btn-primary");
    By rejectDelete = By.cssSelector(".modal-footer .btn-outline-secondary");


    public void clickOptions() {
        waitElementToBeVisible(optionList);
        Click(optionList);
    }

    public void openDetailsScreen() {
        clickOptions();
        waitElementToBeVisible(details);
        Click(details);
    }

    public void openEditScreen() {
        Click(optionList);
        waitElementToBeVisible(edit);
        Click(edit);
    }

    public void delete() {
        clickOptions();
        waitElementToBeVisible(delete);
        Click(delete);
        waitElementToBeVisible(confirmDelete);
        Click(confirmDelete);
    }

    public boolean assertValidationMessage(String fullValidationMessage) {

        try {
            waitElementToBeVisible(By.xpath("//*[contains(text() ,'" + fullValidationMessage + "')]"));
            return checkIfElementIsDisplayed(By.xpath("//*[contains(text() ,'" + fullValidationMessage + "')]"));
        } catch (Exception e) {
            System.err.println("The error is ==>  " + e.getMessage());
            return false;
        }
    }

    public void search(String requiredValue) throws AWTException, InterruptedException {
        waitElementToBeVisible(optionList);
        waitElementToBeVisible(searchTxt);
        writeOnText(searchTxt, requiredValue);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);

    }

    public void waitTillPageIsLoaded() {
        //    new WebDriverWait(currentDriver, 20).until(
        //        webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));

        WebDriverWait wait = new WebDriverWait(currentDriver, 20);
        wait.until(d -> ((JavascriptExecutor) d).executeScript("return (document.readyState === 'complete' || document.readyState === 'interactive')"));
    }

    public String table() {
        waitElementToBeVisible(optionList);
        WebElement table = currentDriver.findElement(By.cssSelector("[role = 'table']"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        System.out.println("size is " +rows.size());
        int size= rows.size();
        String  firstRow = rows.get(1).getText();
        System.out.println("first row name is " + firstRow);

        return firstRow;

    }
}



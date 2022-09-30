package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PageBase {
    protected WebDriver currentDriver;
  public JavascriptExecutor jse;
    List<WebElement> allChildNodes;
    List<String> allvalues;

    WebElement element ;
    WebDriverWait wait ;





    Actions action;

    public PageBase(WebDriver driver) {
        this.currentDriver = driver;

    }

    public void Click(By locator) {
        try {
            currentDriver.findElement(locator).click();
        } catch (Exception e) {
            jse = (JavascriptExecutor) currentDriver;
            jse.executeScript("arguments[0].click();", currentDriver.findElement(locator));
        }
    }

    public void writeOnText(By element, String text) {

        try {
            currentDriver.findElement(element).sendKeys(text);
        } catch (NoSuchElementException e) {
            System.out.println("Cannot find element, check you locators");
        }

    }

    public boolean checkIfElementIsDisplayed(By element) {
        return currentDriver.findElement(element).isDisplayed();
    }

    public String getText(By element) {

        return currentDriver.findElement(element).getText();
    }

    public void selectFromDDLWithoutOptionTags(By parentList, String requiredValue) {

        // allElements = parentList.findElements(By.xpath("//*[contains(@" +
        // attributeName + ",'" + idKey + "')]"));

        allChildNodes = currentDriver.findElement(parentList).findElements(By.cssSelector("*"));
        for (WebElement element : allChildNodes) {
            System.out.println("value is ==>  " + element.getText());
            if (element.getText().contains(requiredValue)) {
                element.click();
                break;
            }
        }
    }


    public boolean checkIfElementExistInTheList(By parentList, String childTagName, String requiredValue) {
        allChildNodes = currentDriver.findElement(parentList).findElements(By.cssSelector("*"));
        allvalues = new ArrayList<String>();

        System.out.println("number of tags is ==> " + allChildNodes.size());
        for (WebElement element : allChildNodes) {

            System.out.println("element content is ==> " + element.getTagName());

            if (element.getText() != null && !element.getText().isEmpty()) {
                System.out.println(element.getText());

                allvalues.add(element.getText());
            }
        }
        return allvalues.contains(requiredValue);
    }

    //Basma
    public void scrollToElement(By locator) {
        jse = (JavascriptExecutor) currentDriver;

        jse.executeScript("arguments[0].scrollIntoView(true);", currentDriver.findElement(locator));

    }

    public void clear(By locator) {
        try {
            currentDriver.findElement(locator).clear();
        } catch (Exception e) {
            jse = (JavascriptExecutor) currentDriver;
            jse.executeScript("arguments[0].clear();", currentDriver.findElement(locator));
        }
    }

    //    public void waitElement(By locator)
//    {
//        WebDriverWait wait = new WebDriverWait(currentDriver, 20);
//        wait.until(ExpectedConditions.visibilityOf(locator));
//    }
//       public void waitElementToBeVisible(WebDriver currentDriver, By locator, int timeOutInSeconds) {
//        element = currentDriver.findElement(locator);
//        wait.until(ExpectedConditions.visibilityOf(element));
//    }

//    public boolean waitElementToBeVisible(By locator) {
//        element = currentDriver.findElement(locator);
//        element = wait.until(ExpectedConditions.visibilityOf(element));
//
//        if (element != null)
//            return true;
//        else
//            return false;
//    }
/*
    public boolean waitElementToBeClickable(By locator) {
        wait = new WebDriverWait(currentDriver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(element));

        element = currentDriver.findElement(locator);
        if (element != null) {
            return true;
        }
        else
            {
                return false;
            }
        }
        */
        public void waitElementToBeVisible(By locator){
            new WebDriverWait(currentDriver,120).until(ExpectedConditions.visibilityOfElementLocated(locator));
        }

    public void waitElementToBeUnVisible(By locator){
        new WebDriverWait(currentDriver,120).until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public void selectByVisibleTXT(By locator , String requiredText)
    {
        Select selectOption = new Select(currentDriver.findElement(locator));
        selectOption.selectByVisibleText(requiredText);
    }
    public static void clickOn(WebDriver currentDriver, WebElement locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(currentDriver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        locator.click();
    }
    public void implicitYWait()
    {
        currentDriver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
    }
    public void uploadFile(String path) throws AWTException, InterruptedException {

        Robot robot = new Robot();
        StringSelection selection= new StringSelection( path );
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection , null);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
    }



    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //

}

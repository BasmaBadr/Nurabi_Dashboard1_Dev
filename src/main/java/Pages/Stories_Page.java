package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Stories_Page extends PageBase{
    public Stories_Page(WebDriver driver) {
        super(driver);
    }

    By addStoryBtn = By.xpath("//span[contains(text() , 'Add Story')]");
    By text = By.id("content");
    By typeOption = By.id("typeSelectOptions");
    By textOption = By.cssSelector("#typeSelectOptions ul li .Text");
    By imageOption = By.cssSelector("#typeSelectOptions ul li .Image");
    By videoOption = By.cssSelector("#typeSelectOptions ul li .Video");

    By delete = By.cssSelector(".b-dropdown.show ul li:nth-child(2) span");
    By confirmDelete = By.cssSelector(".modal-footer .btn-primary");



    public void clickAddButton(){
        waitElementToBeVisible(addStoryBtn);
        Click(addStoryBtn);
    }

    public void addStory(boolean textContect,boolean imageContent,String newStory)
    {
        if (textContect){
            waitElementToBeVisible(text);
            writeOnText(text, newStory);
        } else if (imageContent) {
            waitElementToBeVisible(imageOption);
        //    writeOnText(text, newStory);
        }
        else {
            waitElementToBeVisible(videoOption);
          //  writeOnText(text, newStory);
        }
        Click(submitBtn);

    }

    public void delete() throws InterruptedException {
        clickOptions();
        Click(delete);
        Thread.sleep(3000);
        waitElementToBeVisible(confirmDelete);
        Click(confirmDelete);
    }

}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SidePanel_Page extends PageBase {


    public SidePanel_Page(WebDriver driver) {
        super(driver);
        //   wait = new WebDriverWait(currentDriver , 20);

    }

    By trackingSysParent = By.xpath("(//span[contains(text() , 'Tracking System')])[1]");
    By sidePanel = By.cssSelector("div.main-menu.menu-fixed.menu-accordion.menu-shadow.expanded.menu-light");
    By trackingSysTab = By.xpath("(//span[contains(text() , 'Tracking System')])[2]");
    By listTrackingSysTab = By.xpath("//a[contains(@href,'/apps/trackingSystem/list')]");
    By addTrackingSysTab = By.id("");
    By fields = By.xpath("(//span[contains(text() , 'Fields')])[2]");
    By listFields = By.xpath("//a[contains(@href,'/apps/trackingSystem/fieldsGoals/list')]");
    By addFields = By.id("");
    By activity = By.xpath("//span[contains(text() , 'Activity')]");
    By listActivity = By.xpath("//a[contains(@href,'/apps/trackingSystem/activity/list')]");
    By addActivity = By.id("");

    By initiative = By.xpath("//span[contains(text() , 'Initiative')]");
    By listInitiative = By.xpath("//a[contains(@href,'/apps/trackingSystem/initiative/list')]");
    By addInitiative = By.xpath("//a[contains(@href,'/apps/trackingSystem/initiative/add')]");

    public void openTrackingList() throws InterruptedException {
        waitElementToBeVisible( trackingSysParent);
        Click(trackingSysParent);
        waitElementToBeVisible(trackingSysTab);
        Click(trackingSysTab);
        waitElementToBeVisible(listTrackingSysTab);
        Click(listTrackingSysTab);
    }

    public void openFieldsList()
    {
        waitElementToBeVisible(trackingSysParent);
        Click(trackingSysParent);
        scrollToElement(fields);
        waitElementToBeVisible(fields);
        Click(fields);
        scrollToElement(listFields);
        waitElementToBeVisible(listFields);
        Click(listFields);
    }

    public void openActivityList()
    {
        waitElementToBeVisible(trackingSysParent);
        Click(trackingSysParent);
        scrollToElement(activity);
        waitElementToBeVisible(activity);
        Click(activity);
        scrollToElement(listActivity);
        waitElementToBeVisible(listActivity);
        Click(listActivity);
    }

    public void openInitiativeList()
    {
        waitElementToBeVisible(initiative);
        Click(initiative);
        scrollToElement(listInitiative);
        Click(listInitiative);

    }


}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SidePanel_Page extends PageBase {


    public SidePanel_Page(WebDriver driver) {
        super(driver);
        //   wait = new WebDriverWait(currentDriver , 20);

    }

    By coursesTabParent = By.xpath("(//span[contains(text() , 'Courses')])[1]");
    By coursesTab = By.xpath("(//span[contains(text() , 'Courses')])[2]");
    By coursesList = By.xpath("//a[contains(@href,'/apps/courses/list')]");


    By sectionsTab = By.xpath("//span[contains(text() , 'Sections')]");
    By sectionsList = By.xpath("//a[contains(@href,'/apps/sections/list')]");

    By lessonTab = By.xpath("//span[contains(text() , 'Lessons')]");
    By lessonList = By.xpath("//a[contains(@href,'/apps/lessons/list')]");

    By quizTab = By.xpath("//span[contains(text() , 'Quiz')]");
    By quizList = By.xpath("//a[contains(@href,'/apps/quiz/list')]");

    By practicalTaskTab = By.xpath("(//span[contains(text() , 'Practical Tasks')])[1]");
    By practicalTaskList = By.xpath("//a[contains(@href,'/apps/practicalTasks/list')]");


    By consultationTab = By.xpath("(//span[contains(text() ,'Consultation')])[2]");

    By fieldsConsultationsTab = By.xpath("(//span[contains(text() , 'Fields')])[1]");
    By fieldsConsultationsList = By.xpath("//a[contains(@href,'/apps/fields/list')]");
    By jobTitleTab = By.xpath("//span[contains(text() ,'Job Title')]");
    By jobTitleList = By.xpath("//a[contains(@href,'/apps/jobTitle/list')]");

    By categoriesTab = By.xpath("//span[contains(text() ,'Categories')]");
    By categoriesList = By.xpath("//a[contains(@href,'/apps/categories/list')]");

    By surveyTab = By.xpath("//span[contains(text() ,'Survey')]");
    By surveyList = By.xpath("//a[contains(@href,'/apps/questionnaires/list')]");

    By bankQuestionTab = By.xpath("//span[contains(text() ,'Bank Questions')]");
    By adminTab = By.xpath("(//span[contains(text() ,'Admin')])[2]");
    By adminList = By.xpath("//a[contains(@href,'/baankQuestions/adminList')]");

    By certificatesTab = By.xpath("//span[contains(text() ,'Certificates')]");
    By certificatesList = By.xpath("//a[contains(@href,'/apps/certificates/list')]");

    By currenciesTab = By.xpath("//span[contains(text() ,'Currencies')]");
    By currenciesList = By.xpath("//a[contains(@href,'/apps/currency/list')]");



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


    public void openCoursesList() {
        waitElementToBeVisible(coursesTabParent);
        Click(coursesTabParent);
        waitElementToBeVisible(coursesTab);
        Click(coursesTab);
        waitElementToBeVisible(coursesList);
        Click(coursesList);
    }
    public void openSectionsList() {
        waitElementToBeVisible(coursesTabParent);
        Click(coursesTabParent);
        waitElementToBeVisible(sectionsTab);
        Click(sectionsTab);
        scrollToElement(sectionsList);
        Click(sectionsList);
    }

    public void openLessonList() {
        waitElementToBeVisible(coursesTabParent);
        Click(coursesTabParent);
        waitElementToBeVisible(lessonTab);
        Click(lessonTab);
        scrollToElement(lessonList);
        Click(lessonList);
    }
    public void openQuizList() {
        waitElementToBeVisible(coursesTabParent);
        Click(coursesTabParent);
        waitElementToBeVisible(quizTab);
        Click(quizTab);
        scrollToElement(quizList);
        Click(quizList);
    }

    public void openPracticalTaskList() {
        waitElementToBeVisible(coursesTabParent);
        Click(coursesTabParent);
        waitElementToBeVisible(practicalTaskTab);
        Click(practicalTaskTab);
        scrollToElement(practicalTaskList);
        Click(practicalTaskList);
    }
    public void openFieldsConsultationsList() {
        waitElementToBeVisible(consultationTab);
        Click(consultationTab);
        waitElementToBeVisible(fieldsConsultationsTab);
        Click(fieldsConsultationsTab);
        scrollToElement(fieldsConsultationsList);
        Click(fieldsConsultationsList);
    }

    public void openJobTaskList() {
        waitElementToBeVisible(consultationTab);
        Click(consultationTab);
        waitElementToBeVisible(jobTitleTab);
        Click(jobTitleTab);
        scrollToElement(jobTitleList);
        Click(jobTitleList);
    }

    public void openCategoriesList() {
        waitElementToBeVisible(categoriesTab);
        Click(categoriesTab);
        waitElementToBeVisible(categoriesList);
        Click(categoriesList);
    }

    public void openSurveyList() {
        waitElementToBeVisible(surveyTab);
        Click(surveyTab);
        waitElementToBeVisible(surveyList);
        Click(surveyList);
    }

    public void openAdminList() {
        waitElementToBeVisible(bankQuestionTab);
        Click(bankQuestionTab);
        waitElementToBeVisible(adminTab);
        Click(adminTab);
        waitElementToBeVisible(adminList);
        Click(adminList);
    }

    public void openCertificatesList() {
        waitElementToBeVisible(certificatesTab);
        Click(certificatesTab);
        waitElementToBeVisible(certificatesList);
        Click(certificatesList);

    }

    public void openCurrenciesList() {
        waitElementToBeVisible(currenciesTab);
        Click(currenciesTab);
        waitElementToBeVisible(currenciesList);
        Click(currenciesList);

    }

    public void openTrackingList() throws InterruptedException {
        waitElementToBeVisible(trackingSysParent);
        Click(trackingSysParent);
        waitElementToBeVisible(trackingSysTab);
        Click(trackingSysTab);
        waitElementToBeVisible(listTrackingSysTab);
        Click(listTrackingSysTab);
    }

    public void openFieldsList() {
        waitElementToBeVisible(trackingSysParent);
        Click(trackingSysParent);
        scrollToElement(fields);
        waitElementToBeVisible(fields);
        Click(fields);
        scrollToElement(listFields);
        waitElementToBeVisible(listFields);
        Click(listFields);
    }

    public void openActivityList() {
        waitElementToBeVisible(trackingSysParent);
        Click(trackingSysParent);
        scrollToElement(activity);
        waitElementToBeVisible(activity);
        Click(activity);
        scrollToElement(listActivity);
        waitElementToBeVisible(listActivity);
        Click(listActivity);
    }

    public void openInitiativeList() {
        waitElementToBeVisible(initiative);
        Click(initiative);
        scrollToElement(listInitiative);
        Click(listInitiative);
    }




}

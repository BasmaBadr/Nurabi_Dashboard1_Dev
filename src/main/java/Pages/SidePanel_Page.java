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

    By addCourseTabSidePanel = By.xpath("//a[contains(@href,'/apps/courses/add')]");


    By sectionsTab = By.xpath("//span[contains(text() , 'Sections')]");
    By sectionsList = By.xpath("//a[contains(@href,'/apps/sections/list')]");
    By addSectionsSidePanel = By.xpath("//a[contains(@href,'/apps/sections/add')]");

    By lessonTab = By.xpath("//span[contains(text() , 'Lessons')]");
    By lessonList = By.xpath("//a[contains(@href,'/apps/lessons/list')]");
    By addLessonSidePanel = By.xpath("//a[contains(@href,'/apps/lessons/add')]");

    By quizTab = By.xpath("//span[contains(text() , 'Quiz')]");
    By quizList = By.xpath("//a[contains(@href,'/apps/quiz/list')]");
    By addQuizSidePanel = By.xpath("//a[contains(@href,'/apps/quiz/add')]");


    By practicalTaskTab = By.xpath("(//span[contains(text() , 'Practical Tasks')])[1]");
    By practicalTaskList = By.xpath("//a[contains(@href,'/apps/practicalTasks/list')]");
    By addPracticalTaskSidePanel = By.xpath("//a[contains(@href,'/apps/practicalTasks/add')]");


    By consultationTab = By.id("consultation");
    By addConsultantTab = By.xpath("//a[contains(@href,'/apps/consultation/add')]");

    By consultantsTab = By.id("consultants");


    By fieldsConsultationsTab = By.xpath("(//span[contains(text() , 'Fields')])[1]");
    By fieldsConsultationsList = By.xpath("//a[contains(@href,'/apps/fields/list')]");
    By addFieldsConsultationsSidePanel = By.xpath("//a[contains(@href,'/apps/fields/add')]");

    By specialtyTab = By.id("specialty");
    By specialtyList = By.xpath("//a[contains(@href,'/apps/speciality/list')]");
    By addSpecialtySidePanel = By.xpath("//a[contains(@href,'/apps/speciality/add')]");




    By jobTitleTab = By.xpath("//span[contains(text() ,'Job Title')]");
    By jobTitleList = By.xpath("//a[contains(@href,'/apps/jobTitle/list')]");
    By addJobTitleSidePanel = By.xpath("//a[contains(@href,'/apps/jobTitle/add')]");

    By categoriesTab = By.xpath("//span[contains(text() ,'Categories')]");
    By categoriesList = By.xpath("//a[contains(@href,'/apps/categories/list')]");
    By addCategoriesSidePanel = By.xpath("//a[contains(@href,'/apps/categories/add')]");

    By surveyTab = By.xpath("//span[contains(text() ,'Survey')]");
    By surveyList = By.xpath("//a[contains(@href,'/apps/questionnaires/list')]");

    By addSurveySidePanel = By.xpath("//a[contains(@href,'/apps/questionnaires/add')]");


    By bankQuestionTab = By.xpath("//span[contains(text() ,'Bank Questions')]");
    By adminTab = By.xpath("(//span[contains(text() ,'Admin')])[2]");
    By adminList = By.xpath("//a[contains(@href,'/baankQuestions/adminList')]");
    By addAdminSidePanel = By.xpath("//a[contains(@href,'/apps/baankQuestions/add')]");

    By certificatesTab = By.xpath("//span[contains(text() ,'Certificates')]");
    By certificatesList = By.xpath("//a[contains(@href,'/apps/certificates/list')]");
    By addCertificatesSidePanel = By.xpath("//a[contains(@href,'/apps/certificates/add')]");

    By currenciesTab = By.xpath("//span[contains(text() ,'Currencies')]");
    By currenciesList = By.xpath("//a[contains(@href,'/apps/currency/list')]");
    By addCurrenciesSidePanel = By.xpath("//a[contains(@href,'/apps/currency/add')]");

    By sliderTab = By.xpath("//span[contains(text() ,'Sliders')]");
    By sliderList = By.xpath("//a[contains(@href,'/apps/sliders/list')]");

    By addSliderSidePanel = By.xpath("//a[contains(@href,'/apps/sliders/add')]");

    By personalityTab = By.xpath("//span[contains(text() ,'Personality Analysis')]");
    By personalityCategoryTab = By.xpath("(//span[contains(text() ,'Categories')])[2]");

    By personalityCategoryList = By.xpath("//a[contains(@href,'/personality/categories/list')]");

    By addPersonalityCategorySidePanel = By.xpath("//a[contains(@href,'/apps/personality/categories/add')]");

    By trackingSysParent = By.xpath("(//span[contains(text() , 'Tracking System')])[1]");
    By sidePanel = By.cssSelector("div.main-menu.menu-fixed.menu-accordion.menu-shadow.expanded.menu-light");
    By trackingSysTab = By.xpath("(//span[contains(text() , 'Tracking System')])[2]");
    By listTrackingSysTab = By.xpath("//a[contains(@href,'/apps/trackingSystem/list')]");
    By addTrackingSysSidePanel = By.xpath("//a[contains(@href,'/apps/trackingSystem/add')]");
    By fields = By.xpath("(//span[contains(text() , 'Fields')])[2]");
    By listFields = By.xpath("//a[contains(@href,'/apps/trackingSystem/fieldsGoals/list')]");
    By addFieldsSidePanel = By.xpath("//a[contains(@href,'/apps/trackingSystem/fieldsGoals/add')]");
    By activity = By.xpath("//span[contains(text() , 'Activity')]");
    By listActivity = By.xpath("//a[contains(@href,'/apps/trackingSystem/activity/list')]");
    By addActivitySidePanel = By.xpath("//a[contains(@href,'/apps/trackingSystem/activity/add')]");

    By initiative = By.xpath("//span[contains(text() , 'Initiative')]");
    By listInitiative = By.xpath("//a[contains(@href,'/apps/trackingSystem/initiative/list')]");
    By addInitiativeSidePanel = By.xpath("//a[contains(@href,'/apps/trackingSystem/initiative/add')]");

    By roles = By.id("roles");
    By rolesList = By.xpath("//a[contains(@href,'/apps/roles/list')]");

    By addRoleSidePanel = By.xpath("//a[contains(@href,'/apps/roles/add')]");

    By userModule = By.id("user");
    By adminUserList = By.id("admin-list");
    By userList = By.id("user-list");
    By add = By.id("add");


    public void openCoursesList() {
        waitElementToBeVisible(coursesTabParent);
        Click(coursesTabParent);
        waitElementToBeVisible(coursesTab);
        Click(coursesTab);
        waitElementToBeVisible(coursesList);
        Click(coursesList);
    }

    public void openAddCourseSidePanel() {
        Click(coursesTabParent);
        Click(coursesTab);
        Click(addCourseTabSidePanel);
    }

    public void openSectionsList() {
        Click(coursesTabParent);
        Click(sectionsTab);
        scrollToElement(sectionsList);
        Click(sectionsList);
    }

    public void openAddSectionsSidePanel() {
        Click(coursesTabParent);
        Click(sectionsTab);
        scrollToElement(addSectionsSidePanel);
        Click(addSectionsSidePanel);
    }

    public void openLessonList() {
        Click(coursesTabParent);
        Click(lessonTab);
        scrollToElement(lessonList);
        Click(lessonList);
    }

    public void openAddLessonSidePanel() {
        Click(coursesTabParent);
        Click(lessonTab);
        scrollToElement(addLessonSidePanel);
        Click(addLessonSidePanel);
    }

    public void openQuizList() {
        Click(coursesTabParent);
        Click(quizTab);
        scrollToElement(quizList);
        Click(quizList);
    }

    public void openAddQuizSidePanel() {
        Click(coursesTabParent);
        Click(quizTab);
        scrollToElement(addQuizSidePanel);
        Click(addQuizSidePanel);
    }

    public void openPracticalTaskList() {
        Click(coursesTabParent);
        Click(practicalTaskTab);
        scrollToElement(practicalTaskList);
        Click(practicalTaskList);
    }

    public void openAddPracticalTaskListSidePanel() {
        Click(coursesTabParent);
        Click(practicalTaskTab);
        scrollToElement(addPracticalTaskSidePanel);
        Click(addPracticalTaskSidePanel);
    }

    public void openFieldsConsultationsList() throws InterruptedException {
        Click(consultationTab);
        Click(fieldsConsultationsTab);
        scrollToElement(fieldsConsultationsList);
        Click(fieldsConsultationsList);
    }
    public void openAddFieldsConsultationsSidePanel() throws InterruptedException {
        Click(consultationTab);
        Click(fieldsConsultationsTab);
        scrollToElement(addFieldsConsultationsSidePanel);
        Click(addFieldsConsultationsSidePanel);
    }

    public void openSpecialityList() throws InterruptedException {
        Click(consultationTab);
        Click(specialtyTab);
        Click(specialtyList);
    }
    public void openAddSpecialitySidePanel() throws InterruptedException {
        Click(consultationTab);
        Click(specialtyTab);
        scrollToElement(addSpecialtySidePanel);
        Click(addSpecialtySidePanel);
    }

    public void openJobTaskList() {
        Click(consultationTab);
        Click(jobTitleTab);
        scrollToElement(jobTitleList);
        Click(jobTitleList);
    }

    public void openAddJobTaskSidePanel() {
        Click(consultationTab);
        Click(jobTitleTab);
        scrollToElement(addJobTitleSidePanel);
        Click(addJobTitleSidePanel);
    }

    public void openCategoriesList() {
        Click(categoriesTab);
        Click(categoriesList);
    }

    public void openAddCategoriesSidePanel() {
        Click(categoriesTab);
        Click(addCategoriesSidePanel);
    }

    public void openSurveyList() {
        Click(surveyTab);
        Click(surveyList);
    }

    public void openSAddSurveySidePanel() {
        Click(surveyTab);
        Click(addSurveySidePanel);
    }

    public void openAdminList() {
        Click(bankQuestionTab);
        Click(adminTab);
        Click(adminList);
    }

    public void openAddAdminSidePanel() {
        Click(bankQuestionTab);
        Click(adminTab);
        Click(addAdminSidePanel);
    }

    public void openCertificatesList() {
        Click(certificatesTab);
        Click(certificatesList);
    }

    public void openAddCertificatesSidePanel() {
        Click(certificatesTab);
        Click(addCertificatesSidePanel);
    }

    public void openCurrenciesList() {
        Click(currenciesTab);
        Click(currenciesList);
    }

    public void openAddCurrenciesSidePanel() {
        Click(currenciesTab);
        Click(addCurrenciesSidePanel);
    }

    public void openSlidersList() {
        waitElementToBeVisible(sliderTab);
        scrollToElement(sliderTab);
        Click(sliderTab);
        Click(sliderList);
    }

    public void OpenAddSlidersSidePanel() {
      //  Click(initiative);
        waitElementToBeVisible(sliderTab);
        scrollToElement(sliderTab);
        Click(sliderTab);
        scrollToElement(addSliderSidePanel);
        Click(addSliderSidePanel);
    }

    public void openPersonalityCategoryList() {
        Click(personalityTab);
        Click(personalityCategoryTab);
        Click(personalityCategoryList);
    }

    public void openAddPersonalityCategorySidePanel() {
        Click(personalityTab);
        Click(personalityCategoryTab);
        Click(addPersonalityCategorySidePanel);
    }

    public void openTrackingList() throws InterruptedException {
        Click(trackingSysParent);
        Click(trackingSysTab);
        Click(listTrackingSysTab);
    }

    public void openAddTrackingSidePanel() throws InterruptedException {
        Click(trackingSysParent);
        Click(trackingSysTab);
        scrollToElement(addTrackingSysSidePanel);
        Click(addTrackingSysSidePanel);
    }

    public void openFieldsList() {
        Click(trackingSysParent);
        scrollToElement(fields);
        Click(fields);
        scrollToElement(listFields);
        Click(listFields);
    }

    public void openAddFieldSidePanel() {
        Click(trackingSysParent);
        scrollToElement(fields);
        Click(fields);
        scrollToElement(addFieldsSidePanel);
        Click(addFieldsSidePanel);
    }

    public void openActivityList() {
        Click(trackingSysParent);
        scrollToElement(activity);
        Click(activity);
        scrollToElement(listActivity);
        Click(listActivity);
    }

    public void openAddActivitySidePanel() {
        Click(trackingSysParent);
        scrollToElement(activity);
        Click(activity);
        scrollToElement(addActivitySidePanel);
        Click(addActivitySidePanel);
    }

    public void openInitiativeList() {
        waitElementToBeVisible(initiative);
        Click(initiative);
        scrollToElement(listInitiative);
        Click(listInitiative);
    }

    public void openAddInitiativeSidePanel() {
        Click(initiative);
        scrollToElement(addInitiativeSidePanel);
        Click(addInitiativeSidePanel);
    }

    public void openRolesList() {
        Click(roles);
        Click(rolesList);
    }

    public void openAddRolesSidePanel() {
        Click(roles);
        Click(addRoleSidePanel);
    }


    public void openUserList() {
        Click(userModule);
        Click(userList);
    }

    public void openAdminUserList() {
        Click(userModule);
        Click(adminUserList);
    }

    public void openAddUser() {
        Click(userModule);
        Click(add);
    }

    public void openAddConsultant()
    {
        Click(consultationTab);
        Click(addConsultantTab);
    }

    public void openConsultantsTab()
    {
        Click(consultationTab);
        Click(consultantsTab);
    }
}

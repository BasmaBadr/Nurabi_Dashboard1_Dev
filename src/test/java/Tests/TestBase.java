package Tests;

import Pages.*;
;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.github.javafaker.Faker;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.store.Cur;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

public class TestBase {
    public static WebDriver driver;

    public static ExtentReports extent ;
    public static ExtentTest logger ;
    TrackingSystem_Page trackingSystem_page ;
    Login_Page loginPage ;
    SidePanel_Page sidePanel_page ;
    Fields_Page fields_page;
    Activity_Page activity_page ;
    CommonMethods_Page commonMethods_page ;

    Initiative_Page initiativePage ;
    Courses_Page coursesPage ;
    Sections_Page sectionsPage;
    Quiz_Page quizPage ;
    Lesson_Page lessonPage ;

    PracticalTask_Page practicalTaskPage ;

    JobTitle_Page jobTitlePage ;

    Fields_Consultations_Page fieldsConsultationsPage ;

    Categories_Page categoriesPage ;

    Survey_Page surveyPage ;

    BankQuestion_Page bankQuestionPage ;
    Certificate_Page certificatePage ;

    Currencies_Page currenciesPage ;



    Faker fakeData = new Faker();
    String nameEN = fakeData.name().name();
    String nameAR = fakeData.name().name();
    String slugName = fakeData.name().name();

    String seoNameEN = fakeData.name().name();
    String seoNameAR = fakeData.name().name();

    ////
    String Email = "momen@nurabi.net";
    String Password = "19821120Mm";

    String requiredNameEN = "Tracking NameEN Automation";
    String requiredNameAR = "Tracking NameAR Automation";
    String requiredShortDesEN = "Tracking ShortDesEN Automation";
    String requiredShortDesAR = "Tracking ShortDesAR Automation";
    String requiredLongDesEN = "Tracking LongDesEN Automation";
    String requiredLongDesAR = "Tracking LongDesAR Automation";
    String requiredDuration = "5";
    String requiredSEONameEN = "Tracking SEOEN Automation";
    String requiredSEONameAR = "Tracking SEOAR Automation";
    String requiredSEONDescEN = "Tracking SEODescEN Automation";
    String requiredSEONDescAR = "Tracking SEODescAR Automation";
    String imagePath = "D:\\Photos\\ISTQB.png";
    String videoPath = "D:\\Courses\\Appium\\Find Elements by Accessibility ID.mp4";
    String price = "requiredPrice";


    @BeforeMethod
    public void startDriver(Method method){
        logger = extent.startTest(method.getName());
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        driver.navigate().to("https://dashboard.dev.nurabi.net/");


    }

    @AfterMethod
    public void takeScreenShot(ITestResult result , Method method) throws IOException {
        if (ITestResult.FAILURE == result.getStatus())
        {
            logger.log(LogStatus.FAIL , result.getThrowable());
            logger.log(LogStatus.FAIL , "<a href = '" + result.getName()+ ".png" + "' > <span class='label info'>Download Snapshot</span></a>");

            System.out.println("Failed");
            // Create reference for screenshot
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source,new File("./TestReport/" + result.getName() + ".png"));
        }
        else if (ITestResult.SUCCESS == result.getStatus()) {
            logger.log(LogStatus.PASS , "Test Pass");
            logger.log(LogStatus.PASS , "<a href = '" + result.getName()+ ".png" + "' > <span class='label info'>Download Snapshot</span></a>");
            System.out.println("Passed");
            // Create reference for screenshot
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source,new File("./TestReport/" + result.getName() + ".png"));
        }
        else {
            logger.log(LogStatus.SKIP , " Test Skipped");
        }

    }
    //    @AfterSuite
//    public void stopDriver(){
//        driver.quit();
//    }
    public void defineObjects()
    {
        trackingSystem_page = new TrackingSystem_Page(driver);
        loginPage = new Login_Page(driver);
        sidePanel_page = new SidePanel_Page(driver);
        fields_page = new Fields_Page(driver);
        activity_page = new Activity_Page(driver);
        commonMethods_page = new CommonMethods_Page(driver);
        initiativePage = new Initiative_Page(driver);
        coursesPage = new Courses_Page(driver);
        sectionsPage = new Sections_Page(driver);
        quizPage = new Quiz_Page(driver);
        lessonPage = new Lesson_Page(driver);
        practicalTaskPage = new PracticalTask_Page(driver);
        jobTitlePage = new JobTitle_Page(driver);
        fieldsConsultationsPage = new Fields_Consultations_Page(driver);
        categoriesPage = new Categories_Page(driver);
        surveyPage = new Survey_Page(driver);
        bankQuestionPage = new BankQuestion_Page(driver);
        certificatePage = new Certificate_Page(driver);
        currenciesPage = new Currencies_Page(driver);
    }

    @BeforeSuite
    public void start()
    {
        extent = new ExtentReports("D:\\Automation_Projects\\STC\\Nurabi_Dashboard1\\TestReport" , true);
        extent.addSystemInfo("OS" , "Windows");
        extent.addSystemInfo("Owner" , "Basma");
    }

    @AfterSuite
    public void flush()
    {
        extent.flush();
    }

}

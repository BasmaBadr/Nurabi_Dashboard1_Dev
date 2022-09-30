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



    Faker fakeData = new Faker();
    String nameEN = fakeData.name().title();
    String nameAR = fakeData.name().title();


    @BeforeMethod
    public void startDriver(Method method){
        logger = extent.startTest(method.getName());
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        driver.navigate().to("https://dashboard.test.nurabi.net/login");


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

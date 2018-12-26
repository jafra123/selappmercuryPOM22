package tests;
//import com.mycompany.mytestng.Calc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BookAFlight;
import pages.FlightFinder;
import pages.HomaPageButton;
import pages.LoginPage;
import pages.SelectFlight;

//public class LoginTest extends BaseTest{
public class LoginTest {

    private WebDriver driver;
    // private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Test(priority =0)
    public void testHomeButton (){
        HomaPageButton homepagebutton = new HomaPageButton(driver);
        homepagebutton.CONTACT();
        homepagebutton.SIGNON();
        homepagebutton.SUPPORT();
      //  homepagebutton.SalonTravel();
         homepagebutton.REGISTER();
    }
     
        @Test(priority = 1,groups = {"smoke"})
    // @Test(groups = {"smoke"})
    /*public void testLoginPO() {
        SinginPage loginpage = new SinginPage(driver);
        loginpage.login("mercury", "mercury"); */
    public void testLoginPO() throws InterruptedException {
        LoginPage loginpage = new LoginPage(driver);
        //loginpage.login("mercury", "mercury");
        //   loginpage.SalonTravel();//
           FlightFinder flightfinder = loginpage.login("mercury", "mercury");
          assertTrue(flightfinder.getTitle().contains("Find a Flight"));
// pass values for TestEnterFlighDetail page 
    }
    @Test(priority = 2)
    //@Test(groups = {"smoke"})
    public void testFlightFinder() {
        FlightFinder flightfinder = new FlightFinder(driver);
        // flightfinder.TestFlightFinder(fromPort, fromMonth, fromDay, toPort, toMonth, toDay, airline)
        flightfinder.TestFlightFinder("London", "March", "14", "London", "February", "14", "Blue Skies Airlines");
// pass the value into this from select fight class
//driver.manage().timeouts().wait();
    }
    @Test(priority = 3)
    //@Test(groups = {"smoke"})
    public void testtestTestSelectFlight() throws InterruptedException {
        SelectFlight selectflight = new SelectFlight(driver);
        selectflight.TestSelectFlight();
        // SelectFlight selectflight = new SelectFlight(driver);
        //selectflight.TestSelectFlight();
//driver.manage().timeouts().wait();
    }
    @Test(priority = 4)
    //@Test(groups = {"smoke"})
    public void testtestBookAflight() {
        BookAFlight bookaflight = new BookAFlight(driver);
        bookaflight.testBookAflight("manmohan", "jafra", "jagmohan", "singh", "MasterCard", "222222", "man", "hahaah", "red", "22342343", "bakers drive", "lakem", "il", "60051", "usa", "wee", "we", "helo", "red", "60051", "UNITED STATES");
        /*
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains("Enroll"));
        driver.findElement(By.name("nf-field-35")).sendKeys("my school");
         assertTrue(bodyText.contains("This is a required field.")); */
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\b\\Desktop\\Download\\geckodriver-v0.19.1-win64\\geckodriver.exe"); 
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\b\\Desktop\\Download\\geckodriver.exe");
        /* System.setProperty("webdriver.chrome.driver", "c:\\qa\\drivers\\chromedriver.exe");
        driver = new ChromeDriver(); */
//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arjan\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        // baseUrl = "http://experteducationtraining.com/enroll/";
        // below code DriverUtil class call
        //driver = DriverUtils.getChromeDriver();
        //driver.get("http://newtours.demoaut.com/mercurywelcome.php");
    }

    @BeforeClass // i added these codes because i find ut tht way so that i can run all the tests
    public void setup() {
       driver = DriverUtils.getChromeDriver();
       //driver = DriverUtils.getChromeRemoteDriver();
       //driver = DriverUtils.getFirefoxRemoteDriver();
     // driver = DriverUtils.getIERemoteDriver();
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @AfterClass
    public void teardown() {
       // driver.quit();
    }
}

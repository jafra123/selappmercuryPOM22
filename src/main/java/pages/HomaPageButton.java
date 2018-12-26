package pages;

 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
 
public class HomaPageButton extends BasePage{
 
    //*********Constructor*********
    public HomaPageButton(WebDriver driver) {
        super(driver);
    }
     public String getTitle(){
        // get the title of the page 
        return driver.getTitle();
     }
  //  String baseURL = "http://newtours.demoaut.com/mercurywelcome.php";
   // public void login(String uname, String pwd) {
 //public FlightFinder login(String uname, String pwd) {
      //  driver.findElement(By.name("userName")).sendKeys(uname);
      //  driver.findElement(By.name("password")).sendKeys(pwd);
       // driver.findElement(By.name("login")).submit();
     //  return new FlightFinder(driver);

    //LoginPage
 // }

  //  public LoginPage REGISTER() {
       // driver.findElement(By.linkText("REGISTER")).click();
       // driver.navigate().back();
        // driver.findElement(By.name("password")).sendKeys(pwd);
        //  driver.findElement(By.name("login")).submit();
        //  return new FlightFinder(driver);   
       // return new LoginPage(driver);
  //  }

    public void SUPPORT() {
        driver.findElement(By.linkText("SUPPORT")).click();
        driver.navigate().back();
    }

    public void CONTACT() {
        driver.findElement(By.linkText("CONTACT")).click();
        driver.navigate().back();
    }

    public void SIGNON() {
        driver.findElement(By.linkText("SIGN-ON")).click();
        driver.navigate().back();
    }

    public void SalonTravel() {
        driver.findElement(By.linkText("Salon Travel")).click();
        driver.navigate().back();
    }
  public LoginPage REGISTER() {
        driver.findElement(By.linkText("REGISTER")).click();
        driver.navigate().back();
        // driver.findElement(By.name("password")).sendKeys(pwd);
        //  driver.findElement(By.name("login")).submit();
        //  return new FlightFinder(driver);   
        return new LoginPage(driver);
    }
}


  /*  
    
    
    //*********Web Elements*********
    By usernameBy = By.id("email");
    By passwordBy = By.id("password");
    By loginButtonBy = By.id("loginButton");
    By errorMessageUsernameBy = By.xpath("//*[@id=\"loginForm\"]/div[1]/div/div");
    By errorMessagePasswordBy = By.xpath("//*[@id=\"loginForm\"]/div[2]/div/div ");
 
    //*********Page Methods*********
 
    public LoginPage loginToN11 (String username, String password){
        //Enter Username(Email)
        writeText(usernameBy,username);
        //Enter Password
        writeText(passwordBy, password);
        //Click Login Button
        click(loginButtonBy);
        return this;
    }
 
    //Verify Username Condition
    public LoginPage verifyLoginUserName (String expectedText) {
        assertEquals(errorMessageUsernameBy, expectedText);
        return this;
    }
 
    //Verify Password Condition
    public LoginPage verifyLoginPassword (String expectedText) {
        assertEquals(errorMessagePasswordBy, expectedText);
        return this;
    }
} */
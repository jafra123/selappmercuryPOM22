
package pages;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BookAFlight extends BasePage {
    
    public BookAFlight(WebDriver d) {
        super(d);
    }
    // public void 
    public BookAFlight testBookAflight(String passFirst0,String passLast0,String passFirst1,String passLast1,String creditCard,
       String creditnumber,String cc_frst_name,String cc_mid_name, String cc_last_name, String billAddress1,String billAddress2,String  billCity,String billState, String billZip,
        String billCountry,String delAddress1, String delAddress2,String  delCity, String delState, String delZip,
        
       String delCountry ){
       
        System.out.println("Book a Flight ");
                driver.findElement(By.name("passFirst0")).sendKeys(passFirst0);
        driver.findElement(By.name("passLast0")).sendKeys(passLast0);
        driver.findElement(By.name("passFirst1")).sendKeys(passFirst1);
        driver.findElement(By.name("passLast1")).sendKeys(passLast1);
//MasterCard
        new Select(driver.findElement(By.name("creditCard"))).selectByVisibleText(creditCard);
        driver.findElement(By.name("creditnumber")).sendKeys(creditnumber);
        driver.findElement(By.name("cc_frst_name")).sendKeys(cc_frst_name);
        driver.findElement(By.name("cc_mid_name")).sendKeys(cc_mid_name);
        driver.findElement(By.name("cc_last_name")).sendKeys(cc_last_name);
        driver.findElement(By.name("billAddress1")).sendKeys(billAddress1);
        driver.findElement(By.name("billAddress2")).sendKeys(billAddress2);
        driver.findElement(By.name("billCity")).sendKeys(billCity);
        driver.findElement(By.name("billState")).sendKeys(billState);
        driver.findElement(By.name("billZip")).sendKeys(billZip);
        driver.findElement(By.name("billCountry")).sendKeys(billCountry);
        driver.findElement(By.name("delAddress1")).sendKeys(delAddress1);
        driver.findElement(By.name("delAddress2")).sendKeys(delAddress2);
        driver.findElement(By.name("delCity")).sendKeys(delCity);
        driver.findElement(By.name("delState")).sendKeys(delState);
        driver.findElement(By.name("delZip")).sendKeys(delZip);
        // driver.findElement(By.name("delCountry")).sendKeys("singh");
        //new Select(driver.findElement(By.name("delCountry"))).selectByVisibleText("UNITED STATES");
        new Select(driver.findElement(By.name("delCountry"))).selectByVisibleText(delCountry);
        //   alert.accept();
        driver.findElement(By.name("buyFlights")).click();
        // this below code i get from IDE recording                
       assertEquals("Flight Confirmation: Mercury Tours", driver.getTitle());
        
// below to click on the anchor tags 
return this;
    }
    //
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import java.util.List;
import static org.junit.Assert.fail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author b
 */
public class SelectFlight extends BasePage{

    public SelectFlight(WebDriver d) {
        super(d);
    }
   /* WebDriver driver;
    public SelectFlight(WebDriver d){
        driver =d;
    }*/
    public String getTitle(){
        // get the title of the page 
        return driver.getTitle();
    }
    //BookAFlight
    //public void TestSelectFlight() throws InterruptedException{
    public BookAFlight TestSelectFlight() throws InterruptedException{
    //public void TestSelectFlight(String outFlight,String inFlight, String reserveFlights) throws InterruptedException {
            // DEPART       outFlight
        System.out.println("clicked on depart flight Radio Button ");                 
     // driver.findElement(By.name("outFlight")).click();   // By Xpath
         //driver.findElement(By.xpath("//input[4][@name='outFlight']")).click();   // By Xpath 
        /* <WebElement> this will onloy store Spefically Web elements
        List is an interface */
        //Start list here 
        List <WebElement> radios=driver.findElements(By.name("outFlight"));
        radios.get(3).click(); // this will click on the second radio button    
      // End of List program here 
//          //RETURN
        System.out.println("Ready to click radio button Return");
       driver.findElement(By.xpath("//input[@name='inFlight']")).click();   // By Xpath 
        System.out.println("radio button Return clicked After");
        //System.out.println("radio button clicked");
        // Continue  you can use click() or submit()   same thisn 
        driver.findElement(By.name("reserveFlights")).click();
       // driver.findElement(By.name("reserveFlights")).
        System.out.println("Continue clicked to go to book flight page ");
        // these below codes just for the to make sure title is there these i record throug IDE
        for (int second = 0;; second++) {
            if (second >= 60) {
                fail("timeout");
            }
            try {
                if ("Book a Flight: Mercury Tours".equals(driver.getTitle())) {
                    break;
                }
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }
    return new BookAFlight(driver);   
}
     //return new BookAFlight(driver);   
}



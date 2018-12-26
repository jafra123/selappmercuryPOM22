/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author b
 */
public class FlightFinder extends BasePage {
    
    public FlightFinder(WebDriver driver) {
        super(driver);
    }
     public String getTitle(){
        // get the title of the page 
        return driver.getTitle();
     }
     public SelectFlight TestFlightFinder(String fromPort,String fromMonth,String fromDay, String toPort,String toMonth, String toDay,String airline) {
    //public void TestEnterFlighDetail(String fromPort,String fromMonth,String fromDay, String toPort,String toMonth, String toDay,String airline) {
        
       driver.findElement(By.xpath("//input[@name='tripType']")).click();
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
        dropdown.selectByVisibleText("2");
        // Departing From       
        new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText(fromPort);
        //fromMonth:
        new Select(driver.findElement(By.name("fromMonth"))).selectByVisibleText(fromMonth);
        //fromDay
        new Select(driver.findElement(By.name("fromDay"))).selectByVisibleText(fromDay);
        //Arriving In:
        new Select(driver.findElement(By.name("toPort"))).selectByVisibleText(toPort);
        //Returning:
        new Select(driver.findElement(By.name("toMonth"))).selectByVisibleText(toMonth);
        //Returning:
        //toDay
        new Select(driver.findElement(By.name("toDay"))).selectByVisibleText(toDay);
        //Service Class
        //servClass
        // new Select (driver.findElement(By.name("toDay"))).selectByVisibleText("14");
        // driver.findElement(By.name("servClass")).click();
        driver.findElement(By.xpath("//input[2][@name='servClass']")).click();
        // Airline 
        //:new Select(driver.findElement(By.name("airline"))).selectByVisibleText("Blue Skies Airlines");
        new Select(driver.findElement(By.name("airline"))).selectByVisibleText(airline);
               // <input name="outFlight" value="Pangea Airlines$362$274$9:17" type="radio">
        // Continue
        // driver.findElement(By.name("findFlights")).click();    // By.name
        System.out.println("before clicked to continue");
        driver.findElement(By.xpath("//input[@name='findFlights']")).click();   // By Xpath 
        System.out.println("clicked on continue");
        // DEPART       outFlight
            return new SelectFlight(driver); 
}
   
   
    
}

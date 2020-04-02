/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automationpractice.objs;

import java.util.Random;
import java.util.stream.IntStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author danie
 */
public class AccountDetailsObj {
    
    private WebDriver driver;
    
    public AccountDetailsObj(WebDriver driver){
        this.driver = driver;
    }
    
    public WebElement clickMr(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
       return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"id_gender1\"]")));
       
    }
    
    public WebElement insertFirstName(){
        return driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
    }
    public WebElement insertLastName(){
        return driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
    }
    
    public WebElement insertPassword(){
        return driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
    }
    
    public WebElement birthDay(){
       return driver.findElement(By.xpath("//*[@id=\"days\"]/option[2]"));
    }
    
      public WebElement birthMon(){
       return driver.findElement(By.xpath("//*[@id=\"months\"]/option[8]"));
    }
      
      public WebElement birthYear(){
          return driver.findElement(By.xpath("//*[@id=\"years\"]/option[32]"));     
      }
      
      public WebElement insertAdress(){
          return driver.findElement(By.xpath("//*[@id=\"address1\"]"));
      }
      
      public WebElement insertCity(){
          return driver.findElement(By.xpath("//*[@id=\"city\"]"));
      }
      
      public WebElement insertState(){
          return driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[34]"));
      }
      
      public WebElement insertZipCode(){
          return driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
      }
      
      public WebElement inserCountry(){
          return driver.findElement(By.xpath("//*[@id=\"id_country\"]/option[2]"));
      }
      public WebElement insertPhone(){
          return driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
      }
      
      public WebElement insertAssing(){
          return driver.findElement(By.xpath("//*[@id=\"alias\"]"));
      }
      
      public WebElement clickRegister(){
          return driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
      }
}

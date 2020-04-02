/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automationpractice.objs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author danie
 */
public class CheckFormObj {
    
    WebDriver driver;
    
    public CheckFormObj(WebDriver driver){
        this.driver = driver;
    }
    
    public WebElement checkNameAndLastName(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
       return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"address_delivery\"]/li[2]")));
    }
    
    public WebElement checkAddress(){
        return driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[2]"));
    }
    
    public WebElement checkCityStateZipCode(){
        return driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[4]"));
    }
    
    public WebElement checkCountry(){
        return driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[5]"));
    }
    
    public WebElement checkNumberPhone(){
        return driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[6]"));
    }
    
    
    public WebElement clickOk(){
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
    }
    
    
    
}

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
public class SeeTermsObj {
    WebDriver driver;
    
    public SeeTermsObj(WebDriver driver){
        this.driver = driver;
    }
    
    public WebElement clickTerms(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form\"]/div/p[2]/label"))); 
    }
    public WebElement clickNextPageTerms(){
        return driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
    }
    
}

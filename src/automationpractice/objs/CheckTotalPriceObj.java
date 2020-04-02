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
public class CheckTotalPriceObj {
    WebDriver driver;
    
    public CheckTotalPriceObj(WebDriver driver){
        this.driver = driver;
    }
    
    public WebElement getTotalPriceProducts(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"total_product\"]")));
    }
    
    public WebElement getTotalShipping(){
        return driver.findElement(By.xpath("//*[@id=\"total_shipping\"]"));
    }
    
    public WebElement getTotalPurchase(){
        return driver.findElement(By.xpath("//*[@id=\"total_price\"]"));
    }
    
    public WebElement payByBank(){
        return driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
    }
    
}

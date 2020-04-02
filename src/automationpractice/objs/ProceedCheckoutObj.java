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
public class ProceedCheckoutObj {

    private WebDriver driver;

    public ProceedCheckoutObj(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement clickButtonProceedCheckout() {
         WebDriverWait wait = new WebDriverWait(driver, 5);
    
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")));
    }
    
}
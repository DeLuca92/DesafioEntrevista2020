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
/**
 *
 * @author danie
 */
public class CartProceedObj {
    
    private WebDriver driver;
    
    public CartProceedObj(WebDriver driver){
         this.driver = driver;
    }
    
     public WebElement clickButtonCartProceed() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
       return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")));

      //  return driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
    }
    
}

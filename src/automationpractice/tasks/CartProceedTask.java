/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automationpractice.tasks;
import automationpractice.objs.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author danie
 */
public class CartProceedTask {
    
    private CartProceedObj cartProceed;
    
    public CartProceedTask(WebDriver driver){
        this.cartProceed = new CartProceedObj(driver);
    }
    
    
    public void clickProceedCart(){
       cartProceed.clickButtonCartProceed().click();
    }
}

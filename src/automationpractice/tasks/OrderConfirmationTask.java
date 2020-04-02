/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automationpractice.tasks;
import automationpractice.objs.*;
import org.openqa.selenium.WebDriver;
/**
 *
 * @author danie
 */
public class OrderConfirmationTask {
    OrderConfirmationObj orderObj;
    
    public OrderConfirmationTask(WebDriver driver){
        orderObj = new OrderConfirmationObj(driver);
    }
    
    public int checkIsOk(){
        String orderOk = orderObj.checkConfirmationOrder().getText();
        int i = orderOk.compareTo("Your order on My Store is complete.");
        return i;
        
        
    }
    
    
    //*[@id="cart_navigation"]/button/span
}

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
public class ProccedCheoutTask {
    private ProceedCheckoutObj proc;
    
    public ProccedCheoutTask(WebDriver driver) {
        this.proc = new ProceedCheckoutObj(driver);
    }

    public void ClickProceedCheckoutbtn() {
        this.proc.clickButtonProceedCheckout().click();
    }
    
  
}

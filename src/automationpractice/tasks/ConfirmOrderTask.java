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
public class ConfirmOrderTask {
    ConfirmOrderObj confirmObj;
    
    public ConfirmOrderTask(WebDriver driver){
        confirmObj = new ConfirmOrderObj(driver);
    }
    
    public void cliclBtnConfirm(){
        confirmObj.confirmOrder().click();
    }
    
}

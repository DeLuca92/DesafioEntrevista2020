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
public class CreateAccountTask {
    
    private CreateAccountObj create;
    
    public CreateAccountTask(WebDriver driver){
        this.create = new CreateAccountObj(driver);
    }
    
    
    public void insertEmail(String email){
        create.insertEmail().sendKeys(email);
    }
    
    public void clickCreateEmail(){
        create.clickCreateAccount().click();
    }
}

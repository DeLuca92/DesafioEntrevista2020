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
public class CheckFormTask {
    CheckFormObj formObj;
    
    public CheckFormTask(WebDriver driver){
        formObj = new CheckFormObj(driver);
    }
    
    public int checkName(){
        String info = formObj.checkNameAndLastName().getText();
        return info.compareTo("Pedro Silva");     
    }
    
    
    public int checkAddress(){
        String info = formObj.checkAddress().getText();
        return info.compareTo("940 Madison Ave");
    }
    
    public int checkCityStateZipCode(){
        String info = formObj.checkCityStateZipCode().getText();
        return info.compareTo("New York, New York 10021");
    }
    
    public int checkCountry(){
        String info = formObj.checkCountry().getText();
        return info.compareTo("United States");
    }
    
    public int checkNumberPhone(){
        String info = formObj.checkNumberPhone().getText();
        return info.compareTo("+154475145864");
    }
    
    public void clickOk(){
        formObj.clickOk().click();
    }
    
}

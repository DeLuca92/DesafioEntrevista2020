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
public class SeeTermsTask {
    
    SeeTermsObj seeTermsObjs;
    
    public SeeTermsTask(WebDriver driver){
        seeTermsObjs = new SeeTermsObj(driver);
    }
    
    public void clickTerms(){
        seeTermsObjs.clickTerms().click();
    }
    
    public void clickNextPage(){
        seeTermsObjs.clickNextPageTerms().click();
    }
    
    
}

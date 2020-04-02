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
public class AccountDetalisTask {
    
    AccountDetailsObj accObj;
    
    public AccountDetalisTask(WebDriver driver) {
        accObj = new AccountDetailsObj(driver);
    }
    
    public void clickMr() {
        accObj.clickMr().click();
    }
    
    public void insertFirstName(String name) {
        accObj.insertFirstName().sendKeys(name);
    }
    
    public void insertLastName(String name) {
        accObj.insertLastName().sendKeys(name);
    }
    
    public void inserPassord(String pass) {
        accObj.insertPassword().sendKeys(pass);
    }

    public void inserDayB() {
        accObj.birthDay().click();
    }

    public void inserMonB() {
        accObj.birthMon().click();
    }

    public void inserYearB() {
        accObj.birthYear().click();
    }
    
    public void inserAddress(String address) {
        accObj.insertAdress().sendKeys(address);
    }
    
     public void inserCity(String city) {
        accObj.insertCity().sendKeys(city);
    }
    
     public void insertState(){
         accObj.insertState().click();
     }
     public void inserCountry() {
        accObj.inserCountry().click();
    }
     public void insertZipCode(String zip){
         accObj.insertZipCode().sendKeys(zip);
     }
    
     public void insertPhone(String phone){
         accObj.insertPhone().sendKeys(phone);
     }
    
    public void insertAssing(String assing){
        accObj.insertAssing().sendKeys(assing);
    }
    
    public void clickRegister(){
        accObj.clickRegister().click();
    }
}

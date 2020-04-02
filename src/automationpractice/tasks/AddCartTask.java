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
public class AddCartTask {
    
   
    private AddCartObj addCart;

    public AddCartTask(WebDriver driver) {
        this.addCart = new AddCartObj(driver);
    }

     public void clickButton() {
         
        this.addCart.clickButtonAddProduct().click();
    }
     
     
    
     
}

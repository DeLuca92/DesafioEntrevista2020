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
public class CheckTotalPriceTask {
    CheckTotalPriceObj checkTotalObj;
    
    public CheckTotalPriceTask(WebDriver driver){
        checkTotalObj = new CheckTotalPriceObj(driver);
    }
    
    public int checkPrice(){
        String priceItens = checkTotalObj.getTotalPriceProducts().getText().replace("$", "");
        String priceShip = checkTotalObj.getTotalShipping().getText().replace("$", "");
        String priceTotal = checkTotalObj.getTotalPurchase().getText().replace("$", "");
        double priceItensPluspriceShip = Double.parseDouble(priceItens) + Double.parseDouble(priceShip);
        double priceTotalDouble = Double.parseDouble(priceTotal);
        
        if(priceItensPluspriceShip == priceTotalDouble){
            return 0;
        }else{
            return -1;
        }

    }
    public void payByBank(){
        checkTotalObj.payByBank().click();
    }
    
}

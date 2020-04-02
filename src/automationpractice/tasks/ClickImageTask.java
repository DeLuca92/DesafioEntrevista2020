/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automationpractice.tasks;

import org.openqa.selenium.WebDriver;

import automationpractice.objs.*;

/**
 *
 * @author danie
 */
public class ClickImageTask {

    private ClickImageObj clickImageObj;

    public ClickImageTask(WebDriver driver) {
        this.clickImageObj = new ClickImageObj(driver);
    }

    public void ClickImageProductTask() {
        this.clickImageObj.clickImageProduct().click();
    }
    


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automationpractice.objs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author danie
 */
public class ClickImageObj {

    private WebDriver driver;

    public ClickImageObj(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement clickImageProduct() {
        return driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img"));
    }

   
   
}

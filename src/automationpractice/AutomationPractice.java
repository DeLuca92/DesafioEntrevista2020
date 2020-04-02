/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import automationpractice.tasks.*;
import java.util.Random;
import java.util.concurrent.Delayed;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author danie
 */
public class AutomationPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WebDriver webDrive;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\danie\\Documents\\NetBeansProjects\\AutomationPractice\\src\\automationpractice\\chromedriver.exe");
        webDrive = new ChromeDriver();
        //WebDriverWait ww = new WebDriverWait(webDrive,5);
        webDrive.get("http://automationpractice.com/index.php");
        ClickImageTask clickImage = new ClickImageTask(webDrive);
        AddCartTask addCartTask = new AddCartTask(webDrive);
        ProccedCheoutTask proccedCheout = new ProccedCheoutTask(webDrive);
        CartProceedTask cartProcced = new CartProceedTask(webDrive);
        CreateAccountTask create = new CreateAccountTask(webDrive);
        AccountDetalisTask accTask = new AccountDetalisTask(webDrive);
        CheckFormTask checkTask = new CheckFormTask(webDrive);
        clickImage.ClickImageProductTask();
        addCartTask.clickButton();
        proccedCheout.ClickProceedCheckoutbtn();
        cartProcced.clickProceedCart();
        Random r = new Random();
        int i = r.nextInt(100);
        create.insertEmail("aaa@aaa" + i + ".com.br");
        create.clickCreateEmail();
        accTask.clickMr();
        accTask.insertFirstName("Pedro");
        accTask.insertLastName("Silva");
        accTask.inserPassord("1234567");
        accTask.inserDayB();
        accTask.inserMonB();
        accTask.inserYearB();
        accTask.inserAddress("940 Madison Ave");
        accTask.inserCity("New York");
        accTask.insertState();
        accTask.insertZipCode("10021");
        accTask.inserCountry();
        accTask.insertPhone("+154475145864");
        accTask.clickRegister();
        int checkName = checkTask.checkName();
        int checkCityStateZipCode = checkTask.checkCityStateZipCode();
        int checkCountry = checkTask.checkCountry();
        int checkNumberPhone = checkTask.checkNumberPhone();
        if (checkName == 0 && checkCityStateZipCode == 0 && checkCountry == 0 && checkNumberPhone == 0) {
            checkTask.clickOk();
            SeeTermsTask seeTask = new SeeTermsTask(webDrive);
            seeTask.clickTerms();
            seeTask.clickNextPage();
            CheckTotalPriceTask checkTotal = new CheckTotalPriceTask(webDrive);
            if (checkTotal.checkPrice() == 0) {
                checkTotal.payByBank();
                ConfirmOrderTask confirmOrder = new ConfirmOrderTask(webDrive);
                confirmOrder.cliclBtnConfirm();
                OrderConfirmationTask orderConfirmation = new OrderConfirmationTask(webDrive);
                if (orderConfirmation.checkIsOk() == 0) {
                    JavascriptExecutor js = (JavascriptExecutor) webDrive;
                    js.executeScript("alert('Teste Concluido');");
                } else {
                    JavascriptExecutor js = (JavascriptExecutor) webDrive;
                    js.executeScript("alert('Erro Navegador ira se fechar');");

                    webDrive.close();
                }

            } else {
                JavascriptExecutor js = (JavascriptExecutor) webDrive;
                js.executeScript("alert('Erro Navegador ira se fechar');");
                webDrive.close();
            }
        } else {
            JavascriptExecutor js = (JavascriptExecutor) webDrive;
            webDrive.close();
        }

        //addCartTask.();
        // tt.clicarBotaoConfirmOrder();
        // webDrive.close();
    }

}

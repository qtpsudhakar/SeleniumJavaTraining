package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private By txtUserName = By.xpath("//input[@name='txtUsername']");
    private By txtPassword = By.xpath("//input[@name='txtPassword']");
    private By btnLogin = By.xpath("//input[@value='LOGIN']");

    WebDriver driver;

    public void enterUserName(String userName){
        driver.findElement(txtUserName).sendKeys(userName);
        System.out.println(userName+" entered on UserName Textbox");
    }

    public void enterPassword(String password){
        driver.findElement(txtPassword).sendKeys(password);
        System.out.println(password+" entered on Password Textbox");
    }

    public void clickOnLogin(){
        driver.findElement(btnLogin).click();
        System.out.println("click on login button");
    }

}

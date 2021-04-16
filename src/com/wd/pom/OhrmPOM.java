package com.wd.pom;

import org.openqa.selenium.chrome.ChromeDriver;

public class OhrmPOM {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");


        LoginPage loginPage = new LoginPage();
        loginPage.driver = driver;

        loginPage.enterUserName("admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();

    }
}

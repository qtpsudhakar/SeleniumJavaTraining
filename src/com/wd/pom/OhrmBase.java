package com.wd.pom;

import org.openqa.selenium.chrome.ChromeDriver;

public class OhrmBase {
    static ChromeDriver driver;
    public void OpenApplication(){
        System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
}

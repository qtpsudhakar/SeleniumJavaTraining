package com.automation.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wd3OhrmAddEmployee {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.linkText("PIM")).click();
        driver.findElement(By.partialLinkText("Add Emp")).click();
        driver.findElement(By.id("firstName")).sendKeys("sudhakar");
        driver.findElement(By.id("lastName")).sendKeys("k");
        driver.findElement(By.id("btnSave")).click();

    }
}

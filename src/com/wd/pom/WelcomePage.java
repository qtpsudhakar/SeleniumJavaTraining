package com.wd.pom;

import org.openqa.selenium.By;

public class WelcomePage extends OhrmBase{

    private By lnkPIM = By.linkText("PIM");
    private By lnkAddEmployee = By.partialLinkText("Add Emp");

    public void clickOnPIM(){
        driver.findElement(lnkPIM).click();
        System.out.println("Clicked PIM link");
    }

    public void clickOnAddEmployee(){
        driver.findElement(lnkAddEmployee).click();
        System.out.println("Clicked Add Employee link");
    }

}

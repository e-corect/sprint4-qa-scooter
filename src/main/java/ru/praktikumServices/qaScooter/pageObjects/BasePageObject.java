package ru.praktikumServices.qaScooter.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePageObject {

   protected WebDriver driver;

   public BasePageObject(WebDriver driver){
       this.driver = driver;
   }
}

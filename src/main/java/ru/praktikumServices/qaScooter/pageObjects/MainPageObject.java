package ru.praktikumServices.qaScooter.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageObject extends BasePageObject{

    // конструктор
    public MainPageObject(WebDriver driver){
        super(driver);
    }
    // кнопка согласия на использование куки
    protected final WebElement coockieConfirmButton = driver.findElement(By.id("rcc-confirm-button"));
    // лого "Яндекс" в шапке страницы
    protected final WebElement yandexLogo = driver.findElement(By.xpath(".//img[@alt='Yandex']"));
    // лого "Самоката" в шапке страницы
    protected final WebElement samokatLogo = driver.findElement(By.xpath(".//img[@alt='Scooter']"));
    // кнопка "Заказать" в шапке страницы
    protected final WebElement upperButtonOrder = driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g']"));
    // кнопка "Заказать" в центре страницы
    protected final WebElement bottomButtonOrder = driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"));

    //метод клика на кнопку согласия на использование куки
    public void pressCoockieConfirmButton(){
        coockieConfirmButton.click();
    }
    //метод клика на верхнюю кнопку Заказать
    public void goToOrderScooterByUpperButton(){
        upperButtonOrder.click();
    }
    //метод клика на кнопку Заказать в центре страницы
    public void goToOrderScooterByBottomButton(){
        bottomButtonOrder.click();
    }
}

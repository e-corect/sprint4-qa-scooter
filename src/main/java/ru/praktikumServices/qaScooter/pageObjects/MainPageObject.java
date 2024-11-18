package ru.praktikumServices.qaScooter.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static ru.praktikumServices.qaScooter.pageObjects.Locators.*;

public class MainPageObject extends BasePageObject{

    // конструктор
    public MainPageObject(WebDriver driver){
        super(driver);
    }
    // кнопка согласия на использование куки
    protected final WebElement coockieConfirmButton = driver.findElement(By.id(COOCKIE_CONFIRM_BUTTON_ID));
    // лого "Яндекс" в шапке страницы
    protected final WebElement yandexLogo = driver.findElement(By.xpath(YANDEX_LOGO_XPATH));
    // лого "Самоката" в шапке страницы
    protected final WebElement samokatLogo = driver.findElement(By.xpath(SAMOKAT_LOGO_XPATH));
    // кнопка "Заказать" в шапке страницы
    protected final WebElement upperButtonOrder = driver.findElement(By.xpath(UPPER_BUTTON_ORDER_XPATH));
    // кнопка "Заказать" в центре страницы
    protected final WebElement bottomButtonOrder = driver.findElement(By.xpath(BOTTOM_BUTTON_ORDER_XPATH));

    //метод клика по кнопке согласия на использование куки
    public void pressCoockieConfirmButton(){
        coockieConfirmButton.click();
    }
    //метод клика по верхней кнопке "Заказать"
    public void orderScooterByUpperButton(){
        upperButtonOrder.click();
    }
    //метод клика по кнопке "Заказать" в центре страницы
    public void orderScooterByBottomButton(){
        bottomButtonOrder.click();
    }
}

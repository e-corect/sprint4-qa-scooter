package ru.praktikumServices.qaScooter.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static ru.praktikumServices.qaScooter.pageObjects.Locators.*;

public class OrderPageObject extends BasePageObject{

    // конструктор
    public OrderPageObject(WebDriver driver) {
        super(driver);
    }

    // поле ввода для имени клиента
    protected final WebElement nameInput = driver.findElement(By.xpath(NAME_INPUT_XPATH));
    // поле ввода для фамилии клиента
    protected final WebElement lastnameInput = driver.findElement(By.xpath(LASTMANE_INPUT_XPATH));
    // поле ввода для адреса клиента
    protected final WebElement addressInput = driver.findElement(By.xpath(ADDRESS_INPUT_XPATH));
    // выпадающий список со станциями метро
    protected final WebElement metroStationInput = driver.findElement(By.xpath(METRO_STATION_INPUT_XPATH));
    // поле ввода для контактного телефона клиента
    protected final WebElement phoneNumberInput = driver.findElement(By.xpath(PHONE_NUMBER_INPUT_XPATH));
    // кнопка "Далее"
    protected final WebElement forwardButton = driver.findElement(By.xpath(FORWARD_BUTTON_XPATH));

    // методы заполнения каждого из полей
    public void typeName(String name){
        nameInput.sendKeys(name);
    }

    public void typeLastname(String lastname){
        lastnameInput.sendKeys(lastname);
    }

    public void typeAddress(String address){
        addressInput.sendKeys(address);

    }

    public void typeMetroStation(String metroStation){
        metroStationInput.sendKeys(metroStation);
        metroStationInput.click();
    }

    public void typePhoneNumber(String phoneNumber){
        phoneNumberInput.sendKeys(phoneNumber);
    }
    // метод нажатия кнопки "Далее"
    public void pressForwardButton(){
        forwardButton.click();
    }

    // метод заполнения всей формы заказа
    public void fillOutScooterOrderForm(String name, String lastname, String address, String metroStation, String phoneNumber){
        typeName(name);
        typeLastname(lastname);
        typeAddress(address);
        typeMetroStation(address);
        typePhoneNumber(phoneNumber);
        pressForwardButton();



    }
}

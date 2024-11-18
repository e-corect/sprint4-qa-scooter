package ru.praktikumServices.qaScooter.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPageObject extends BasePageObject{

    // конструктор
    public OrderPageObject(WebDriver driver) {
        super(driver);
    }

    // поле ввода для имени клиента
    protected final WebElement nameInput = driver.findElement(By.xpath(".//input[@placeholder='* Имя']"));
    // поле ввода для фамилии клиента
    protected final WebElement lastnameInput = driver.findElement(By.xpath(".//input[@placeholder='* Фамилия']"));
    // поле ввода для адреса клиента
    protected final WebElement addressInput = driver.findElement(By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']"));
    // выпадающий список со станциями метро
    protected final WebElement metroStationInput = driver.findElement(By.xpath(".//input[@class='select-search__input']"));
    // поле ввода для контактного телефона клиента
    protected final WebElement phoneNumberInput = driver.findElement(By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']"));
    // методы заполнения каждого из полей
    public void typeName(String name){
        nameInput.sendKeys(name);
    }

    public void typeLastname(String lastname){
        lastnameInput.sendKeys(lastname);
    }

    public void address(String address){
        addressInput.sendKeys(address);

    }

    public void metroStation(String metroStation){
        metroStationInput.sendKeys(metroStation);
        metroStationInput.click();
    }

    public void phoneNumber(String phoneNumber){
        phoneNumberInput.sendKeys(phoneNumber);

    }
    // метод заполнения всей формы заказа
    public void fillOutScooterOrderForm(String name, String lastname, String address, String metroStation, String phoneNumber){

    }
}

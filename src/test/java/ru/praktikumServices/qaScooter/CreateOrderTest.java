package ru.praktikumServices.qaScooter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.praktikumServices.qaScooter.pageObjects.MainPageObject;
import ru.praktikumServices.qaScooter.pageObjects.OrderPageObject;

import static java.lang.Thread.sleep;

public class CreateOrderTest {

    private WebDriver driver;

    @Before
    public void prepare() {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void mainPageTest(){
        MainPageObject mainPageObject = new MainPageObject(driver);
        mainPageObject.pressCoockieConfirmButton();
        mainPageObject.orderScooterByUpperButton();
    }

    @Test
    public void orderScooterFormTest(){
        MainPageObject mainPageObject = new MainPageObject(driver);
        mainPageObject.pressCoockieConfirmButton();
        mainPageObject.orderScooterByUpperButton();
        OrderPageObject orderPageObject = new OrderPageObject(driver);
        orderPageObject.fillOutScooterOrderForm("Семён", "Кипятков", "г москва ул большая садовая дом 10", "Маяковская", "79876543210");
    }

    @After
    public void complete(){
        driver.quit();
    }
}

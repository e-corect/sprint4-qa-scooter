package ru.praktikumServices.qaScooter;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.praktikumServices.qaScooter.pageObjects.MainPageObject;

import static java.lang.Thread.sleep;

public class CreateOrderTest {

    private WebDriver driver;

    @Before
    public void prepare() {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
    }

    @Test
    public void mainPageTest(){
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageObject mainPageObject = new MainPageObject(driver);
        mainPageObject.pressCoockieConfirmButton();
        mainPageObject.goToOrderScooterByUpperButton();
    }

    @After
    public void complete(){
        driver.quit();
    }
}

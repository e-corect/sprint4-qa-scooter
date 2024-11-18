package ru.praktikumServices.qaScooter;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;

public class CreateOrderTest {

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }
}

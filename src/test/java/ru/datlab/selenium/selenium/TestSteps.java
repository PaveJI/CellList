package ru.datlab.selenium.selenium;

import java.io.IOException;

import cucumber.api.java.ru.Пусть;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class TestSteps {
    static WebDriver driver;

    @BeforeClass
    public static void setupDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver(DesiredCapabilities.chrome());

    }

    @AfterClass
    public static void closeDriver() {
        driver.quit();
    }

    @Test
    @Пусть("открыта страница")
    public void open(){
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCellList");
    }



}

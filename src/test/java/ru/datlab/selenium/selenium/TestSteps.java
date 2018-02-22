package ru.datlab.selenium.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import Pages.Page;
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
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver");
        driver = new ChromeDriver(DesiredCapabilities.chrome());

    }

    @AfterClass
    public static void closeDriver() {
        driver.quit();
    }

    @Test
    @Пусть("открыта страница")
    public void open() throws InterruptedException {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCellList");
        Thread.sleep(6000);
        Page page = new Page(driver);
        Thread.sleep(6000);
        page.firstNameLabel.sendKeys("asdasd");
    }



}

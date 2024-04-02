package com.ait.qa34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HWFindElementsTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void findElementByTagName1() {
        WebElement element = driver.findElement(By.tagName("h2"));
        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.tagName("h3"));
        System.out.println(element1.getText());

        WebElement element2 = driver.findElement(By.tagName("html"));
        System.out.println(element2.getText());
    }
    @Test
    public void findElementByCssSelector() {
        driver.findElement(By.cssSelector("#dialog-notifications-success"));
        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElement(By.cssSelector(".bar-notification"));
        driver.findElement(By.cssSelector(".ajax-loading-block-window"));
        driver.findElement(By.cssSelector(".loading-image"));
        driver.findElement(By.cssSelector(".master-wrapper-main"));
        driver.findElement(By.cssSelector(".footer"));
        driver.findElement(By.cssSelector(".footer-poweredby"));
        driver.findElement(By.cssSelector(".footer-disclaimer"));
        driver.findElement(By.cssSelector(".footer-menu-wrapper"));
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

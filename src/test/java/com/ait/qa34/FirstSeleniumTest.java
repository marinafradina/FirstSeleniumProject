package com.ait.qa34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver driver;

    //before open setUp
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
       // driver.get("https://www.google.com/");
        driver.navigate().to("https://www.google.com/");//with history
        driver.navigate().back();

    }
    //test name
    @Test
    public void openGoogleTest() {
        System.out.println("Google is opened!");
    }
    //after tearDown
    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();//close browser(all tabs)
        //driver.close();//only one tab(if only one -> close browser)
    }

}

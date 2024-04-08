package com.ait.qa34;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }

    public boolean isElementPresen(By locator) {
        return driver.findElements(locator).size()>0;
    }

    public void type(By locator, String text) {
        if (text != null) {
            click(locator);
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        }
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public boolean isAlertPresent() {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(15)).
                until(ExpectedConditions.alertIsPresent());
        if (alert == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isRegistrationEmailButton() {
        return isElementPresen(By.cssSelector("ul:nth-child(1) .account"));
    }

    public void clickOnRegistrationButton() {
        click(By.cssSelector("#register-button"));
    }

    public void fillLoginRegisterForm(String email, String password, String firstName, String lastName) {
        type(By.name("FirstName"), firstName);
        //enter Last name
        type(By.cssSelector("#LastName"), lastName);
        //enter email
        type(By.name("Email"), email);
        //enter passwoort
        type(By.cssSelector("#Password"), password);
        //enter ConfirmPassword
        type(By.cssSelector("#ConfirmPassword"), password);
    }

    public void clickOnRegisterLink() {
        click(By.cssSelector("[href=\'/register\']"));
    }
}

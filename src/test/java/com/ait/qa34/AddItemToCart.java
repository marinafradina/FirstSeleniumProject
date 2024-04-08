package com.ait.qa34;

import jdk.jfr.Registered;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

public class AddItemToCart extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        Random random = new Random();
        int i = random.nextInt(1000);
        clickOnRegisterLink();
        fillLoginRegisterForm("manyta" + i + "123@gmx.de", "Manyta123@", "Anna",
                "Naan");
        clickOnRegistrationButton();
    }
    @AfterMethod
    public void postCondition() {

    }
    @Test
    public void addProduct() {
        driver.findElement(By.cssSelector("//span[contains(text(),'Ad to card')]"));
        Assert.assertTrue(isRegistrationEmailButton());


    }

}

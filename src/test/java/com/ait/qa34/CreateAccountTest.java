package com.ait.qa34;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class CreateAccountTest extends TestBase{

    @Test
    public void createNewAccount() {
        Random random = new Random();
        int i = random.nextInt(1000);
        clickOnRegisterLink();
        fillLoginRegisterForm("manyta" + i + "123@gmx.de", "Manyta123@", "Anna",
                "Naan");
        clickOnRegistrationButton();
        //Assert.assertTrue(isElementPresen(By.cssSelector(".account")));
        Assert.assertTrue(isRegistrationEmailButton());

    }

}

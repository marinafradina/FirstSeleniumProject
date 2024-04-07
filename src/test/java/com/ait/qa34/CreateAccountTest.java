package com.ait.qa34;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class CreateAccountTest extends TestBase{

    @Test
    public void createNewAccount() {
        Random random = new Random();
        int i = random.nextInt(1000);
        //click on Register link
        click(By.cssSelector("[href=\'/register\']"));
        //enter First name
        type(By.name("FirstName"), "Anna");
        //enter Last name
        type(By.cssSelector("#LastName"), "Naan");
        //enter email
        type(By.name("Email"), "manyta" + i + "123@gmx.de");
        //enter passwoort
        type(By.cssSelector("#Password"), "Manyta123@");
        //enter ConfirmPassword
        type(By.cssSelector("#ConfirmPassword"), "Manyta123@");
        //clock on Registration button
        click(By.cssSelector("#register-button"));
        Assert.assertTrue(isElementPresen(By.cssSelector(".account")));

    }

}

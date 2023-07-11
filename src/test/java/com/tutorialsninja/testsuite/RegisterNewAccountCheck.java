package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.NavigateToRegister;
import com.tutorialsninja.pages.RegisterNewAccount;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class RegisterNewAccountCheck extends BaseTest
{
    String expectedText,actualText;
    NavigateToRegister nr1 = new NavigateToRegister();
    RegisterNewAccount ra1 = new RegisterNewAccount();

    @Test
    public void verifyThatUserRegisterAccountSuccessfully()
    {
        nr1.clickOnRegister();
        ra1.enterFirstName("Vicky");
        ra1.enterLastName("Shah");
        ra1.email("vicky.shah792851@yahoo.com");
        ra1.enterTelephone("0123456789");
        ra1.enterPassword("abc@1234");
        ra1.enterConfirmPassword("abc@1234");
        ra1.clickSuscribe();
        ra1.clickOnPrivacy();
        ra1.clickOnContinue();
        ra1.cartVerify();
        ra1.clickOnConButton();
        ra1.clickOnMyAccount();
    }
}

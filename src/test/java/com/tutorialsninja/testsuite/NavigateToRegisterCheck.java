package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.NavigateToRegister;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigateToRegisterCheck extends BaseTest
{
    String expectedText,actualText;
    NavigateToRegister nr = new NavigateToRegister();

    @Test
    public void VerifyRegisterLink()
    {
        nr.clickOnRegister();

        expectedText="Register Account";
        actualText=nr.verifyRegisterText();
        Assert.assertEquals(actualText,expectedText,"Register page not displayed");
    }
}

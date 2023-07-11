package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.NavigateToLoginPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageCheck extends BaseTest
{
    String expectedText,actualText;
    NavigateToLoginPage navlog = new NavigateToLoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully()
    {
        navlog.clickOnMyAccount();
        navlog.clickOnLogin();

        expectedText="Returning Customer";
        actualText= navlog.verifyTextRegisterAccount();
        Assert.assertEquals(actualText,expectedText,"Register Account Not Matched");
    }
}

package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.LoginAndLogout;
import com.tutorialsninja.pages.NavigateToLoginPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAndLogoutCheck extends BaseTest
{
    String expectedText,actualText;
    NavigateToLoginPage navlog = new NavigateToLoginPage();
    LoginAndLogout ll = new LoginAndLogout();

    @Test
    public void  verifyThatUserShouldLoginAndLogoutSuccessfully()
    {
        navlog.clickOnMyAccount();
        navlog.clickOnLogin();

        ll.enterEmail("vicky.shah7928111@yahoo.com");
        ll.enterPassword("abc@1234");
        ll.clickOnLoginButton();

        expectedText="My Account";
        actualText=ll.myAccountClick();
        Assert.assertEquals(actualText,expectedText,"My Account Header Test Not Matched");

        ll.clickOnLink();
        ll.clickOnLogoutButton();

        expectedText="Account Logout";
        actualText=ll.logoutTextVerify();
        Assert.assertEquals(actualText,expectedText,"Logout Header Text Not Matched");

    }
}

package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.NavigateToComponents;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComponentsCheck extends BaseTest
{
    String expectedText,actualText;
    NavigateToComponents nc = new NavigateToComponents();

    @Test
    public void components()
    {
        nc.mouseHoverOnComponents();
        nc.showAllComponentsOption();

        expectedText="Components";
        actualText=nc.verifyComponentText();
        Assert.assertEquals(actualText,expectedText,"Components Header Text Not Matched");
    }
}

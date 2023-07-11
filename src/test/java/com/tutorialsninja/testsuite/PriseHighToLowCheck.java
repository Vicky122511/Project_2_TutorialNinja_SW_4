package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.NavigateToLaptop;
import com.tutorialsninja.pages.PriseDisplayHighToLow;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class PriseHighToLowCheck extends BaseTest
{
    NavigateToLaptop nl1 = new NavigateToLaptop();
    PriseDisplayHighToLow prdis = new PriseDisplayHighToLow();

    @Test
    public void checkPriseHighToLow()
    {
        nl1.mouseHoverOnLaptop();
        nl1.mouseHoverAndClick();
        prdis.priseHighToLow();
    }
}

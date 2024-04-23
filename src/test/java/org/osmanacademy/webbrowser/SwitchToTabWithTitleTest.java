package org.osmanacademy.webbrowser;

import org.osmanacademy.webbrowser.exceptions.WebBrowserAutomationException;
import org.osmanacademy.webbrowser.impl.SeleniumWebDriverImpl;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.fail;

public class SwitchToTabWithTitleTest extends BaseTest {
    @BeforeTest
    public void beforeTest() {
        setWebBrowser(new SeleniumWebDriverImpl("web-browser-automation.properties"));
        setWebSiteUrl("https://www.google.com/");
        setSoftAssert(new SoftAssert());
    }
    @Test
    public void testSwitchToTabWithTitle() {
        try {
            setWebBrowser(new SeleniumWebDriverImpl("web-browser-automation.properties"));
            getWebBrowser().openWebBrowser();
            getWebBrowser().maximize();
            getWebBrowser().openUrl(getWebSiteUrl());
            getWebBrowser().openNewTab();
            getWebBrowser().switchToTabWithTitle("New Tab");
            getWebBrowser().closeBrowser();
        } catch (Exception e) {
            fail("Exception was thrown during the testSwitchToTabWithTitle method execution: " + e.getMessage());
        }
    }
    @AfterTest
    public void afterTest() throws WebBrowserAutomationException {
        getWebBrowser().closeBrowser();
    }
}

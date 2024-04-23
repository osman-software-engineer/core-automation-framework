package org.osmanacademy.webbrowser;

import org.osmanacademy.webbrowser.exceptions.WebBrowserAutomationException;
import org.osmanacademy.webbrowser.impl.SeleniumWebDriverImpl;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.fail;

public class OpenBrowserTest extends BaseTest {
    @BeforeTest
    public void beforeTest() {
        setWebBrowser(new SeleniumWebDriverImpl("web-browser-automation.properties"));
        setWebSiteUrl("https://www.google.com/");
        setSoftAssert(new SoftAssert());
    }
    @Test
    public void testOpenBrowser() {
        try {
            setWebBrowser(new SeleniumWebDriverImpl("web-browser-automation.properties"));
            getWebBrowser().openWebBrowser();
            getWebBrowser().closeBrowser();
        } catch (Exception e) {
            fail("Exception was thrown during the openBrowser method execution: " + e.getMessage());
        }
    }
    @AfterTest
    public void afterTest() throws WebBrowserAutomationException {
        getWebBrowser().closeBrowser();
    }

}

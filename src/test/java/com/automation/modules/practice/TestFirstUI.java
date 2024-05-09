package com.automation.modules.practice;

import com.automation.utils.helpers.annotations.TestInfo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static com.automation.constants.componentsconstants.Components.UI;
import static com.automation.constants.componentsconstants.Groups.SMOKE;
import static org.assertj.core.api.Assertions.assertThat;

public class TestFirstUI {

    @Test(groups = {SMOKE})
    @TestInfo(testCaseId = "JIRA-223344", component = UI)
    public void testOpenBrowser() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("disable-gpu");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());
//        Assertions.assertEquals("Google", driver.getTitle(), "Page title is not correct");
        assertThat(driver.getTitle())
                .withFailMessage("Page title is not correct")
                .isEqualTo("Google");
    }
}

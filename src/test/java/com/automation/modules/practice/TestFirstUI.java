package com.automation.modules.practice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.assertj.core.api.Assertions.assertThat;

public class TestFirstUI {

    @Test
    public void testOpenBrowser() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("disable-gpu");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        assertThat(driver.getTitle())
                .withFailMessage("Page title is not correct")
                .isEqualTo("Google");
    }
}

package com.marat.test.config;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver> {

    private SimpleWebDriverConfig config;
    public WebDriverProvider (final SimpleWebDriverConfig config) {
        this.config = config;
    }

    @Override
    public WebDriver get() {
        Configuration.browser = config.browser();
        Configuration.browserVersion = config.browserVersion();
        Configuration.baseUrl = config.baseUrl();

        if (config.browserVersion().equals("111")) {
            return new EdgeDriver();
        } else if (config.browserVersion().equals("100")) {
            return new FirefoxDriver();
        }
        return new ChromeDriver();
    }
}

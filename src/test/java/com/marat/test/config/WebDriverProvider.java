package com.marat.test.config;

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
        if(config.getBrowser().equals(Browser.EDGE)) {
            return new EdgeDriver();
        } else if (config.getBrowser().equals(Browser.FIREFOX)) {
            return new FirefoxDriver();
        }
        return new ChromeDriver();
    }
}

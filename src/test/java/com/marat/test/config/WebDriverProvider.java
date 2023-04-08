package com.marat.test.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;
import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver> {

    private WebDriverConfig config;

    public WebDriverProvider(final WebDriverConfig config) {
        this.config = config;
    }

    @Override
    public WebDriver get() {
        if (Objects.isNull(config.getRemoteUrl())) {
            if (config.getBrowser().equals(Browser.FIREFOX)) {
                return new FirefoxDriver();
            }
            if (config.getBrowser().equals(Browser.EDGE)) {
                return new EdgeDriver();
            }
        } else {
            return new ChromeDriver();
//            return new RemoteWebDriver(config.getRemoteUrl(), DesiredCapabilities.chrome());
        }
        throw new NullPointerException("There is no such browser");
    }
}

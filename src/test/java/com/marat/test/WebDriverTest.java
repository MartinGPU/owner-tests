package com.marat.test;

import com.marat.test.config.SimpleWebDriverConfig;
import com.marat.test.config.WebDriverProvider;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private final SimpleWebDriverConfig config = ConfigFactory.create(SimpleWebDriverConfig.class, System.getProperties());
    private final WebDriverProvider provider = new WebDriverProvider(config);

    @Test
    public void TestTitle() {
        WebDriver driver = provider.get();
        driver.get(config.getBaseUrl());
        assertEquals("GitHub: Let’s build from here · GitHub", driver.getTitle());
        driver.quit();
    }

    private WebDriver getDriver() {
        return new EdgeDriver();
    }
    private String getBaseUrl() {
        return "https://github.com";
    }
}

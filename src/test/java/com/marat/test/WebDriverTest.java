package com.marat.test;

import com.marat.test.config.WebDriverConfig;
import com.marat.test.config.WebDriverProvider;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private final WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    private final WebDriverProvider provider = new WebDriverProvider(config);

    @Test
    @Tag("web_driver")
    public void testTitle() {
        WebDriver driver = provider.get();
        driver.get(config.getBaseUrl());
        assertEquals("GitHub: Let’s build from here · GitHub", driver.getTitle());
        driver.quit();
    }
}

package com.marat.test;

import com.marat.test.config.WebDriverProvider;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

//    private final WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
//    private final WebDriverProvider provider = new WebDriverProvider(config);
private WebDriver driver = new WebDriverProvider().get();

    @Test
    public void testTitle() {
        assertEquals("GitHub: Let’s build from here · GitHub", driver.getTitle());
        driver.quit();
    }
}

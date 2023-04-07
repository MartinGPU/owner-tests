package com.marat.test;

import com.codeborne.selenide.Condition;
import com.marat.test.config.WebDriverConfig;
import com.marat.test.config.WebDriverProvider;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    //private final RemoteWebDriverConfig remoteConfig = ConfigFactory.create(RemoteWebDriverConfig.class, System.getProperties());
    private final WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    private final WebDriverProvider provider = new WebDriverProvider(config);

    @Test
    @Tag("github")
    public void testTitle() {
        WebDriver driver = provider.get();
        driver.get(config.getBaseUrl());
        assertEquals("GitHub: Let’s build from here · GitHub", driver.getTitle());
        driver.quit();
    }

//    @Test
//    @Tag("vk")
//    public void testVkTitle() {
//        WebDriver driver = provider.get();
//        driver.get(config.getBaseUrl());
//        step("Check Title", () -> {
//            $(".login_mobile_header").shouldHave(Condition.text("ВКонтакте для мобильных устройств"));
//        });
//        driver.quit();
//    }
}

package com.marat.test;

import com.marat.test.config.RemoteWebDriverConfig;
import com.marat.test.config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.marat.test.config.Browser.CHROME;
import static com.marat.test.config.Browser.FIREFOX;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WebTest {

    private RemoteWebDriverConfig remoteConfig;

    private WebDriverConfig config;

    @Test
    @Tag("local")
    public void webLocaleTest() {
        System.setProperty("web", "local");
        config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
        assertThat(config.getBrowser()).isEqualTo(FIREFOX);
        assertThat(config.getVersion()).isEqualTo(110.0);
    }

    @Test
    @Tag("remote")
    public void webRemoteTest() {
        System.setProperty("web", "remote");
        remoteConfig = ConfigFactory.create(RemoteWebDriverConfig.class, System.getProperties());
        assertThat(remoteConfig.browserName()).isEqualTo(CHROME);
        assertThat(remoteConfig.browserVersion()).isEqualTo(111.0);
        assertThat(remoteConfig.remoteUrl()).isEqualTo("https://user1:1234@selenoid.autotests.cloud/wd/hub/");
    }
}

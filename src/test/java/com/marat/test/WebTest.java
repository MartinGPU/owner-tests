package com.marat.test;
import com.marat.test.config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WebTest {

    @Test
    public void webLocaleTest() {
        System.setProperty("env", "localEdge");

        WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());
        assertThat(webConfig.browserName()).isEqualTo("EDGE");
        assertThat(webConfig.browserVersion()).isEqualTo("111");
    }

    @Test
    public void webRemoteTest() {
        System.setProperty("env", "remoteChrome");

        WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());
        assertThat(webConfig.browserName()).isEqualTo("CHROME");
        assertThat(webConfig.browserVersion()).isEqualTo("111");
        assertThat(webConfig.remoteUrl()).isEqualTo("https://user1:1234@selenoid.autotests.cloud/wd/hub/");
    }
}

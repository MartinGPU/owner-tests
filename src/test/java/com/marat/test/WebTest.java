package com.marat.test;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//public class WebTest {

//    @Test
//    public void webLocaleTest() {
//        System.setProperty("env", "localEdge");
//
//        RemoteWebDriverConfig remoteWebDriverConfig = ConfigFactory.create(RemoteWebDriverConfig.class, System.getProperties());
//        assertThat(remoteWebDriverConfig.browserName()).isEqualTo("EDGE");
//        assertThat(remoteWebDriverConfig.browserVersion()).isEqualTo("111");
//    }
//
//    @Test
//    public void webRemoteTest() {
//        System.setProperty("env", "remoteChrome");
//
//        RemoteWebDriverConfig remoteWebDriverConfig = ConfigFactory.create(RemoteWebDriverConfig.class, System.getProperties());
//        assertThat(remoteWebDriverConfig.browserName()).isEqualTo("CHROME");
//        assertThat(remoteWebDriverConfig.browserVersion()).isEqualTo("111");
//        assertThat(remoteWebDriverConfig.remoteUrl()).isEqualTo("https://user1:1234@selenoid.autotests.cloud/wd/hub/");
//    }
//}

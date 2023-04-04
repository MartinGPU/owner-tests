package com.marat.test;

import com.marat.test.config.AndroidConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AndroidTest {

    private AndroidConfig config;

    @Test
    public void testAndroid() {
        config = ConfigFactory.create(AndroidConfig.class, System.getProperties());
        assertThat(config.appLocation()).isEqualTo("/Users/V3/app.android");
        assertThat(config.deviceName()).isEqualTo("Samsung");
        assertThat(config.platformName()).isEqualTo("Android");
        assertThat(config.platformVersion()).isEqualTo("15");
    }

    @Test
    public void testAndroidOverride() {
        System.setProperty("device.name", "Apple");

        config = ConfigFactory.create(AndroidConfig.class, System.getProperties());
        assertThat(config.deviceName()).isEqualTo("Apple");
        assertThat(config.appLocation()).isEqualTo("/Users/V3/app.android");
        assertThat(config.platformName()).isEqualTo("Android");
        assertThat(config.platformVersion()).isEqualTo("15");
    }
}

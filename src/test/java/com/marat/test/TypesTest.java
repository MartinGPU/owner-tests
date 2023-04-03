package com.marat.test;

import com.marat.test.config.Browser;
import com.marat.test.config.TypesConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TypesTest {

    private TypesConfig config;

    @Test
    public void testInteger() {
        System.setProperty("Integer", "200");

        config = ConfigFactory.create(TypesConfig.class, System.getProperties());
        assertThat(config.getInteger()).isEqualTo(200);
    }

    @Test
    public void testBoolean() {
        System.setProperty("Boolean", "false");

        config = ConfigFactory.create(TypesConfig.class, System.getProperties());
        assertThat(config.getBoolean()).isEqualTo(false);
    }

    @Test
    public void testDouble() {
        System.setProperty("Double", "1.2");

        config = ConfigFactory.create(TypesConfig.class, System.getProperties());
        assertThat(config.getDouble()).isEqualTo(1.2);
    }

    @Test
    public void testEnum() {
        System.setProperty("Enum", "FIREFOX");

        config = ConfigFactory.create(TypesConfig.class, System.getProperties());
        assertThat(config.getEnum()).isEqualTo(Browser.FIREFOX);
    }
}

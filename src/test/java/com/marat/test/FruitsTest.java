package com.marat.test;

import com.marat.test.config.FruitsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class FruitsTest {

    private FruitsConfig config;

    @Test
    public void testList() {
        System.setProperty("fruits.list", "apple, orange, carrot");

        config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsList()).contains("apple", "orange", "carrot");
        System.out.println(config.getFruitsList());
    }

    @Test
    public void testArray() {
        System.setProperty("fruits.array", "apple;orange;carrot");

        config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsArray()).contains("apple", "orange", "carrot");
        System.out.println(Arrays.toString(config.getFruitsArray()));
    }
}

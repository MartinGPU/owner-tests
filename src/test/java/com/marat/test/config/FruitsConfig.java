package com.marat.test.config;

import org.aeonbits.owner.Config;

import java.util.List;

public interface FruitsConfig extends Config{

    @Separator(",")
    @Key("fruits.list")
    List<String> getFruitsList();

    @Separator(";")
    @Key("fruits.array")
    String[] getFruitsArray();
}

package com.marat.test.config;

import org.aeonbits.owner.Config;

public interface TypesConfig extends Config{

    @Key("Integer")
    Integer getInteger();

    @Key("Enum")
    Browser getEnum();

    @Key("Double")
    Double getDouble();

    @Key("Boolean")
    Boolean getBoolean();
}

package com.marat.test.config;

import org.aeonbits.owner.Config;

public interface SimpleWebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("EDGE")
    Browser getBrowser();

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();
}

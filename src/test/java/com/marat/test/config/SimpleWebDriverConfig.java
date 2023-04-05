package com.marat.test.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:web.properties"})
public interface SimpleWebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("EDGE")
    String browser();

    @Key("browserVersion")
    @DefaultValue("111")
    String browserVersion();

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String baseUrl();
}

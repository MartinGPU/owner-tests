package com.marat.test.config;

import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("FIREFOX")
    Browser getBrowser();

    @Key("browserVersion")
    @DefaultValue("100.0")
    Double getVersion();

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("remoteUrl")
    String remoteUrl();
}

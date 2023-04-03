package com.marat.test.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface SimpleWebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("EDGE")
    Browser getBrowser();

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("remoteUrl")
    @DefaultValue("https://selenoid.autotests.cloud/#/")
    URL getRemoteUrl();
}

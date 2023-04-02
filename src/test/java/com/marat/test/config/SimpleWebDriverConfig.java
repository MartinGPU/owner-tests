package com.marat.test.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface SimpleWebDriverConfig extends Config {

    @Key("browser")
    Browser getBrowser();

    @Key("baseUrl")
    String getBaseUrl();

    @Key("remoteUrl")
    URL getRemoteUrl();
}

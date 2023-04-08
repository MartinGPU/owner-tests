package com.marat.test.config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources({"classpath:${web}.properties"})
public interface WebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("FIREFOX")
    Browser getBrowser();

    @Key("browserVersion")
    @DefaultValue("110.0")
    Double getVersion();

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("remoteUrl")
    URL getRemoteUrl();
}

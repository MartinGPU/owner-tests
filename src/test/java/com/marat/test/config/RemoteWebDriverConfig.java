package com.marat.test.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface RemoteWebDriverConfig extends Config {

    @Key("browser.name")
    @DefaultValue("CHROME")
    String browserName();

    @Key("browser.version")
    @DefaultValue("111.0")
    Double browserVersion();

    @Key("remote.url")
    URL remoteUrl();
}

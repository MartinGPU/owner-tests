package com.marat.test.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${web}.properties"})
public interface RemoteWebDriverConfig extends Config {

    @Key("browser.name")
    @DefaultValue("CHROME")
    Browser browserName();

    @Key("browser.version")
    @DefaultValue("111.0")
    Double browserVersion();

    @Key("remote.url")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub/")
    String remoteUrl();
}

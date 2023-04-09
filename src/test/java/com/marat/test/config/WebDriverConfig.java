package com.marat.test.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${env}.properties"})
public interface WebDriverConfig extends Config {

    @Key("browser.name")
    @DefaultValue("EDGE")
    String getBrowser();

    @Key("browser.size")
    @DefaultValue("1600x900")
    String getSize();

    @Key("browser.version")
    @DefaultValue("111.0")
    String getVersion();

    @Key("base.url")
    @DefaultValue("https://www.tutu.ru/")
    String getBaseUrl();

    @Key("remote.url")
    String getRemoteUrl();
}

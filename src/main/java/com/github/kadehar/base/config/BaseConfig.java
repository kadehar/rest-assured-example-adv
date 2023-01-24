package com.github.kadehar.base.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config.properties"
})
public interface BaseConfig extends Config {
    @Key("baseUrl")
    String baseUrl();
}

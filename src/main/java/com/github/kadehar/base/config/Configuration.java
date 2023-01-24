package com.github.kadehar.base.config;

import org.aeonbits.owner.ConfigFactory;

public enum Configuration {
    Instance;

    private static final BaseConfig config = ConfigFactory.create(BaseConfig.class);

    public String baseUrl() {
        return config.baseUrl();
    }
}

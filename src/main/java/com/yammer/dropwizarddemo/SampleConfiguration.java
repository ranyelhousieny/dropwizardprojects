package com.yammer.dropwizarddemo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;

import javax.validation.constraints.NotEmpty;

public class SampleConfiguration extends Configuration {
    @NotEmpty
    private String password;

    @JsonProperty
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

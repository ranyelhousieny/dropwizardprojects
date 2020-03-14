package com.yammer.dropwizarddemo;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizarddemo.com.yammer.dropwizarddemo.dto.Car;
import com.yammer.dropwizarddemo.resources.SampleResource;

import java.util.HashMap;
import java.util.Map;

public class SampleService extends Service<SampleConfiguration> {

    public static void main(String[] args) throws Exception {
        new SampleService().run(args);
    }
    @Override
    public void initialize(Bootstrap<SampleConfiguration> bootstrap) {

    }

    @Override
    public void run(SampleConfiguration sampleConfiguration, Environment environment) throws Exception {
        environment.addResource(new SampleResource());


    }
}

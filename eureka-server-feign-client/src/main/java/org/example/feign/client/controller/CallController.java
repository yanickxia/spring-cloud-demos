package org.example.feign.client.controller;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.example.feign.client.client.EurekaClientClient;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

@RestController
public class CallController {

    private final EurekaClientClient eurekaClientClient;

    public CallController(EurekaClientClient eurekaClientClient) {
        this.eurekaClientClient = eurekaClientClient;
    }


    @RequestMapping("/call")
    public String call() {
        return eurekaClientClient.hello();
    }
}

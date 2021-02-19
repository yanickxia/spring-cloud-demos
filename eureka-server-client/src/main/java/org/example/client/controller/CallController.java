package org.example.client.controller;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

@RestController
public class CallController {

    private final RestTemplate restTemplate;

    public CallController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("/call")
    public String call(@RequestParam(value = "service", required = false, defaultValue = "eureka-service-feign-client") String service,
                       @RequestParam(value = "path", required = false, defaultValue = "/") String path,
                       @RequestParam(value = "method", required = false, defaultValue = "GET") String method) {

        return restTemplate.exchange(String.format("http://%s%s", service, path), Objects.requireNonNull(HttpMethod.resolve(method)), null, String.class).getBody();
    }

    private String bodyString(InputStream inputStream) {
        byte[] bytes = new byte[]{};
        try {
            IOUtils.readFully(inputStream, bytes);
            return new String(bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

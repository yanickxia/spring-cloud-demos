package org.example.feign.client.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("eureka-service-client")
public interface EurekaClientClient {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    String hello();
}

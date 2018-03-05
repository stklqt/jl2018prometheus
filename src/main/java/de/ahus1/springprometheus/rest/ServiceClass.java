package de.ahus1.springprometheus.rest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.micrometer.core.annotation.Timed;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author Alexander Schwartz 2018
 */
@Component
@Slf4j
public class ServiceClass {

    @Timed(value = "doSomething", description = "this is doing something")
    @HystrixCommand
    public void doSomething() {
        log.info("hi");
    }
}

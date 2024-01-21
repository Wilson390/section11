package com.eazybytes.accounts.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

/**
 * @author Eazy Bytes
 */
@RestController
public class FallBackController {
	
    @RequestMapping("/contactSupport")
    public Mono<String> contactSupport() {
        return Mono.just("An error occurred.Please try after sometime or contact support team!!!");
    }
    
}

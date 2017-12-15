package com.dk.sbr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SampleRestController.class);

    @GetMapping("/get")
    public Object getRequest(){
        return "Get Request executed successfully";
    }

    @GetMapping("/get/{item}")
    public Object getRequestWithURLIdentifier(@PathVariable String item){
        return "Get Request with "+item+" received.";
    }

    @GetMapping("/getParam")
    public Object getWithParam(@RequestParam String param){
        return "Param..."+param+" received.";
    }

    @RequestMapping("/post")
    public Object postRequest(@RequestBody Object body){
        LOGGER.debug("Payload... {}",body.toString());
        return body;
    }

    @RequestMapping("/post/{item}")
    public Object postWithPathVariable(@PathVariable String item){
        return "post received with "+item;
    }


    @RequestMapping("/postParam")
    public Object postWithQueryParam(@RequestParam String param){
        return "param..."+param+" received.";
    }

    //TODO: samples with @ModelAttribute yet to be added.
}

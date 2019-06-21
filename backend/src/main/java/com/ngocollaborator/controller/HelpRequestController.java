package com.ngocollaborator.controller;


import com.ngocollaborator.model.HelpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelpRequestController {
    @RequestMapping("/greeting")

    public HelpRequest helpRequest(@RequestParam(value="name", defaultValue="World") String name) {
        return new HelpRequest(name+"LOO");
    }
}

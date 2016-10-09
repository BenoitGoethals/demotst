package com.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by benoit on 09/10/16.
 */
@RestController(value = "/home")
public class HomeController {

    @RequestMapping("/")
    public String home(@PathVariable String value){
        return value;
    }
}

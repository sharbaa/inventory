package com.inventory.inventorymgmt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	

    @RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World!";
    }
	
}

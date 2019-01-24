package com.demo.secondspboot.controller;

import com.demo.secondspboot.model.TestModel;
import com.demo.secondspboot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/testController")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping(value = "/getAlltest")
   public List<TestModel> getAlltest(){
       return testService.getAll();
   }
}

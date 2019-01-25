package com.demo.secondspboot.controller;

import com.demo.secondspboot.model.TestModel;
import com.demo.secondspboot.service.TestService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @ApiOperation(value = "查询用户" , httpMethod ="GET", notes = "根据Id查询用户")
    @ApiImplicitParams(@ApiImplicitParam(  name = "id",value = "用户ID",required = true,dataType = "int",paramType = "query"))
    @ApiResponse(response=TestModel.class, code = 200,  message = "接口返回对象参数")
    @ResponseBody
    @RequestMapping(value = "/getModelById",method=RequestMethod.GET)
    public List<TestModel> getModelById( int id){
        return testService.getModelById(id);
    }


}

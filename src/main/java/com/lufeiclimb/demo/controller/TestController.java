package com.lufeiclimb.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "/test")
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/test")
    @ApiOperation(value = "test")
    public Integer byWords() {

        return 0;
    }
}

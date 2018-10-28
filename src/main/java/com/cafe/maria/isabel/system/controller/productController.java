package com.cafe.maria.isabel.system.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
@Api(value = "CancelService", description = "Cancel inbox")
public class productController {

    @PostMapping(value = "/")
    @ApiOperation(value = "Cancel")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Cancel inbox success"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource."),
            @ApiResponse(code = 404, message = "The resource you were trying to reach was not found.")
    })
    public String example(String value){
        return "Hola Mundo";
    }
}

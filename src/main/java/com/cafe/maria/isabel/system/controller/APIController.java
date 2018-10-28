package com.cafe.maria.isabel.system.controller;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@ApiIgnore
public class APIController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ApiOperation(hidden = true, value = "")
    @RequestMapping(value = {"/", "/home", "/welcome", "/index"}, method = { RequestMethod.GET })
    public RedirectView API() {
        logger.debug("::> Accesing to API Doc");
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/swagger-ui.html");
        return redirectView;
    }

}

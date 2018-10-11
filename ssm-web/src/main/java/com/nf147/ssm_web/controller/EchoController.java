package com.nf147.ssm_web.controller;


import com.nf147.ssm_service.services.DualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EchoController {

    @Autowired
    private DualService dualService;

    @RequestMapping({"/echo/{msg}", "/echo"})
    @ResponseBody
    public String dual(@PathVariable(required = false) String msg) {
        dualService.dual();

        return msg == null ? "No Message." : msg;
    }
}

package com.nf147.ssm_web.controller;


import com.nf147.ssm.dao.EchoDAO;
import com.nf147.ssm.entity.Echo;
import com.nf147.ssm.services.DualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EchoController {

    @Autowired
    private DualService dualService;

    @Autowired
    private EchoDAO echoDAO;

    @RequestMapping({"/echo/{msg}", "/echo"})
    @ResponseBody
    public List<Echo> dual(@PathVariable(required = false) String msg) {
        dualService.dual();

        List<Echo> echo = echoDAO.findAll();

        return echo;
    }
}

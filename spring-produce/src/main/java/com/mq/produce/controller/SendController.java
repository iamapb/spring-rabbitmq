package com.mq.produce.controller;

import com.mq.produce.service.SendService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@RestController
@RequestMapping("send-mq")
public class SendController {

    private static Logger logger =  LoggerFactory.getLogger(SendController.class);

    @Autowired
    private SendService sendService;


    @RequestMapping("/send")
    public String sendMessage(@RequestParam("msg") String msg) throws IOException, TimeoutException {
        sendService.sendMessage(msg);
        return "成功";
    }
}

package com.SMSService.Controller;

import com.SMSService.Payload.SmsRequest;
import com.SMSService.Service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsController {

    private final SmsService smsService;

    @Autowired
    public SmsController(SmsService smsService) {
        this.smsService = smsService;
    }

    @PostMapping("/send-sms")
    public void sendSms(@RequestBody SmsRequest smsRequest) {
        smsService.sendSms(smsRequest.getTo(), smsRequest.getMessage());
    }
}


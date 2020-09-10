package com.aviccii.mqtt.controller;

import com.aviccii.mqtt.config.MqttGateway;
import com.aviccii.mqtt.config.MqttSenderConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.logging.Handler;

/**
 * @author aviccii 2020/9/10
 * @Discrimination
 */
@RestController
@RequestMapping
public class TestController {

    @Autowired
    private MqttGateway mqttGateway;

    @GetMapping("/sendMqtt")
    public String sendMqtt(String sendData){
        mqttGateway.sendToMqtt(sendData,"test");
        return "OK";
    }

}

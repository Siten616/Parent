package com.st.controller;

import com.st.domain.Food;
import com.st.rabbitmq.springboot.RabbitSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: shentao
 * @Date: 2021/1/13 0013 16:08
 */
@RequestMapping("/food")
@RestController
public class FoodController {

    @Autowired
    RabbitSender rabbitSender;

    @RequestMapping(value = "/showfood", method = RequestMethod.GET)
    public Food showFood() {
        Food food = new Food(1, "苹果", "5");
        System.out.println(food);
        return food;
    }

    @RequestMapping(value = "/mq", method = RequestMethod.GET)
    public String sendRabbitMQ() {
        Map map = new HashMap();
        map.put("食物", "水果");
        try {
            rabbitSender.send("你好啊", map);
            return "RabbitMQ 发送成功";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "error";
    }
}

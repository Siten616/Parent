package com.st.controller;

import com.st.entity.Food;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: shentao
 * @Date: 2021/1/13 0013 16:08
 */
@RequestMapping("/food")
@RestController
public class FoodController {

    @ResponseBody
    @RequestMapping(value = "/showfood", method = RequestMethod.GET)
    public Food showFood() {
        Food food = new Food(1, "苹果", "5");
        System.out.println(food);
        return food;

    }
}

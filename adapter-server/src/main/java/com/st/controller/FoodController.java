package com.st.controller;

import com.st.domain.Food;
import com.st.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: shentao
 * @Date: 2021/1/13 0013 17:48
 */
@RestController
@RequestMapping(value = "/food")
public class FoodController {
    @Autowired
    FoodService foodService;

    @RequestMapping(value = "/showfood")
    public Food showFood() {
        return foodService.showFood();
    }

}

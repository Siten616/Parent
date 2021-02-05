package com.st.controller;

import com.st.domain.Food;
import com.st.domain.Restaurant;
import com.st.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

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


    @RequestMapping(value = "/showRestaurant")
    public String showRestaurant() {
        ArrayList arrayList = new ArrayList<Food>();
        arrayList.add(new Food(1, "水饺", "10"));
        System.out.println("size:"+arrayList.size());
        Restaurant restaurant = new Restaurant(1, "餐厅", "苏州", "小吃", arrayList);
        return restaurant.toString();
    }

}

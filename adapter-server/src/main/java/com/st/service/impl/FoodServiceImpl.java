package com.st.service.impl;

import com.st.domain.Food;
import com.st.remote.CoreRemote;
import com.st.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: shentao
 * @Date: 2021/1/13 0013 17:50
 */
@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    CoreRemote coreRemote;

    @Override
    public Food showFood() {
        Food food = coreRemote.showFood();
        return food;
    }
}

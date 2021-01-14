package com.st.remote;

import com.st.domain.Food;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "core-server/core-server")
public interface CoreRemote {

    @RequestMapping(value = "/food/showfood", method = RequestMethod.GET)
    Food showFood();

}

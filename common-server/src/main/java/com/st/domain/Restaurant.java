package com.st.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Restaurant {
    private Integer id;
    /**名称*/
    private String name;
    /**地址*/
    private String address;
    /**类型*/
    private String type;
    /**菜品*/
    private List<Food> foods;

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", foods=" + foods +foods.size()+
                '}';
    }
}

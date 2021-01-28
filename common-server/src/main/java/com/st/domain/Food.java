package com.st.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: shentao
 * @Date: 2021/1/14 0014 18:58
 */
@Data
@AllArgsConstructor
public class Food {
    private Integer id;
    /**名称*/
    private String name;
    /**价格*/
    private String price;
}

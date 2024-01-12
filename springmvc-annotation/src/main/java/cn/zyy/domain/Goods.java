package cn.zyy.domain;

import lombok.Data;

/**
 * @Author: Zz
 * @Date: 2023/11/21/10:10
 * @Description:  商品类
 */
@Data
public class Goods {

    private Integer id;
    private String name;
    private Double price;

    private People people;
}

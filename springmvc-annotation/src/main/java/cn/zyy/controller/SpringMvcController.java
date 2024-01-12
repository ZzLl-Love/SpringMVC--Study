package cn.zyy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Zz
 * @Date: 2023/11/16/16:47
 * @Description: 致敬
 */

@Controller
public class SpringMvcController {

    @RequestMapping("/common")
    public void test1(){
        System.out.println("测试是否能够进入test1方法");
    }
}

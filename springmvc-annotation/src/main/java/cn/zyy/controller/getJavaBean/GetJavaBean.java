package cn.zyy.controller.getJavaBean;

import cn.zyy.domain.Goods;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Zz
 * @Date: 2023/11/21/10:12
 * @Description: 致敬
 */

@Controller
@RequestMapping("/jb")
public class GetJavaBean {

    /**
     * 测试获取单个javabean对象,类里面的属性不是又一个类，非级联赋值
     * @param goods
     * @return
     */
    @GetMapping("/single")
    @ResponseBody
    public String single(Goods goods){
        System.out.println(goods);
        return "return:"+goods.toString();
    }

    /**
     * 测试级联赋值 类Goods中有一个属性为 People
     * @param goods
     * @return
     */
    @GetMapping("jl")
    @ResponseBody
    public String  testCascade(Goods goods){
        System.out.println("级联赋值===" + goods);
        return "级联赋值："+goods.toString();
    }


}

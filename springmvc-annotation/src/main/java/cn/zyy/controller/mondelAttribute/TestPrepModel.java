package cn.zyy.controller.mondelAttribute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @Author: Zz
 * @Date: 2023/11/21/10:58
 * @Description: 致敬
 */
@Controller
public class TestPrepModel {

    @ModelAttribute
    public void prepareModel(){
        System.out.println("先执行我，完成准备工作.....");
    }

    @GetMapping("/test1")
    public void test1(){
        System.out.println("-------test1方法-------");
    }


    @GetMapping("/test2")
    public void test2(){
        System.out.println("-------test2方法-------");
    }

}

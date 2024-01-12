package cn.zyy.controller.pathVariable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Zz
 * @Date: 2023/11/20/16:44
 * @Description: 致敬
 */

@Controller
public class TestPathVariable {

    @RequestMapping("/testPath")
    @ResponseBody
    public String testPath(String username){
        System.out.println("进入testPath");
        System.out.println(username);
        return username;
    }


    @RequestMapping("/testpath2/{username}/{password}")
    @ResponseBody
    public String testPath2(@PathVariable("username") String name,
                            @PathVariable("password") String mima){

        System.out.println("我进来了...");
        return "name:"+name + ":" +"password"+ mima;
    }
}

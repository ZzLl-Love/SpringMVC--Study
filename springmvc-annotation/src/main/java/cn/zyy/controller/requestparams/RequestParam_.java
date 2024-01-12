package cn.zyy.controller.requestparams;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Zz
 * @Date: 2023/11/21/9:32
 * @Description: 致敬
 */

@Controller
public class RequestParam_ {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String testRequestParam(@RequestParam("un") String username ,
                                   @RequestParam("pw") String password){
        System.out.println(username);
        System.out.println(password);
        return "参数请求成功";
    }
}

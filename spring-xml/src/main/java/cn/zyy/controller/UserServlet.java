package cn.zyy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Zz
 * @Date: 2023/11/13/19:16
 * @Description: 致敬
 */
@Controller
public class UserServlet {


    /**
     *
     * @return
     */
    @RequestMapping(value = "/login")
    public String login(String username, String password){

        System.out.println(username);
        System.out.println(password);

        System.out.println("login ok ....");
        return "login_ok";
    }
}

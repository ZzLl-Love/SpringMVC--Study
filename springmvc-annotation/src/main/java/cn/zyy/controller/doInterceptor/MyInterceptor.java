package cn.zyy.controller.doInterceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: Zz
 * @Date: 2023/11/21/11:35
 * @Description: 致敬
 */
@Component(value = "myInterceptor")
public class MyInterceptor implements HandlerInterceptor {

    /**
     * 在目标方法前执行
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("=================MyInterceptor perHandle===========================");
        return true;

    }

    /**
     * 在目标方法执行后执行
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        System.out.println("=================MyInterceptor postHandle===========================");
    }

    /**
     * 在视图解析器完成解析后执行
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("=================MyInterceptor afterCompletion===========================");

    }
}

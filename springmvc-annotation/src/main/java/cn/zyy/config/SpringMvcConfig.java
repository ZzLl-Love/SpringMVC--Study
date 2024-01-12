package cn.zyy.config;

import cn.zyy.controller.doInterceptor.MyInterceptor;
import cn.zyy.controller.doInterceptor.MyInterceptor02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: Zz
 * @Date: 2023/11/16/16:38
 * @Description: 致敬
 */

@Configuration
@ComponentScan("cn.zyy.controller")
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {

    /**
     * 注入拦截器
     */
    @Autowired
    MyInterceptor myInterceptor;

    @Autowired
    MyInterceptor02 myInterceptor02;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截所有的路径
        //registry.addInterceptor(myInterceptor).addPathPatterns("/*");
        //配置第二个拦截器的路径
        //registry.addInterceptor(myInterceptor02).addPathPatterns("/*");
    }
}

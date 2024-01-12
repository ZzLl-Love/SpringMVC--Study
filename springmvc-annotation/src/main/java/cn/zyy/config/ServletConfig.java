package cn.zyy.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @Author: Zz
 * @Date: 2023/11/16/16:35
 * @Description
 *
 *  相当于 web.xml 配置类
 */
public class ServletConfig extends AbstractDispatcherServletInitializer {



    @Override
    protected WebApplicationContext createServletApplicationContext() {

        //获取springMvc的容器
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(SpringMvcConfig.class);
        return context;

    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}

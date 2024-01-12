package cn.zyy.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Author: Zz
 * @Date: 2023/11/16/17:35
 * @Description: 致敬
 */
public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 配置spring交给web管理
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    /**
     * 配置springMvc交给web管理
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

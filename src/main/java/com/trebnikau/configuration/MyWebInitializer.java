package com.trebnikau.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    // Отвечает за ссылку на ApplicationContext
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MyConfig.class};
    }

    // Отвечает за url связанный с нашим приложением
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

package com.tjh.urule_server.common;

import com.bstek.urule.console.servlet.URuleServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author: tjh
 * @Date: 2020/7/3 17:33
 */
@Component
public class URuleServletRegistration {
    @Bean
    public ServletRegistrationBean registerURuleServlet()
    {
        return new ServletRegistrationBean(new URuleServlet(), new String[] { "/urule/*" });
    }
}

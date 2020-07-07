package com.tjh.excel_template.servlet;

import com.bstek.urule.KnowledgePackageReceiverServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author: tjh
 * @Date: 2020/7/7 11:17
 */
@Component
public class URuleServletRegistration {
    //此Servlet用于接收Urule服务端发布的知识包，使用开源版本时删除或者注释这个bean
/*    @Bean
    public ServletRegistrationBean registerURuleServlet(){
        return new ServletRegistrationBean(new KnowledgePackageReceiverServlet(),"/knowledgepackagereceiver");
    }*/
}

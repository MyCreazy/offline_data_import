package com.tjh.excel_template.controller;

import com.bstek.urule.Utils;
import com.bstek.urule.runtime.KnowledgePackage;
import com.bstek.urule.runtime.KnowledgeSession;
import com.bstek.urule.runtime.KnowledgeSessionFactory;
import com.bstek.urule.runtime.service.KnowledgeService;
import com.tjh.excel_template.model.UserAchievement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @Author: tjh
 * @Date: 2020/7/7 11:18
 */
@RestController
public class UruleTestController {
    @RequestMapping("/get_rule")
    public  String getRule()
    {
        KnowledgeService service=(KnowledgeService) Utils.getApplicationContext().getBean(KnowledgeService.BEAN_ID);
        //通过KnowledgeService接口获取指定的资源包"项目名/知识包名"
        KnowledgePackage knowledgePackage= null;
        try {
            knowledgePackage = service.getKnowledge("import_excel_data/1");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //通过取到的KnowledgePackage对象创建KnowledgeSession对象
        KnowledgeSession session= KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);

        UserAchievement userAchievement=new UserAchievement();
        userAchievement.setUser_name("张三/");
        userAchievement.setMonth_target("1");
        userAchievement.setYear_target("10");
        //将业务数据对象传入
        session.insert(userAchievement);
        //执行所有满足条件的规则
        session.fireRules();

        return  "success";
    }
}

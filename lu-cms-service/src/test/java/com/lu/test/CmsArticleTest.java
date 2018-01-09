/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.test;

import com.lu.cms.model.CmsArticle;
import com.lu.cms.service.CmsArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 *
 * @author huanlu
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/spring-mvc.xml", "classpath*:applicationContext-jdbc.xml" })
@WebAppConfiguration
public class CmsArticleTest {
    
    @Autowired
    CmsArticleService cmsArticleService;
    
//    @Test
//    public void inserttest(){
//        CmsArticle cmsArticle = new CmsArticle();
//        cmsArticle.setArticleId(103);
//        cmsArticle.setTitle("1111111");
//        cmsArticle.setType(new Byte("1"));
//        cmsArticle.setAllowcomments(new Byte("1"));
//        cmsArticle.setStatus(new Byte("1"));
//        cmsArticle.setUserId(1);
//        cmsArticle.setReadnumber(1);
//        cmsArticle.setTop(0);
//        cmsArticle.setCtime(Long.valueOf("1489845594355"));
//        cmsArticle.setOrders(Long.valueOf("1489845594355"));
//        cmsArticleService.insert(cmsArticle);
//    }
    
    @Test
    public void selectTest(){
        System.out.println("!!!!!!!" + cmsArticleService.selectByPrimaryKey(3));
    }

}

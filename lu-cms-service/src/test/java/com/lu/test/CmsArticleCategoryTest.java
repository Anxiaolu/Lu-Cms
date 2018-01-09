/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.test;

import com.lu.cms.service.CmsArticleCategoryService;
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
@ContextConfiguration(locations = { "classpath:spring/spring-mvc.xml", "classpath:spring-mybatis.xml" })
@WebAppConfiguration
public class CmsArticleCategoryTest {
    
    @Autowired
    CmsArticleCategoryService cmsArticleCategoryService;
    
//    @Test
//    private void insertTest(){
//        cmsArticleCategoryService.insert(new CmsArticleCategory(100, Integer.SIZE, Integer.BYTES));
//    }
}

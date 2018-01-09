/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.service.impl;

import com.lu.cms.dao.CmsArticleCategoryMapper;
import com.lu.cms.model.CmsArticleCategory;
import com.lu.cms.service.CmsArticleCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author huanlu
 */
@Service
public class CmsArticleCategoryServiceImpl implements CmsArticleCategoryService{
    
    @Autowired
    private CmsArticleCategoryMapper cmsArticleCategoryMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer articleCategoryId) {
        return cmsArticleCategoryMapper.deleteByPrimaryKey(articleCategoryId);
    }

    @Override
    public int insert(CmsArticleCategory record) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertSelective(CmsArticleCategory record) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CmsArticleCategory selectByPrimaryKey(Integer articleCategoryId) {
        String string = String.valueOf(1);
        return cmsArticleCategoryMapper.selectByPrimaryKey(articleCategoryId);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsArticleCategory record) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateByPrimaryKey(CmsArticleCategory record) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

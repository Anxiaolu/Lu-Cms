/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.service.impl;

import com.lu.cms.dao.CmsArticleMapper;
import com.lu.cms.model.CmsArticle;
import com.lu.cms.service.CmsArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author huanlu
 */
@Service
@SuppressWarnings("unchecked")
public class CmsArticleServiceImpl implements CmsArticleService{

    @Autowired
    private CmsArticleMapper cmsArticleDao;
    
    @Override
    public int deleteByPrimaryKey(Integer articleId) {
        return cmsArticleDao.deleteByPrimaryKey(articleId);
    }

    @Override
    public int insert(CmsArticle record) {
        return cmsArticleDao.insert(record);
    }

    @Override
    public int insertSelective(CmsArticle record) {
        return cmsArticleDao.insertSelective(record);
    }

    @Override
    public CmsArticle selectByPrimaryKey(Integer articleId) {
        return cmsArticleDao.selectByPrimaryKey(articleId);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsArticle record) {
        return cmsArticleDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(CmsArticle record) {
        return cmsArticleDao.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(CmsArticle record) {
        return updateByPrimaryKey(record);
    }
    
}

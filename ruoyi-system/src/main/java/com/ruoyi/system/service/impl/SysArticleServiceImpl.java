package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.domain.SysArticle;
import com.ruoyi.system.mapper.SysArticleMapper;
import com.ruoyi.system.service.ISysArticleService;

/**
 * 文章 服务层实现
 *
 * @author ruoyi
 */
@Service
public class SysArticleServiceImpl implements ISysArticleService
{
    @Autowired
    private SysArticleMapper articleMapper;

    /**
     * 查询文章信息
     *
     * @param articleId 文章ID
     * @return 文章信息
     */
    @Override
    public SysArticle selectArticleById(Long articleId)
    {
        return articleMapper.selectArticleById(articleId);
    }

    /**
     * 查询文章列表
     *
     * @param article 文章信息
     * @return 文章集合
     */
    @Override
    public List<SysArticle> selectArticleList(SysArticle article)
    {
        return articleMapper.selectArticleList(article);
    }

    /**
     * 新增文章
     *
     * @param article 文章信息
     * @return 结果
     */
    @Override
    public int insertArticle(SysArticle article)
    {
        return articleMapper.insertArticle(article);
    }

    /**
     * 修改文章
     *
     * @param article 文章信息
     * @return 结果
     */
    @Override
    public int updateArticle(SysArticle article)
    {
        return articleMapper.updateArticle(article);
    }

    /**
     * 删除文章信息
     *
     * @param articleId 文章ID
     * @return 结果
     */
    @Override
    public int deleteArticleById(Long articleId)
    {
        return articleMapper.deleteArticleById(articleId);
    }

    /**
     * 批量删除文章信息
     *
     * @param articleIds 需要删除的文章ID
     * @return 结果
     */
    @Override
    public int deleteArticleByIds(Long[] articleIds)
    {
        return articleMapper.deleteArticleByIds(articleIds);
    }
}

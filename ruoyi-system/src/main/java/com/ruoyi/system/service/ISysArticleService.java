package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysArticle;

/**
 * 文章 服务层
 *
 * @author ruoyi
 */
public interface ISysArticleService
{
    /**
     * 查询文章信息
     *
     * @param articleId 文章ID
     * @return 文章信息
     */
    public SysArticle selectArticleById(Long articleId);

    /**
     * 查询文章列表
     *
     * @param article 文章信息
     * @return 文章集合
     */
    public List<SysArticle> selectArticleList(SysArticle article);

    /**
     * 新增文章
     *
     * @param article 文章信息
     * @return 结果
     */
    public int insertArticle(SysArticle article);

    /**
     * 修改文章
     *
     * @param article 文章信息
     * @return 结果
     */
    public int updateArticle(SysArticle article);

    /**
     * 删除文章信息
     *
     * @param articleId 文章ID
     * @return 结果
     */
    public int deleteArticleById(Long articleId);

    /**
     * 批量删除文章信息
     *
     * @param articleIds 需要删除的文章ID
     * @return 结果
     */
    public int deleteArticleByIds(Long[] articleIds);
}

package com.ruoyi.paper.service;

import java.util.List;
import com.ruoyi.paper.domain.Paper;

/**
 * 试卷管理Service接口
 * 
 * @author ruoyi
 * @date 2024-01-19
 */
public interface IPaperService 
{
    /**
     * 查询试卷管理
     * 
     * @param paperId 试卷管理主键
     * @return 试卷管理
     */
    public Paper selectPaperByPaperId(String paperId);

    /**
     * 查询试卷管理列表
     * 
     * @param paper 试卷管理
     * @return 试卷管理集合
     */
    public List<Paper> selectPaperList(Paper paper);

    /**
     * 新增试卷管理
     * 
     * @param paper 试卷管理
     * @return 结果
     */
    public int insertPaper(Paper paper);

    /**
     * 修改试卷管理
     * 
     * @param paper 试卷管理
     * @return 结果
     */
    public int updatePaper(Paper paper);

    /**
     * 批量删除试卷管理
     * 
     * @param paperIds 需要删除的试卷管理主键集合
     * @return 结果
     */
    public int deletePaperByPaperIds(String[] paperIds);

    /**
     * 删除试卷管理信息
     * 
     * @param paperId 试卷管理主键
     * @return 结果
     */
    public int deletePaperByPaperId(String paperId);
}

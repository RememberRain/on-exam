package com.ruoyi.result.service;

import java.util.List;
import com.ruoyi.result.domain.PaperResult;

/**
 * 考试结果Service接口
 * 
 * @author lyj
 * @date 2024-01-19
 */
public interface IPaperResultService 
{
    /**
     * 查询考试结果
     * 
     * @param paperId 考试结果主键
     * @return 考试结果
     */
    public PaperResult selectPaperResultByPaperId(String paperId);

    /**
     * 查询考试结果列表
     * 
     * @param paperResult 考试结果
     * @return 考试结果集合
     */
    public List<PaperResult> selectPaperResultList(PaperResult paperResult);

    /**
     * 新增考试结果
     * 
     * @param paperResult 考试结果
     * @return 结果
     */
    public int insertPaperResult(PaperResult paperResult);

    /**
     * 修改考试结果
     * 
     * @param paperResult 考试结果
     * @return 结果
     */
    public int updatePaperResult(PaperResult paperResult);

    /**
     * 批量删除考试结果
     * 
     * @param paperIds 需要删除的考试结果主键集合
     * @return 结果
     */
    public int deletePaperResultByPaperIds(String[] paperIds);

    /**
     * 删除考试结果信息
     * 
     * @param paperId 考试结果主键
     * @return 结果
     */
    public int deletePaperResultByPaperId(String paperId);
}

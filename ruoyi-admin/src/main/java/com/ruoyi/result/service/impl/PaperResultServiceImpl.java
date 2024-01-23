package com.ruoyi.result.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.result.mapper.PaperResultMapper;
import com.ruoyi.result.domain.PaperResult;
import com.ruoyi.result.service.IPaperResultService;

/**
 * 考试结果Service业务层处理
 * 
 * @author lyj
 * @date 2024-01-19
 */
@Service
public class PaperResultServiceImpl implements IPaperResultService 
{
    @Autowired
    private PaperResultMapper paperResultMapper;

    /**
     * 查询考试结果
     * 
     * @param paperId 考试结果主键
     * @return 考试结果
     */
    @Override
    public PaperResult selectPaperResultByPaperId(String paperId)
    {
        return paperResultMapper.selectPaperResultByPaperId(paperId);
    }

    /**
     * 查询考试结果列表
     * 
     * @param paperResult 考试结果
     * @return 考试结果
     */
    @Override
    public List<PaperResult> selectPaperResultList(PaperResult paperResult)
    {
        return paperResultMapper.selectPaperResultList(paperResult);
    }

    /**
     * 新增考试结果
     * 
     * @param paperResult 考试结果
     * @return 结果
     */
    @Override
    public int insertPaperResult(PaperResult paperResult)
    {
        return paperResultMapper.insertPaperResult(paperResult);
    }

    /**
     * 修改考试结果
     * 
     * @param paperResult 考试结果
     * @return 结果
     */
    @Override
    public int updatePaperResult(PaperResult paperResult)
    {
        return paperResultMapper.updatePaperResult(paperResult);
    }

    /**
     * 批量删除考试结果
     * 
     * @param paperIds 需要删除的考试结果主键
     * @return 结果
     */
    @Override
    public int deletePaperResultByPaperIds(String[] paperIds)
    {
        return paperResultMapper.deletePaperResultByPaperIds(paperIds);
    }

    /**
     * 删除考试结果信息
     * 
     * @param paperId 考试结果主键
     * @return 结果
     */
    @Override
    public int deletePaperResultByPaperId(String paperId)
    {
        return paperResultMapper.deletePaperResultByPaperId(paperId);
    }
}

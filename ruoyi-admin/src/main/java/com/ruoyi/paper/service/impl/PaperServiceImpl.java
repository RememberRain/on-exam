package com.ruoyi.paper.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.paper.mapper.PaperMapper;
import com.ruoyi.paper.domain.Paper;
import com.ruoyi.paper.service.IPaperService;

/**
 * 试卷管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-19
 */
@Service
public class PaperServiceImpl implements IPaperService 
{
    @Autowired
    private PaperMapper paperMapper;

    /**
     * 查询试卷管理
     * 
     * @param paperId 试卷管理主键
     * @return 试卷管理
     */
    @Override
    public Paper selectPaperByPaperId(String paperId)
    {
        return paperMapper.selectPaperByPaperId(paperId);
    }

    /**
     * 查询试卷管理列表
     * 
     * @param paper 试卷管理
     * @return 试卷管理
     */
    @Override
    public List<Paper> selectPaperList(Paper paper)
    {
        return paperMapper.selectPaperList(paper);
    }

    /**
     * 新增试卷管理
     * 
     * @param paper 试卷管理
     * @return 结果
     */
    @Override
    public int insertPaper(Paper paper)
    {
        paper.setCreateTime(DateUtils.getNowDate());
        return paperMapper.insertPaper(paper);
    }

    /**
     * 修改试卷管理
     * 
     * @param paper 试卷管理
     * @return 结果
     */
    @Override
    public int updatePaper(Paper paper)
    {
        paper.setUpdateTime(DateUtils.getNowDate());
        return paperMapper.updatePaper(paper);
    }

    /**
     * 批量删除试卷管理
     * 
     * @param paperIds 需要删除的试卷管理主键
     * @return 结果
     */
    @Override
    public int deletePaperByPaperIds(String[] paperIds)
    {
        return paperMapper.deletePaperByPaperIds(paperIds);
    }

    /**
     * 删除试卷管理信息
     * 
     * @param paperId 试卷管理主键
     * @return 结果
     */
    @Override
    public int deletePaperByPaperId(String paperId)
    {
        return paperMapper.deletePaperByPaperId(paperId);
    }
}

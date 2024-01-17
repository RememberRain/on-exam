package com.ruoyi.chineseTf.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.chineseTf.mapper.TestChineseTfMapper;
import com.ruoyi.chineseTf.domain.TestChineseTf;
import com.ruoyi.chineseTf.service.ITestChineseTfService;

/**
 * 判断题Service业务层处理
 * 
 * @author lyj
 * @date 2024-01-17
 */
@Service
public class TestChineseTfServiceImpl implements ITestChineseTfService 
{
    @Autowired
    private TestChineseTfMapper testChineseTfMapper;

    /**
     * 查询判断题
     * 
     * @param questionId 判断题主键
     * @return 判断题
     */
    @Override
    public TestChineseTf selectTestChineseTfByQuestionId(String questionId)
    {
        return testChineseTfMapper.selectTestChineseTfByQuestionId(questionId);
    }

    /**
     * 查询判断题列表
     * 
     * @param testChineseTf 判断题
     * @return 判断题
     */
    @Override
    public List<TestChineseTf> selectTestChineseTfList(TestChineseTf testChineseTf)
    {
        return testChineseTfMapper.selectTestChineseTfList(testChineseTf);
    }

    /**
     * 新增判断题
     * 
     * @param testChineseTf 判断题
     * @return 结果
     */
    @Override
    public int insertTestChineseTf(TestChineseTf testChineseTf)
    {
        return testChineseTfMapper.insertTestChineseTf(testChineseTf);
    }

    /**
     * 修改判断题
     * 
     * @param testChineseTf 判断题
     * @return 结果
     */
    @Override
    public int updateTestChineseTf(TestChineseTf testChineseTf)
    {
        return testChineseTfMapper.updateTestChineseTf(testChineseTf);
    }

    /**
     * 批量删除判断题
     * 
     * @param questionIds 需要删除的判断题主键
     * @return 结果
     */
    @Override
    public int deleteTestChineseTfByQuestionIds(String[] questionIds)
    {
        return testChineseTfMapper.deleteTestChineseTfByQuestionIds(questionIds);
    }

    /**
     * 删除判断题信息
     * 
     * @param questionId 判断题主键
     * @return 结果
     */
    @Override
    public int deleteTestChineseTfByQuestionId(String questionId)
    {
        return testChineseTfMapper.deleteTestChineseTfByQuestionId(questionId);
    }
}

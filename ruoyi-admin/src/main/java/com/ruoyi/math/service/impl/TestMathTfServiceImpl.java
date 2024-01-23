package com.ruoyi.math.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.math.mapper.TestMathTfMapper;
import com.ruoyi.math.domain.TestMathTf;
import com.ruoyi.math.service.ITestMathTfService;

/**
 * 判断题Service业务层处理
 * 
 * @author lyj
 * @date 2024-01-18
 */
@Service
public class TestMathTfServiceImpl implements ITestMathTfService 
{
    @Autowired
    private TestMathTfMapper testMathTfMapper;

    /**
     * 查询判断题
     * 
     * @param questionId 判断题主键
     * @return 判断题
     */
    @Override
    public TestMathTf selectTestMathTfByQuestionId(String questionId)
    {
        return testMathTfMapper.selectTestMathTfByQuestionId(questionId);
    }

    /**
     * 查询判断题列表
     * 
     * @param testMathTf 判断题
     * @return 判断题
     */
    @Override
    public List<TestMathTf> selectTestMathTfList(TestMathTf testMathTf)
    {
        return testMathTfMapper.selectTestMathTfList(testMathTf);
    }

    /**
     * 新增判断题
     * 
     * @param testMathTf 判断题
     * @return 结果
     */
    @Override
    public int insertTestMathTf(TestMathTf testMathTf)
    {
        return testMathTfMapper.insertTestMathTf(testMathTf);
    }

    /**
     * 修改判断题
     * 
     * @param testMathTf 判断题
     * @return 结果
     */
    @Override
    public int updateTestMathTf(TestMathTf testMathTf)
    {
        return testMathTfMapper.updateTestMathTf(testMathTf);
    }

    /**
     * 批量删除判断题
     * 
     * @param questionIds 需要删除的判断题主键
     * @return 结果
     */
    @Override
    public int deleteTestMathTfByQuestionIds(String[] questionIds)
    {
        return testMathTfMapper.deleteTestMathTfByQuestionIds(questionIds);
    }

    /**
     * 删除判断题信息
     * 
     * @param questionId 判断题主键
     * @return 结果
     */
    @Override
    public int deleteTestMathTfByQuestionId(String questionId)
    {
        return testMathTfMapper.deleteTestMathTfByQuestionId(questionId);
    }
}

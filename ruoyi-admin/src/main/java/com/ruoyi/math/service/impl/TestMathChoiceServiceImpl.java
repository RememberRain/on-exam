package com.ruoyi.math.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.math.mapper.TestMathChoiceMapper;
import com.ruoyi.math.domain.TestMathChoice;
import com.ruoyi.math.service.ITestMathChoiceService;

/**
 * 选择题Service业务层处理
 * 
 * @author lyj
 * @date 2024-01-18
 */
@Service
public class TestMathChoiceServiceImpl implements ITestMathChoiceService 
{
    @Autowired
    private TestMathChoiceMapper testMathChoiceMapper;

    /**
     * 查询选择题
     * 
     * @param questionId 选择题主键
     * @return 选择题
     */
    @Override
    public TestMathChoice selectTestMathChoiceByQuestionId(String questionId)
    {
        return testMathChoiceMapper.selectTestMathChoiceByQuestionId(questionId);
    }

    /**
     * 查询选择题列表
     * 
     * @param testMathChoice 选择题
     * @return 选择题
     */
    @Override
    public List<TestMathChoice> selectTestMathChoiceList(TestMathChoice testMathChoice)
    {
        return testMathChoiceMapper.selectTestMathChoiceList(testMathChoice);
    }

    /**
     * 新增选择题
     * 
     * @param testMathChoice 选择题
     * @return 结果
     */
    @Override
    public int insertTestMathChoice(TestMathChoice testMathChoice)
    {
        return testMathChoiceMapper.insertTestMathChoice(testMathChoice);
    }

    /**
     * 修改选择题
     * 
     * @param testMathChoice 选择题
     * @return 结果
     */
    @Override
    public int updateTestMathChoice(TestMathChoice testMathChoice)
    {
        return testMathChoiceMapper.updateTestMathChoice(testMathChoice);
    }

    /**
     * 批量删除选择题
     * 
     * @param questionIds 需要删除的选择题主键
     * @return 结果
     */
    @Override
    public int deleteTestMathChoiceByQuestionIds(String[] questionIds)
    {
        return testMathChoiceMapper.deleteTestMathChoiceByQuestionIds(questionIds);
    }

    /**
     * 删除选择题信息
     * 
     * @param questionId 选择题主键
     * @return 结果
     */
    @Override
    public int deleteTestMathChoiceByQuestionId(String questionId)
    {
        return testMathChoiceMapper.deleteTestMathChoiceByQuestionId(questionId);
    }
}

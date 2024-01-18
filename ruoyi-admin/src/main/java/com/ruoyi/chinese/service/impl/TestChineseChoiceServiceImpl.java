package com.ruoyi.chinese.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.chinese.mapper.TestChineseChoiceMapper;
import com.ruoyi.chinese.domain.TestChineseChoice;
import com.ruoyi.chinese.service.ITestChineseChoiceService;

/**
 * 选择题Service业务层处理
 * 
 * @author lyj
 * @date 2024-01-18
 */
@Service
public class TestChineseChoiceServiceImpl implements ITestChineseChoiceService 
{
    @Autowired
    private TestChineseChoiceMapper testChineseChoiceMapper;

    /**
     * 查询选择题
     * 
     * @param questionId 选择题主键
     * @return 选择题
     */
    @Override
    public TestChineseChoice selectTestChineseChoiceByQuestionId(String questionId)
    {
        return testChineseChoiceMapper.selectTestChineseChoiceByQuestionId(questionId);
    }

    /**
     * 查询选择题列表
     * 
     * @param testChineseChoice 选择题
     * @return 选择题
     */
    @Override
    public List<TestChineseChoice> selectTestChineseChoiceList(TestChineseChoice testChineseChoice)
    {
        return testChineseChoiceMapper.selectTestChineseChoiceList(testChineseChoice);
    }

    /**
     * 新增选择题
     * 
     * @param testChineseChoice 选择题
     * @return 结果
     */
    @Override
    public int insertTestChineseChoice(TestChineseChoice testChineseChoice)
    {
        return testChineseChoiceMapper.insertTestChineseChoice(testChineseChoice);
    }

    /**
     * 修改选择题
     * 
     * @param testChineseChoice 选择题
     * @return 结果
     */
    @Override
    public int updateTestChineseChoice(TestChineseChoice testChineseChoice)
    {
        return testChineseChoiceMapper.updateTestChineseChoice(testChineseChoice);
    }

    /**
     * 批量删除选择题
     * 
     * @param questionIds 需要删除的选择题主键
     * @return 结果
     */
    @Override
    public int deleteTestChineseChoiceByQuestionIds(String[] questionIds)
    {
        return testChineseChoiceMapper.deleteTestChineseChoiceByQuestionIds(questionIds);
    }

    /**
     * 删除选择题信息
     * 
     * @param questionId 选择题主键
     * @return 结果
     */
    @Override
    public int deleteTestChineseChoiceByQuestionId(String questionId)
    {
        return testChineseChoiceMapper.deleteTestChineseChoiceByQuestionId(questionId);
    }
}

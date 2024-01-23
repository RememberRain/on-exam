package com.ruoyi.english.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.english.mapper.TestEnglishChoiceMapper;
import com.ruoyi.english.domain.TestEnglishChoice;
import com.ruoyi.english.service.ITestEnglishChoiceService;

/**
 * 选择题Service业务层处理
 * 
 * @author lyj
 * @date 2024-01-18
 */
@Service
public class TestEnglishChoiceServiceImpl implements ITestEnglishChoiceService 
{
    @Autowired
    private TestEnglishChoiceMapper testEnglishChoiceMapper;

    /**
     * 查询选择题
     * 
     * @param questionId 选择题主键
     * @return 选择题
     */
    @Override
    public TestEnglishChoice selectTestEnglishChoiceByQuestionId(String questionId)
    {
        return testEnglishChoiceMapper.selectTestEnglishChoiceByQuestionId(questionId);
    }

    /**
     * 查询选择题列表
     * 
     * @param testEnglishChoice 选择题
     * @return 选择题
     */
    @Override
    public List<TestEnglishChoice> selectTestEnglishChoiceList(TestEnglishChoice testEnglishChoice)
    {
        return testEnglishChoiceMapper.selectTestEnglishChoiceList(testEnglishChoice);
    }

    /**
     * 新增选择题
     * 
     * @param testEnglishChoice 选择题
     * @return 结果
     */
    @Override
    public int insertTestEnglishChoice(TestEnglishChoice testEnglishChoice)
    {
        return testEnglishChoiceMapper.insertTestEnglishChoice(testEnglishChoice);
    }

    /**
     * 修改选择题
     * 
     * @param testEnglishChoice 选择题
     * @return 结果
     */
    @Override
    public int updateTestEnglishChoice(TestEnglishChoice testEnglishChoice)
    {
        return testEnglishChoiceMapper.updateTestEnglishChoice(testEnglishChoice);
    }

    /**
     * 批量删除选择题
     * 
     * @param questionIds 需要删除的选择题主键
     * @return 结果
     */
    @Override
    public int deleteTestEnglishChoiceByQuestionIds(String[] questionIds)
    {
        return testEnglishChoiceMapper.deleteTestEnglishChoiceByQuestionIds(questionIds);
    }

    /**
     * 删除选择题信息
     * 
     * @param questionId 选择题主键
     * @return 结果
     */
    @Override
    public int deleteTestEnglishChoiceByQuestionId(String questionId)
    {
        return testEnglishChoiceMapper.deleteTestEnglishChoiceByQuestionId(questionId);
    }
}

package com.ruoyi.english.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.english.mapper.TestEnglishTfMapper;
import com.ruoyi.english.domain.TestEnglishTf;
import com.ruoyi.english.service.ITestEnglishTfService;

/**
 * 判断题Service业务层处理
 * 
 * @author lyj
 * @date 2024-01-18
 */
@Service
public class TestEnglishTfServiceImpl implements ITestEnglishTfService 
{
    @Autowired
    private TestEnglishTfMapper testEnglishTfMapper;

    /**
     * 查询判断题
     * 
     * @param questionId 判断题主键
     * @return 判断题
     */
    @Override
    public TestEnglishTf selectTestEnglishTfByQuestionId(String questionId)
    {
        return testEnglishTfMapper.selectTestEnglishTfByQuestionId(questionId);
    }

    /**
     * 查询判断题列表
     * 
     * @param testEnglishTf 判断题
     * @return 判断题
     */
    @Override
    public List<TestEnglishTf> selectTestEnglishTfList(TestEnglishTf testEnglishTf)
    {
        return testEnglishTfMapper.selectTestEnglishTfList(testEnglishTf);
    }

    /**
     * 新增判断题
     * 
     * @param testEnglishTf 判断题
     * @return 结果
     */
    @Override
    public int insertTestEnglishTf(TestEnglishTf testEnglishTf)
    {
        return testEnglishTfMapper.insertTestEnglishTf(testEnglishTf);
    }

    /**
     * 修改判断题
     * 
     * @param testEnglishTf 判断题
     * @return 结果
     */
    @Override
    public int updateTestEnglishTf(TestEnglishTf testEnglishTf)
    {
        return testEnglishTfMapper.updateTestEnglishTf(testEnglishTf);
    }

    /**
     * 批量删除判断题
     * 
     * @param questionIds 需要删除的判断题主键
     * @return 结果
     */
    @Override
    public int deleteTestEnglishTfByQuestionIds(String[] questionIds)
    {
        return testEnglishTfMapper.deleteTestEnglishTfByQuestionIds(questionIds);
    }

    /**
     * 删除判断题信息
     * 
     * @param questionId 判断题主键
     * @return 结果
     */
    @Override
    public int deleteTestEnglishTfByQuestionId(String questionId)
    {
        return testEnglishTfMapper.deleteTestEnglishTfByQuestionId(questionId);
    }
}

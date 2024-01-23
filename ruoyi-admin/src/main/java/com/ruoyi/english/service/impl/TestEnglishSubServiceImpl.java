package com.ruoyi.english.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.english.mapper.TestEnglishSubMapper;
import com.ruoyi.english.domain.TestEnglishSub;
import com.ruoyi.english.service.ITestEnglishSubService;

/**
 * 主观题Service业务层处理
 * 
 * @author lyj
 * @date 2024-01-18
 */
@Service
public class TestEnglishSubServiceImpl implements ITestEnglishSubService 
{
    @Autowired
    private TestEnglishSubMapper testEnglishSubMapper;

    /**
     * 查询主观题
     * 
     * @param questionId 主观题主键
     * @return 主观题
     */
    @Override
    public TestEnglishSub selectTestEnglishSubByQuestionId(String questionId)
    {
        return testEnglishSubMapper.selectTestEnglishSubByQuestionId(questionId);
    }

    /**
     * 查询主观题列表
     * 
     * @param testEnglishSub 主观题
     * @return 主观题
     */
    @Override
    public List<TestEnglishSub> selectTestEnglishSubList(TestEnglishSub testEnglishSub)
    {
        return testEnglishSubMapper.selectTestEnglishSubList(testEnglishSub);
    }

    /**
     * 新增主观题
     * 
     * @param testEnglishSub 主观题
     * @return 结果
     */
    @Override
    public int insertTestEnglishSub(TestEnglishSub testEnglishSub)
    {
        return testEnglishSubMapper.insertTestEnglishSub(testEnglishSub);
    }

    /**
     * 修改主观题
     * 
     * @param testEnglishSub 主观题
     * @return 结果
     */
    @Override
    public int updateTestEnglishSub(TestEnglishSub testEnglishSub)
    {
        return testEnglishSubMapper.updateTestEnglishSub(testEnglishSub);
    }

    /**
     * 批量删除主观题
     * 
     * @param questionIds 需要删除的主观题主键
     * @return 结果
     */
    @Override
    public int deleteTestEnglishSubByQuestionIds(String[] questionIds)
    {
        return testEnglishSubMapper.deleteTestEnglishSubByQuestionIds(questionIds);
    }

    /**
     * 删除主观题信息
     * 
     * @param questionId 主观题主键
     * @return 结果
     */
    @Override
    public int deleteTestEnglishSubByQuestionId(String questionId)
    {
        return testEnglishSubMapper.deleteTestEnglishSubByQuestionId(questionId);
    }
}

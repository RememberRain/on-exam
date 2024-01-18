package com.ruoyi.chinese.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.chinese.mapper.TestChineseSubMapper;
import com.ruoyi.chinese.domain.TestChineseSub;
import com.ruoyi.chinese.service.ITestChineseSubService;

/**
 * 主观题Service业务层处理
 * 
 * @author lyj
 * @date 2024-01-18
 */
@Service
public class TestChineseSubServiceImpl implements ITestChineseSubService 
{
    @Autowired
    private TestChineseSubMapper testChineseSubMapper;

    /**
     * 查询主观题
     * 
     * @param questionId 主观题主键
     * @return 主观题
     */
    @Override
    public TestChineseSub selectTestChineseSubByQuestionId(String questionId)
    {
        return testChineseSubMapper.selectTestChineseSubByQuestionId(questionId);
    }

    /**
     * 查询主观题列表
     * 
     * @param testChineseSub 主观题
     * @return 主观题
     */
    @Override
    public List<TestChineseSub> selectTestChineseSubList(TestChineseSub testChineseSub)
    {
        return testChineseSubMapper.selectTestChineseSubList(testChineseSub);
    }

    /**
     * 新增主观题
     * 
     * @param testChineseSub 主观题
     * @return 结果
     */
    @Override
    public int insertTestChineseSub(TestChineseSub testChineseSub)
    {
        return testChineseSubMapper.insertTestChineseSub(testChineseSub);
    }

    /**
     * 修改主观题
     * 
     * @param testChineseSub 主观题
     * @return 结果
     */
    @Override
    public int updateTestChineseSub(TestChineseSub testChineseSub)
    {
        return testChineseSubMapper.updateTestChineseSub(testChineseSub);
    }

    /**
     * 批量删除主观题
     * 
     * @param questionIds 需要删除的主观题主键
     * @return 结果
     */
    @Override
    public int deleteTestChineseSubByQuestionIds(String[] questionIds)
    {
        return testChineseSubMapper.deleteTestChineseSubByQuestionIds(questionIds);
    }

    /**
     * 删除主观题信息
     * 
     * @param questionId 主观题主键
     * @return 结果
     */
    @Override
    public int deleteTestChineseSubByQuestionId(String questionId)
    {
        return testChineseSubMapper.deleteTestChineseSubByQuestionId(questionId);
    }
}

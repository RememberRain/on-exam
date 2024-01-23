package com.ruoyi.math.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.math.mapper.TestMathSubMapper;
import com.ruoyi.math.domain.TestMathSub;
import com.ruoyi.math.service.ITestMathSubService;

/**
 * 主观题Service业务层处理
 * 
 * @author lyj
 * @date 2024-01-18
 */
@Service
public class TestMathSubServiceImpl implements ITestMathSubService 
{
    @Autowired
    private TestMathSubMapper testMathSubMapper;

    /**
     * 查询主观题
     * 
     * @param questionId 主观题主键
     * @return 主观题
     */
    @Override
    public TestMathSub selectTestMathSubByQuestionId(String questionId)
    {
        return testMathSubMapper.selectTestMathSubByQuestionId(questionId);
    }

    /**
     * 查询主观题列表
     * 
     * @param testMathSub 主观题
     * @return 主观题
     */
    @Override
    public List<TestMathSub> selectTestMathSubList(TestMathSub testMathSub)
    {
        return testMathSubMapper.selectTestMathSubList(testMathSub);
    }

    /**
     * 新增主观题
     * 
     * @param testMathSub 主观题
     * @return 结果
     */
    @Override
    public int insertTestMathSub(TestMathSub testMathSub)
    {
        return testMathSubMapper.insertTestMathSub(testMathSub);
    }

    /**
     * 修改主观题
     * 
     * @param testMathSub 主观题
     * @return 结果
     */
    @Override
    public int updateTestMathSub(TestMathSub testMathSub)
    {
        return testMathSubMapper.updateTestMathSub(testMathSub);
    }

    /**
     * 批量删除主观题
     * 
     * @param questionIds 需要删除的主观题主键
     * @return 结果
     */
    @Override
    public int deleteTestMathSubByQuestionIds(String[] questionIds)
    {
        return testMathSubMapper.deleteTestMathSubByQuestionIds(questionIds);
    }

    /**
     * 删除主观题信息
     * 
     * @param questionId 主观题主键
     * @return 结果
     */
    @Override
    public int deleteTestMathSubByQuestionId(String questionId)
    {
        return testMathSubMapper.deleteTestMathSubByQuestionId(questionId);
    }
}

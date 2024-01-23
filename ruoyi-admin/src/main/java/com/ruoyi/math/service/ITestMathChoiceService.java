package com.ruoyi.math.service;

import java.util.List;
import com.ruoyi.math.domain.TestMathChoice;

/**
 * 选择题Service接口
 * 
 * @author lyj
 * @date 2024-01-18
 */
public interface ITestMathChoiceService 
{
    /**
     * 查询选择题
     * 
     * @param questionId 选择题主键
     * @return 选择题
     */
    public TestMathChoice selectTestMathChoiceByQuestionId(String questionId);

    /**
     * 查询选择题列表
     * 
     * @param testMathChoice 选择题
     * @return 选择题集合
     */
    public List<TestMathChoice> selectTestMathChoiceList(TestMathChoice testMathChoice);

    /**
     * 新增选择题
     * 
     * @param testMathChoice 选择题
     * @return 结果
     */
    public int insertTestMathChoice(TestMathChoice testMathChoice);

    /**
     * 修改选择题
     * 
     * @param testMathChoice 选择题
     * @return 结果
     */
    public int updateTestMathChoice(TestMathChoice testMathChoice);

    /**
     * 批量删除选择题
     * 
     * @param questionIds 需要删除的选择题主键集合
     * @return 结果
     */
    public int deleteTestMathChoiceByQuestionIds(String[] questionIds);

    /**
     * 删除选择题信息
     * 
     * @param questionId 选择题主键
     * @return 结果
     */
    public int deleteTestMathChoiceByQuestionId(String questionId);
}

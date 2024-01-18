package com.ruoyi.chinese.service;

import java.util.List;
import com.ruoyi.chinese.domain.TestChineseChoice;

/**
 * 选择题Service接口
 * 
 * @author lyj
 * @date 2024-01-18
 */
public interface ITestChineseChoiceService 
{
    /**
     * 查询选择题
     * 
     * @param questionId 选择题主键
     * @return 选择题
     */
    public TestChineseChoice selectTestChineseChoiceByQuestionId(String questionId);

    /**
     * 查询选择题列表
     * 
     * @param testChineseChoice 选择题
     * @return 选择题集合
     */
    public List<TestChineseChoice> selectTestChineseChoiceList(TestChineseChoice testChineseChoice);

    /**
     * 新增选择题
     * 
     * @param testChineseChoice 选择题
     * @return 结果
     */
    public int insertTestChineseChoice(TestChineseChoice testChineseChoice);

    /**
     * 修改选择题
     * 
     * @param testChineseChoice 选择题
     * @return 结果
     */
    public int updateTestChineseChoice(TestChineseChoice testChineseChoice);

    /**
     * 批量删除选择题
     * 
     * @param questionIds 需要删除的选择题主键集合
     * @return 结果
     */
    public int deleteTestChineseChoiceByQuestionIds(String[] questionIds);

    /**
     * 删除选择题信息
     * 
     * @param questionId 选择题主键
     * @return 结果
     */
    public int deleteTestChineseChoiceByQuestionId(String questionId);
}

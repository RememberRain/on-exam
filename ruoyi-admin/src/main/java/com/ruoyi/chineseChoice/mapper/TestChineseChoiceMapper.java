package com.ruoyi.chineseChoice.mapper;

import java.util.List;
import com.ruoyi.chineseChoice.domain.TestChineseChoice;

/**
 * 选择题Mapper接口
 * 
 * @author lyj
 * @date 2024-01-17
 */
public interface TestChineseChoiceMapper 
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
     * 删除选择题
     * 
     * @param questionId 选择题主键
     * @return 结果
     */
    public int deleteTestChineseChoiceByQuestionId(String questionId);

    /**
     * 批量删除选择题
     * 
     * @param questionIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTestChineseChoiceByQuestionIds(String[] questionIds);
}

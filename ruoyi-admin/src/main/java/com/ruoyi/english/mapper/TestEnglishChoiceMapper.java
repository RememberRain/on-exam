package com.ruoyi.english.mapper;

import java.util.List;
import com.ruoyi.english.domain.TestEnglishChoice;

/**
 * 选择题Mapper接口
 * 
 * @author lyj
 * @date 2024-01-18
 */
public interface TestEnglishChoiceMapper 
{
    /**
     * 查询选择题
     * 
     * @param questionId 选择题主键
     * @return 选择题
     */
    public TestEnglishChoice selectTestEnglishChoiceByQuestionId(String questionId);

    /**
     * 查询选择题列表
     * 
     * @param testEnglishChoice 选择题
     * @return 选择题集合
     */
    public List<TestEnglishChoice> selectTestEnglishChoiceList(TestEnglishChoice testEnglishChoice);

    /**
     * 新增选择题
     * 
     * @param testEnglishChoice 选择题
     * @return 结果
     */
    public int insertTestEnglishChoice(TestEnglishChoice testEnglishChoice);

    /**
     * 修改选择题
     * 
     * @param testEnglishChoice 选择题
     * @return 结果
     */
    public int updateTestEnglishChoice(TestEnglishChoice testEnglishChoice);

    /**
     * 删除选择题
     * 
     * @param questionId 选择题主键
     * @return 结果
     */
    public int deleteTestEnglishChoiceByQuestionId(String questionId);

    /**
     * 批量删除选择题
     * 
     * @param questionIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTestEnglishChoiceByQuestionIds(String[] questionIds);
}

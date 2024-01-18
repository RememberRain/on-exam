package com.ruoyi.english.service;

import java.util.List;
import com.ruoyi.english.domain.TestEnglishTf;

/**
 * 判断题Service接口
 * 
 * @author lyj
 * @date 2024-01-18
 */
public interface ITestEnglishTfService 
{
    /**
     * 查询判断题
     * 
     * @param questionId 判断题主键
     * @return 判断题
     */
    public TestEnglishTf selectTestEnglishTfByQuestionId(String questionId);

    /**
     * 查询判断题列表
     * 
     * @param testEnglishTf 判断题
     * @return 判断题集合
     */
    public List<TestEnglishTf> selectTestEnglishTfList(TestEnglishTf testEnglishTf);

    /**
     * 新增判断题
     * 
     * @param testEnglishTf 判断题
     * @return 结果
     */
    public int insertTestEnglishTf(TestEnglishTf testEnglishTf);

    /**
     * 修改判断题
     * 
     * @param testEnglishTf 判断题
     * @return 结果
     */
    public int updateTestEnglishTf(TestEnglishTf testEnglishTf);

    /**
     * 批量删除判断题
     * 
     * @param questionIds 需要删除的判断题主键集合
     * @return 结果
     */
    public int deleteTestEnglishTfByQuestionIds(String[] questionIds);

    /**
     * 删除判断题信息
     * 
     * @param questionId 判断题主键
     * @return 结果
     */
    public int deleteTestEnglishTfByQuestionId(String questionId);
}

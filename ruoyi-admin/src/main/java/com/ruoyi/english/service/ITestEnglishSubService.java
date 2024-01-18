package com.ruoyi.english.service;

import java.util.List;
import com.ruoyi.english.domain.TestEnglishSub;

/**
 * 主观题Service接口
 * 
 * @author lyj
 * @date 2024-01-18
 */
public interface ITestEnglishSubService 
{
    /**
     * 查询主观题
     * 
     * @param questionId 主观题主键
     * @return 主观题
     */
    public TestEnglishSub selectTestEnglishSubByQuestionId(String questionId);

    /**
     * 查询主观题列表
     * 
     * @param testEnglishSub 主观题
     * @return 主观题集合
     */
    public List<TestEnglishSub> selectTestEnglishSubList(TestEnglishSub testEnglishSub);

    /**
     * 新增主观题
     * 
     * @param testEnglishSub 主观题
     * @return 结果
     */
    public int insertTestEnglishSub(TestEnglishSub testEnglishSub);

    /**
     * 修改主观题
     * 
     * @param testEnglishSub 主观题
     * @return 结果
     */
    public int updateTestEnglishSub(TestEnglishSub testEnglishSub);

    /**
     * 批量删除主观题
     * 
     * @param questionIds 需要删除的主观题主键集合
     * @return 结果
     */
    public int deleteTestEnglishSubByQuestionIds(String[] questionIds);

    /**
     * 删除主观题信息
     * 
     * @param questionId 主观题主键
     * @return 结果
     */
    public int deleteTestEnglishSubByQuestionId(String questionId);
}

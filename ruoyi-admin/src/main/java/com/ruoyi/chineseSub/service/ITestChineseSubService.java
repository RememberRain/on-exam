package com.ruoyi.chineseSub.service;

import java.util.List;
import com.ruoyi.chineseSub.domain.TestChineseSub;

/**
 * 主观题Service接口
 * 
 * @author lyj
 * @date 2024-01-17
 */
public interface ITestChineseSubService 
{
    /**
     * 查询主观题
     * 
     * @param questionId 主观题主键
     * @return 主观题
     */
    public TestChineseSub selectTestChineseSubByQuestionId(String questionId);

    /**
     * 查询主观题列表
     * 
     * @param testChineseSub 主观题
     * @return 主观题集合
     */
    public List<TestChineseSub> selectTestChineseSubList(TestChineseSub testChineseSub);

    /**
     * 新增主观题
     * 
     * @param testChineseSub 主观题
     * @return 结果
     */
    public int insertTestChineseSub(TestChineseSub testChineseSub);

    /**
     * 修改主观题
     * 
     * @param testChineseSub 主观题
     * @return 结果
     */
    public int updateTestChineseSub(TestChineseSub testChineseSub);

    /**
     * 批量删除主观题
     * 
     * @param questionIds 需要删除的主观题主键集合
     * @return 结果
     */
    public int deleteTestChineseSubByQuestionIds(String[] questionIds);

    /**
     * 删除主观题信息
     * 
     * @param questionId 主观题主键
     * @return 结果
     */
    public int deleteTestChineseSubByQuestionId(String questionId);
}

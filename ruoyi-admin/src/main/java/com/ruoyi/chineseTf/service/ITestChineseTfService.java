package com.ruoyi.chineseTf.service;

import java.util.List;
import com.ruoyi.chineseTf.domain.TestChineseTf;

/**
 * 判断题Service接口
 * 
 * @author lyj
 * @date 2024-01-17
 */
public interface ITestChineseTfService 
{
    /**
     * 查询判断题
     * 
     * @param questionId 判断题主键
     * @return 判断题
     */
    public TestChineseTf selectTestChineseTfByQuestionId(String questionId);

    /**
     * 查询判断题列表
     * 
     * @param testChineseTf 判断题
     * @return 判断题集合
     */
    public List<TestChineseTf> selectTestChineseTfList(TestChineseTf testChineseTf);

    /**
     * 新增判断题
     * 
     * @param testChineseTf 判断题
     * @return 结果
     */
    public int insertTestChineseTf(TestChineseTf testChineseTf);

    /**
     * 修改判断题
     * 
     * @param testChineseTf 判断题
     * @return 结果
     */
    public int updateTestChineseTf(TestChineseTf testChineseTf);

    /**
     * 批量删除判断题
     * 
     * @param questionIds 需要删除的判断题主键集合
     * @return 结果
     */
    public int deleteTestChineseTfByQuestionIds(String[] questionIds);

    /**
     * 删除判断题信息
     * 
     * @param questionId 判断题主键
     * @return 结果
     */
    public int deleteTestChineseTfByQuestionId(String questionId);
}

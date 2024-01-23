package com.ruoyi.chinese.mapper;

import java.util.List;
import com.ruoyi.chinese.domain.TestChineseTf;

/**
 * 判断题Mapper接口
 * 
 * @author lyj
 * @date 2024-01-18
 */
public interface TestChineseTfMapper 
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
     * 删除判断题
     * 
     * @param questionId 判断题主键
     * @return 结果
     */
    public int deleteTestChineseTfByQuestionId(String questionId);

    /**
     * 批量删除判断题
     * 
     * @param questionIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTestChineseTfByQuestionIds(String[] questionIds);
}

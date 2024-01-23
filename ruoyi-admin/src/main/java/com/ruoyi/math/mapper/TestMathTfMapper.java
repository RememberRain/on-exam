package com.ruoyi.math.mapper;

import java.util.List;
import com.ruoyi.math.domain.TestMathTf;

/**
 * 判断题Mapper接口
 * 
 * @author lyj
 * @date 2024-01-18
 */
public interface TestMathTfMapper 
{
    /**
     * 查询判断题
     * 
     * @param questionId 判断题主键
     * @return 判断题
     */
    public TestMathTf selectTestMathTfByQuestionId(String questionId);

    /**
     * 查询判断题列表
     * 
     * @param testMathTf 判断题
     * @return 判断题集合
     */
    public List<TestMathTf> selectTestMathTfList(TestMathTf testMathTf);

    /**
     * 新增判断题
     * 
     * @param testMathTf 判断题
     * @return 结果
     */
    public int insertTestMathTf(TestMathTf testMathTf);

    /**
     * 修改判断题
     * 
     * @param testMathTf 判断题
     * @return 结果
     */
    public int updateTestMathTf(TestMathTf testMathTf);

    /**
     * 删除判断题
     * 
     * @param questionId 判断题主键
     * @return 结果
     */
    public int deleteTestMathTfByQuestionId(String questionId);

    /**
     * 批量删除判断题
     * 
     * @param questionIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTestMathTfByQuestionIds(String[] questionIds);
}

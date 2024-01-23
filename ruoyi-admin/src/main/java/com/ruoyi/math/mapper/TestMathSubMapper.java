package com.ruoyi.math.mapper;

import java.util.List;
import com.ruoyi.math.domain.TestMathSub;

/**
 * 主观题Mapper接口
 * 
 * @author lyj
 * @date 2024-01-18
 */
public interface TestMathSubMapper 
{
    /**
     * 查询主观题
     * 
     * @param questionId 主观题主键
     * @return 主观题
     */
    public TestMathSub selectTestMathSubByQuestionId(String questionId);

    /**
     * 查询主观题列表
     * 
     * @param testMathSub 主观题
     * @return 主观题集合
     */
    public List<TestMathSub> selectTestMathSubList(TestMathSub testMathSub);

    /**
     * 新增主观题
     * 
     * @param testMathSub 主观题
     * @return 结果
     */
    public int insertTestMathSub(TestMathSub testMathSub);

    /**
     * 修改主观题
     * 
     * @param testMathSub 主观题
     * @return 结果
     */
    public int updateTestMathSub(TestMathSub testMathSub);

    /**
     * 删除主观题
     * 
     * @param questionId 主观题主键
     * @return 结果
     */
    public int deleteTestMathSubByQuestionId(String questionId);

    /**
     * 批量删除主观题
     * 
     * @param questionIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTestMathSubByQuestionIds(String[] questionIds);
}

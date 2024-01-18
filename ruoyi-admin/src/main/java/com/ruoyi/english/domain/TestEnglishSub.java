package com.ruoyi.english.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 主观题对象 test_english_sub
 * 
 * @author lyj
 * @date 2024-01-18
 */
public class TestEnglishSub extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 题目编号 */
    @Excel(name = "题目编号")
    private String questionId;

    /** 题干 */
    @Excel(name = "题干")
    private String content;

    /** 参考答案 */
    private String answer;

    public void setQuestionId(String questionId) 
    {
        this.questionId = questionId;
    }

    public String getQuestionId() 
    {
        return questionId;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setAnswer(String answer) 
    {
        this.answer = answer;
    }

    public String getAnswer() 
    {
        return answer;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("questionId", getQuestionId())
            .append("content", getContent())
            .append("answer", getAnswer())
            .toString();
    }
}

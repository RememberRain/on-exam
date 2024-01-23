package com.ruoyi.english.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 判断题对象 test_english_tf
 * 
 * @author lyj
 * @date 2024-01-18
 */
public class TestEnglishTf extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 题目编号 */
    @Excel(name = "题目编号")
    private String questionId;

    /** 题干 */
    @Excel(name = "题干")
    private String content;

    /** 选项一 */
    private String choiceOne;

    /** 选项二 */
    private String choiceTwo;

    /** 答案 */
    @Excel(name = "答案")
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
    public void setChoiceOne(String choiceOne) 
    {
        this.choiceOne = choiceOne;
    }

    public String getChoiceOne() 
    {
        return choiceOne;
    }
    public void setChoiceTwo(String choiceTwo) 
    {
        this.choiceTwo = choiceTwo;
    }

    public String getChoiceTwo() 
    {
        return choiceTwo;
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
            .append("choiceOne", getChoiceOne())
            .append("choiceTwo", getChoiceTwo())
            .append("answer", getAnswer())
            .toString();
    }
}

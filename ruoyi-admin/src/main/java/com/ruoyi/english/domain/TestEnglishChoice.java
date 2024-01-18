package com.ruoyi.english.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 选择题对象 test_english_choice
 * 
 * @author lyj
 * @date 2024-01-18
 */
public class TestEnglishChoice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 题目编号 */
    @Excel(name = "题目编号")
    private String questionId;

    /** 题干 */
    @Excel(name = "题干")
    private String content;

    /** A */
    private String choiceOne;

    /** B */
    private String choiceTwo;

    /** C */
    private String choiceThree;

    /** D */
    private String choiceFour;

    /** 答案 */
    private String answer;

    /** 题型 */
    @Excel(name = "题型")
    private String type;

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
    public void setChoiceThree(String choiceThree) 
    {
        this.choiceThree = choiceThree;
    }

    public String getChoiceThree() 
    {
        return choiceThree;
    }
    public void setChoiceFour(String choiceFour) 
    {
        this.choiceFour = choiceFour;
    }

    public String getChoiceFour() 
    {
        return choiceFour;
    }
    public void setAnswer(String answer) 
    {
        this.answer = answer;
    }

    public String getAnswer() 
    {
        return answer;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("questionId", getQuestionId())
            .append("content", getContent())
            .append("choiceOne", getChoiceOne())
            .append("choiceTwo", getChoiceTwo())
            .append("choiceThree", getChoiceThree())
            .append("choiceFour", getChoiceFour())
            .append("answer", getAnswer())
            .append("type", getType())
            .toString();
    }
}

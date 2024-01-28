package com.ruoyi.formPaper.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/** 组卷对象FormPaper */
public class FormPaper extends BaseEntity {
    /** 试卷编号 */
    @Excel(name = "试卷编号")
    private String paperId;

    /** 题目编号 */
    @Excel(name = "题目编号")
    private String questionId;

    public FormPaper(){}

    public FormPaper(String paperId, String questionId) {
        this.paperId = paperId;
        this.questionId = questionId;
    }

    public String getPaperId() {
        return paperId;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    @Override
    public String toString() {
        return "FormPaper{" +
                "paperId='" + paperId + '\'' +
                ", questionId='" + questionId + '\'' +
                '}';
    }
}

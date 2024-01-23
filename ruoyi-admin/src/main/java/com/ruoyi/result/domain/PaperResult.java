package com.ruoyi.result.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 考试结果对象 paper_result
 * 
 * @author lyj
 * @date 2024-01-19
 */
public class PaperResult extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 试卷编号 */
    @Excel(name = "试卷编号")
    private String paperId;

    /** 试卷名称 */
    @Excel(name = "试卷名称")
    private String paperName;

    /** 学号 */
    @Excel(name = "学号")
    private String studentId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String studentName;

    /** 答案 */
    private String anwser;

    /** 每题得分 */
    private String quesScore;

    /** 总分 */
    @Excel(name = "总分")
    private Long score;

    /** 排名 */
    @Excel(name = "排名")
    private Long rank;

    public void setPaperId(String paperId) 
    {
        this.paperId = paperId;
    }

    public String getPaperId() 
    {
        return paperId;
    }
    public void setPaperName(String paperName) 
    {
        this.paperName = paperName;
    }

    public String getPaperName() 
    {
        return paperName;
    }
    public void setStudentId(String studentId) 
    {
        this.studentId = studentId;
    }

    public String getStudentId() 
    {
        return studentId;
    }
    public void setStudentName(String studentName) 
    {
        this.studentName = studentName;
    }

    public String getStudentName() 
    {
        return studentName;
    }
    public void setAnwser(String anwser) 
    {
        this.anwser = anwser;
    }

    public String getAnwser() 
    {
        return anwser;
    }
    public void setQuesScore(String quesScore) 
    {
        this.quesScore = quesScore;
    }

    public String getQuesScore() 
    {
        return quesScore;
    }
    public void setScore(Long score) 
    {
        this.score = score;
    }

    public Long getScore() 
    {
        return score;
    }
    public void setRank(Long rank) 
    {
        this.rank = rank;
    }

    public Long getRank() 
    {
        return rank;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("paperId", getPaperId())
            .append("paperName", getPaperName())
            .append("studentId", getStudentId())
            .append("studentName", getStudentName())
            .append("anwser", getAnwser())
            .append("quesScore", getQuesScore())
            .append("score", getScore())
            .append("rank", getRank())
            .toString();
    }
}

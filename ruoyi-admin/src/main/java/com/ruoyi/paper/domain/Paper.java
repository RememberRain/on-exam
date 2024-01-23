package com.ruoyi.paper.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 试卷管理对象 paper
 * 
 * @author ruoyi
 * @date 2024-01-19
 */
public class Paper extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 试卷编号 */
    @Excel(name = "试卷编号")
    private String paperId;

    /** 试卷名称 */
    @Excel(name = "试卷名称")
    private String name;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 所属学科 */
    @Excel(name = "所属学科")
    private String subject;

    /** 出题人 */
    @Excel(name = "出题人")
    private String createUser;

    /** 出题人工号 */
    @Excel(name = "出题人工号")
    private String createUserId;

    /** 修改人 */
    private String updateUser;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    public void setPaperId(String paperId) 
    {
        this.paperId = paperId;
    }

    public String getPaperId() 
    {
        return paperId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setSubject(String subject) 
    {
        this.subject = subject;
    }

    public String getSubject() 
    {
        return subject;
    }
    public void setCreateUser(String createUser) 
    {
        this.createUser = createUser;
    }

    public String getCreateUser() 
    {
        return createUser;
    }
    public void setCreateUserId(String createUserId) 
    {
        this.createUserId = createUserId;
    }

    public String getCreateUserId() 
    {
        return createUserId;
    }
    public void setUpdateUser(String updateUser) 
    {
        this.updateUser = updateUser;
    }

    public String getUpdateUser() 
    {
        return updateUser;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("paperId", getPaperId())
            .append("name", getName())
            .append("status", getStatus())
            .append("subject", getSubject())
            .append("createUser", getCreateUser())
            .append("createUserId", getCreateUserId())
            .append("createTime", getCreateTime())
            .append("updateUser", getUpdateUser())
            .append("updateTime", getUpdateTime())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .toString();
    }
}

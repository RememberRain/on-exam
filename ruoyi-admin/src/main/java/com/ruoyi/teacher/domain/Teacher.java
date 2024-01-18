package com.ruoyi.teacher.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 教师管理对象 teacher
 * 
 * @author ruoyi
 * @date 2024-01-18
 */
public class Teacher extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 工号 */
    @Excel(name = "工号")
    private Long teacherId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 账号 */
    private String account;

    /** 密码 */
    private String password;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String email;

    /** 电话 */
    @Excel(name = "电话")
    private String phoneNumber;

    /** 学校 */
    @Excel(name = "学校")
    private String school;

    /** 教研组 */
    @Excel(name = "教研组")
    private String subject;

    /** 角色 */
    @Excel(name = "角色")
    private Long role;

    /** 头像 */
    private String avatar;

    /** 删除状态 */
    private String delFlag;

    /** 账号状态 */
    @Excel(name = "账号状态")
    private String status;

    /** 性别 */
    private String sex;

    public void setTeacherId(Long teacherId) 
    {
        this.teacherId = teacherId;
    }

    public Long getTeacherId() 
    {
        return teacherId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setAccount(String account) 
    {
        this.account = account;
    }

    public String getAccount() 
    {
        return account;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }
    public void setSchool(String school) 
    {
        this.school = school;
    }

    public String getSchool() 
    {
        return school;
    }
    public void setSubject(String subject) 
    {
        this.subject = subject;
    }

    public String getSubject() 
    {
        return subject;
    }
    public void setRole(Long role) 
    {
        this.role = role;
    }

    public Long getRole() 
    {
        return role;
    }
    public void setAvatar(String avatar) 
    {
        this.avatar = avatar;
    }

    public String getAvatar() 
    {
        return avatar;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("teacherId", getTeacherId())
            .append("name", getName())
            .append("account", getAccount())
            .append("password", getPassword())
            .append("email", getEmail())
            .append("phoneNumber", getPhoneNumber())
            .append("school", getSchool())
            .append("subject", getSubject())
            .append("role", getRole())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("avatar", getAvatar())
            .append("delFlag", getDelFlag())
            .append("status", getStatus())
            .append("sex", getSex())
            .toString();
    }
}

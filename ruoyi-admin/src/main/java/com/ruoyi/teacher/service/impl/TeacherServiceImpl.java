package com.ruoyi.teacher.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.teacher.mapper.TeacherMapper;
import com.ruoyi.teacher.domain.Teacher;
import com.ruoyi.teacher.service.ITeacherService;

/**
 * 教师管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-18
 */
@Service
public class TeacherServiceImpl implements ITeacherService 
{
    @Autowired
    private TeacherMapper teacherMapper;

    /**
     * 查询教师管理
     * 
     * @param teacherId 教师管理主键
     * @return 教师管理
     */
    @Override
    public Teacher selectTeacherByTeacherId(Long teacherId)
    {
        return teacherMapper.selectTeacherByTeacherId(teacherId);
    }

    /**
     * 查询教师管理列表
     * 
     * @param teacher 教师管理
     * @return 教师管理
     */
    @Override
    public List<Teacher> selectTeacherList(Teacher teacher)
    {
        return teacherMapper.selectTeacherList(teacher);
    }

    /**
     * 新增教师管理
     * 
     * @param teacher 教师管理
     * @return 结果
     */
    @Override
    public int insertTeacher(Teacher teacher)
    {
        teacher.setCreateTime(DateUtils.getNowDate());
        return teacherMapper.insertTeacher(teacher);
    }

    /**
     * 修改教师管理
     * 
     * @param teacher 教师管理
     * @return 结果
     */
    @Override
    public int updateTeacher(Teacher teacher)
    {
        teacher.setUpdateTime(DateUtils.getNowDate());
        return teacherMapper.updateTeacher(teacher);
    }

    /**
     * 批量删除教师管理
     * 
     * @param teacherIds 需要删除的教师管理主键
     * @return 结果
     */
    @Override
    public int deleteTeacherByTeacherIds(Long[] teacherIds)
    {
        return teacherMapper.deleteTeacherByTeacherIds(teacherIds);
    }

    /**
     * 删除教师管理信息
     * 
     * @param teacherId 教师管理主键
     * @return 结果
     */
    @Override
    public int deleteTeacherByTeacherId(Long teacherId)
    {
        return teacherMapper.deleteTeacherByTeacherId(teacherId);
    }
}

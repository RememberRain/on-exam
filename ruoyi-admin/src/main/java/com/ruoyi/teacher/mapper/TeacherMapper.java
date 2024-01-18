package com.ruoyi.teacher.mapper;

import java.util.List;
import com.ruoyi.teacher.domain.Teacher;

/**
 * 教师管理Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-18
 */
public interface TeacherMapper 
{
    /**
     * 查询教师管理
     * 
     * @param teacherId 教师管理主键
     * @return 教师管理
     */
    public Teacher selectTeacherByTeacherId(Long teacherId);

    /**
     * 查询教师管理列表
     * 
     * @param teacher 教师管理
     * @return 教师管理集合
     */
    public List<Teacher> selectTeacherList(Teacher teacher);

    /**
     * 新增教师管理
     * 
     * @param teacher 教师管理
     * @return 结果
     */
    public int insertTeacher(Teacher teacher);

    /**
     * 修改教师管理
     * 
     * @param teacher 教师管理
     * @return 结果
     */
    public int updateTeacher(Teacher teacher);

    /**
     * 删除教师管理
     * 
     * @param teacherId 教师管理主键
     * @return 结果
     */
    public int deleteTeacherByTeacherId(Long teacherId);

    /**
     * 批量删除教师管理
     * 
     * @param teacherIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeacherByTeacherIds(Long[] teacherIds);
}

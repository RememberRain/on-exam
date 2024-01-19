package com.ruoyi.teacher.service;

import java.util.List;
import com.ruoyi.teacher.domain.Teacher;

/**
 * 教师管理Service接口
 */
public interface ITeacherService 
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
     * 查询有无重复账号
     *
     * @param teacher 教师管理
     * @return 结果
     */
    public int checkTeacherAccountExistence(Teacher teacher);

    /**
     * 查询有无重复邮箱
     *
     * @param teacher 教师管理
     * @return 结果
     */
    public int checkTeacherEmailExistence(Teacher teacher);

    /**
     * 查询有无重复电话
     *
     * @param teacher 教师管理
     * @return 结果
     */
    public int checkTeacherPhoneExistence(Teacher teacher);

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

//    /**
//     * 批量删除教师管理
//     *
//     * @param teacherIds 需要删除的教师管理主键集合
//     * @return 结果
//     */
//    public int deleteTeacherByTeacherIds(Long[] teacherIds);
//
//    /**
//     * 删除教师管理信息
//     *
//     * @param teacherId 教师管理主键
//     * @return 结果
//     */
//    public int deleteTeacherByTeacherId(Long teacherId);
}

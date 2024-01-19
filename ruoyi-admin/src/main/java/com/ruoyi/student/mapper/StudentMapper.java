package com.ruoyi.student.mapper;

import java.util.List;
import com.ruoyi.student.domain.Student;
import com.ruoyi.teacher.domain.Teacher;

/**
 * 学生管理Mapper接口
 *
 * @author ruoyi
 * @date 2024-01-18
 */
public interface StudentMapper
{
    /**
     * 查询学生管理
     *
     * @param studentId 学生管理主键
     * @return 学生管理
     */
    public Student selectStudentByStudentId(Long studentId);

    /**
     * 查询学生管理列表
     *
     * @param student 学生管理
     * @return 学生管理集合
     */
    public List<Student> selectStudentList(Student student);

    /**
     * 新增学生管理
     *
     * @param student 学生管理
     * @return 结果
     */
    public int insertStudent(Student student);

    /**
     * 检查是否账号重复
     *
     * @param student 学生管理
     * @return 结果
     */
    public int checkStudentAccountExistence(Student student);

    /**
     * 检查是否邮箱重复
     *
     * @param student 学生管理
     * @return 结果
     */
    public int checkStudentEmailExistence(Student student);

    /**
     * 检查是否电话重复
     *
     * @param student 学生管理
     * @return 结果
     */
    public int checkStudentPhoneExistence1(Student student);

    /**
     * 检查是否账号重复
     *
     * @param student 学生管理
     * @return 结果
     */
    public int checkStudentAccountExistence1(Student student);

    /**
     * 检查是否邮箱重复
     *
     * @param student 学生管理
     * @return 结果
     */
    public int checkStudentEmailExistence1(Student student);

    /**
     * 检查是否电话重复
     *
     * @param student 学生管理
     * @return 结果
     */
    public int checkStudentPhoneExistence(Student student);

    /**
     * 修改学生管理
     *
     * @param student 学生管理
     * @return 结果
     */
    public int updateStudent(Student student);

    /**
     * 删除学生管理
     *
     * @param studentId 学生管理主键
     * @return 结果
     */
    public int deleteStudentByStudentId(Long studentId);

    /**
     * 批量删除学生管理
     *
     * @param studentIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStudentByStudentIds(Long[] studentIds);
}

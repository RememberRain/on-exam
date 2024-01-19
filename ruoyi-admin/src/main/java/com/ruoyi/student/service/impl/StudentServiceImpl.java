package com.ruoyi.student.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.student.mapper.StudentMapper;
import com.ruoyi.student.domain.Student;
import com.ruoyi.student.service.IStudentService;

/**
 * 学生管理Service业务层处理
 *
 * @author ruoyi
 * @date 2024-01-18
 */
@Service
public class StudentServiceImpl implements IStudentService
{
    @Autowired
    private StudentMapper studentMapper;

    /**
     * 查询学生管理
     *
     * @param studentId 学生管理主键
     * @return 学生管理
     */
    @Override
    public Student selectStudentByStudentId(Long studentId)
    {
        return studentMapper.selectStudentByStudentId(studentId);
    }

    /**
     * 查询学生管理列表
     *
     * @param student 学生管理
     * @return 学生管理
     */
    @Override
    public List<Student> selectStudentList(Student student)
    {
        return studentMapper.selectStudentList(student);
    }

    /**
     * 新增学生管理
     *
     * @param student 学生管理
     * @return 结果
     */
    @Override
    public int insertStudent(Student student)
    {
        if (studentMapper.checkStudentAccountExistence(student) > 0){
            return -1;
        }
        if (studentMapper.checkStudentEmailExistence(student) > 0){
            return -2;
        }
        if (studentMapper.checkStudentPhoneExistence(student) > 0){
            return -3;
        }
        student.setCreateTime(DateUtils.getNowDate());
        return studentMapper.insertStudent(student);
    }

    /**
     * 修改学生管理
     *
     * @param student 学生管理
     * @return 结果
     */
    @Override
    public int updateStudent(Student student)
    {
        if (studentMapper.checkStudentAccountExistence1(student) > 0){
            return -1;
        }
        if (studentMapper.checkStudentEmailExistence1(student) > 0){
            return -2;
        }
        if (studentMapper.checkStudentPhoneExistence1(student) > 0){
            return -3;
        }
        student.setUpdateTime(DateUtils.getNowDate());
        return studentMapper.updateStudent(student);
    }

    /**
     * 批量删除学生管理
     *
     * @param studentIds 需要删除的学生管理主键
     * @return 结果
     */
    @Override
    public int deleteStudentByStudentIds(Long[] studentIds)
    {
        return studentMapper.deleteStudentByStudentIds(studentIds);
    }

    /**
     * 删除学生管理信息
     *
     * @param studentId 学生管理主键
     * @return 结果
     */
    @Override
    public int deleteStudentByStudentId(Long studentId)
    {
        return studentMapper.deleteStudentByStudentId(studentId);
    }
}

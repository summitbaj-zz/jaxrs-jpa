package com.lftechnology.restful.service.impl;

import com.lftechnology.restful.entity.Student;
import com.lftechnology.restful.service.StudentService;

import javax.inject.Inject;

/**
 * Created by Summit on 1/27/2017.
 */
//@State
public class StudentServiceImpl implements StudentService {
    @Inject
    StudentServiceImpl studentDao;

    public Student save(Student student) {
        return studentDao.save(student);

    }

    public Student update(Student student) {
        return null;
    }
}

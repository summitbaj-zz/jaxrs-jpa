package com.lftechnology.restful.dao.impl;


import com.lftechnology.restful.entity.Student;
import com.lftechnology.restful.dao.StudentDao;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Summit on 1/27/2017.
 */
public class StudentDaoImpl implements StudentDao {
    @Inject
    EntityManager em;

    @Override
    public Student save(Student student) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Model");
        em = emf.createEntityManager();

        createStudent(1, "Summit");
        return student;
    }

    private void createStudent(int id, String name) {
        em.getTransaction().begin();
        Student std = new Student();
        std.setId(id);
        std.setName(name);
        em.persist(std);
        em.getTransaction().commit();
    }

    }

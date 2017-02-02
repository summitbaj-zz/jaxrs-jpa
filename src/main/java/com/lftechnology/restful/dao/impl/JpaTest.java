/*
package com.lftechnology.restful.dao.impl;

import com.lftechnology.restful.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JpaTest {
    private static EntityManager em;

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
        em = emf.createEntityManager();

        createStudent(1, "Summit");
    }

    private static void createStudent(int id, String name) {
        em.getTransaction().begin();
        Student std = new Student();
        std.setId(id);
        std.setName(name);
        em.persist(std);
        em.getTransaction().commit();
    }
}*/

package org.example.dao.Custom.impl;

import org.example.bo.BOFactory;
import org.example.config.FactoryConfiguration;
import org.example.dao.Custom.StudentDao;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;

public class StudentDaoImpl implements StudentDao {

    @Override
    public boolean save(Student entity) throws SQLException, ClassNotFoundException {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(entity);

        transaction.commit();
        session.close();
        return true;
    }
}

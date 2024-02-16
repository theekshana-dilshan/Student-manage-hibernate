package org.example.bo.Custom.impl;

import org.example.bo.Custom.StudentBO;
import org.example.dao.Custom.StudentDao;
import org.example.dao.DAOFactory;
import org.example.dto.StudentDto;
import org.example.entity.Student;

import java.sql.SQLException;

public class StudentBoImpl implements StudentBO {

    StudentDao studentDao= (StudentDao) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.STUDENT);

    @Override
    public boolean setStudent(StudentDto dto) throws SQLException, ClassNotFoundException {
        return studentDao.save(new Student(dto.getId(),dto.getName(),dto.getAddress()));
    }
}

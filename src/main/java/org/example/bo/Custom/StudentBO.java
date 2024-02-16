package org.example.bo.Custom;

import org.example.bo.SuperBO;
import org.example.dao.Custom.StudentDao;
import org.example.dto.StudentDto;

import java.sql.SQLException;

public interface StudentBO extends SuperBO {
    boolean setStudent(StudentDto dto) throws SQLException, ClassNotFoundException;
}

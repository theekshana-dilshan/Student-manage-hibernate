package org.example.Controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.example.bo.BOFactory;
import org.example.bo.Custom.StudentBO;
import org.example.dto.StudentDto;

import java.sql.SQLException;

public class AddStudentFormController {

    @FXML
    private JFXTextField txtStudentAddress;

    @FXML
    private JFXTextField txtStudentID;

    @FXML
    private JFXTextField txtStudentName;

    StudentBO studentBO= (StudentBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.STUDENT);

    @FXML
    void btnAddOnAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        String id = txtStudentID.getText();
        String name = txtStudentName.getText();
        String address = txtStudentAddress.getText();

        StudentDto studentDto = new StudentDto(id, name, address);

        boolean isSaved = studentBO.setStudent(studentDto);
        if (isSaved){
            System.out.println("Done");
        }else {
            System.out.println("Error");
        }
    }
}
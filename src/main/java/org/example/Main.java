package org.example;

import config.DatabaseConnection;
import dao.StudentDAO;
import model.StudentModel;

import java.sql.Connection;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();

        List<StudentModel> students = studentDAO.getAllStudents();

        for (StudentModel s : students) {

            System.out.println(
                    s.getId() + " " + s.getName() + " " + s.getAge()
            );

        }

    }
}

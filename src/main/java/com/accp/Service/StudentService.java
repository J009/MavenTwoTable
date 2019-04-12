package com.accp.Service;

import com.accp.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> FinaAll();


    Student FinaById(int id);

    int Update(Student stu);
}

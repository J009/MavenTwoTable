package com.accp.Dao;

import com.accp.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {

    List<Student> FinaAll();

    Student FinaById(int id);

    int Update(Student stu);
}

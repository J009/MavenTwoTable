package com.accp.Service;

import com.accp.entity.Grade;
import com.accp.entity.Student;

import java.util.List;

public interface GradeService {
    List<Grade> FinaAll();

    Grade FindById(int id);
}

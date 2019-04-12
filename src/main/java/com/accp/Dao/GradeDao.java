package com.accp.Dao;

import com.accp.entity.Grade;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeDao {

    List<Grade> FindAll();

    Grade FindById(int id);
}

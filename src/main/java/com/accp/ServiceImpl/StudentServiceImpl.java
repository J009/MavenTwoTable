package com.accp.ServiceImpl;

import com.accp.Dao.StudentDao;
import com.accp.Service.StudentService;
import com.accp.entity.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao sd;

    public List<Student> FinaAll() {
        return sd.FinaAll();
    }

    public Student FinaById(int id) {
        return sd.FinaById(id);
    }

    public int Update(Student stu) {
        return sd.Update(stu);
    }
}

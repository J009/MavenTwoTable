package com.accp.ServiceImpl;

import com.accp.Dao.GradeDao;
import com.accp.Service.GradeService;
import com.accp.entity.Grade;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {
    @Resource
    private GradeDao sd;

    public List<Grade> FinaAll() {
        return sd.FindAll();
    }

    public Grade FindById(int id) {
        return sd.FindById(id);
    }
}

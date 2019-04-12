package com.accp.Handler;

import com.accp.Dao.GradeDao;
import com.accp.Service.StudentService;
import com.accp.entity.Grade;
import com.accp.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class Hander {
    @Resource
    private StudentService sd;
    @Resource
    private GradeDao gd;

    @RequestMapping("/FindAll")
    public String FindAll(Map<String, Object> map) {
        List<Student> list = sd.FinaAll();
        map.put("list", list);
        return "FindAll";
    }

    @RequestMapping("/byid")
    public String FindById(int id, Model mod, HttpServletRequest req) {
        List<Grade> glist = gd.FindAll();
        req.setAttribute("glist", glist);
        Student byId = sd.FinaById(id);
        List<String> slist = Arrays.asList("男", "女");
        mod.addAttribute("slist", slist);
        mod.addAttribute("byid", byId);
        return "ById";
    }

    @RequestMapping("/update")
    public String update(@ModelAttribute("stu") Student stu) {
        int i = sd.Update(stu);
        System.out.println("i = " + i);

        return "redirect:FindAll";
    }
}

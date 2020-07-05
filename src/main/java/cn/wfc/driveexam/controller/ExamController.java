package cn.wfc.driveexam.controller;

import cn.wfc.driveexam.entity.Exam;
import cn.wfc.driveexam.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class ExamController {

    @Autowired
    private ExamService examService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/addError")
    @ResponseBody
    public int addError(String id) {
        String userId = "wfc";
        return examService.addError(userId,id);
    }

    @RequestMapping("/exam")
    public String exam(){
        return "exam";
    }

    @RequestMapping("/findById")
    @ResponseBody
    public Exam findById(String id) {
        return examService.findById(id);
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Integer insert() throws IOException {
        return examService.insert();
    }
}

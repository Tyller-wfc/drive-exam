package cn.wfc.driveexam.controller;

import cn.wfc.driveexam.entity.Exam;
import cn.wfc.driveexam.service.ExamService;
import cn.wfc.driveexam.util.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
@RequestMapping("/exam")
public class ExamController {

    @Autowired
    private ExamService examService;

    @RequestMapping("/view")
    public String view() {
        return "view";
    }

    @RequestMapping("/addError")
    @ResponseBody
    public int addError(String id) {
        String userId = SecurityUtil.getCurrentUser();
        return examService.addError(userId, id);
    }

    @RequestMapping("/practice")
    public String practice() {
        return "practice";
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

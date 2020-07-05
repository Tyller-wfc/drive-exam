package cn.wfc.driveexam.service;

import cn.wfc.driveexam.entity.Exam;

import java.io.IOException;

public interface ExamService {
    int insert() throws IOException;

    Exam findById(String id);
}

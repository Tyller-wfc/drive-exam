package cn.wfc.driveexam.mapper;

import cn.wfc.driveexam.entity.Exam;

public interface ExamMapper {
    Exam findById(String id);

    int insert(Exam exam);

    int addError(String userId, String examId);
}

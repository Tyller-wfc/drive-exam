package cn.wfc.driveexam.mapper;

import cn.wfc.driveexam.entity.Exam;

import java.util.Map;

public interface ExamMapper {
    Exam findById(String id);

    int insert(Exam exam);

    int addError(String userId, String examId);

    int updateError(String userId, String examId);

    Map<String, String> findError(String userId, String examId);
}

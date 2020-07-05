package cn.wfc.driveexam;

import cn.wfc.driveexam.entity.Exam;
import cn.wfc.driveexam.mapper.ExamMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.DriverManager;

@SpringBootTest
class DriveExamApplicationTests {

    @Autowired
    private ExamMapper examMapper;

    @Test
    void contextLoads() {
        Exam exam = examMapper.findById("1");
        System.out.println(exam);
    }

}

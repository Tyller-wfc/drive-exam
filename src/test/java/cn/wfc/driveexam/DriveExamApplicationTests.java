package cn.wfc.driveexam;

import cn.wfc.driveexam.entity.Exam;
import cn.wfc.driveexam.mapper.ExamMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.sql.DriverManager;

@SpringBootTest
class DriveExamApplicationTests {

    @Autowired
    private ExamMapper examMapper;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Test
    void contextLoads() {
        String pass = "111";
        System.out.println(passwordEncoder.encode(pass));
    }

}

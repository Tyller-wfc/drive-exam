package cn.wfc.driveexam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.wfc.driveexam.mapper")
public class DriveExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(DriveExamApplication.class, args);
	}

}

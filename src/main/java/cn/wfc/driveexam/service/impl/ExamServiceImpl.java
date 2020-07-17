package cn.wfc.driveexam.service.impl;

import cn.wfc.driveexam.entity.Exam;
import cn.wfc.driveexam.mapper.ExamMapper;
import cn.wfc.driveexam.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ExamServiceImpl implements ExamService {

    @Autowired
    private ExamMapper examMapper;

    @Override
    public int insert() throws IOException {
        File file = ResourceUtils.getFile(ResourceUtils.CLASSPATH_URL_PREFIX + "doc/tk.txt");

        BufferedReader reader = null;
        StringBuffer sbf = new StringBuffer();
        reader = new BufferedReader(new FileReader(file));
        String tempStr;
        while ((tempStr = reader.readLine()) != null) {
            sbf.append(tempStr);
            sbf.append("\n");
        }
        reader.close();
        String tk = sbf.toString();
        String[] ts = tk.split("----------\n");

        for (String t : ts) {
            String[] e = t.split("\n");
            Exam exam = new Exam();
            String examStr = e[0];
            exam.setExamStr(examStr);
            String id = examStr.substring(0, examStr.indexOf("."));
            exam.setId(id);
            List<String> opts = new ArrayList<>();
            if (e.length == 2) {
                exam.setType(Exam.PD);
                opts.add("正确");
                opts.add("错误");
            } else if (e.length == 6) {
                exam.setType(Exam.XZ);
                for (int m = 1; m < e.length - 1; m++) {
                    opts.add(e[m]);
                }
            }
            String answer = e[e.length - 1].substring(3);
            exam.setAnswer(answer);
            exam.setOpts(opts);
            examMapper.insert(exam);
        }
        return ts.length;
    }

    @Override
    public Exam findById(String id) {
        return examMapper.findById(id);
    }

    @Override
    public int addError(String userId, String examId) {
        //先判断有没有，有的画次数加一，没有的话增加一条新记录
        Map<String, String> exist = examMapper.findError(userId, examId);
        if (exist==null) {
            return examMapper.addError(userId, examId);
        }else {
            return examMapper.updateError(userId, examId);
        }
    }
}

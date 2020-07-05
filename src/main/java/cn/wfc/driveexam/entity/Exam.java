package cn.wfc.driveexam.entity;

import java.util.List;

public class Exam {
    public static final Integer XZ=0;
    public static final Integer PD=1;

    private String id;
    private String examStr;
    private String examUrl;
    private List<String> opts;
    private String answer;
    private Integer type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExamStr() {
        return examStr;
    }

    public void setExamStr(String examStr) {
        this.examStr = examStr;
    }

    public String getExamUrl() {
        return examUrl;
    }

    public void setExamUrl(String examUrl) {
        this.examUrl = examUrl;
    }

    public List<String> getOpts() {
        return opts;
    }

    public void setOpts(List<String> opts) {
        this.opts = opts;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Exam{" +
                "id='" + id + '\'' +
                ", examStr='" + examStr + '\'' +
                ", examUrl='" + examUrl + '\'' +
                ", opts=" + opts +
                ", answer='" + answer + '\'' +
                ", type=" + type +
                '}';
    }
}

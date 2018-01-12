package main.java.ws;

import java.time.*;

public class ResultLogs {
    private LocalDateTime timeMoment;
    private String fileName;
    private String content;

//    public ResultLogs(LocalDateTime timeMoment, String fileName, String content) {
//        this.timeMoment = timeMoment;
//        this.fileName = fileName;
//        this.content = content;
//    }

    public LocalDateTime getTimeMoment() {
        return timeMoment;
    }

    public String getContent() {
        return content;
    }

    public String getFileName() {
        return fileName;
    }

    public void setTimeMoment(LocalDateTime timeMoment) {
        this.timeMoment = timeMoment;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

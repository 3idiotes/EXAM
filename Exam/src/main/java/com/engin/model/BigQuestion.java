package com.engin.model;

public class BigQuestion {
    private Integer bqid;

    private String text;

    private String answer;

    public Integer getBqid() {
        return bqid;
    }

    public void setBqid(Integer bqid) {
        this.bqid = bqid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }
}
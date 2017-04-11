package com.engin.model;

public class HisExam {
    private Integer id;

    private String username;

    private String examtype;

    private String submitime;

    private String score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getExamtype() {
        return examtype;
    }

    public void setExamtype(String examtype) {
        this.examtype = examtype == null ? null : examtype.trim();
    }

    public String getSubmitime() {
        return submitime;
    }

    public void setSubmitime(String submitime) {
        this.submitime = submitime == null ? null : submitime.trim();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }
}
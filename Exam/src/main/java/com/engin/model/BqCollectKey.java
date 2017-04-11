package com.engin.model;

public class BqCollectKey {
    private Integer bqcid;

    private String username;

    private Integer bqid;

    public Integer getBqcid() {
        return bqcid;
    }

    public void setBqcid(Integer bqcid) {
        this.bqcid = bqcid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getBqid() {
        return bqid;
    }

    public void setBqid(Integer bqid) {
        this.bqid = bqid;
    }
}
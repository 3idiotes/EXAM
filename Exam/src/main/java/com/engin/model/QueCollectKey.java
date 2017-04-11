package com.engin.model;

public class QueCollectKey {
    private Integer qcid;

    private String username;

    private String id;

    public Integer getQcid() {
        return qcid;
    }

    public void setQcid(Integer qcid) {
        this.qcid = qcid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
}
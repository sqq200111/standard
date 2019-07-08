package com.example.standard1.domain;

import java.time.LocalDateTime;

public class Standard {
    private Integer id;
    private String stdUm;
    private String zhName;
    private String version;
    private String keys;
    private LocalDateTime releaseDate;
    private LocalDateTime implDate;
    private String ackagePath;


    @Override
    public String toString() {
        return "Standard{" +
                "id=" + id +
                ", stdUm='" + stdUm + '\'' +
                ", zhName='" + zhName + '\'' +
                ", version='" + version + '\'' +
                ", keys='" + keys + '\'' +
                ", releaseDate=" + releaseDate +
                ", implDate=" + implDate +
                ", ackagePath='" + ackagePath + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStdUm() {
        return stdUm;
    }

    public void setStdUm(String stdUm) {
        this.stdUm = stdUm;
    }

    public String getZhName() {
        return zhName;
    }

    public void setZhName(String zhName) {
        this.zhName = zhName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public LocalDateTime getImplDate() {
        return implDate;
    }

    public void setImplDate(LocalDateTime implDate) {
        this.implDate = implDate;
    }

    public String getAckagePath() {
        return ackagePath;
    }

    public void setAckagePath(String ackagePath) {
        this.ackagePath = ackagePath;
    }

    public Standard(String stdUm, String zhName, String version, String keys, LocalDateTime releaseDate, LocalDateTime implDate, String ackagePath) {
        this.stdUm = stdUm;
        this.zhName = zhName;
        this.version = version;
        this.keys = keys;
        this.releaseDate = releaseDate;
        this.implDate = implDate;
        this.ackagePath = ackagePath;
    }

    public Standard() {
    }

    public Standard(Integer id, String stdUm, String zhName, String version, String keys, LocalDateTime releaseDate, LocalDateTime implDate, String ackagePath) {
        this.id = id;
        this.stdUm = stdUm;
        this.zhName = zhName;
        this.version = version;
        this.keys = keys;
        this.releaseDate = releaseDate;
        this.implDate = implDate;
        this.ackagePath = ackagePath;
    }
}

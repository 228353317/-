package com.OJ.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

//pojo类(普通类)
@Setter
@Getter
@ToString
public class solution {

    private Long SSid;
    private int Pid;
    private int Sid;
    private int TIid;
    private int score;
    //数据类型datetime
    private Timestamp submitDate;
    private int memory;
    private int time;
    private int codeLength;
    private int ULid;
    private int JRid;
    //数据类型text
    private String error;

    public Long getSSid() {
        return SSid;
    }

    public void setSSid(Long SSid) {
        this.SSid = SSid;
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int pid) {
        Pid = pid;
    }

    public int getSid() {
        return Sid;
    }

    public void setSid(int sid) {
        Sid = sid;
    }

    public int getTIid() {
        return TIid;
    }

    public void setTIid(int TIid) {
        this.TIid = TIid;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Timestamp getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Timestamp submitDate) {
        this.submitDate = submitDate;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getCodeLength() {
        return codeLength;
    }

    public void setCodeLength(int codeLength) {
        this.codeLength = codeLength;
    }

    public int getULid() {
        return ULid;
    }

    public void setULid(int ULid) {
        this.ULid = ULid;
    }

    public int getJRid() {
        return JRid;
    }

    public void setJRid(int JRid) {
        this.JRid = JRid;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "solution{" +
                "SSid=" + SSid +
                ", Pid=" + Pid +
                ", Sid=" + Sid +
                ", TIid=" + TIid +
                ", score=" + score +
                ", submitDate=" + submitDate +
                ", memory=" + memory +
                ", time=" + time +
                ", codeLength=" + codeLength +
                ", ULid=" + ULid +
                ", JRid=" + JRid +
                ", error='" + error + '\'' +
                '}';
    }
}

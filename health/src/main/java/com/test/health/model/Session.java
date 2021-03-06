package com.test.health.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;


public class Session {
    private Long id;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+18")
    private Date time;

    private Long doctorId;

    private String doctorName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
}

package com.chriscodes.playground.POJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Capsule {

    private String capsule_serial;
    private String capsule_id;
    private String status;
    private String original_launch;
    private String type;
    private int original_launch_unix;
    private int landings;
    private int reuse_count;
    private Mission[] missions;
    
    
    public String getCapsule_serial() {
        return capsule_serial;
    }

    public void setCapsule_serial(String capsule_serial) {
        this.capsule_serial = capsule_serial;
    }

    public String getCapsule_id() {
        return capsule_id;
    }

    public void setCapsule_id(String capsule_id) {
        this.capsule_id = capsule_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOriginal_launch() {
        return original_launch;
    }

    public void setOriginal_launch(String original_launch) {
        this.original_launch = original_launch;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOriginal_launch_unix() {
        return original_launch_unix;
    }

    public void setOriginal_launch_unix(int original_launch_unix) {
        this.original_launch_unix = original_launch_unix;
    }

    public int getLandings() {
        return landings;
    }

    public void setLandings(int landings) {
        this.landings = landings;
    }

    public int getReuse_count() {
        return reuse_count;
    }

    public void setReuse_count(int reuse_count) {
        this.reuse_count = reuse_count;
    }

    public Mission[] getMissions() {
        return missions;
    }

    public void setMissions(Mission[] missions) {
        this.missions = missions;
    }

    @Override
    public String toString() {
        return "Capsule{" + "capsule_serial=" + capsule_serial + ", capsule_id=" + capsule_id + ", status=" + status + ", original_launch=" + original_launch + ", type=" + type + ", original_launch_unix=" + original_launch_unix + ", landings=" + landings + ", reuse_count=" + reuse_count + ", missions=" + missions + '}';
    }

    
}

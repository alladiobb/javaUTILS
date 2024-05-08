package org.example.utils.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Batata {
    @JsonProperty("batatinha1")
    private String batatatinha1;
    @JsonProperty("batatinha2")
    private String batatinha2;

    public String getBatatinha2() {
        return batatinha2;
    }

    public void setBatatinha2(String batatinha2) {
        this.batatinha2 = batatinha2;
    }

    public String getBatatatinha1() {
        return batatatinha1;
    }

    public void setBatatatinha1(String batatatinha1) {
        this.batatatinha1 = batatatinha1;
    }
}

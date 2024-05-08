package org.example.utils.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Data {
    private String a;
    private String b;
    @JsonProperty("T")
    public List<T> T;
//    @JsonProperty("BATATA")
    public List<Batata> batata;
    @JsonProperty("Macarrao")
    public List<Macarrao> macarrao;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public List<T> getT() {
        return T;
    }

    public void setT(List<T> t) {
        T = t;
    }

    public List<Batata> getBatata() {
        return batata;
    }

    public void setBatata(List<Batata> batata) {
        this.batata = batata;
    }

    public List<Macarrao> getMacarrao() {
        return macarrao;
    }

    public void setMacarrao(List<Macarrao> macarrao) {
        this.macarrao = macarrao;
    }
}

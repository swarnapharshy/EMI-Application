package com.application.emicalculator.entities;

public class EmiEntity {
    private double principal;
    private double rate;
    private double time;
    private double EMI;

    public EmiEntity() {
    }

    public EmiEntity(double principal, double rate, double time, double EMI) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
        this.EMI = EMI;
    }

    public EmiEntity(double EMI) {
        this.EMI = EMI;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getEMI() {
        return EMI;
    }

    public void setEMI(double EMI) {
        this.EMI = EMI;
    }

    @Override
    public String toString() {
        return "EmiEntity{" +
                "principal=" + principal +
                ", rate=" + rate +
                ", time=" + time +
                ", EMI=" + EMI +
                '}';
    }
}
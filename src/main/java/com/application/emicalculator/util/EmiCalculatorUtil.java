package com.application.emicalculator.util;

import com.application.emicalculator.entities.EmiEntity;

public class EmiCalculatorUtil {

    public static double emicalculator(EmiEntity emiEntity) {

        double r = (emiEntity.getRate()/100) / 12;
        int n = (int)emiEntity.getTime() * 12;

        double emi = (emiEntity.getPrincipal() * r * java.lang.Math.pow(1+r, n))/(java.lang.Math.pow(1+r, n)-1);

        return emi;
    }

}

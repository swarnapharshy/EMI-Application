package com.application.emicalculator.services;

import com.application.emicalculator.entities.EmiEntity;
import com.application.emicalculator.util.EmiCalculatorUtil;
import org.springframework.stereotype.Service;

@Service
public class EmiServiceImpl implements EmiService {

    @Override
    public double emicalculator(EmiEntity emiEntity) {
        return EmiCalculatorUtil.emicalculator(emiEntity);
    }
}

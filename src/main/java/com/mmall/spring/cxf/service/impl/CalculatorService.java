package com.mmall.spring.cxf.service.impl;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.mmall.spring.cxf.service.api.ICalculatorService;

@WebService
@SOAPBinding(style = Style.RPC)
public class CalculatorService implements ICalculatorService {
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public double mul(double a, double b) {
        return a * b;
    }

    @Override
    public double div(double a, double b) {
        return b == 0 ? Double.MAX_VALUE : a / b;
    }
}

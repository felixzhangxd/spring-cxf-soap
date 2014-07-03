package com.mmall.spring.cxf.service.api;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface ICalculatorService {
    double add(double a, double b);

    double sub(double a, double b);

    double mul(double a, double b);

    double div(double a, double b);
}

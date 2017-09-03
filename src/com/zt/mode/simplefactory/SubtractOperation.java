package com.zt.mode.simplefactory;

import java.util.function.DoubleUnaryOperator;

/**
 * @Author：ZhangTao
 * @Description:减法运算
 * @Date: Created in 20:37 2017/9/3
 */
public class SubtractOperation extends BaseCalculator {

    @Override
    public Double getResult() {
        Double result = getNumberA()-getNumberB();
        return result;
    }
}

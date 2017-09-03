package com.zt.mode.simplefactory;

/**
 * @Author：ZhangTao
 * @Description:计算器乘法运算
 * @Date: Created in 20:35 2017/9/3
 */
public class MultiplyOperation extends BaseCalculator {

    @Override
    public Double getResult() {
        Double result = getNumberA()*getNumberB();
        return result;
    }
}

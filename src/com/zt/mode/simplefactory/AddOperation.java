package com.zt.mode.simplefactory;

/**
 * @Author：ZhangTao
 * @Description:计算器的加法运算
 * @Date: Created in 20:27 2017/9/3
 */
public class AddOperation extends BaseCalculator {

    @Override
    public Double getResult() {
        Double result = getNumberA()+getNumberB();
        return result;
    }
}

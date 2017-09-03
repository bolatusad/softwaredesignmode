package com.zt.mode.simplefactory;

import java.sql.SQLOutput;

/**
 * @Author：ZhangTao
 * @Description:计算器除运算
 * @Date: Created in 20:31 2017/9/3
 */
public class DivideOperation extends BaseCalculator{

    @Override
    public Double getResult() {
        if(new Double(0).equals(getNumberB())){
            System.out.println("除数不能为0！");
            return null;
        }
        Double result = getNumberA()/getNumberB();
        return result;
    }
}

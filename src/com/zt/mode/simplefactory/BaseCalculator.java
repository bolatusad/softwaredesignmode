package com.zt.mode.simplefactory;

/**
 * @Author：ZhangTao
 * @Description:计算器的基础类
 * @Date: Created in 20:23 2017/9/3
 */
public class BaseCalculator {

    private Double numberA;

    private Double numberB;

    public Double getNumberA() {
        return numberA;
    }

    public void setNumberA(Double numberA) {
        this.numberA = numberA;
    }

    public Double getNumberB() {
        return numberB;
    }

    public void setNumberB(Double numberB) {
        this.numberB = numberB;
    }

    public Double getResult(){
        System.out.println("请自己去实现相应的获取结果的程序！");
        return new Double(0);
    }
}

package com.zt.mode.simplefactory;

import java.util.Scanner;

/**
 * @Author：ZhangTao
 * @Description:使用简单工厂模式的计算器
 * @Date: Created in 20:46 2017/9/3
 */
public class NewCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数字A：");
        Double numberA = input.nextDouble();
        System.out.println("请输入运算符：");
        String operator = input.next();
        System.out.println("请输入数字B：");
        Double numberB = input.nextDouble();
        BaseCalculator calculator = OperationFactory.getOperation(operator);
        calculator.setNumberA(numberA);
        calculator.setNumberB(numberB);
        System.out.println("计算结果是："+calculator.getResult());
    }
}

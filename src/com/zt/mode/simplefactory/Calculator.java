package com.zt.mode.simplefactory;

import java.util.Scanner;

/**
 * @Author：ZhangTao
 * @Description:简易计算器
 * @Date: Created in 19:50 2017/9/3
 */
public class Calculator {
    public static void main(String[] args){
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Please input a number:");
            int numberA = input.nextInt();
            System.out.println("Please input a opeator:");
            String operator = input.next();
            System.out.println("Please input another number:");
            int numberB = input.nextInt();
            int result = 0;
            switch (operator){
                case "+": result = numberA + numberB;break;
                case "-": result = numberA - numberB;break;
                case "*": result = numberA * numberB;break;
                case "/":
                    if(0 != numberB){
                        result = numberA / numberB;break;
                    }else {
                        System.out.println("除数不能为0！");
                        return;
                    }
                default:
                    System.out.println("input error!Please check!");
                    return;
            }
            System.out.println("result is:"+result);
        }catch (Exception e){
            System.out.println("input error!Please check!");
        }

    }
}

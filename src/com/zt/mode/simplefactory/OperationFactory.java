package com.zt.mode.simplefactory;

/**
 * @Author：ZhangTao
 * @Description:计算器工厂（简单工厂模式）
 * @Date: Created in 20:38 2017/9/3
 */
public class OperationFactory {

    /**
     * 用于获取相应的实例化对象
     * @param operator
     * @return
     */
    public static BaseCalculator getOperation(String operator){
        switch (operator){
            case "+": return new AddOperation();
            case "-": return new SubtractOperation();
            case "*": return new MultiplyOperation();
            case "/": return new DivideOperation();
            default:
                System.out.println("此操作暂不支持！");
                return null;
        }
    }

}

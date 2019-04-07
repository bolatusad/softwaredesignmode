package zt.mode.factory;

/**
 * ZhangTao
 * 2019/4/6 18:30
 * Description:
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        FactoryMethod appleFactory = new AppleFactory();
        FactoryMethod orangeFactory = new OrangeFactory();
        Product apple = appleFactory.newProduct();
        Product orange = orangeFactory.newProduct();
        apple.show();
        orange.show();
    }
}


// 简单工厂模式，则是将

/**
 * 抽象工厂方法
 */
interface FactoryMethod {
    Product newProduct();
}

/**
 * 抽象产品
 */
interface Product{
    void show();
}

/**
 * 抽象工厂的具体实现
 */
class AppleFactory implements FactoryMethod {

    @Override
    public Product newProduct() {
        return new AppleProduct();
    }
}

/**
 * 抽象工厂的具体实现
 */
class OrangeFactory implements FactoryMethod {

    @Override
    public Product newProduct() {
        return new OrangeProduct();
    }
}

/**
 * 抽象产品的具体实现
 */
class AppleProduct implements Product{
    @Override
    public void show() {
        System.out.println("我是苹果！");
    }
}

/**
 * 抽象产品的具体实现
 */
class OrangeProduct implements Product{
    @Override
    public void show() {
        System.out.println("我是橘子！");
    }
}
package zt.mode.factory;

/**
 * ZhangTao
 * 2019/4/7 11:21
 * Description: 抽象工厂 ： 可以生产多种产品
 */
public class AbstrctFactoryTest {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = new ShapeFactory();
        AbstractFactory colorFactory = new ColorFactory();
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Color red = colorFactory.getColor("red");
        red.fill();
    }


}

/**
 * 抽象产品1
 */
interface Shape{
    void draw();
}

class circle implements Shape{


    @Override
    public void draw() {
        System.out.println("我是圆形！");
    }
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("我是矩形！");
    }
}

/**
 * 抽象产品2
 */
interface Color{
    void fill();
}

class RedColor implements Color{

    @Override
    public void fill() {
        System.out.println("填充红色！");
    }
}

class GreenColor implements Color{

    @Override
    public void fill() {
        System.out.println("填充绿色！");
    }
}


/**
 * 抽象工厂
 */
interface AbstractFactory{

    Shape getShape(String shape);
    Color getColor(String color);
}


class ShapeFactory implements AbstractFactory{

    @Override
    public Shape getShape(String shape) {
        if("circle".equals(shape)){
            return new circle();
        }
        if("rectangle".equals(shape)){
            return new Rectangle();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}


class ColorFactory implements AbstractFactory{

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if("red".equals(color)){
            return new RedColor();
        }
        if("green".equals(color)){
            return new GreenColor();
        }
        return null;
    }
}

/**
 * 不应该加这个东西，不满足开闭原则
 */
class FactoryProducer {
    public AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}





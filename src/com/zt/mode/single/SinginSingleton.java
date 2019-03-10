package zt.mode.single;

/**
 * ZhangTao
 * 2019/3/10 20:40
 * Description: 注册式
 * 使用相对简单，能达到双检的效果
 *
 * 也是利用了，类加载机制，当首次类加载的时候，不会创建对象，在调用getInstance时，才会
 */
public class SinginSingleton {

    private static class SingletonHolder {
        private static final SinginSingleton INSTANCE = new SinginSingleton();
    }
    private SinginSingleton (){}
    public static final SinginSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //枚举类创建单例的使用方法
    public static void main(String[] args) {
        EnumSingleton.INSTANCE.whateverMethod();
    }

}

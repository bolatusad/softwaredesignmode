package zt.mode.struct;

/**
 * ZhangTao
 * 2019/4/7 14:19
 * Description: 代理模式： 由于某种原因，需要给某个对象，提供一个代理以控制对改对象的访问，而，此时访问对象，不适合或者不能直接访问目标对象，
 * 代理对象作为访问对象和目标对象之间的中介
 *
 * 优点：
 * - 代理模式在客户端与目标对象之间，起到一个中介和保护目标对象的作用
 * - 代理模式可以扩展目标 对象的功能
 * - 代理模式能够将客户端与目标对象分离，在一定程度上降低了系统的耦合度
 *
 * 缺点：
 * - 在客户端与目标对象之间增加一个代理对象，会造成请求处理速度，降低
 * - 增加了系统的复杂度
 *
 */
public class ProxyModeTest {

    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject();
        proxySubject.request();
    }

}


interface Subject{
    void request();
}

class RealSubject implements Subject{

    @Override
    public void request() {
        System.out.println("real subject request...........");
    }
}

class ProxySubject implements Subject{

    private RealSubject realSubject;

    @Override
    public void request() {
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        afterRequest();
    }

    public void preRequest(){
        System.out.println("pre request........");
    }

    public void afterRequest(){
        System.out.println("after request...........");
    }
}

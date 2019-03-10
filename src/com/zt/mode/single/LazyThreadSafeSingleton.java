package com.zt.mode.single;

/**
 * ZhangTao
 * 2019/3/10 17:19
 * Description: 懒汉式，线程安全模式
 *
 * 特点： 这种方式，虽然可以保证线程安全，
 * 但是synchronized加载了方法上，效率很低，不适用与调用率较高的场景
 */
public class LazyThreadSafeSingleton {

    private static LazyThreadSafeSingleton lazyThreadSafeSingleton;

    private LazyThreadSafeSingleton(){};

    public static synchronized LazyThreadSafeSingleton getInstance(){
        if(lazyThreadSafeSingleton == null){
            lazyThreadSafeSingleton = new LazyThreadSafeSingleton();
        }
        return lazyThreadSafeSingleton;
    }

}

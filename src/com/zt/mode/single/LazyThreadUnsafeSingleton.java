package com.zt.mode.single;

/**
 * ZhangTao
 * 2019/3/10 17:14
 * Description: 懒汉式 单例模式，顾名思义，用到的时候才会创建
 * 此处的例子，是线程不安全的，适合单线程的时候使用
 *
 */
public class LazyThreadUnsafeSingleton {

    private static LazyThreadUnsafeSingleton lazyThreadUnsafeSingleton;

    /**
     * 防止外部实例化对象
     */
    private LazyThreadUnsafeSingleton(){};

    public static LazyThreadUnsafeSingleton getInstance(){
        if(lazyThreadUnsafeSingleton == null){
            lazyThreadUnsafeSingleton = new LazyThreadUnsafeSingleton();
        }
        return lazyThreadUnsafeSingleton;
    }

}

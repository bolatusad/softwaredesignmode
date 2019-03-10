package com.zt.mode.single;

/**
 * ZhangTao
 * 2019/3/10 17:05
 * Description:
 * 饿汉式单例模式
 * 优点： 没有枷锁，且线程安全，效率较高，实现较为方便简单
 * 缺点：类加载的时候就初始化，而不考虑后面是否会被使用，浪费内存
 */
public class HungrySingleton {

    //不允许创建实例
    private HungrySingleton(){};

    private static HungrySingleton singleton = new HungrySingleton();

    public static HungrySingleton getSingleton(){
        return singleton;
    }
}

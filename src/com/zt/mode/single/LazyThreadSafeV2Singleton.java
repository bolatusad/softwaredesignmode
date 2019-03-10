package com.zt.mode.single;

/**
 * ZhangTao
 * 2019/3/10 17:49
 * Description:
 */
public class LazyThreadSafeV2Singleton {

    // 加上 volatile 是为了避免，发生指令重排的情况，
    // 而导致获取到了不为空singleton，但是，还没有赋值
    //volatile关键字的一个作用是禁止指令重排，把instance声明为volatile之后，对它的写操作就会有一个内存屏障（什么是内存屏障？），这样，在它的赋值完成之前，就不用会调用读操作。
    //注意：volatile阻止的不singleton = new Singleton()这句话内部[1-2-3]的指令重排，而是保证了在一个写操作（[1-2-3]）完成之前，不会调用读操作（if (instance == null)）。
    private volatile static LazyThreadSafeV2Singleton singleton;

    private LazyThreadSafeV2Singleton(){};

    public static LazyThreadSafeV2Singleton getInstance(){
        if(singleton == null){
            //为空才加锁，相比方法枷锁，效率大大提升
            synchronized (LazyThreadSafeV2Singleton.class){
                //多个线程，获取到锁的时候，可能，第一个执行完成之后，
                // 再次进入创建的方法，如果发现已经不为空了，则不执行了
                if(singleton == null){
                    singleton = new LazyThreadSafeV2Singleton();
                }
            }
        }
        return singleton;
    }

}

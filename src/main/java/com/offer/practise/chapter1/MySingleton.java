package com.offer.practise.chapter1;

/**
 * @author zhugp
 * @description TODO
 * @date 2019/9/5 15:12
 */
public class MySingleton {
    public static void main(String args[]){
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                Singleton5 sin =  Singleton5.getInstance();
                System.out.println(sin);
            }).start();
        }

    }
}


/**
 * @author zhugp
 * @description 饱汉式单例 多线程环境下会创建出不同的对象
 * @date 2019/9/5 15:35
 * @return
 **/
class Singleton1 {

    private static Singleton1 instance = null;

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    private Singleton1() {

    }
}

/**
 * @author zhugp
 * @description 程序最开始就将实例初始化好了，
 * 可以避免创建不同对象的问题，但是消耗资源，因为可能这个对象不用
 * @date 2019/9/5 16:09
 * @return
 **/
class Singleton2 {
    private static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return instance;
    }

    private Singleton2() {

    }

}

/**
 * @author zhugp
 * @description 加锁了，多线程下饱汉式也能跑了，但是加锁之后这个效率就低了，因为锁是会影响性能的
 * @date 2019/9/5 16:12
 * @param null
 * @return
 **/
class Singleton3{
    private static Singleton3 instance = null;

    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }

    private Singleton3() {

    }
}

/**
 * @author zhugp
 * @description Singleton3的改进版，双重检查锁
 * @date 2019/9/5 16:16
 * @param null
 * @return
 **/
class Singleton4 {
    private static Singleton4 instance = null;

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }


    private Singleton4() {

    }
}

/**
 * @author zhugp
 * @description 通过静态内部类实现单例（单例）
 * @date 2019/9/5 16:19
 * @param null
 * @return
 **/
class Singleton5 {
    private static class SingletonHolder{
        private static Singleton5 instance = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return SingletonHolder.instance;
    }

    private Singleton5() {

    }


}



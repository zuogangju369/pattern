package com.pattern.createtype.singleton;
/**
 * Description: 懒汉式线程安全单例模式
 *
 * @author zuogangju
 * @date 2019/3/4 13:43
 * @version V1.0
 */
public class Singleton {
    /**
     * 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
     */
    private static Singleton instance = null;

    /**
     * 私有构造方法，防止被实例化
     */
    private Singleton() {
        System.out.println("您调用了单例模式");
    }

    /**
     * 多线程同步
     */
    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new Singleton();
        }
    }

    /**
     * 静态工程方法，创建实例
     *
     * @return 单例对象
     */
    public static Singleton getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }


}

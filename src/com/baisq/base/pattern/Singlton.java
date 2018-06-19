package com.baisq.base.pattern;


/**
 * 为什么静态内部类实现单例
 * 静态内部类可以定义静态成员
 * 非静态内部类不可以定义静态成员
 */
public class Singlton {

    static class SingltonInnerClass{
        private static Singlton singlton = new Singlton();
    }
    public static Singlton getInstance(){
        return SingltonInnerClass.singlton;
    }

    /**
     * 外部类可以访问静态内部类的非静态成员(实例化内部类访问)
     * 可以直接访问静态成员
     */
    public void test(){

    }


//    class SingltonInnerClass2{
//        private static Singlton singlton = new Singlton();
//    }
}

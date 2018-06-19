package com.baisq.base.pattern;

/**
 * 双重检查实现单例
 * 可能会因为jvm内存模型的无需写入情况出现问题(对象初始化过程的顺序无序)
 *  使用volatile关键字实现一致性
 */
public class DoubleCheckSinglton {

    private static DoubleCheckSinglton instnce = null ;

    public static DoubleCheckSinglton getInstance(){
        if (instnce == null){
            synchronized (DoubleCheckSinglton.class){
               if(instnce == null){
                   instnce = new DoubleCheckSinglton();
               }
            }
        }
        return instnce;
    }
}

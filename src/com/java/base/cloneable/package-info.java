
/**
 * 为什么clone要实现cloneable接口
 * 如果不实现cloneable接口，调用object类的clone方法会报clonenotsupportexception
 * *******************
 * object类的clone方法返回的是一个object对象的拷贝对象：
 * 1该拷贝对象不是引用，而是一个新对象
 * 2拷贝对象与通过new 操作符创建的对象的区别就是，拷贝对象可以包含原来对象的信息。
 * *******************
 * 如何实现clone
 * 1实现cloneable接口
 * 2重载clone()方法
 * 3clone()方法内部直接或间接调用super.clone()，Object类的clone方法
 * *******************
 * 为什么super.clone()调用的是Object而不是其它父类的clone方法（为什么用Object的clone方法。而不是new 对象然后赋值创建对象）？
 * Object类的clone()使用native修饰的，native修饰的方法的效率要高于非native的方法
 * *******************
 * clone方法是protected修饰的，而所有类缺省继承了Object类，所以可以直接重载clone方法；
 * 重载之后要修饰符要用public,方便其它对象访问；
 * ******************
 * Cloneable接口没有任何抽象方法，clone方法是object类的，那为什么还要实现cloneable
 * 实现Cloneable接口只是允许克隆的一个标志，如果不实现，调用clone方法会报错
 * @author Administrator
 *
 */
package com.java.base.cloneable;
/**
 * 
 */
/**
 * race condition 资源竞争(出现在并发访问情况)
 * 1Thread和ThreadLocal通过Thread.ThreadLocalMap关联
 * 2每个线程维护一个ThreadLocalMap,结构是key-value形式，key即代表当前线程实例，value存放在Entry[]的数组中，firstKey.threadLocalHashCode & (INITIAL_CAPACITY - 1);
 * 3
 * ThreadLocalMap(ThreadLocal<?> firstKey, Object firstValue) {
            table = new Entry[INITIAL_CAPACITY];
            int i = firstKey.threadLocalHashCode & (INITIAL_CAPACITY - 1);
            table[i] = new Entry(firstKey, firstValue);
            size = 1;
            setThreshold(INITIAL_CAPACITY);
        }
   4ThreadLocal是弱引用，因为Entry extends WeakReference<ThreadLocal<?>>，存储元素的entry类是弱应用，当线程结束或者，调用ThreadLocalMap.remove方法，会回收占用的空间，不会出现内存泄漏
   5如果是线程池，可能会出现内存泄漏，因为线程会被复用，需要手动remove
 * @author Administrator
 *
 */
package com.baisq.base.threadlocal;


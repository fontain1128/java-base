/**
 * 
 */
/**
 * race condition ��Դ����(�����ڲ����������)
 * 1Thread��ThreadLocalͨ��Thread.ThreadLocalMap����
 * 2ÿ���߳�ά��һ��ThreadLocalMap,�ṹ��key-value��ʽ��key������ǰ�߳�ʵ����value�����Entry[]�������У�firstKey.threadLocalHashCode & (INITIAL_CAPACITY - 1);
 * 3
 * ThreadLocalMap(ThreadLocal<?> firstKey, Object firstValue) {
            table = new Entry[INITIAL_CAPACITY];
            int i = firstKey.threadLocalHashCode & (INITIAL_CAPACITY - 1);
            table[i] = new Entry(firstKey, firstValue);
            size = 1;
            setThreshold(INITIAL_CAPACITY);
        }
   4ThreadLocal�������ã���ΪEntry extends WeakReference<ThreadLocal<?>>���洢Ԫ�ص�entry������Ӧ�ã����߳̽������ߣ�����ThreadLocalMap.remove�����������ռ�õĿռ䣬��������ڴ�й©
   5������̳߳أ����ܻ�����ڴ�й©����Ϊ�̻߳ᱻ���ã���Ҫ�ֶ�remove
 * @author Administrator
 *
 */
package com.baisq.base.threadlocal;



/**
 * ΪʲôcloneҪʵ��cloneable�ӿ�
 * �����ʵ��cloneable�ӿڣ�����object���clone�����ᱨclonenotsupportexception
 * *******************
 * object���clone�������ص���һ��object����Ŀ�������
 * 1�ÿ������������ã�����һ���¶���
 * 2����������ͨ��new �����������Ķ����������ǣ�����������԰���ԭ���������Ϣ��
 * *******************
 * ���ʵ��clone
 * 1ʵ��cloneable�ӿ�
 * 2����clone()����
 * 3clone()�����ڲ�ֱ�ӻ��ӵ���super.clone()��Object���clone����
 * *******************
 * Ϊʲôsuper.clone()���õ���Object���������������clone������Ϊʲô��Object��clone������������new ����Ȼ��ֵ�������󣩣�
 * Object���clone()ʹ��native���εģ�native���εķ�����Ч��Ҫ���ڷ�native�ķ���
 * *******************
 * clone������protected���εģ���������ȱʡ�̳���Object�࣬���Կ���ֱ������clone������
 * ����֮��Ҫ���η�Ҫ��public,��������������ʣ�
 * ******************
 * Cloneable�ӿ�û���κγ��󷽷���clone������object��ģ���Ϊʲô��Ҫʵ��cloneable
 * ʵ��Cloneable�ӿ�ֻ�������¡��һ����־�������ʵ�֣�����clone�����ᱨ��
 * @author Administrator
 *
 */
package com.java.base.cloneable;
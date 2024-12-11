package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/11 14:39
 */
public interface Iterator<E> {
    //判断集合中是否有下一个元素
    boolean hasNext();

    //将游标后移一位元素
    E next();

    //返回当前游标指定的元素
    E currentItem();
}

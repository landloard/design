package org.landlord.demo01;

import java.util.ArrayList;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/11 14:40
 */
public class ConcreteIterator<E> implements Iterator<E> {
    private int cursor = 0;

    private ArrayList<E> list ;

    public ConcreteIterator(ArrayList<E> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public E next() {
     return list.get(cursor++);
    }

    @Override
    public E currentItem() {
        return list.get(cursor);
    }
}

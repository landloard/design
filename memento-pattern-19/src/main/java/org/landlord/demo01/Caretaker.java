package org.landlord.demo01;

/**
 * 负责人类-保存备忘录对象
 * @author spikeCong
 * @date 2022/10/19
 **/
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}

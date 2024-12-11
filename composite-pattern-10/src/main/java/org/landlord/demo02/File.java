package org.landlord.demo02;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 14:23
 */
public class File extends Entry {
    private String fileName;

    private int size;

    public File(String fileName, int size) {
        this.fileName = fileName;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.fileName;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public Entry add(Entry entry) {
        return null;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}

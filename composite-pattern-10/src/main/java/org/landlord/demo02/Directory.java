package org.landlord.demo02;

import java.util.ArrayList;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 14:19
 */
public class Directory extends Entry {
    private String directoryName;

    private ArrayList<Entry> entries = new ArrayList<>();

    public Directory(String directoryName) {
        this.directoryName = directoryName;
    }

    @Override
    public String getName() {
        return this.directoryName;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : entries) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        entries.add(entry);
        return null;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/"+this);
        for (Entry entry : entries) {
            entry.printList(prefix+"/"+this);
        }
    }
}

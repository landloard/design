package org.landlord.demo02;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 14:26
 */
public class Client {
    public static void main(String[] args) {
        Directory rootDir = new Directory("root");

        Directory binDir = new Directory("bin");
        binDir.add(new File("vi",1000));
        binDir.add(new File("test",8000));

        Directory tmpDir = new Directory("tmp");

        Directory usrDir = new Directory("usr");
        Directory mysqlDir = new Directory("mysql");
        mysqlDir.add(new File("my.cnf",8000));
        mysqlDir.add(new File("test.db",250000));
        usrDir.add(mysqlDir);

        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);

        rootDir.printList("");


    }
}

package org.landlord.demo02;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 11:42
 */
public class DataLoaderDecorator implements DataLoader{
    private DataLoader dataLoader;

    public DataLoaderDecorator(DataLoader dataLoader) {
        this.dataLoader = dataLoader;
    }
    @Override
    public String read() {
        return dataLoader.read();
    }

    @Override
    public void write(String data) {
        dataLoader.write(data);
    }
}

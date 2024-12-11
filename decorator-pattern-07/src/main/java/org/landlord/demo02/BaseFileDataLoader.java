package org.landlord.demo02;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 11:24
 */
public class BaseFileDataLoader implements DataLoader {

    private String filePath;

    public BaseFileDataLoader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() {

        try {
            String result = FileUtils.readFileToString(new File(filePath), "utf-8");
            return result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void write(String data) {
        try {
            FileUtils.writeStringToFile(new File(filePath),data,"utf-8");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

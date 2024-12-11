package org.landlord.demo02;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 11:43
 */
public class EncryptionDataDecorator  extends  DataLoaderDecorator{
    public EncryptionDataDecorator(DataLoader dataLoader) {
        super(dataLoader);
    }

    @Override
    public String read() {
        return decode(super.read());
    }



    @Override
    public void write(String data) {
        super.write(encode(data));
    }

    private String encode(String data) {
        try {
            Base64.Encoder encoder = Base64.getEncoder();
            return encoder.encodeToString(data.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private String decode(String read) {
        try {
            Base64.Decoder decoder = Base64.getDecoder();
            return new String(decoder.decode(read),"utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

    }
}

package me.leozhou.compression.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import me.leozhou.compression.Compress;

/**
 * AbstractCompression class
 *
 * @author zhouchunjie
 * @date 2021/5/19
 */
public abstract class AbstractCompression implements Compress {

    protected abstract OutputStream getCompressOutputString(OutputStream output) throws IOException;

    protected abstract InputStream getUncompressInputStream(InputStream input) throws IOException ;

    @Override
    public String compress(String str) throws IOException {
        byte[] data = str.getBytes(Charset.defaultCharset());
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try(OutputStream cs = getCompressOutputString(os)){
            cs.write(data);
        }
        // 需要保证输出编码为ISO-8859-1，不然后续解压时，会抛出 Not in GZIP format
        return os.toString("ISO-8859-1");
    }

    @Override
    public String uncompress(String str) throws IOException {

        // 前面使用了ISO-8859-1编码
        byte[] data = str.getBytes("ISO-8859-1");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[4096];
        int len = 0;

        try (InputStream us = getUncompressInputStream(new ByteArrayInputStream(data))) {
            while ((len = us.read(buffer)) != -1){
                baos.write(buffer, 0, len);
            }
        }

        return baos.toString(Charset.defaultCharset().name());
    }
}

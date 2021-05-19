package me.leozhou.compression;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.IO;
import java.io.IOException;
import me.leozhou.compression.impl.GzipCompression;

/**
 * CompressUtils class
 *
 * @author zhouchunjie
 * @date 2021/5/19
 */
public enum  CompressUtils {

    GZIP {
        Compress compress = new GzipCompression();

        @Override
        public String compress(String str) throws IOException {
            return compress.compress(str);
        }
        @Override
        public String uncompress(String str) throws IOException {
            return compress.uncompress(str);
        }
    };

    public String compress(String str) throws IOException {
        throw  new AbstractMethodError();
    }

    public String uncompress(String str) throws IOException {
        throw  new AbstractMethodError();
    }

}

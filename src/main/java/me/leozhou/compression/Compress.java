package me.leozhou.compression;

import java.io.IOException;

/**
 * Compress class
 *
 * @author zhouchunjie
 * @date 2021/5/19
 */
public interface Compress {

    /**
     * 压缩数据
     * @param data 带压缩的数据
     * @return
     * @throws IOException
     */
    String compress(String data) throws IOException;


    /**
     * 解压数据
     * @param data  已压缩的数据
     * @return
     * @throws IOException
     */
    String uncompress(String data) throws IOException;

}

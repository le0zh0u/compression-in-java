package me.leozhou.compression.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * GzipCompression class
 *
 * @author zhouchunjie
 * @date 2021/5/19
 */
public class GzipCompression extends AbstractCompression{

    @Override
    protected OutputStream getCompressOutputString(OutputStream output) throws IOException {
        return new GZIPOutputStream(output);
    }

    @Override
    protected InputStream getUncompressInputStream(InputStream input) throws IOException {
        return new GZIPInputStream(input);
    }
}

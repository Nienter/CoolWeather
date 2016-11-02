package com.coolweather.app.util;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by Blank on 2016/9/26.
 */
public class CloseableUtil {

    public CloseableUtil(Closeable... closeables) {
        close(closeables);
    }

    public void close(Closeable... closeables) {
        if (null != closeables && closeables.length > 0) {
            for (Closeable closeable : closeables) {
                if (null != closeable) {
                    try {
                        closeable.close();
                    } catch (IOException e) {
                        LogUtil.e("WQL", "CloseableUtil error: " + e.getMessage());
                    }
                }
            }
        }
    }

}

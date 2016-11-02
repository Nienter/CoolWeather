/**
 * Copyright © 2016 深圳市欧唯科技有限公司. All rights reserved.
 *
 * @Title: AssetsUtil.java
 * @Prject: PersistenceDemo
 * @Package: com.example.persistencedemo
 * @Description: TODO
 * @author: WUQINGLONG
 * @date: 2016年9月23日 下午4:06:04
 * @version: V1.0
 */
package com.coolweather.app.util;

import com.coolweather.app.activity.BaseApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: AssetsUtil
 * @Description: TODO
 * @author: Blank
 * @date: 2016年9月23日 下午4:06:04
 */
public class AssetsUtil {
    private AssetsUtil() {
    }

    public static String readFile(String name) {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(BaseApplication.getContext().getAssets().open(name)));
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            LogUtil.e("WQL", "AssetsUtil error: " + e.getMessage());
        } finally {
            new CloseableUtil(reader);
        }
        return sb.toString();
    }
}

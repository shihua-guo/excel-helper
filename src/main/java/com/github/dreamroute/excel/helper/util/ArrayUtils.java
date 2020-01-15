package com.github.dreamroute.excel.helper.util;

import java.lang.reflect.Array;

/**
 * @author guoshihua
 * @description
 * @date 2020/1/15 11:58
 */
public class ArrayUtils {

    public static boolean isEmpty(byte[] array) {
        return getLength(array) == 0;
    }

    public static int getLength(Object array) {
        return array == null ? 0 : Array.getLength(array);
    }


}

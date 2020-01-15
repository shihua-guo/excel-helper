package com.github.dreamroute.excel.helper.util;

import java.util.Collection;

/**
 * @author guoshihua
 * @description
 * @date 2020/1/15 11:51
 */
public class CollectionUtils {

    public static boolean isEmpty(Collection<?> coll) {
        return coll == null || coll.isEmpty();
    }

    public static boolean isNotEmpty(Collection<?> coll) {
        return !isEmpty(coll);
    }

}

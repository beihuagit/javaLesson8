package com.basics.Collections;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * �Ƚ��ȳ���������δ��ʹ��
 * @author xiaole.chen
 * @date 2020/11/3 14:52
 * */
public class LruCache<K,V> extends LinkedHashMap<K,V> {

    private static final long serialVersionUID = 3091602539094011264L;

    private final int MAX_CACHE_SIZE;
    public LruCache(int maxCacheSize) {
        super(maxCacheSize + 1, 1.0f, true);
        MAX_CACHE_SIZE = maxCacheSize;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > MAX_CACHE_SIZE;
    }

    public static void main(String[] args) {
        Map<String, String> map = Collections.synchronizedMap(new LruCache<>(3));
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        System.out.println(map);
        map.put("4","4");
        System.out.println(map);
    }
}

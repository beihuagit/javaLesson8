package com.basics.utils;


import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * @Author: xiaole.chen
 * @Date: 2020/4/28 14:23
 * @Description: 驼峰转换
 * */
public class MyStringUtil {

    /**
     * 下划线转驼峰
     * @param str
     * @return
     */
    public static String stringToCamel(String str) {
        StringBuilder buffer = new StringBuilder();
        String[] parts = str.toLowerCase().split("_");
        Stream.iterate(0, i -> i + 1).limit(parts.length).forEach(i -> {
            if(0 != i){
                buffer.append(StringUtils.capitalize((parts[i])));
            }else{
                buffer.append(parts[i]);
            }
        });
        return buffer.toString();
    }

    private static Pattern linePattern = Pattern.compile("_(\\w)");
    /** 下划线转驼峰 */
    public static String lineToHump(String str) {
        str = str.toLowerCase();
        Matcher matcher = linePattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    private static Pattern humpPattern = Pattern.compile("[A-Z]");
    /** 驼峰转下划线,效率比上面高 */
    public static String humpToLine(String str) {
        Matcher matcher = humpPattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, "_" + matcher.group(0).toLowerCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

}

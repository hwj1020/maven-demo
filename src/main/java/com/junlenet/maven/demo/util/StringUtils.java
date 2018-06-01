package com.junlenet.maven.demo.util;

public class StringUtils {

    /**
     * formate object to string
     * @param obj
     * @return string
     */
    public static String toStr(Object obj){
        if(null == obj){
            return "";
        }
        return obj.toString();
    }
}

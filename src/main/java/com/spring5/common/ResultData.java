package com.spring5.common;

/**
 * @author 洛水晴川
 * @date 2021/9/28 12:35
 * */
public class ResultData {

    private Object data;
    private String traceId;

    public ResultData(Object data, String traceId) {
        this.data = data;
        this.traceId = traceId;
    }

    public ResultData(Object data) {
        this.data = data;
    }

    public static ResultData SUCCESS(Object data) {
        return new ResultData(data);
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public Object getData() {
        return data;
    }

    public String getTraceId() {
        return traceId;
    }
}

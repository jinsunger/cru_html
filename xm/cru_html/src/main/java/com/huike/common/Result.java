package com.huike.common;

import java.util.List;

//公共的返回
public class Result<T> {
    //如果分页查询，返回的是个集合
    private List<T> list;
    //如果返回单条记录，返回的是个对象
    private T t;

    //增删改没有返回值
    private String stua;

    private String message;

    public Result(String stua, String message) {
        this.stua = stua;
        this.message = message;
    }

    public Result(T t) {
        this.t = t;
    }

    public Result(List<T> list) {
        this.list = list;
    }

    public Result() {
    }

    @Override
    public String toString() {
        return "Result{" +
                "list=" + list +
                ", t=" + t +
                ", stua='" + stua + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getList() {
        return list;
    }

    public void setStua(String stua) {
        this.stua = stua;
    }

    public T getT() {
        return t;
    }

    public String getStua() {
        return stua;
    }

    public String getMessage() {
        return message;
    }
}

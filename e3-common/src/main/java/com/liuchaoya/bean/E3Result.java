package com.liuchaoya.bean;

import java.io.Serializable;

/**
 * 网络返回结果统一格式
 * Created by LiuChaoya on 2018/8/16 0016 16:36.
 * email  1090969255@qq.com
 */

public class E3Result implements Serializable {
    public int resultCode;
    public int requestStatus;
    public String resultMsg;
    public Object data;

    @Override
    public String toString() {
        return "{" +
                "resultCode=" + resultCode +
                ", requestStatus=" + requestStatus +
                ", resultMsg='" + resultMsg + '\'' +
                ", data=" + data.toString() +
                '}';
    }
}

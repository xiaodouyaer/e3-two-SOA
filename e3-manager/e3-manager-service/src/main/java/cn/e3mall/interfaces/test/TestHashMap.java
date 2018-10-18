package cn.e3mall.interfaces.test;

import java.util.HashMap;

/**
 * Created by LiuChaoya on 2018/8/22 0022 10:28.
 * email  1090969255@qq.com
 */

public class TestHashMap {

    public static void main(String[] args) {
        final HashMap<String,String> map = new HashMap<>(2);
        map.put("Android","1");
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                map.put("Java","2");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                map.put("Java","2");
            }
        });

        thread1.start();
        thread2.start();
    }
}

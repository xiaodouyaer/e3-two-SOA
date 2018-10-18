package cn.e3mall.interfaces.test;

/**
 * Created by LiuChaoya on 2018/9/6 0006 11:57.
 * email  1090969255@qq.com
 */

public class ProxyTest {
    public static void main(String[] args) {
        int result = Add(3,7);
    }

    private static int Add(int a, int b) {
        int ans;
        while (b != 0) {  //直到没有进位
            ans = a ^ b;        //不带进位加法
            b = ((a & b) << 1);   //进位
            a = ans;
        }
        return a;
    }
}

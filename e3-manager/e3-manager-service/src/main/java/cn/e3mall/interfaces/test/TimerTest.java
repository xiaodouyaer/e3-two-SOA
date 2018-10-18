package cn.e3mall.interfaces.test;

import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by LiuChaoya on 2018/8/24 0024 14:00.
 * email  1090969255@qq.com
 */

public class TimerTest {
    Timer timer;

    public TimerTest(int time) {
        timer = new Timer();
        timer.schedule(new timerTaskTest(), time * 100, 300);//timer.schedule(执行的方法，延迟多久执行(ms))
    }

    public static void main(String[] args) {
//        System.out.println("timer begin...");
//        new TimerTest(3);

        //元素不允许重复，重复会覆盖
        HashSet<String> set = new HashSet<>();
        set.add("111");
        set.add("222");
        set.add("333");
        set.add("111");

    }

    class timerTaskTest extends TimerTask {
        int count = 0;

        @Override
        public void run() {
            if (count > 10) {
                timer.cancel();
                return;
            }
            count++;
            System.out.println("time's up!!");
        }
    }
}

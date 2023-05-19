import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD
MyThread thread = new MyThread();
MyThread thread2 = new MyThread();
thread.start();
thread2.start();

    }

    static class MyThread extends Thread {
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
            }
        }
    }
}
=======
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(49));
        System.out.println(list.size());
        JFrame frame = new JFrame();
        }
    }
>>>>>>> df6c31a (first commit)

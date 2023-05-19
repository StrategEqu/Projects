import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
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

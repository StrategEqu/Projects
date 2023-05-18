import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
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

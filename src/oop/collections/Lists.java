package oop.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Lists {
    public static void main(String[] args) {
        LinkedList<Integer> n = new LinkedList<>();
        n.add(34);
        n.add(18);
        n.add(52);
        n.add(95);
        n.add(63);

        System.out.println(n);
    }
}

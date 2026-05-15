package oop.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Lists {
    public static void main(String[] args) {
        Collection<Integer> n = new ArrayList<>();
        n.add(34);
        n.add(18);
        n.add(52);
        n.add(95);
        n.add(63);

        System.out.println(n);
    }
}

package Collec;

import java.util.Comparator;

public class ComparatorMenor implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
       return o1 - o2;
    }
}

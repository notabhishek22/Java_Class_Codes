// Java program to demonstrate Unbounded wildcard

import java.util.Arrays;
import java.util.List;

class TestUnboundedWildcard {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);

        List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);

        printlist(list1);

        printlist(list2);
    }

    private static void printlist(List<?> list) {
        System.out.println(list);
    }
}

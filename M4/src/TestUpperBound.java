// Java program to demonstrate Upper Bounded Wildcards

import java.util.Arrays;
import java.util.List;

class TestUpperBoundWildcard {
    public static void main(String[] args) {
        // Upper Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

        // printing the sum of elements in list
        System.out.println("Total sum is:" + sum(list1));

        // Double list
        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);

//        Double[] list2 = { 1.1, 2.2, 3.3, 4.4 };
        // printing the sum of elements in list
        System.out.println("Total sum is:" + sum(list2));

//    private static <E> double sum(List <E> list){
//        double m = 0.0;
//        for(E x : list){
//            m += x.doubleValue();
//            m = m + (Double)x;
//        }
//        return m;
    }

    private static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }
        return sum;
    }
}
// Java program to demonstrate Lower Bounded Wildcards

import java.util.Arrays;
import java.util.List;

class TestLowerBoundWildcard {
    public static void main(String[] args) {

        // Lower Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
//         Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list1);

//        List<Double> list3 = Arrays.asList(4.1, 5.1, 6.1);
//
//        printOnlyIntegerClassorSuperClass(list3);

        // Number list
        List<Number> list2 = Arrays.asList(4, 5, 6, 7);

        // Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list2);
    }

    public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list)
    {
        System.out.println(list);
    }
}
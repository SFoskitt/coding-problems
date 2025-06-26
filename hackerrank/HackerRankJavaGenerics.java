import java.util.*;

public class HackerRankJavaGenerics {

    public static <E> void printArray(E[] arr) {
        for(E ele : arr){
            System.out.println(ele);
        }
    }

    public static void main(String[] args){
        String[] strArr = {"Hello", "World"};
        Integer[] intArr = {1, 2, 3};
        printArray(intArr);
        printArray(strArr);
    }
}

// https://www.hackerrank.com/challenges/java-generics/problem?isFullScreen=true

/**
 * You have to write a single method printArray that can print all the elements of both arrays (String and int)
 * 
 * NOTE: Generics seem okay with String and Integer but *NOT* with primitive types (int)
 */

package wrapper;

import java.util.Arrays;

public class ArrayMergeAtSpecificIndex {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 7, 12, 11};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = new int[arr1.length + arr2.length];
        int index = 5;
        for (int i = 0; i < arr3.length; i++) {
            if(index>i){
                arr3[i] = arr1[i];
            }else if(i>=index+arr2.length){
                arr3[i] = arr1[i-arr2.length];
            }else if(index<=i){
                arr3[i] = arr2[i-index];
            }

        }
        System.out.println("Array after merging");
        System.out.println(Arrays.toString(arr3));

    }
}

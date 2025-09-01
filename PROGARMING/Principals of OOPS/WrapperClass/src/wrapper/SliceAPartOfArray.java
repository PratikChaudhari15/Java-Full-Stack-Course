package wrapper;

import java.util.Arrays;

public class SliceAPartOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int startSlice= 3;
        int endSlice= 5;
        int[] arr2 = new int[arr1.length-(endSlice-startSlice)];

        if(startSlice<endSlice){
            for(int i=0;i<arr1.length;i++){
                if(startSlice>i){
                    arr2[i]=arr1[i];
                } else if (startSlice<=i && endSlice>i) {
                    continue;
                }else if(endSlice<=i){
                    arr2[i-(endSlice-startSlice)]=arr1[i];
                }
            }
            System.out.println(Arrays.toString(arr2));
        }else{
            System.out.println("End index must be greater than start");
        }

    }
}

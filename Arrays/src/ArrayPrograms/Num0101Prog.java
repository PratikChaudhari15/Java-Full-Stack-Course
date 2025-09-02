package ArrayPrograms;

public class Num0101Prog
{
    public static void main(String [] args)
    {
        // Input array with 0s and 1s (unsorted)
        int []arr = {1,0,1,0,1,1,1,0,0};

        // ✅ Call the sorting logic method
        sortArray(arr);

        // ✅ Print sorted array
        System.out.print("Sorted Array :  ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    // ✅ Logic method: moves 0s to left and 1s to right using two pointers
    public static void sortArray(int[] arr)
    {
        int left = 0;                 // pointer starting from the beginning
        int right = arr.length - 1;   // pointer starting from the end

        // loop runs until left and right pointers meet
        while (left < right)
        {
            if (arr[left] == 0) {
                // if left side already has 0, move left pointer forward
                left++;
            }
            else if (arr[right] == 1) {
                // if right side already has 1, move right pointer backward
                right--;
            }
            else {
                // otherwise swap left=1 and right=0
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                // after swapping, move both pointers
                left++;
                right--;
            }
        }
    }
}

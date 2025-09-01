package ArrayPrograms;

public class Num0101Prog
{
    public static void main(String [] args)
    {
        int []arr = {1,0,1,0,1,1,1,0,0};

        sortArray(arr);

        System.out.print("Sorted Array :  ");

        for (int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void sortArray(int[]arr)
    {
        int left = 0;
        int right = arr.length-1;

        while (left<right)
        {
            if (arr[left]==0)
            {
                left++;
            } else if (arr[right]==1)
            {
                right--;
            }
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }

}

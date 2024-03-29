import java.util.*;
public class Main
{
    static int binarySearch(int [] arr, int elem)
    {
        int l = 0;
        int r = arr.length;
        int mid = 0;

        if(elem >= arr[arr.length - 1])
        {
            return arr.length - 1;
        }

        if(elem < arr[0])
        {
            return -1;
        }

        while(l <= r)
        {
            mid = (l + r) / 2;

            if(mid >= arr.length)
            {
                break;
            }

            if(elem >= arr[mid])
            {
                l = mid + 1;
            }
            else
            {
                r = mid - 1;
            }
        }

        return r;
    }

    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);

        int n = read.nextInt();
        int m = read.nextInt();
        int [] arr1 = new int[n];
        int [] arr2 = new int[n];

        for(int i = 0; i<n; i++)
        {
            arr1[i] = read.nextInt();
        }

        for(int i = 0; i<m; i++)
        {
            arr2[i] = read.nextInt();
        }

        for(int i = 0; i<m; i++)
        {
            System.out.println(binarySearch(arr1, arr2[i]) + 1);
        }
    }
}

/*
 5 3
 1 3 5 7 9
 6 4 8
 */

/*
 5 5
 1 1 2 2 5
 3 1 4 1 5
 */

/*
 7 4
 1 3 3 3 3 3 5
 2 3 4 10
 */
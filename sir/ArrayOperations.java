public class ArrayOperations {
    public static void main(String[] args) {
        int[] narray = { 3, 2, 6, 7, 1, 9 };

        // sum of array elements
        // int sum=0;
        // for(int i=0;i<narray.length; i++) // 5
        // { // 27 18 9
        // sum =sum+ narray[i];
        // }

        // System.out.println(sum);

        // maximum number
        int max = narray[0]; // 3  6  7  9
        for (int i = 0; i < 6; i++)
         {//     7      9
            if (max > narray[i])
             {
                 max=narray[i];
             }

        }

        System.out.println(max);

    }
}

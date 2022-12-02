package array_tasks;

public class Array_findMaximum {

     /*
        Write a function that can find the maximum number from an int Array
     */
 public static int MaxValue(int[] m){


     int max = Integer.MIN_VALUE;

     for(int each : m){
         if(each > max){
             max = each;
         }
     }
     return max;
 }

    public static void main(String[] args) {

        System.out.println("Min_value: "+ Integer.MIN_VALUE);

        System.out.println(MaxValue(new int[]{3,5,64,7,0,45,2147483647}));
    }

}

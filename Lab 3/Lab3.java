import java.util.Arrays;
import java.util.Scanner;

public class Lab3{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Elements of Array ");
         int n = sc.nextInt();
         int[] array = new int[n];
         System.out.println("Enter the elements of the array:");
         for (int i = 0; i < n; i++) {
             array[i] = sc.nextInt();
         }
         System.out.println("1. Find Mean ");
         System.out.println("2. Find Median");
         System.out.println("3. Find Mode ");
         System.out.println("Enter your Choice");
         int selection=sc.nextInt();

        switch(selection){
            case 1:
                double mean = CalculateMean(array);
                System.out.println("Mean of Array "+ mean);
                break;

            case 2:
                double median = CalculateMedian(array);
                System.out.println("Median of Array" +median);
                break;

            case 3:
                int mode = CalculateMode(array);
                System.out.println("Mode of Array" +mode);
                break;

            default:
                System.out.println("Invalid Choice");

        }
              
    }

    public static double CalculateMean(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double mean = (double) sum / array.length;
        return mean;
    }

    public static double CalculateMedian(int[] array) {
        Arrays.sort(array);
        int middle = array.length / 2;
        if (array.length % 2 == 0) {
            double median = (double) (array[middle - 1] + array[middle]) / 2;
            return median;
        } else {
            double median = (double) array[middle];
            return median;
        }
    }

    public static int CalculateMode(int[] array) {
        int mode = array[0];
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = i; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = array[i];
            }
        }
        return mode;
    }
   
}
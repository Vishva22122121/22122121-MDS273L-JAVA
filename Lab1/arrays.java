import java.util.Scanner;

public class arrays {
    public static void main (String[]args){
        int marks[] = {100,90,40,60,85};
        for (int i =0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        for(int x : marks){
            System.out.println(x);
        }
    
        // Integer.parsent(scan.new(int));
        int[] Arr = {10,20,30,40,50};

        // accessing an element with its index position
        System.out.println(Arr[3]);

        // iterationg over the array and displaying all values
        for(int i=0; i< Arr.length; i++ ){
            System.out.println(Arr[i]);
        }

        // another way of iteration
        for(int i : Arr){
            System.out.println(i);
        }

        // declaring array
        int[] Arr2 = new int[5];  // we are creating an integer array that can store 
        Arr2[2] = 100;
        Arr2[4] = 1;
        for(int i : Arr2){
            System.out.println(i + " ");

        }
        Arr2[4] = 1; // will give error and program exists

        Scanner scan = new Scanner(System.in);
        for(int i=0; i< Arr2.length; i++){
            System.out.println("Enter value for : "+i+"th Element in Array:");
            Arr2[i] = Integer.parseInt(scan.nextLine());

        } 
        for(int i : Arr2){
            System.out.print(i + " ");
        
        }

        

    }
}

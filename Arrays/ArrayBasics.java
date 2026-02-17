import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayBasics{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        /*

        Following is the list methods that we use to go around lists -

        to add elements - list.add(value)
        to access elements - list.get();
        Modify elements - list.set(index,value);
        remove elements - list.remove(index);
        size of list - list.size();

        

        */
       Scanner in = new Scanner(System.in);
       
       System.out.println("Enter the no. of elements in your array: ");
       int n = in.nextInt();
       in.nextLine();
       System.out.println("Enter you array elements: ");

        // entering values in array - 
       for(int i=0;i<n;i++){
        int value = in.nextInt();
        in.nextLine();
        list.add(value);
       }

       // displaying values of array -
       System.out.println("The enterd array is: ");
       for(int i=0; i<list.size(); i++){
        int k = list.get(i);
        System.out.print(k +" ");
       }   

       System.out.println();

       // Modify elements - 
       list.set(2, 100);

       System.out.println("The array modified at index 2 is: ");
       for(int i=0; i<list.size(); i++){  /* Note that we use list.size() cause its dynamic */
        int k = list.get(i);
        System.out.print(k +" ");
       } 

       System.out.println();

       // Deleting elements - 
       list.remove(2);

       System.out.println("The array deleted at index 2 is: ");
       for(int i=0; i<list.size(); i++){
        int k = list.get(i);
        System.out.print(k +" ");
       } 

       System.out.println();

       // size of array -
       System.out.println("The size of your array is: " +list.size());

    }
}
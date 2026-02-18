import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 2 sum is finding the index for values whose sum will satisfy the taget. This is the brute force apporach.git 

public class TwoSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        
        Scanner in =  new Scanner(System.in);

        System.out.println("Enter the size of your array: ");
        int n = in.nextInt();
        in.nextLine();

        System.out.println("Enter values in your array: ");

        for(int i=0; i<n; i++){
            int value = in.nextInt();
            in.nextLine();
            arr.add(value);
        }

        System.out.println("Enter the target value for search - ");
        int target = in.nextInt();
        in.nextLine();

        for(int i=0; i<arr.size(); i++){
            int k = arr.get(i);
            for(int j = i+1; j<arr.size(); j++){
                if(target - k == arr.get(j)){
                    System.out.println("The indices are: " + i +" and " + j);
                    break;
                }
                else
                    System.out.println("Target not found.");
            }
        }
        
    }
    
}

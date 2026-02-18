import java.util.*;
public class FrequencyOfValues{
    public static void main(String[] args) {

        Map<Integer,Integer> arr = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of your array: ");
        int n = in.nextInt();

        System.out.println("\nEnter the values in you array: ");
        for(int i=0; i<n; i++){
            int value = in.nextInt();
            list.add(value);
            arr.put(value, arr.getOrDefault(value,0)+ 1);
            /*getOrDefault - gives me the value of the key, if it pre-exists increses the default value else if it does
            not exist, assigns the default value which in case here was 0. */
        }

        System.out.println("\nYou array is: ");
        for (int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+"\t");   
        }

        System.out.println("\n \nDupliacate and their frequency is as follows: ");
        for (Map.Entry<Integer,Integer> entry : arr.entrySet()){
            if(entry.getValue()>1){
                System.out.print("Value: " + entry.getKey() + " has duplicates: " + entry.getValue()+"\n");
            }
        }
    }
}
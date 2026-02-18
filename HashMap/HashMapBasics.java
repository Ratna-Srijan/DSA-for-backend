import java.util.*;

public class HashMapBasics {
    public static void main(String[] args) {
        Map<Integer, String> hash = new HashMap<>();

        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the size of your hashmap: ");
        int n = in.nextInt();
        in.nextLine();

        // Entering values in a hash map -
        for(int i=0; i<n; i++){
            System.out.println("Enter key:");
            int key = in.nextInt();
            in.nextLine();

            System.out.println("Enter value: ");
            String value = in.nextLine();
            
            hash.put(key, value);

        }

        // Displaying values in a hash map -
        System.out.println("\nThe HashMap is: ");
        for (Map.Entry<Integer,String> entry: hash.entrySet()){
            System.out.println("key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Updating values in a hash map - (It overwrites values if key exists).
        hash.put(1, "i update it.");
        System.out.println("\nUpdate value for key 1");
        for (Map.Entry<Integer,String> entry: hash.entrySet()){
            System.out.println("key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // removing values in a hash map-
        hash.remove(1);
        System.out.println("\nRemoved key 1, the hash map is: ");
        for (Map.Entry<Integer,String> entry: hash.entrySet()){
            System.out.println("key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Size of a hash map -
        System.out.println("\nSize of hash map is: "+ hash.size());
        
    }
}

import java.util.Hashtable;
import java.util.Random;

public class Main {
    public static Random random = new Random();

    public static void main(String[] args) {

        MyHashTable<MyTestingClass , Student> table =  new MyHashTable<MyTestingClass , Student>();

//        table.put(new MyTestingClass("abc") , new Student("abc" , "def"));
//
//        for(int i =0;i<10000;i++) {
//            table.put(new MyTestingClass(generateRandomString(5)) , new Student(generateRandomString(5) , generateRandomString(5)));
//        }
//
//        System.out.println(table.getM());
//
//        for(int i =0;i< table.getM();i++) {
//            System.out.println(table.countElements(i));
//        }

        BST<Integer, String> bst = new BST<>();

        bst.put(30, "B"); // This replaces bst.put(50, "A")
        bst.put(40, "C"); // Changed from bst.put(30, "AA")
        bst.put(70, "AAA");
        bst.put(20, "D"); // Changed from bst.put(20, "AAAA")
        bst.put(50, "E"); // Changed from bst.put(40, "AAAAA")
        bst.put(60, "F"); // Remains the same
        bst.put(80, "G"); // Remains the same

        System.out.println("Value for key 40: " + bst.get(40)); // Expected to return "C"
        System.out.println("Value for key 60: " + bst.get(60)); // Expected to return "F"

        // Testing delete operation
        bst.delete(40); // Adjusted the key to delete from 30 to 40
        System.out.println("Contains key 40? " + bst.contains(40)); // Expected to be false after deletion

        // Loop through all keys in the BST
        for (Integer key : bst) {
            System.out.println("Key: " + key + ", Value: " + bst.get(key));
        }
    }
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < length ; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }

}
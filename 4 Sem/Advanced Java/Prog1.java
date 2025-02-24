 /*Implement a java program to demonstrate creating an ArrayList, adding elements, removing elements, 
sorting elements of ArrayList.  Also illustrate the use of toArray() method.*/

package pkg4jd23is126;
import java.util.ArrayList;
import java.util.Collections;

public class Prog1 {
    public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<>();

        // 2. Adding elements to the ArrayList
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        list.add("Grapes");
        list.add("Mango");

        System.out.println("Original ArrayList: " + list);

        // 3. Removing an element from the ArrayList
        list.remove("Orange"); // Remove by object
        list.remove(2); // Remove by index

        System.out.println("ArrayList after removal: " + list);

        // 4. Sorting elements in the ArrayList
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);

        // 5. Using toArray() method to convert ArrayList to an array
        String[] array = new String[list.size()];
        list.toArray(array);

        // Displaying the ArrayList as an array
        System.out.print("Array from ArrayList: ");
        for (String fruit : array) {
            System.out.print(fruit + " ");
        }
    }
    }


/* Output:-
 
Original ArrayList: [Banana, Apple, Orange, Grapes, Mango]
ArrayList after removal: [Banana, Apple, Mango]
Sorted ArrayList: [Apple, Banana, Mango]
Array from ArrayList: Apple Banana Mango
 

 */
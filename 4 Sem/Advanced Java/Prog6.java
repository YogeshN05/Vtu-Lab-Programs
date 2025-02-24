//Implement a java program to illustrate the use of different types of StringBuffer methods 

package pkg4jd23is126;
public class Prog6 {
    public static void main(String[] args) {
        // 1. Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Java Programming");

        // Display the original StringBuffer content
        System.out.println("Original StringBuffer: " + sb);

        // 2. Append Method - Adds a string at the end of the current string
        sb.append(" is awesome!");
        System.out.println("After append: " + sb);

        // 3. Insert Method - Inserts a string at a specific position
        sb.insert(4, "Language ");
        System.out.println("After insert: " + sb);

        // 4. Delete Method - Removes a part of the string
        sb.delete(4, 13); // Deletes from index 4 to 13 (exclusive)
        System.out.println("After delete: " + sb);

        // 5. Replace Method - Replaces a part of the string with another string
        sb.replace(0, 4, "Python");
        System.out.println("After replace: " + sb);

        // 6. Reverse Method - Reverses the entire content of the StringBuffer
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 7. Length Method - Returns the length of the StringBuffer
        int length = sb.length();
        System.out.println("Length of StringBuffer: " + length);

        // 8. Capacity Method - Returns the current capacity of the StringBuffer
        int capacity = sb.capacity();
        System.out.println("Capacity of StringBuffer: " + capacity);

        // 9. SetLength Method - Sets the length of the StringBuffer
        sb.setLength(10);  // Set length to 10, will truncate any characters beyond index 9
        System.out.println("After setLength(10): " + sb);

        // 10. CharAt Method - Retrieves a character at a specific index
        char charAtIndex3 = sb.charAt(3);  // Get character at index 3
        System.out.println("Character at index 3: " + charAtIndex3);
    }
}


/*OUTPUT:-

Original StringBuffer: Java Programming
After append: Java Programming is awesome!
After insert: JavaLanguage  Programming is awesome!
After delete: Java Programming is awesome!
After replace: Python Programming is awesome!
After reverse: !emosewa si gnimmargorP nohtyP
Length of StringBuffer: 30
Capacity of StringBuffer: 66
After setLength(10): !emosewa s
Character at index 3: o

 */


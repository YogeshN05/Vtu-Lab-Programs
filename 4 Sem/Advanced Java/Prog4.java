//Implement a java program to illustrate the use of different types of string class constructors.

package pkg4jd23is126;
public class Prog4 {
    public static void main(String[] args) {
        
        // 1. Using the default constructor (empty string)
        String str1 = new String();
        System.out.println("str1 (empty string): '" + str1 + "'");

        // 2. Using constructor that accepts a String literal
        String str2 = new String("Hello, World!");
        System.out.println("str2: '" + str2 + "'");

        // 3. Using constructor that accepts a char array
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str3 = new String(charArray);
        System.out.println("str3 (from char array): '" + str3 + "'");

        // 4. Using constructor that accepts a part of a char array (startIndex, length)
        String str4 = new String(charArray, 1, 3);  // Starting from index 1, length 3
        System.out.println("str4 (from char array, part of it): '" + str4 + "'");

        // 5. Using constructor that accepts byte array (encoding)
        byte[] byteArray = {74, 97, 118, 97};  // ASCII values for 'J', 'a', 'v', 'a'
        String str5 = new String(byteArray);
        System.out.println("str5 (from byte array): '" + str5 + "'");

        // 6. Using constructor that accepts a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("StringBuffer to String");
        String str6 = new String(stringBuffer);
        System.out.println("str6 (from StringBuffer): '" + str6 + "'");
    }
}

/*
Output:-
str1 (empty string): ''
str2: 'Hello, World!'
str3 (from char array): 'Java'
str4 (from char array, part of it): 'ava'
str5 (from byte array): 'Java'
str6 (from StringBuffer): 'StringBuffer to String'
 
*/
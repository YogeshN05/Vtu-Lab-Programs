/*Implement a java program to illustrate the use of different types of character extraction, string 
comparison, string search and string modification methods.*/

package pkg4jd23is126;
public class Prog5 {
    public static void main(String[] args) {
        // Initial string for demonstration
        String str = "Java Programming Language";

        // 1. Character Extraction (using charAt and getChars)
        System.out.println("1. Character Extraction:");
        char charAtIndex5 = str.charAt(5);  // Extract character at index 5
        System.out.println("Character at index 5: " + charAtIndex5);
        
        // Extracting a range of characters using getChars
        char[] destArray = new char[5];
        str.getChars(5, 10, destArray, 0);
        System.out.print("Characters from index 5 to 9: ");
        for (char c : destArray) {
            System.out.print(c);  // Outputs: Progr
        }
        System.out.println("\n");

        // 2. String Comparison
        System.out.println("2. String Comparison:");
        String str1 = "Java Programming";
        String str2 = "Java Programming";
        String str3 = "Python Programming";
        
        // Using equals method
        boolean isEqual = str1.equals(str2);
        System.out.println("str1 equals str2: " + isEqual);
        
        // Using equalsIgnoreCase method
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase("java programming");
        System.out.println("str1 equalsIgnoreCase 'java programming': " + isEqualIgnoreCase);
        
        // Using compareTo method
        int comparisonResult = str1.compareTo(str3);
        System.out.println("str1 compareTo str3: " + comparisonResult);  // Returns a negative value since "Java" is less than "Python"
        System.out.println();

        // 3. String Search
        System.out.println("3. String Search:");
        String searchString = "Java Programming Language";
        
        // Using indexOf method
        int index = searchString.indexOf("Programming");
        System.out.println("Index of 'Programming': " + index);
        
        // Using lastIndexOf method
        int lastIndex = searchString.lastIndexOf("a");
        System.out.println("Last occurrence of 'a': " + lastIndex);
        
        // Using contains method
        boolean containsWord = searchString.contains("Language");
        System.out.println("Contains 'Language': " + containsWord);
        System.out.println();

        // 4. String Modification
        System.out.println("4. String Modification:");
        
        // Using toUpperCase method
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperStr);
        
        // Using toLowerCase method
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerStr);
        
        // Using replace method
        String replacedStr = str.replace("Programming", "Development");
        System.out.println("Replaced 'Programming' with 'Development': " + replacedStr);
        
        // Using substring method
        String substringStr = str.substring(5, 16);
        System.out.println("Substring from index 5 to 15: " + substringStr);
        
        // Using trim method (to remove leading/trailing spaces)
        String strWithSpaces = "  Java  ";
        String trimmedStr = strWithSpaces.trim();
        System.out.println("Trimmed string: '" + trimmedStr + "'");
    }
}

/*OUTPUT:-

1. Character Extraction:
Character at index 5: P
Characters from index 5 to 9: Progr

2. String Comparison:
str1 equals str2: true
str1 equalsIgnoreCase 'java programming': true
str1 compareTo str3: -6

3. String Search:
Index of 'Programming': 5
Last occurrence of 'a': 22
Contains 'Language': true

4. String Modification:
Uppercase: JAVA PROGRAMMING LANGUAGE
Lowercase: java programming language
Replaced 'Programming' with 'Development': Java Development Language
Substring from index 5 to 15: Programming
Trimmed string: 'Java'
 
 */
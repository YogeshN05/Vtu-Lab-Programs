/*Develop a program to read random numbers between a given range that are multiples of 2 and 5, sort 
the numbers according to tens place using comparator. */


package pkg4jd23is126;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Prog2 {
    public static void main(String[] args) {
        // Define the range
        int lowerBound = 1;
        int upperBound = 100;

        // Generate random numbers between the range and filter multiples of 2 and 5
        ArrayList<Integer> numbers = generateRandomNumbers(lowerBound, upperBound);

        // Print the original list of numbers
        System.out.println("Original List: " + numbers);

        // Sort the numbers using a custom comparator that compares based on tens place
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                // Get the tens place for both numbers
                int tensPlaceNum1 = (num1 / 10) % 10;
                int tensPlaceNum2 = (num2 / 10) % 10;

                // Compare based on the tens place
                return Integer.compare(tensPlaceNum1, tensPlaceNum2);
            }
        });

        // Print the sorted list of numbers
        System.out.println("Sorted List (based on tens place): " + numbers);
    }

    // Method to generate random numbers between a given range and filter multiples of 2 and 5
    public static ArrayList<Integer> generateRandomNumbers(int lowerBound, int upperBound) {
        Random random = new Random();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < 20; i++) { // Generate 20 random numbers
            int randomNum = lowerBound + random.nextInt(upperBound - lowerBound + 1);
            
            // Add the number if it is a multiple of 2 and 5 (i.e., a multiple of 10)
            if (randomNum % 10 == 0) {
                result.add(randomNum);
            }
        }

        return result;
    }
}


/*
Output:-

Original List: [10, 20, 40, 50]
Sorted List (based on tens place): [10, 20, 40, 50]
  
 */


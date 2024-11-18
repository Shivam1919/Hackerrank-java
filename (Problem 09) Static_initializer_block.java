/*You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth  and height . You should read the variables from the standard input.

If  or  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

Input Format

There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

Constraints

Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1

1
3
Sample output 1

3
Sample input 2

-1
2
Sample output 2

java.lang.Exception: Breadth and height must be positive
  */


import java.io.*;
import java.util.*;

public class Solution {

    private static boolean flag = true;
    private static int B;
    private static int H;

    static {
        try {
            Scanner s = new Scanner(System.in);
            B = s.nextInt(); // Set the class-level variable B
            H = s.nextInt(); // Set the class-level variable H
            
            // Check if the values are positive
            if (B <= 0 || H <= 0) {
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            flag = false;
            System.out.println(e); // Output the error message
        }
    }

    public static void main(String[] args) {
        if (flag) {
            // If the flag is true, it means no error occurred in the static block
            int area = B * H;
            System.out.println(area); // Print the area
        }
    }
}

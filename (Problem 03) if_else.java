/* Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, . */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n%2!=0){
            System.out.println("Weird");
        }
        if(n>=2&&n<=5){
            if(n%2==0){
                System.out.println("Not Weird");
            }
        }
        else if(n>=6&&n<=20){
            if(n%2==0){
                System.out.println("Weird");
            }
        }
        else if(n>20){
            if(n%2==0){
                System.out.println("Not Weird");
            }
        }
    }
    
}


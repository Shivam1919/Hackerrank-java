/*Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly  characters.
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.print(s1);
            int spaces=18-(s1.length()+3);
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            if(x<100 && x>=10){
                System.out.print("0"+x);
            }else if(x<10){
                System.out.print("00"+x);
            }
            else{
                System.out.print(x);
            }
            System.out.println();
        }
        System.out.println("================================");
    }
}




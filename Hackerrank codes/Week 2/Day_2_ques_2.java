/*Write a program to take one input of int type from the user. If the value is positive convert it into double and display it, otherwise display the message “Invalid Input”

Input Format

Your program should take one input of int type.

Constraints

Input should be positive integer

Output Format

If the input value is positive number (including 0) display the value in double type otherwise display the message “Invalid Input”.

Sample Input 0

5
Sample Output 0

5.0
Sample Input 1

-1
Sample Output 1

Invalid Input
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        double d= i;
        if(i>0)
        {
            System.out.println(d);
        }
        else{
            System.out.println("Invalid Input");
        }
        
    }
}
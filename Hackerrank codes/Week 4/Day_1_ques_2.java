/*
Suppose that you want to write a program to calculate the marks of a student of all his subjects that he has learnt in a particular semester. Take the input from the user which will ask him to enter no. of subjects he has learnt. If the input given is greater than 0, then program should ask the user to enter the marks of each subject. After entering all the marks, calculate and print total marks scored by him in all subjects. If the input given is negative or zero, then display the message “Invalid”.

Input Format

The first input line should ask the user to enter no. of subjects he has learnt. The remaining input lines should ask the user to enter the marks scored by him in each subject.

Constraints

Number of subjects should be greater than 0. i.e. 1 ≤ n ≤ 10 If any subject marks entered by him is negative value or greater than 100, then it should not be considered. i.e. 0 ≤ marks ≤ 100

Output Format

Sum of marks of all subjects entered by user.

Sample Input 0

4
20
10
30
70
Sample Output 0

130
Sample Input 1

0
Sample Output 1

Invalid
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=1 && n<=10){
            int sum=0;
            int mark;
            for(int i=0;i<n;i++){
                mark=sc.nextInt();
                if(mark<100 && mark>=0)
                sum = sum+mark;
            }
            System.out.print(sum);
        }
        else{
            System.out.print("Invalid");
        }
    }
}